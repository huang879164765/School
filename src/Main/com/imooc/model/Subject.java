package imooc.model;

public class Subject {
    private String subjectName;
    private String subjectNumber;
    private int subjectLife;

    public Subject() {
    }

    public Subject(String subjectName, String subjectNumber, int subjectLife) {
        this.subjectName = subjectName;
        this.subjectNumber = subjectNumber;
        this.setSubjectLife(subjectLife);
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectNumber() {
        return subjectNumber;
    }

    public void setSubjectNumber(String subjectNumber) {
        this.subjectNumber = subjectNumber;
    }

    public int getSubjectLife() {
        return subjectLife;
    }

    public int setSubjectLife(int subjectLife) {
        if (subjectLife <= 0) {
            System.out.println("专业年制非法");
        } else {
            this.subjectLife = subjectLife;
        }
        return subjectLife;
    }

    @Override
    public String toString() {
        return "学校专业{" +
                "专业名称='" + subjectName + '\'' +
                ", 专业编号='" + subjectNumber + '\'' +
                ", 专业年制=" + subjectLife +
                '}';
    }
}
