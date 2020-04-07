import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    private static final RomanNumber I = RomanNumber.I;
    private static final RomanNumber V = RomanNumber.V;
    private static final RomanNumber X = RomanNumber.X;
    private static final RomanNumber L = RomanNumber.L;
    private static final RomanNumber C = RomanNumber.C;
    private static final RomanNumber D = RomanNumber.D;
    private static final RomanNumber M = RomanNumber.M;

    @Test
    public void Converter_compute_ShouldBe_III() {
        //arrange
        Converter converter = new ConverterImpl(3);

        //act
        String result = converter.compute(I, V, X);

        //assert
        Assert.assertEquals("III", result);
    }

    @Test
    public void Converter_compute_ShouldBe_IV() {
        //arrange
        Converter converter = new ConverterImpl(4);

        //act
        String result = converter.compute(I, V, X);

        //assert
        Assert.assertEquals("IV", result);
    }

    @Test
    public void Converter_compute_ShouldBe_VIII() {
        //arrange
        Converter converter = new ConverterImpl(8);

        //act
        String result = converter.compute(I, V, X);

        //assert
        Assert.assertEquals("VIII", result);
    }

    @Test
    public void Converter_compute_ShouldBe_IX() {
        //arrange
        Converter converter = new ConverterImpl(9);

        //act
        String result = converter.compute(I, V, X);

        //assert
        Assert.assertEquals("IX", result);
    }

    @Test
    public void Converter_compute_ShouldBe_XXX() {
        //arrange
        Converter converter = new ConverterImpl(30);

        //act
        String result = converter.compute(X, L, C);

        //assert
        Assert.assertEquals("XXX", result);
    }

    @Test
    public void Converter_computeX_ShouldBe_XL() {
        //arrange
        Converter converter = new ConverterImpl(40);

        //act
        String result = converter.compute(X, L, C);

        //assert
        Assert.assertEquals("XL", result);
    }

    @Test
    public void Converter_compute_ShouldBe_LXXX() {
        //arrange
        Converter converter = new ConverterImpl(80);

        //act
        String result = converter.compute(X, L, C);

        //assert
        Assert.assertEquals("LXXX", result);
    }

    @Test
    public void Converter_computeX_ShouldBe_XC() {
        //arrange
        Converter converter = new ConverterImpl(90);

        //act
        String result = converter.compute(X, L, C);

        //assert
        Assert.assertEquals("XC", result);
    }

    @Test
    public void Converter_convert_ShouldBe_XCVIII() {
        //arrange
        Converter converter = new ConverterImpl(98);

        //act
        String result = converter.convert();

        //assert
        Assert.assertEquals("XCVIII", result);
    }

    @Test
    public void Converter_convert_ShouldBe_XCIV() {
        //arrange
        Converter converter = new ConverterImpl(94);

        //act
        String result = converter.convert();

        //assert
        Assert.assertEquals("XCIV", result);
    }

    @Test
    public void Converter_convert_ShouldBe_XCIX() {
        //arrange
        Converter converter = new ConverterImpl(99);

        //act
        String result = converter.convert();

        //assert
        Assert.assertEquals("XCIX", result);
    }

    @Test
    public void Converter_compute_ShouldBe_CCC() {
        //arrange
        Converter converter = new ConverterImpl(300);

        //act
        String result = converter.compute(C, D, M);

        //assert
        Assert.assertEquals("CCC", result);
    }

    @Test
    public void Converter_compute_ShouldBe_CD() {
        //arrange
        Converter converter = new ConverterImpl(400);

        //act
        String result = converter.compute(C, D, M);

        //assert
        Assert.assertEquals("CD", result);
    }

    @Test
    public void Converter_compute_ShouldBe_DCCC() {
        //arrange
        Converter converter = new ConverterImpl(800);

        //act
        String result = converter.compute(C, D, M);

        //assert
        Assert.assertEquals("DCCC", result);
    }

    @Test
    public void Converter_compute_ShouldBe_CM() {
        //arrange
        Converter converter = new ConverterImpl(900);

        //act
        String result = converter.compute(C, D, M);

        //assert
        Assert.assertEquals("CM", result);
    }

    @Test
    public void Converter_compute_ShouldBe_MMM() {
        //arrange
        Converter converter = new ConverterImpl(3000);

        //act
        String result = converter.compute(M);

        //assert
        Assert.assertEquals("MMM", result);
    }

    @Test
    public void Converter_compute_ShouldBe_MMMM() {
        //arrange
        Converter converter = new ConverterImpl(4000);

        //act
        String result = converter.compute(M);

        //assert
        Assert.assertEquals("MMMM", result);
    }

    @Test
    public void Converter_convert_ShouldBe_MMDXCIX() {
        //arrange
        Converter converter = new ConverterImpl(2599);

        //act
        String result = converter.convert();

        //assert
        Assert.assertEquals("MMDXCIX", result);
    }

    @Test
    public void Converter_convert_ShouldBe_MMMMCMLXXVIII() {
        //arrange
        Converter converter = new ConverterImpl(4978);

        //act
        String result = converter.convert();

        //assert
        Assert.assertEquals("MMMMCMLXXVIII", result);
    }
}
