package buiderPartern;

public class ClientTest {
    public static void main(String[] args) {
        House house=new HouseBuilder().buildWalls(4).buildColor("red").buildDoors(2).build();
        System.out.println(house);
    }
}
