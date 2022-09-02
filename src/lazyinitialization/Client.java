package lazyinitialization;

public class Client {
    public static void main(String[] args) {
        LazyInitialization lazy1=LazyInitialization.getInstance();
        lazy1.setName("huy");
        System.out.println(lazy1.getName());
        LazyInitialization lazy2=LazyInitialization.getInstance();
        System.out.println(lazy2.getName());
        LazyInitialization lazy3=LazyInitialization.getINSTANCE();
        lazy3.setName("huy1");
        System.out.println(lazy3.getName());

    }
}
