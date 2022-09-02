package abstrctFactoryMedthod;

public class HeightFactory extends AbstractFactory{
    @Override
    Phone getPhone() {
        return new HeightPhone();
    }

    @Override
    Laptop getLaptop() {
        return new HeightLaptop();
    }
}
