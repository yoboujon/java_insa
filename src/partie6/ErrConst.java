package partie6;

public class ErrConst extends Exception {
    String message;
    int abs;
    int ord;

    ErrConst() {
        this.message = "Exception thrown.";
    }

    ErrConst(String s) {
        this.message = s;
    }

    ErrConst(int x, int y) {
        this.abs = x;
        this.ord = y;
        if (x < 0)
            this.message = "X can't be negative";
        if (y < 0)
            this.message = "Y can't be negative";
    }

    public int getAbs() {
        return this.abs;
    }

    public int getOrd() {
        return this.ord;
    }

    public String getMessage() {
        return message;
    }
}
