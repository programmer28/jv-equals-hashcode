package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    private static final Integer A_FIRST = 300;
    private static final Integer B_FIRST = 400;
    private static final String COLOR_FIRST = "red";

    private static final Integer A_SECOND = 300;
    private static final Integer B_SECOND = 400;
    private static final String COLOR_SECOND = "red";

    @Test
    public void equalityOfRectangle() {
        Rectangle firstRectangle = new Rectangle(A_FIRST, B_FIRST, COLOR_FIRST);
        Rectangle secondRectangle = new Rectangle(A_SECOND, B_SECOND, COLOR_SECOND);

        Assert.assertTrue("Test failed with first hash "
                        + firstRectangle.hashCode()
                        + " and second hash " + secondRectangle.hashCode()
                        + " and equals " + firstRectangle.equals(secondRectangle),
                firstRectangle.equals(secondRectangle));
    }
}
