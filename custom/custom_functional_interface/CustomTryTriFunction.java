package dowlath.io.example.custom.custom_functional_interface;

@FunctionalInterface
public interface CustomTryTriFunction<T, U, V, R> {
        R apply(T t, U u, V v) throws Exception;
}
