class Soldier extends Ant {

    Soldier(int name, int xPosition, int yPosition) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    Directions dirs;

    @Override
    void move() {
        switch (dirs) {
            case NORTH:
                yPosition += 1;
                break;
            case EAST:
                xPosition += 1;
                break;
            case SOUTH:
                yPosition -= 1;
                break;
            case WEST:
                xPosition -= 1;
        }
    }
}
