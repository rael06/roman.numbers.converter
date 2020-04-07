public interface Converter {
    String convert();
    String compute(RomanNumber roman, RomanNumber romanException1, RomanNumber romanException2);
    String compute(RomanNumber roman);
}
