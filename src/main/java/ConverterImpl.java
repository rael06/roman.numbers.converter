import java.util.Scanner;

public class ConverterImpl implements Converter {
    private static final RomanNumber I = RomanNumber.I;
    private static final RomanNumber V = RomanNumber.V;
    private static final RomanNumber X = RomanNumber.X;
    private static final RomanNumber L = RomanNumber.L;
    private static final RomanNumber C = RomanNumber.C;
    private static final RomanNumber D = RomanNumber.D;
    private static final RomanNumber M = RomanNumber.M;
    private static final int NUMBER_OF_ROMAN_EXCEPTION_SYMBOL = 1;

    private int number;

    public ConverterImpl(int i) {
        number = i;
    }

    @Override
    public String convert() {
        return compute(M) +
                compute(C, D, M) +
                compute(X, L, C) +
                compute(I, V, X);
    }

    private String romanSymbols(String r, int nbOfSymbol) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nbOfSymbol; i++) {
            result.append(r);
        }
        return result.toString();
    }

    @Override
    public String compute(RomanNumber roman, RomanNumber romanException1, RomanNumber romanException2) {
        int nbOfSymbol = number % romanException2.number() / roman.number();
        int romanLimit1 = (romanException1.number() - roman.number()) / roman.number();
        int romanLimit2 = (romanException2.number() - roman.number()) / roman.number();

        if (nbOfSymbol == romanLimit1)
            return roman.symbol() + romanException1.symbol();
        if (nbOfSymbol == romanLimit2)
            return roman.symbol() + romanException2.symbol();
        if (nbOfSymbol > romanLimit1)
            return romanException1.symbol() + romanSymbols(roman.symbol(), nbOfSymbol - romanLimit1 - NUMBER_OF_ROMAN_EXCEPTION_SYMBOL);
        return romanSymbols(roman.symbol(), nbOfSymbol);
    }

    @Override
    public String compute(RomanNumber roman) {
        int nbOfSymbol = number / roman.number();
        return romanSymbols(roman.symbol(), nbOfSymbol);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int number = Integer.parseInt(sc.nextLine());
            Converter converter = new ConverterImpl(number);
            System.out.println(converter.convert());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
