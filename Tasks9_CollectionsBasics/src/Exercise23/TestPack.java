package Exercise23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        return Integer.compare(this.getResult().getSum(), o.getResult().getSum());
    }

}

class Result {
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

    public int getSum() {
        return (this.grade1 + this.grade2);
    }

    public int getGrade1() {
        return grade1;
    }

    public int getGrade2() {
        return grade2;
    }

}

class Register {
    private List<TestPack> collection;
    private boolean ordered;

    public Register(String line) {
        String[] testPacks = line.split(" ");
        collection = new ArrayList<>(testPacks.length);

        for (String testPackString : testPacks) {
            TestPack testPack = new TestPack(testPackString);
            collection.add(testPack);
        }

        ordered = false;
    }

    public int size() {
        return collection.size();
    }

    public TestPack get(int index) {
        if (index < 0 || index >= size()) {
            return null;
        }
        return collection.get(index);
    }

    public void insert(int index, TestPack testPack) {
        if (index < 0) {
            index = 0;
        } else if (index > size()) {
            index = size();
        }

        collection.add(index, testPack);
        ordered = false;
    }

    public boolean removeRange(int from, int to) {
        if (from < 0 || from >= size()) {
            return false;
        }

        if (to <= from || to > size()) {
            return false;
        }

        collection.subList(from, to).clear();

        ordered = false;

        return true;
    }

    public void sort() {
        if (!ordered) {
            Collections.sort(collection);
            ordered = true;
        }
    }

    public int binarySearch(TestPack testPack) {
        if (!ordered) {
            sort();
        }
        return Collections.binarySearch(collection, testPack);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for(TestPack pack : collection) {
            sb.append(pack.getId());
            sb.append(";");
            sb.append(pack.getResult().getGrade1());
            sb.append(";");
            sb.append(pack.getResult().getGrade2());
            sb.append(";");
            sb.append(pack.getResult().getSum());

            if (collection.indexOf(pack) != (collection.size() - 1)) {
                sb.append(", ");
            }
        }

        sb.append("]");

        return sb.toString();
    }
}
