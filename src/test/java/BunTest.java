import praktikum.Bun;

import org.junit.Assert;
import org.junit.Test;

public class BunTest {

    final String BUN_NAME = "Fluorescent bun R2-D3";
    final float BUN_PRICE = 988f;
    Bun bun = new Bun(BUN_NAME, BUN_PRICE);

    @Test
    public void testBunGetName() {
        Assert.assertEquals(bun.getName(), "Fluorescent bun R2-D3");
    }

    @Test
    public void testBunGetPrice() {
        Assert.assertEquals(988f, bun.getPrice(), 0);
    }
}