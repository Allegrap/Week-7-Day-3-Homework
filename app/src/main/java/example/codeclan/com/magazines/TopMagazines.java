package example.codeclan.com.magazines;

import java.util.ArrayList;

/**
 * Created by user on 19/04/2017.
 */

public class TopMagazines {

    private ArrayList<Magazine> list;

    public TopMagazines() {
        list = new ArrayList<Magazine>();
        list.add(new Magazine(1, "Ambrosia", 2016));
        list.add(new Magazine(1, "Cherry Bomb", 2017));
        list.add(new Magazine(1, "Junko", 2015));
    }
}
