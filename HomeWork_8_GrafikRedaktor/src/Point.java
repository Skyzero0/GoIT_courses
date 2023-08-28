public class Point implements Drawable, GetShapesName{
//    private final double x;
//    private final double y;

    public Point () {    }

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }

    public String toString (){
        return getClass().getName();
    }

//    public void getName (){
//        System.out.println(getClass().getName());
//        System.out.println("Точка");
//    }
}

