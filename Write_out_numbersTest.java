import static org.junit.Assert.*;
import org.junit.Test;

public class Write_out_numbersTest {


    @Test
    public void testToWord() {
        Write_out_numbers test = new Write_out_numbers();
        assertEquals(test.fn("0"), "zero ");
        assertEquals(test.fn("1"), "one ");
        assertEquals(test.fn("9"), "nine ");
        assertEquals(test.fn("10"), "ten ");
        assertEquals(test.fn("17"), "seventeen ");
        assertEquals(test.fn("20"), "twenty ");
        assertEquals(test.fn("21"), "twenty one ");
        assertEquals(test.fn("45"), "forty five ");
        assertEquals(test.fn("80"), "eighty ");
        assertEquals(test.fn("99"), "ninety nine ");
        assertEquals(test.fn("100"), "one hundred ");
        assertEquals(test.fn("301"), "three hundred one ");
        assertEquals(test.fn("799"), "seven hundred ninety nine ");
        assertEquals(test.fn("800"), "eight hundred ");
        assertEquals(test.fn("950"), "nine hundred fifty ");
        assertEquals(test.fn("1000"), "one thousand ");
        assertEquals(test.fn("1002"), "one thousand two ");
        assertEquals(test.fn("3051"), "three thousand fifty one ");
        assertEquals(test.fn("7200"), "seven thousand two hundred ");
        assertEquals(test.fn("7219"), "seven thousand two hundred nineteen ");
        assertEquals(test.fn("8330"), "eight thousand three hundred thirty ");
        assertEquals(test.fn("99999"), "ninety nine thousand nine hundred ninety nine ");
        assertEquals(test.fn("888888"), "eight hundred eighty eight thousand eight hundred eighty eight ");
    }

}
