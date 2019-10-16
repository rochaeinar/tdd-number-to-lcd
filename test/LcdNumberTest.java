import com.erc.LcdNumber;
import org.junit.Test;

import java.util.Arrays;

public class LcdNumberTest {

    @Test
    public void getLcdDefaultNumberTest_success() {
        LcdNumber lcdNumber = new LcdNumber(8, 1, 1);
        String[][] defaultLcdNumber =
                {
                        {" ", "_", " "},
                        {"|", " ", "|"},
                        {" ", "_", " "},
                        {"|", " ", "|"},
                        {" ", "_", " "}
                };

        assert Arrays.deepEquals(lcdNumber.getLcdRepresentation(), defaultLcdNumber);
    }

    @Test
    public void getLcdIntegerNumberTest_success() {
        LcdNumber lcdNumber = new LcdNumber(5, 1, 1);
        assert lcdNumber.getNumber() == 5;
    }

    @Test
    public void createLcdNumberSizes_success() {
        LcdNumber lcdNumber = new LcdNumber(5, 3, 2);
        assert lcdNumber.getLcdRepresentation().length == 7;
        assert lcdNumber.getLcdRepresentation()[0].length == 5;
    }

}
