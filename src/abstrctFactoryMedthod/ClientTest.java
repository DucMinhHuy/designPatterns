package abstrctFactoryMedthod;

public class ClientTest {
    public static void main(String[] args) {
        AbstractFactory height=Factory.getFactory(Segment.HEIGHT);
        Laptop heightLaptop= height.getLaptop();
        Phone heightPhone=height.getPhone();
        System.out.println(heightPhone.getSegment());
        System.out.println(heightLaptop.getSegment());
        System.out.println("----------------");

        AbstractFactory mid=Factory.getFactory(Segment.MID);
        Laptop midLaptop=mid.getLaptop();
        Phone midPhone=mid.getPhone();
        System.out.println(midLaptop.getSegment());
        System.out.println(midPhone.getSegment());
    }
}
