import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Colony {

    private static List<Ant> ants = new ArrayList<>();
    private static Random antGenerator = new Random();

    private static void init() {
        ants.add(Queen.getInstance());

        for (int i=0; i<10; i++) {
            int antType = antGenerator.nextInt(3);

            int xPositionGenerator = antGenerator.nextInt((-50 + 150)+1);
            int yPositionGenerator = antGenerator.nextInt((-50 + 100)+1);

            if (antType==0)
                ants.add(new Drone(i, xPositionGenerator, yPositionGenerator));
            else if (antType==1)
                ants.add(new Worker(i, xPositionGenerator, yPositionGenerator));
            else if (antType==2)
                ants.add(new Soldier(i, xPositionGenerator, yPositionGenerator));
        }
    }

    private static String antTypeFinder(Object obj) {
        Class cls = obj.getClass();
        return cls.getName();
    }

    public static void main(String[] args) {
        init();
        for (Ant ant: ants) {
            ant.move();
            System.out.println(antTypeFinder(ant) + ant.toString());
        }
    }
}
