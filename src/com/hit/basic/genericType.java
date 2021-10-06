package com.hit.basic;
// genericType review


import java.util.ArrayList;
import java.util.List;

public class genericType {
    public static void main(String[] args) {


        /*
          generic class review

          */

        Generic<Integer> genericInteger = new Generic<>(123456);
        System.out.println(genericInteger.getKey());
        // 实质上，常用的Arraylist 就是一种泛型
        List<String> strings=new ArrayList<>();
        for (int i=0;i<10;i++){
            strings.add("Are you OK?");
        }
        System.out.println(strings.size());



        /*
          generic interface review
          */
        Generator generator=new GeneratorImpl();
        System.out.println(generator.method());

        /*
        generic method review
         */

        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        printArray(intArray);
        printArray(stringArray);




    }
    //此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型
//在实例化泛型类时，必须指定T的具体类型
    public static class Generic<T> {

        private T key;

        public Generic(T key) {
            this.key = key;
        }

        public T getKey() {
            return key;
        }
    }

    public  static interface Generator<T> {
        public T method();
    }

    static class GeneratorImpl implements Generator<String>{
        @Override
        public String method() {
            return "hello";
        }
    }

    //注意这里的<E>是指向传参的

    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

}
