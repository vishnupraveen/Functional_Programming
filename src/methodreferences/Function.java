package methodreferences;
@FunctionalInterface
public interface Function<S, T>{
    T apply(S s);

}
