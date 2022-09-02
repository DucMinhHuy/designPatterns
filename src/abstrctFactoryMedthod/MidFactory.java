package abstrctFactoryMedthod;

public class MidFactory extends AbstractFactory {

    @Override
    Phone getPhone() {
        return new MidRangePhone();
    }

    @Override
    Laptop getLaptop() {
        return new MidLaptop();
    }
}
