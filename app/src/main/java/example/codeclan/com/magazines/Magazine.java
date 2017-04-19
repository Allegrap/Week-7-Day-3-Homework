package example.codeclan.com.magazines;

/**
 * Created by user on 19/04/2017.
 */

public class Magazine {

    private int ranking;
    private String name;
    private int year;

    public Magazine(Integer ranking, String name, Integer year){
        this.ranking = ranking;
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Integer getRanking() {
        return ranking;
    }

    public Integer getYear() {
        return year;
    }
}
