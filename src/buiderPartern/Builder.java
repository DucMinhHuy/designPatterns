package buiderPartern;

public interface Builder {
    Builder buildRoof(boolean hasRoof);
    Builder buildPool(boolean hasPool);
    Builder buildWalls(int walls);
    Builder buildDoors(int doors);
    Builder buildColor(String Color);
    House build();
}
