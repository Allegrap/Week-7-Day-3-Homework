package example.codeclan.com.magazines;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 19/04/2017.
 */

public class MagazineTest {

    Magazine magazine;

    @Before
    public void before(){
        Magazine magazine = new Magazine(1, "Ambrosia", 2016);
    }

    @Test
    public void canGetName(){
        assertEquals("Ambrosia", magazine.getName());
    }
}
