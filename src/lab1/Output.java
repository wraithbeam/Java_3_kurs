package lab1;

public interface Output {
    default void print(Object o){
        System.out.println(o);
    }
}
