package Exercise1;

class Result {
    private int grade1;
    private int grade2;

    public Result(int grade1, int grade2) {
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public Result(String csvLine) {
        String[] parts = csvLine.split(";");
        this.grade1 = Integer.parseInt(parts[0]);
        this.grade2 = Integer.parseInt(parts[1]);
    }

}
