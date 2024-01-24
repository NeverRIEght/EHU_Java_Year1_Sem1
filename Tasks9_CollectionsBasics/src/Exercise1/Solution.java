package Exercise1;

import java.util.*;

class Solution {

    private Solution() { }

    public static List<TestPack> createList(String str) {
        TestPack[] objects = decomposeString(str);
        List<TestPack> output = new ArrayList<>();

        Collections.addAll(output, objects);

        return output;
    }

    public static Set<TestPack> createSet(String str) {
        return new HashSet<>(createList(str));
    }

    public static SortedSet<TestPack> createSortedSet(String str) {
        return new TreeSet<>(createSet(str));
    }

    public static Queue<TestPack> createQueue(String str) {
        return new LinkedList<>(createList(str));
    }

    public static Queue<TestPack> createStack(String str) {
        TestPack[] objects = decomposeString(str);

        TestPack[] inverseArray = new TestPack[objects.length];
        for(int i = 0; i < objects.length; i++) {
            inverseArray[i] = objects[objects.length - 1 - i];
        }

        Queue<TestPack> output = new LinkedList<>();

        Collections.addAll(output, inverseArray);

        return output;
    }

    public static Map<Integer, Result> createMap(String str) {
        TestPack[] objects = decomposeString(str);

        Map<Integer, Result> output = new HashMap<>();

        for(TestPack elem : objects) {
            output.put(elem.getId(), elem.getResult());
        }

        return output;
    }

    public static SortedMap<Integer, Result> createSortedMap(String str) {
        TestPack[] objects = decomposeString(str);
        TreeMap<Integer, Result> output = new TreeMap<>();

        for(TestPack elem : objects) {
            output.put(elem.getId(), elem.getResult());
        }

        return output;
    }

    private static TestPack[] decomposeString(String input) {
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