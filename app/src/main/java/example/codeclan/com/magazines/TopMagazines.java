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
        list.add(new Magazine(2, "Cherry Bombe", 2017));
        list.add(new Magazine(3, "Junko", 2015));
        list.add(new Magazine(4, "Drift", 2013));
        list.add(new Magazine(5, "Beirut Cooks", 2015));
        list.add(new Magazine(6, "Standart", 2010));
        list.add(new Magazine(7, "Elementum", 2017));
        list.add(new Magazine(8, "In Clover", 2015));
        list.add(new Magazine(9, "Lunch Lady", 2016));
        list.add(new Magazine(10, "Tank", 2017));
    }

    public ArrayList<Magazine> getList(){
        return new ArrayList<Magazine>(list);
    }
}
