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
        magazine = new Magazine(1, "Ambrosia", 2016);
    }

    @Test
    public void getNameTest(){
        assertEquals("Ambrosia", magazine.getName());
    }

    @Test
    public void getRankingTest(){
        assertEquals((Integer)1, magazine.getRanking());
    }

    @Test
    public void getYearTest(){
        assertEquals((Integer)2016, magazine.getYear());
    }
}
