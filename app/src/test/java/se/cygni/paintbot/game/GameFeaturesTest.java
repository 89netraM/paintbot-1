package se.cygni.paintbot.game;

import org.junit.Assert;
import org.junit.Test;

public class GameFeaturesTest {

    @Test
    public void testMaxNoofPlayersIsMax20() throws Exception {
        GameFeatures gf = new GameFeatures();
        gf.setMaxNoofPlayers(99);
        gf.applyValidation();

        Assert.assertEquals(20, gf.getMaxNoofPlayers());
    }

    @Test
    public void testMaxNoofPlayersIsMin2() throws Exception {
        GameFeatures gf = new GameFeatures();
        gf.setMaxNoofPlayers(-2);
        gf.applyValidation();

        Assert.assertEquals(2, gf.getMaxNoofPlayers());

        gf.setMaxNoofPlayers(0);
        gf.applyValidation();

        Assert.assertEquals(2, gf.getMaxNoofPlayers());
    }

    @Test
    public void testStartObstaclesIsPositive() throws Exception {
        GameFeatures gf = new GameFeatures();
        gf.setStartObstacles(-2);
        gf.applyValidation();

        Assert.assertEquals(0, gf.getStartObstacles());

        gf.setStartObstacles(0);
        gf.applyValidation();

        Assert.assertEquals(0, gf.getStartObstacles());

        gf.setStartObstacles(7);
        gf.applyValidation();

        Assert.assertEquals(7, gf.getStartObstacles());
    }

    @Test
    public void testStartFoodIsPositive() throws Exception {
        GameFeatures gf = new GameFeatures();
        gf.setStartPowerUps(-2);
        gf.applyValidation();

        Assert.assertEquals(0, gf.getStartPowerUps());

        gf.setStartPowerUps(0);
        gf.applyValidation();

        Assert.assertEquals(0, gf.getStartPowerUps());

        gf.setStartPowerUps(7);
        gf.applyValidation();

        Assert.assertEquals(7, gf.getStartPowerUps());
    }
}