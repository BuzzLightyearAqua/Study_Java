package com.buzz.java_08_reflection;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/12 19:28
 */
public class InvokeMethodDemo {
    public static void main(String[] args) throws Exception {
        Class stdClass = Student4.class;
        //获取public方法getScore，参数为String
        System.out.println(stdClass.getMethod("getScore", String.class));
        //获取public方法getName 无参数
        System.out.println(stdClass.getMethod("getName"));
        //获取private方法getGrade，参数为int
        System.out.println(stdClass.getDeclaredMethod("getGrade", int.class));
    }
}

class Student4 extends Person4 {
    public int getScore(String type){
        return 99;
    }

    private int getGrade(int year){
        return 1;
    }
}

class Person4 {
    public String getName(){
        return "Person";
    }
}