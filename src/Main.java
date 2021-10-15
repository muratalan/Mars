import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Robotic robotic = new Robotic();

        Rover rover = new Rover();
        rover.setX(1);
        rover.setY(2);
        rover.setFace(Rover.Face.N);
        rover.setCommands("LMLMLMLMM");

        Rover rover2 = new Rover();
        rover2.setX(3);
        rover2.setY(3);
        rover2.setFace(Rover.Face.E);
        rover2.setCommands("MMRMMRMRRM");

        List<Rover> rovers = new ArrayList<>();
        rovers.add(rover);
        rovers.add(rover2);

        List<Rover> output = robotic.viewMars(5, 5, rovers);

        for (Rover r : output) {
            System.out.println(r.getX() + " " + r.getY() + " " + r.getFace().toString());
        }

    }
}
