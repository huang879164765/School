package imooc.model;

public class Student {
    private String studentName;
    private String studentNunber;
    private String studentGender;
    private int studentAge;

    public Student() {
    }

    public Student(String studentName, String studentNunber, String studentGender, int studentAge) {
        this.studentName = studentName;
        this.studentNunber = studentNunber;
        this.studentGender = studentGender;
        this.setStudentAge(studentAge);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNunber() {
        return studentNunber;
    }

    public void setStudentNunber(String studentNunber) {
        this.studentNunber = studentNunber;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public int setStudentAge(int studentAge) {
        if (studentAge <= 0) {
            System.out.println("年龄非法");
        } else {
            this.studentAge = studentAge;
        }
        return studentAge;
    }

    @Override
    public String toString() {
        return "学生信息{" +
                "学生姓名='" + studentName + '\'' +
                ", 学生编号='" + studentNunber + '\'' +
                ", 学生性别='" + studentGender + '\'' +
                ", 学生年龄=" + studentAge +
                '}';
    }
}
