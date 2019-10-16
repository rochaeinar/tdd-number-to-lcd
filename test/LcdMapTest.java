import com.erc.LcdMap;
import com.erc.LcdNumber;
import org.junit.Test;

import java.util.Arrays;

public class LcdMapTest {

    @Test
    public void getDefaultNumberMapTest_success() {
        assert LcdMap.getMap(8).length == 0;
    }

    @Test
    public void getZeroNumberMapTest_success() {
        int[] lcdUnmarked = new int[]{4};
        assert Arrays.equals(LcdMap.getMap(0), lcdUnmarked);
    }

    @Test
    public void getOneNumberMapTest_success() {
        int[] lcdUnmarked = new int[]{1, 2, 4, 5, 7};
        assert Arrays.equals(LcdMap.getMap(1), lcdUnmarked);
    }

    @Test
    public void getSevenNumberMapTest_success() {
        int[] lcdUnmarked = new int[]{2, 4, 5, 7};
        assert Arrays.equals(LcdMap.getMap(7), lcdUnmarked);
    }

}
