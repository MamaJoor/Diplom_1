import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.hamcrest.CoreMatchers.is;
import static praktikum.IngredientType.SAUCE;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    @Mock
    Bun bun;
    @Mock
    Ingredient ingredient;
    @Mock
    Burger burger;

    @Before
    public void setUp(){
        burger = new Burger();
    }

    @Test
    public void testBurgerSetBuns() {
        burger.setBuns(bun);
        Assert.assertEquals(bun, burger.bun);
    }

    @Test
    public void testBurgerAddIngredient() {
        burger.addIngredient(ingredient);
        Assert.assertEquals(1, burger.ingredients.size());
    }

    @Test
    public void testBurgerRemoveIngredient() {
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
        Assert.assertEquals(0, burger.ingredients.size());
    }

    @Test
    public void testBurgerMoveIngredient() {
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        Ingredient ingredientItem = Mockito.mock(Ingredient.class);
        burger.addIngredient(ingredientItem);
        burger.moveIngredient(3, 0);
        Assert.assertEquals(ingredientItem, burger.ingredients.get(0));
    }

    @Test
    public void testBurgerGetPrice() {
        Mockito.when(bun.getPrice()).thenReturn(200f);
        burger.setBuns(bun);
        Mockito.when(ingredient.getPrice()).thenReturn(200f);
        burger.addIngredient(ingredient);
        Assert.assertEquals(600f, burger.getPrice(), 0);
    }


//    @Test
//    public void testBurgerGetReceipt() {
//    }
}

