import praktikum.Ingredient;
import praktikum.IngredientType;

import org.junit.Assert;
import org.junit.Test;


public class IngredientTest {
    final String FILLING = "Beef meteorite (chop)";
    final String SAUCE = "Spicy-X Sauce";
    final float FILLING_PRICE = 2000f;
    final float SAUCE_PRICE = 90f;

    Ingredient ingredientFilling = new Ingredient(IngredientType.FILLING, FILLING, FILLING_PRICE);
    Ingredient ingredientSauce = new Ingredient(IngredientType.SAUCE, SAUCE, SAUCE_PRICE);

    @Test
    public void testIngredientFillingGetName() {
        Assert.assertEquals(FILLING, ingredientFilling.getName());
    }

    @Test
    public void testIngredientFillingGetPrice() {
        Assert.assertEquals(FILLING_PRICE, ingredientFilling.getPrice(), 0);
    }

    @Test
    public void testIngredientFillingGetType() {
        Assert.assertEquals(IngredientType.FILLING, ingredientFilling.getType());
    }

    @Test
    public void testIngredientSauceGetName() {
        Assert.assertEquals(SAUCE, ingredientSauce.getName());
    }

    @Test
    public void testIngredientSauceGetPrice() {
        Assert.assertEquals(SAUCE_PRICE, ingredientSauce.getPrice(), 0);
    }

    @Test
    public void testIngredientSauceGetType() {
        Assert.assertEquals(IngredientType.SAUCE, ingredientSauce.getType());
    }
}
