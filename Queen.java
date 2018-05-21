public class Queen extends Ant {

    private static Queen instance = null;

    private Queen() {}

    public static Queen getInstance() {
        if (instance == null) {
            instance = new Queen();
        }
        return instance;
    }

    @Override
    void move() {
        xPosition = 0;
        yPosition = 0;
    }
}
