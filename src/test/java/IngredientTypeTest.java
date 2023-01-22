import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import praktikum.Ingredient;
import praktikum.IngredientType;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

@RunWith(Parameterized.class)
public class IngredientTypeTest {
    private final String NAME;
    private final IngredientType TYPE;
    private final float PRICE;

    public IngredientTypeTest(IngredientType TYPE, String NAME, float PRICE) {
        this.TYPE = TYPE;
        this.NAME = NAME;
        this.PRICE = PRICE;
    }

    @Parameterized.Parameters()
    public static Object[][] dataForTest() {
        return new Object[][]{
                { SAUCE, "Spicy-X Sauce", 90f},
                { FILLING, "Beef meteorite (chop)", 2000f},
                { FILLING, "Mini salad Exo-Plantago", 4400f},
        };
    }

    @Test
    public void testIngredientType() {
        Ingredient ingredient = new Ingredient(TYPE, NAME, PRICE);
        Assert.assertEquals(TYPE, ingredient.getType());
    }

}