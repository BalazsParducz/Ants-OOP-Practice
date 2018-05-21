import java.lang.reflect.Type;

abstract class Ant {

    int xPosition;
    int yPosition;
    int name;

    public int distanceFromQueen() {
        return Math.abs(xPosition) + Math.abs(yPosition);
    }

    @Override
    public String toString() {
        return " " + name + ":\nX position: " + xPosition + " / Y position: " + yPosition +
                "\nDistance from the Queen " + distanceFromQueen() + "\n";
    }

    abstract void move();
}
