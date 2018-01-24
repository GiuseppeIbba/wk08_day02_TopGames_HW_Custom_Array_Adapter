package example.codeclan.com.myapplication;

import java.util.ArrayList;

/**
 * Created by user on 24/01/2018.
 */

class TopGames {

    private ArrayList<Game> list;

    public TopGames() {
        list = new ArrayList<>();
        list.add(new Game(1, "Grand Theft Auto V", 2013));
        list.add(new Game(2, "The Elder Scroll V: Skyrim", 2013));
        list.add(new Game(3, "Half-Life 2", 2004));
        list.add(new Game(4, "Portal 2", 2007));
        list.add(new Game(5, "The Witcher 3: Wild Hunt", 2015));
        list.add(new Game(6, "Doom", 1993));
        list.add(new Game(7, "Mass Effect 2", 2009));
        list.add(new Game(8, "Final Fantasy VIII", 1999));
        list.add(new Game(9, "Fallout 4", 2015));
        list.add(new Game(10, "Knuckle Joe", 1985));

    }


    public ArrayList<Game> getList() {
        return new ArrayList<Game>(list);
    }
}