public class Drone extends Ant {


    Drone(int name, int xPosition, int yPosition) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }


    @Override
    void move() {
        if (xPosition > 0 && yPosition > 0) {
            xPosition += 1;
        }
    }
}
