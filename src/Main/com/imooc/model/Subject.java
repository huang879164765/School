package imooc.model;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String subjectName;
    private String subjectNumber;
    private int subjectLife;

    private List<Student> studentList;

    public Subject() {
    }

    public Subject(String subjectName, String subjectNumber, int subjectLife) {
        this.subjectName = subjectName;
        this.subjectNumber = subjectNumber;
        this.setSubjectLife(subjectLife);
    }

    public Subject(String subjectName, String subjectNumber, int subjectLife, List<Student> studentList) {
        this.subjectName = subjectName;
        this.subjectNumber = subjectNumber;
        this.setSubjectLife(subjectLife);
        this.setStudentList(studentList);
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

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Student> setStudentList(List<Student> studentList) {
        this.studentList = studentList;
        return this.studentList;
    }

    @Override
    public String toString() {
        return "学校专业{" +
                "专业名称='" + subjectName + '\'' +
                ", 专业编号='" + subjectNumber + '\'' +
                ", 专业年制=" + subjectLife +
                '}';
    }

    public void add(Student student) {
        this.studentList.add(student);
    }

    public void diaplayStudentNum() {
        System.out.println("报名" + this.getSubjectName() + "的学生有" + this.studentList.size() + "个");
    }


}
