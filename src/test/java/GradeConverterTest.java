import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeConverterTest {

    private  GradeConverter converter;
    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }

    @Test
    public void testConvert1() {
        String excepted = "A";
        String actual = converter.convert(100);
        assertEquals(excepted, actual);
    }

    @Test
    public void testConvert2() {
        String excepted = "A";
        String actual = converter.convert(90);
        assertEquals(excepted, actual);
    }
    @Test
    public void testConvert3() {
        String excepted = "B";
        String actual = converter.convert(80);
        assertEquals(excepted, actual);
    }

}