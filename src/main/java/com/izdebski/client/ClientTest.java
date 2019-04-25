package com.izdebski.client;

import com.izdebski.model.Student;
import com.izdebski.myinterface.MyInterface;
import com.izdebski.myinterfaceImpl.MyClass;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {

    public static void main(String[] args) {

        MyInterface myInterface = new MyClass();
        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student("Sean", 20));
        stuList.add(new Student("Andrew", 16));
        stuList.add(new Student("Frank", 26));

        List<Student> sortStudents = myInterface.sortStudents(stuList);
        for (Student student : sortStudents) {
            System.out.println(student.getName()+"\t"+student.getAge());
        }

        System.out.println("-------------------------------");

        MyInterface.greet("Sean");

        System.out.println("-----------------------------------");

        List<Integer> intList = new ArrayList<>();
        intList.add(1000);
        intList.add(50);
        intList.add(9000);
        intList.add(90);
        Integer maxNum = myInterface.getMaxNum(intList);
        System.out.println("Max Num:"+maxNum);

    }

}