import java.util.List;

public class Robotic {

    public List<Rover> viewMars(int coordinateX, int coordinateY, List<Rover> rovers) {

        for (Rover rover : rovers) {
            for (char c : rover.getCommands().toCharArray()) {
                actionFace(rover, c);
                if ((rover.getX() < 0 || rover.getX() > coordinateX) || (rover.getY()<0 || rover.getY() > coordinateY)) {
                    throw new UnsupportedOperationException();
                }
            }
        }

        return rovers;
    }

    private Rover actionFace(Rover rover, char c) {
        switch (rover.getFace()) {
            case N:
                switch (String.valueOf(c)) {
                    case "L":
                        rover.setFace(Rover.Face.W);
                        break;
                    case "R":
                        rover.setFace(Rover.Face.E);
                        break;
                    case "M":
                        rover.setY(rover.getY() + 1);
                        break;
                }
                break;
            case S:
                switch (String.valueOf(c)) {
                    case "L":
                        rover.setFace(Rover.Face.E);
                        break;
                    case "R":
                        rover.setFace(Rover.Face.W);
                        break;
                    case "M":
                        rover.setY(rover.getY() - 1);
                        break;
                }
                break;
            case E:
                switch (String.valueOf(c)) {
                    case "L":
                        rover.setFace(Rover.Face.N);
                        break;
                    case "R":
                        rover.setFace(Rover.Face.S);
                        break;
                    case "M":
                        rover.setX(rover.getX() + 1);
                        break;
                }
                break;
            case W:
                switch (String.valueOf(c)) {
                    case "L":
                        rover.setFace(Rover.Face.S);
                        break;
                    case "R":
                        rover.setFace(Rover.Face.N);
                        break;
                    case "M":
                        rover.setX(rover.getX() - 1);
                        break;
                }
                break;
        }
        return rover;
    }

}
