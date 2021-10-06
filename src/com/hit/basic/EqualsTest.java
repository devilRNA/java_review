package com.hit.basic;

public class EqualsTest {
    public static void main(String[] args) {
        // 新建2个相同内容的Person对象，
        // 再用equals比较它们是否相等
        Person p1 = new Person("eee", 100);
        Person p2 = new Person("eee", 100);
        System.out.printf("%s\n", p1.equals(p2));

        String a="Are you OK?";
        String b="Are you OK?";
        String c="Are you OK!!!!!!!!!!!!?";
        System.out.println(a.equals(b));   // just ignore the IDEA warning...
        System.out.println(a.equals(c));

        PersonB pb1= new PersonB("changkaishi",666);
        PersonB pb2= new PersonB("changkaishi",666);
        System.out.println(pb1.equals(pb2));
    }

    /**
     * Person类。
     */
    private static class Person {
        int age;
        String name;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return name + " - " +age;
        }

    }

    /**
     * @desc Person类。覆盖equals方法
     */
    private static class PersonB {
        int age;
        String name;

        public PersonB(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String toString() {
            return name + " - " +age;
        }

        /**
         * @desc 覆盖equals方法
         */
        @Override
        public boolean equals(Object obj){
            if(obj == null){
                return false;
            }

            //如果是同一个对象返回true，反之返回false
            if(this == obj){
                return true;
            }

            //判断是否类型相同
            if(this.getClass() != obj.getClass()){
                return false;
            }

            PersonB person = (PersonB)obj;
            return name.equals(person.name) && age==person.age;
        }
    }



}
