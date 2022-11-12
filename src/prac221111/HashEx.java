package prac221111;

public class HashEx {
    public static void main(String[] args) {
        //Hash
        System.out.println(new Person().toString());
        String name1 = "홍길동";
        String name2 = "홍길동";
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        Integer age1=30;
        Integer age2=30;
        System.out.println(age1.hashCode());
        System.out.println(age2.hashCode());
    }
}

class Person{

}
