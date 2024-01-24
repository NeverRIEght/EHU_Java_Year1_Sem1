package Exercise2;
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
