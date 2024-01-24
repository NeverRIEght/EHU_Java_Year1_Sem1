package Exercise2;

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
        return Integer.compare(this.result.getSum(), o.getResult().getSum());
    }
}