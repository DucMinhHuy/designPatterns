package abstrctFactoryMedthod;

public class Factory {
    public static AbstractFactory getFactory(Segment segment){
        switch (segment){
            case MID:
                return new MidFactory();
            case HEIGHT:
                return new HeightFactory();
            default:
                throw new UnsupportedOperationException("this  Unsupport");
        }
    }
}
