package com.izdebski.myinterfaceImpl;

import com.izdebski.model.Student;
import com.izdebski.myinterface.MyInterface;

import java.util.Collections;
import java.util.List;

public class MyClass extends Object implements MyInterface {

    @Override
    public Integer getMaxNum(List<Integer> intList) {
        Integer maxNum = Collections.max(intList);
        return maxNum;
    }

    public List<Student> sortStudents(List<Student> stuList){
        return stuList;
    }

}