package imooc.model;

import java.util.List;

public class Student {
    private String studentName;
    private String studentNumber;
    private String studentGender;
    private int studentAge;

    public Student() {
    }

    public Student(String studentName, String studentNunber, String studentGender, int studentAge) {
        this.studentName = studentName;
        this.studentNumber = studentNunber;
        this.studentGender = studentGender;
        this.setStudentAge(studentAge);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
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
                ", 学生编号='" + studentNumber + '\'' +
                ", 学生性别='" + studentGender + '\'' +
                ", 学生年龄=" + studentAge +
                '}';
    }

    public String introduction(Subject mysubject) {
        return "学生信息{" +
                "学生姓名='" + studentName + '\'' +
                ", 学生编号='" + studentNumber + '\'' +
                ", 学生性别='" + studentGender + '\'' +
                ", 学生年龄=" + studentAge + '\'' +
                ", 专业名称=" + mysubject.getSubjectName() + '\'' +
                ", 专业学制=" + mysubject.getSubjectLife() + "年" +
                '}';
    }


}
