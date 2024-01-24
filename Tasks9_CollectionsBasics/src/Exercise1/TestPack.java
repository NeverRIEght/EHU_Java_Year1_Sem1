package Exercise1;

import java.util.Objects;

class TestPack implements Comparable<TestPack> {
    private int id;
    private Result result;

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
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TestPack other = (TestPack) obj;
        return id == other.id;
    }

    @Override
    public int compareTo(TestPack testPack) {
        return id - testPack.id;
    }

}
