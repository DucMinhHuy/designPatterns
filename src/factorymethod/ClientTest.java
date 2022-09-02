package factorymethod;

public class ClientTest {
    public static void main(String[] args) {
        // lay tu lop cha
        Candy hardCandy = CandyFactory.getCandy(CandyType.HARD);
        System.out.println(hardCandy.getCandyName());
        System.out.println("============");
        //lay du lieu chinh lop cua no
        MintyCandy mintyCandy = (MintyCandy) CandyFactory.getCandy(CandyType.MINTY);
        System.out.println(mintyCandy.getCandyName());
        System.out.println("-----------");
        Candy node = CandyFactory.getCandy(null);
        System.out.println(node);
    }
}
