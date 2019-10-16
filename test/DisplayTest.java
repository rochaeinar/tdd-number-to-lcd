import com.erc.Display;
import com.erc.LcdMap;
import com.erc.LcdNumber;
import org.junit.Test;

import java.util.Arrays;

public class DisplayTest {

    @Test
    public void getEmptyDisplayTest_success() {
        Display display = new Display();
        assert display.getLcdNumbers().size() == 0;
    }

    @Test
    public void getDisplayWithNumberTest_success() {
        Display display = new Display();
        LcdNumber lcdNumber = new LcdNumber(5, 1, 1);
        display.addLcdNumber(lcdNumber);
        assert display.getLcdNumbers().size() == 1;
    }

    @Test
    public void getMultipleNumbersString_success() {
        Display display = new Display();
        LcdNumber lcdNumber0 = new LcdNumber(0, 5, 3);
        LcdNumber lcdNumber1 = new LcdNumber(1, 5, 3);
        LcdNumber lcdNumber2 = new LcdNumber(2, 5, 3);
        LcdNumber lcdNumber3 = new LcdNumber(3, 5, 3);
        LcdNumber lcdNumber4 = new LcdNumber(4, 5, 3);
        LcdNumber lcdNumber5 = new LcdNumber(5, 5, 3);
        LcdNumber lcdNumber6 = new LcdNumber(6, 5, 3);
        LcdNumber lcdNumber7 = new LcdNumber(7, 5, 3);
        LcdNumber lcdNumber8 = new LcdNumber(8, 5, 3);
        LcdNumber lcdNumber9 = new LcdNumber(9, 5, 3);
        display.addLcdNumber(lcdNumber0);
        display.addLcdNumber(lcdNumber1);
        display.addLcdNumber(lcdNumber2);
        display.addLcdNumber(lcdNumber3);
        display.addLcdNumber(lcdNumber4);
        display.addLcdNumber(lcdNumber5);
        display.addLcdNumber(lcdNumber6);
        display.addLcdNumber(lcdNumber7);
        display.addLcdNumber(lcdNumber8);
        display.addLcdNumber(lcdNumber9);

        System.out.println(display.getStringRepresentation());

        assert display.getStringRepresentation()
                .equals(" _____               _____     _____               _____     _____     _____     _____     _____    \n" +
                        "|     |         |         |         |   |     |   |         |               |   |     |   |     |   \n" +
                        "|     |         |         |         |   |     |   |         |               |   |     |   |     |   \n" +
                        "|     |         |         |         |   |     |   |         |               |   |     |   |     |   \n" +
                        "                     _____     _____     _____     _____     _____               _____     _____    \n" +
                        "|     |         |   |               |         |         |   |     |         |   |     |         |   \n" +
                        "|     |         |   |               |         |         |   |     |         |   |     |         |   \n" +
                        "|     |         |   |               |         |         |   |     |         |   |     |         |   \n" +
                        " _____               _____     _____               _____     _____               _____     _____    \n"
                );
    }
}
