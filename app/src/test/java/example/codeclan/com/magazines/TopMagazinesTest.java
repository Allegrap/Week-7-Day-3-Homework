package example.codeclan.com.magazines;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 19/04/2017.
 */

public class TopMagazinesTest {

    @Test
    public void getListTest(){
        TopMagazines topMagazines = new TopMagazines();
        assertEquals(3, topMagazines.getList().size());
    }

}
