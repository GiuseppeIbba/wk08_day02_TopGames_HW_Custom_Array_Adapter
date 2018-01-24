package example.codeclan.com.myapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 24/01/2018.
 */

public class GameTest {

    Game game;

    @Before
    public void before() {
        game = new Game(38, "Divinity 2: Original Sin", 2017);
        }

    @Test
    public void getRankingTest() {
        assertEquals((Integer)38, game.getRanking());

    }

    @Test
    public void getTitleTest() {
        assertEquals("Divinity 2: Original Sin", game.getTitle());

    }

    @Test
    public void getYearTest() {
        assertEquals((Integer)2017, game.getYear());

    }

}

