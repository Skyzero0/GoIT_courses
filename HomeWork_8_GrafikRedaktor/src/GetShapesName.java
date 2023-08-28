public interface GetShapesName{

    default void getName() {
        System.out.println(getClass().getName());
    };
}
