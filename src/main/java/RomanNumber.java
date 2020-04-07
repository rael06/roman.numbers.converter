public enum RomanNumber {
    I(1, "I"),
    V(5, "V"),
    X(10, "X"),
    L(50, "L"),
    C(100, "C"),
    D(500, "D"),
    M(1000, "M");

    private int number;
    private String roman;

    RomanNumber(int n, String r) {
        number = n;
        roman = r;
    }

    public int number() {
        return number;
    }

    public String symbol() {
        return roman;
    }
}
