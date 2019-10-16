import com.erc.LineHelper;
import org.junit.Test;

public class LineTest {

    @Test
    public void isTopBorderTest() {
        LineHelper lineHelper = new LineHelper(5, 7);
        assert lineHelper.isTopBorder(0);
        assert !lineHelper.isTopBorder(1);
    }

    @Test
    public void isBottomBorderTest() {
        LineHelper lineHelper = new LineHelper(5, 7);
        assert !lineHelper.isBottomBorder(0);
        assert lineHelper.isBottomBorder(6);
    }

    @Test
    public void isLeftBorderTest() {
        LineHelper lineHelper = new LineHelper(5, 7);
        assert lineHelper.isLeftBorder(0);
        assert !lineHelper.isLeftBorder(4);
    }

    @Test
    public void isRightBorderTest() {
        LineHelper lineHelper = new LineHelper(5, 7);
        assert !lineHelper.isRightBorder(0);
        assert lineHelper.isRightBorder(4);
    }

    @Test
    public void isTopLeftCornerTest() {
        LineHelper lineHelper = new LineHelper(5, 7);
        assert lineHelper.isTopLeftCorner(0, 0);
        assert !lineHelper.isTopLeftCorner(4, 6);
    }

    @Test
    public void isTopRightCornerTest() {
        LineHelper lineHelper = new LineHelper(5, 7);
        assert !lineHelper.isTopRightCorner(0, 0);
        assert lineHelper.isTopRightCorner(4, 0);
    }

    @Test
    public void isBottomLeftCornerTest() {
        LineHelper lineHelper = new LineHelper(5, 7);
        assert !lineHelper.isBottomLeftCorner(4, 6);
        assert lineHelper.isBottomLeftCorner(0, 6);
    }

    @Test
    public void isBottomRightCornerTest() {
        LineHelper lineHelper = new LineHelper(5, 7);
        assert !lineHelper.isBottomRightCorner(0, 6);
        assert lineHelper.isBottomRightCorner(4, 6);
    }

    @Test
    public void isMiddleTest() {
        LineHelper lineHelper = new LineHelper(5, 7);
        assert !lineHelper.isMiddle(0);
        assert lineHelper.isMiddle(3);
    }

    public void isMiddleLeftCornerTest() {
        LineHelper lineHelper = new LineHelper(5, 7);
        assert !lineHelper.isMiddleLeftCorner(4, 3);
        assert lineHelper.isMiddleLeftCorner(0, 3);
    }

    @Test
    public void isMiddleRightCornerTest() {
        LineHelper lineHelper = new LineHelper(5, 7);
        assert !lineHelper.isMiddleRightCorner(0, 3);
        assert lineHelper.isMiddleRightCorner(4, 3);
    }

    @Test
    public void isCornerTest() {
        LineHelper lineHelper = new LineHelper(5, 7);
        assert lineHelper.isCorner(0, 0);
        assert lineHelper.isCorner(4, 0);
        assert lineHelper.isCorner(0, 3);
        assert lineHelper.isCorner(4, 3);
        assert lineHelper.isCorner(0, 6);
        assert lineHelper.isCorner(4, 6);

        assert !lineHelper.isCorner(1, 1);
        assert !lineHelper.isCorner(5, 1);
        assert !lineHelper.isCorner(1, 4);
        assert !lineHelper.isCorner(5, 4);
        assert !lineHelper.isCorner(1, 5);
        assert !lineHelper.isCorner(5, 5);
    }

}
