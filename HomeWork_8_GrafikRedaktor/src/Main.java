import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        GetShapesName [] getShapesName = {new Point(), new Line(), new Triangle(), new Rectangle(), new Square()};

        for (GetShapesName o:getShapesName) {
            o.getName();
            System.out.println();
        }

    }
}