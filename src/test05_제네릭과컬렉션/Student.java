package test05_제네릭과컬렉션;

public class Student {

    private String name;
    private String major;
    private String code;
    private double score;

    public Student() {

    }

    public Student(String name, String major, String code, double score) {
        this.name = name;
        this.major = major;
        this.code = code;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

}
