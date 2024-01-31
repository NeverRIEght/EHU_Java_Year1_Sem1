package Exercise22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class TestPack implements Comparable<TestPack> {
    private final int id;
    private final Result result;

    public TestPack(int id, Result result) {
        this.id = id;
        this.result = result;
    }

    public TestPack(String csvLine) {
        String[] parts = csvLine.split(";", 2);
        this.id = Integer.parseInt(parts[0]);
        this.result = new Result(parts[1]);
    }

    public int getId() {
        return id;
    }

    public Result getResult() {
        return result;
    }

    @Override
    public int compareTo(TestPack o) {
        return this.result.compareTo(o.result);
    }
}

class Result implements Comparable<Result>{
    private final int grade1;
    private final int grade2;

    public Result(int grade1, int grade2) {
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public Result(String csvLine) {
        String[] parts = csvLine.split(";");
        this.grade1 = Integer.parseInt(parts[0]);
        this.grade2 = Integer.parseInt(parts[1]);
    }

    @Override
    public int compareTo(Result o) {
        return grade2+grade1 - (o.grade2 + o.grade1);
    }
}

class Register {
    private ArrayList<TestPack> packs;
    private boolean isSorted;

    public Register(String line) {
        TestPack[] objects = decomposeString(line);
        packs = new ArrayList<>();

        Collections.addAll(packs, objects);
        isSorted = false;
    }

    public int size() {
        return packs.size();
    }

    public TestPack get(int index) {
        if(index < 0 || index >= size()) {
            return null;
        }
        return packs.get(index);
    }

    public void insert(int index, TestPack testPack) {
        if(index >= 0 && index < size()) {
            packs.add(index, testPack);
        } else if(index < 0) {
            packs.addFirst(testPack);
        } else {
            packs.add(testPack);
        }
        isSorted = false;
    }

    public boolean removeRange(int from, int to) {
        if(from < 0 || from >= size()) {
            return false;
        }

        if(to <= from || to > size()) {
            return false;
        }

        packs.subList(from, to).clear();
        isSorted = false;
        return true;
    }

    public void sort() {
        if(!isSorted) {
            packs.sort(new Comparator<TestPack>() {
                @Override
                public int compare(TestPack o1, TestPack o2) {
                    return o1.compareTo(o2);
                }
            });
            isSorted = true;
        }
    }

    public int binarySearch(TestPack testPack) {
        if(!isSorted) {
            sort();
        }

        return Collections.binarySearch(packs, testPack);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < packs.size(); i++) {
            sb.append(packs.get(i).getId());
            sb.append(";");
            sb.append(packs.get(i).getResult());
            if(i != packs.size() - 1) {
                sb.append(" ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private TestPack[] decomposeString(String input) {
        String[] strings = input.split(" ");
        TestPack[] output = new TestPack[strings.length];

        for(int i = 0; i < strings.length; i++) {
            String[] parts = strings[i].split(";", 3);
            Result res = new Result(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
            output[i] = new TestPack(Integer.parseInt(parts[0]), res);
        }

        return output;
    }




}