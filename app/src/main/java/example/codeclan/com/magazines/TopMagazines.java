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
        list.add(new Magazine(2, "Cherry Bomb", 2017));
        list.add(new Magazine(3, "Junko", 2015));
    }

    public ArrayList<Magazine> getList(){
        return new ArrayList<Magazine>(list);
    }
}
