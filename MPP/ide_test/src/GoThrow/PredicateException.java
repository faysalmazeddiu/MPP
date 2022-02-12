package GoThrow;

import java.util.function.Predicate;

public interface PredicateException<T> {
    public boolean test(T t) throws Exception;

    public static <T> Predicate<T> helper(PredicateException<T> f) {
        return x -> {
            try {
                return f.test(x);
            } catch(Exception e) {
                throw new RuntimeException(e);
            }
        };
    }
}
