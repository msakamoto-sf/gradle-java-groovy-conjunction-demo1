package j1;

public class Main {
    public static void main(String[] args) {
        JavaBean b = new JavaBean("Java");
        System.out.println(b.greeting("Groovy"));
        System.out.println(b.greeting2("Funny"));
    }
}

