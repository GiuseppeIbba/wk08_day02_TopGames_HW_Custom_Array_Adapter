package example.codeclan.com.myapplication;

/**
 * Created by user on 24/01/2018.
 */

public class Game {


    private Integer ranking;
    private String title;
    private Integer year;

    public Game(Integer ranking, String title, Integer year) {
        this.ranking = ranking;
        this.title = title;
        this.year = year;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }
}
