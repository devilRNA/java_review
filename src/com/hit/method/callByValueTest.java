package com.hit.method;

/**
 * Source : https://snailclimb.gitee.io/javaguide/#/docs/java/basis/Java%E5%9F%BA%E7%A1%80%E7%9F%A5%E8%AF%86?id=%e4%b8%ba%e4%bb%80%e4%b9%88-java-%e4%b8%ad%e5%8f%aa%e6%9c%89%e5%80%bc%e4%bc%a0%e9%80%92%ef%bc%9f
 * Aim: to explore whether java is call by value or not.
 * */
public class callByValueTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student s1 = new Student("小张");
        Student s2 = new Student("小李");
        System.out.println("s1:" +s1.hashCode());
        System.out.println("s2:" +s2.hashCode());
        callByValueTest.swap(s1, s2);
        System.out.println("s1:" + s1.getName());
        System.out.println("s2:" + s2.getName());
        System.out.println("s1:" +s1.hashCode());
        System.out.println("s2:" +s2.hashCode());
    }

    public static void swap(Student x, Student y) {
        Student temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x.getName());
        System.out.println("y:" + y.getName());
    }



}
