package dowlath.io.example.custom_functional_interface;

@FunctionalInterface
public interface TryTriFunction<T, U, V, R> {
    R apply(T t, U u, V v) throws Exception;
}