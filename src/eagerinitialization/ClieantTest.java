package eagerinitialization;

public class ClieantTest {
    public static void main(String[] args) {
        EagerInitialization eager1= EagerInitialization.getInstance();
        eager1.setName("huy");
        System.out.println(eager1.getName());
        EagerInitialization eager2= EagerInitialization.getInstance();
        System.out.println(eager2.getName());
    }
}
