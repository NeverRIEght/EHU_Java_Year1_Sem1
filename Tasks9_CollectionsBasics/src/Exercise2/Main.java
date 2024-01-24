package Exercise2;

import java.util.*;

class Main {

    static {
        //some hidden verification code here

    }

    public static void main(String[] args) {
        //test Comparable<TestPack>
        TestPack somePack = new TestPack("100;35;54");
        TestPack somePackEqualled = new TestPack("50;30;59");
        assertTrue(somePack.compareTo(new TestPack("100;30;70")) < 0, "somePack is less than the argument");
        assertTrue(somePack.compareTo(somePackEqualled) == 0, "somePack is equal to the argument");
        assertTrue(somePack.compareTo(new TestPack("100;35;53")) > 0, "somePack is greater than the argument");

        Random rand = new Random();
        try (Scanner sc = new Scanner(System.in)) {
            String line = sc.nextLine();
            Register register = new Register(line);
            //test get, size
            assertTrue(register.get(-1) == null, "no instance with id=-1");
            assertTrue(register.get(register.size()) == null, "no instance with id=" + register.size());
            assertTrue(register.get(register.size() + 1) == null, "no instance with id=" + (register.size() + 1));
            //test insert, get, size
            int index = -10 + rand.nextInt(10);
            register.insert(index, somePack);
            assertTrue(register.get(0).getId() == 100, "an instance with id=100 had to be inserted at index=0");
            index = register.size() + rand.nextInt(10);
            register.insert(index, new TestPack("101;5;20"));
            assertTrue(register.get(register.size() - 1).getId() == 101,
                    "an instance with id=101 had to be inserted at index=" + (register.size() - 1));
            index = rand.nextInt(register.size());
            register.insert(index, new TestPack("102;75;30"));
            assertTrue(register.get(index).getId() == 102,
                    "an instance with id=102 had to be inserted at index=" + index);

            testKeepTrackOrdering();

            //test sort, binarySearch
            assertTrue(register.binarySearch(somePackEqualled) >= 0,
                    "there is an element in the register equalled to somePackEqualled");
            TestPack fakePack = new TestPack("100500;100500;100500");
            assertTrue(register.binarySearch(fakePack) == (-register.size() - 1),
                    "if fakePack were in the register, its index would be " + (-register.size() - 1));
            testBinarySearchAdditional();
            //test remove
            assertTrue(!register.removeRange(0, 0), String.format("no way to remove a sublist from %d to %d", 0, 0));
            assertTrue(!register.removeRange(1, 0), String.format("no way to remove a sublist from %d to %d", 1, 0));
            assertTrue(!register.removeRange(-1, 1), String.format("no way to remove a sublist from %d to %d", -1, 1));
            int curSize = register.size();
            assertTrue(!register.removeRange(1, curSize + 1),
                    String.format("no way to remove a sublist from %d to %d", 1, curSize + 1));
            //curSize is sure to be greater than 3
            assertTrue(register.removeRange(1, 3),
                    String.format("it's possible to remove a sublist from %d to %d", 1, 3));
            assertTrue(register.size() == curSize - 2,
                    String.format("register size after removing a sublist from %d to %d is %d", 1, 3, curSize - 2));
            assertTrue(register.removeRange(0, 1),
                    String.format("it's possible to remove a sublist from %d to %d", 0, 1));
            assertTrue(register.size() == curSize - 3,
                    String.format("register size after removing a sublist from %d to %d is %d", 0, 1, curSize - 3));
            curSize -= 3;
            if (curSize > 2) {
                assertTrue(register.removeRange(curSize - 2, curSize),
                        String.format("it's possible to remove a sublist from %d to %d", curSize - 2, curSize));
                assertTrue(register.size() == curSize - 2,
                        String.format("register size after removing a sublist from %d to %d is %d", curSize - 2, curSize, curSize - 2));
            }
            System.out.println(register);
        }
    }

    private static void assertTrue(boolean actual, String description) {
        if (!actual) {
            System.out.println("Actually, " + description);
            System.exit(-1);
        }
    }

    private static void testBinarySearchAdditional() {
        Register register2 = new Register("1;100;50 2;10;10");
        int index = register2.binarySearch(new TestPack("1;100;50"));
        assertTrue(index == 1,
                "you need to sort a collection in advance to do binary search");
    }

    private static void testKeepTrackOrdering() {
        Register register2 = new Register("1;90;90 2;15;15");
        assertTrue(register2.get(0).compareTo(register2.get(1)) > 0,
                "you need to have a collection unsorted just after creation");
        register2.sort();
        register2.insert(0, new TestPack("3;100;100"));
        assertTrue(register2.get(0).compareTo(register2.get(1)) > 0,
                "you need to have a collection unsorted after inserting an element");
    }

}