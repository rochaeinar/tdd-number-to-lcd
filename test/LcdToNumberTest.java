import com.erc.LcdNumber;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class LcdToNumberTest {

    @Test
    public void getLcdDefaultNumberTest_success() {
        LcdNumber lcdNumber = new LcdNumber(8);
        String[][] defaultLcdNumber =
                {
                        {" ", "_", " "},
                        {"|", "_", "|"},
                        {"|", "_", "|"}
                };

        assert Arrays.deepEquals(lcdNumber.getLcdRepresentation(), defaultLcdNumber);
    }

    @Test
    public void getLcdIntegerNumberTest_success() {
        LcdNumber lcdNumber = new LcdNumber(5);
        assert lcdNumber.getNumber() == 5;
    }


}
