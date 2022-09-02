package lazyinitialization;

public class LazyInitialization {
    private static LazyInitialization INSTANCE;
    private LazyInitialization(){}
    public static LazyInitialization getInstance(){
        if(INSTANCE==null){
            INSTANCE=new LazyInitialization();
        }
        return INSTANCE;
    }
    private String name;

    public static LazyInitialization getINSTANCE() {
        return INSTANCE;
    }

    public static void setINSTANCE(LazyInitialization INSTANCE) {
        LazyInitialization.INSTANCE = INSTANCE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
