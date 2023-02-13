package imooc.test;

import imooc.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student one = new Student("张三", "S01", "男", 18);
        Student two = new Student("李四", "S02", "女", 17);
        Student three = new Student("王五", "S03", "男", 18);
        System.out.println(one.toString() + "\n" + two.toString() + "\n" + three.toString());
    }
}
