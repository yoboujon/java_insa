package partie6;

public class ErrDepl extends Exception {
    String message;

    ErrDepl() {
        this.message = "When moving a point, the result can't be negative.";
    }

    public String getMessage() {
        return message;
    }
}
