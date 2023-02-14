package imooc.test;

import imooc.model.Student;
import imooc.model.Subject;

import java.util.ArrayList;

public class SchoolTest {
    public static void main(String[] args) {
        Subject subject = new Subject("计算机科学与应用", "J0001", 4);
        Subject subject1 = new Subject("思想政治与理论", "J0002", 4);

        System.out.println(subject.toString());

        Student one = new Student("张三", "S01", "男", 18);
        Student two = new Student("李四", "S02", "女", 17);
        Student three = new Student("王五", "S03", "男", 18);
        System.out.println(one.introduction(subject) + "\n" + two.introduction(subject) + "\n" + three.introduction(subject));

        System.out.println("====================================================");
        subject.setStudentList(new ArrayList<Student>());
        subject.add(one);
        subject.add(two);
        subject.add(three);
        subject.diaplayStudentNum();

        subject1.setStudentList(new ArrayList<Student>());
        subject1.add(one);
        subject1.add(two);
        subject1.diaplayStudentNum();
    }
}
