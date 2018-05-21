import java.util.Random;

class Worker extends Ant {

    Worker(int name, int xPosition, int yPosition) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    Random step = new Random();
    private int direction = step.nextInt(4);

    @Override
    void move() {
        if (direction == 0)
            xPosition += 1;

        else if (direction == 1)
            xPosition -= 1;

        else if (direction == 2)
            yPosition += 1;

        else if (direction == 3)
            yPosition -= 1;
    }
}
