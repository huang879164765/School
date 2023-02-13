package imooc.test;

import imooc.model.Subject;

public class SchoolTest {
    public static void main(String[] args) {
        Subject subject = new Subject("计算机科学与应用", "J0001", 4);
        System.out.println(subject.toString());
    }
}
