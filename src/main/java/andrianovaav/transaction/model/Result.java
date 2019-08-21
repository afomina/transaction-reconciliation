package andrianovaav.transaction.model;

import java.util.Optional;

/**
 *
 * @param <T>
 */
public class Result<T> {

    private final Status status;
    private final T result;
    private final String error;

    private Result(Status status, T result, String error) {
        this.status = status;
        this.result = result;
        this.error = error;
    }

    public static <T> Result<T> success(T result) {
        return new Result<>(Status.SUCCESS, result, null);
    }

    public static <T> Result<T> error(String error) {
        return new Result<>(Status.ERROR, null, error);
    }

    public Status getStatus() {
        return status;
    }

    public Optional<T> getResult() {
        return Optional.ofNullable(result);
    }

    public Optional<String> getError() {
        return Optional.ofNullable(error);
    }

    public boolean isSuccess() {
        return status == Status.SUCCESS;
    }

    public static enum Status {
        SUCCESS,
        ERROR
    }

}
