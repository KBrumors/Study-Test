package com.test.git;

import java.util.ArrayList;

/**
 * Hello world!
 *
 * @author 李志伟
 */
public class App {
    public static void main( String[] args ) {
        System.out.println("第一次修改!");
        System.out.println("第二次修改!");
        System.out.println("第三次修改,哈哈哈哈哈哈哈哈哈!");
        System.out.println("第四次修改,哈哈哈哈哈哈哈哈哈!");
        System.out.println("develop分支第一次修改!");
        System.out.println( "Hello World!" );
        Student student = new Student();
        student.setId(10);
        student.setName("rumors");
        Clazz clazz = new Clazz();
        clazz.setId(20);
        clazz.setName("liu");
        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList.add(student);
        clazz.setStudentList(studentArrayList);
        System.out.println(clazz);
    }
}
