package com.hit.basic;

// review wrapper classes' usages
public class wrapperClass {
    public static void main(String[] args) {
        int i =100;
        String s = String.valueOf(i);
        System.out.println(s);

        int j = Integer.parseInt(s);
        j+=1;
        System.out.println(j);

        System.out.println(s.hashCode());

    }


}
