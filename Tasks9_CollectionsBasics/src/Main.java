import java.util.*;

class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String line = sc.nextLine();
            TestPack fake = new TestPack("-1;0;0");

            List< TestPack > list = Solution.createList(line);
            Random rand = new Random();
            int k = rand.nextInt(list.size());
            TestPack tp = list.get(k);
            int index = list.indexOf(tp);
            boolean isListOk = tp.getId() == list.get(index).getId() &&
                    list.indexOf(fake) == -1;

            Set< TestPack > set = Solution.createSet(line);
            boolean isSetOk = set.contains(tp) &&
                    !set.contains(fake);

            SortedSet< TestPack > sortedSet = Solution.createSortedSet(line);
            boolean isSortedSetOk = sortedSet.size() > 1 ?
                    sortedSet.first().getId() < sortedSet.last().getId() : true;

            Queue < TestPack > queue = Solution.createQueue(line);
            boolean isQueueOk = list.get(0).equals(queue.peek());

            Queue < TestPack > stack = Solution.createStack(line);
            boolean isStackOk = list.get(list.size() - 1).equals(stack.peek());

            Map < Integer, Result > map = Solution.createMap(line);
            boolean isMapOk = map.containsKey(tp.getId()) &&
                    !map.containsKey(fake.getId());

            SortedMap < Integer, Result > sortedMap = Solution.createSortedMap(line);
            boolean isSortedMap = sortedMap.size() > 1 ?
                    sortedMap.firstKey() < sortedMap.lastKey() : true;

            System.out.printf("%d %b %d %b %d %b %d %b %d %b %d %b %d %b",
                    list.size(), isListOk, set.size(), isSetOk, sortedSet.size(), isSortedSetOk,
                    queue.size(), isQueueOk, stack.size(), isStackOk, map.size(), isMapOk, sortedMap.size(), isSortedMap);
        }
    }

}
