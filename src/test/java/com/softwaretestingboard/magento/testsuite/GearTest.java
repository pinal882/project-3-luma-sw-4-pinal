package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends TestBase {
    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();


    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        //* Mouse Hover on Gear Menu
homePage.mouseHoverOnGear();
        //* Click on Bags
homePage.clickOnBags();
        //* Click on Product Name ‘Overnight Duffle’
bagsPage.clickOnProductNameOvernightDuffle();
        //* Verify the text ‘Overnight Duffle’
        String expectedText = "Overnight Duffle";
String actualText = bagsPage.VerifyTextOvernightDuffle();
        Assert.assertEquals(actualText,expectedText,"text does not match");
        //* Change Qty 3
bagsPage.changeQty3("3");
        //* Click on ‘Add to Cart’ Button.
bagsPage.clickOnAddToCartButton();
        //* Verify the text ‘You added Overnight Duffle to your shopping cart.’
        String expectedText1 = "You added Overnight Duffle to your shopping cart.";
String actualText1 = bagsPage.VerifyTextOvernightDuffle();
        //* Click on ‘shopping cart’ Link into message
bagsPage.clickOnShoppingCart();
//* Verify the product name ‘Cronus Yoga Pant’
        String expectedText2 = "Overnight Duffle";
        String actualText2 = shoppingCartPage.verifyProductNameCronusYogaPant();
Assert.assertEquals(actualText2,expectedText2,"text does not match");
        //* Verify the Qty is ‘3’
        Thread.sleep(1000);
        Assert.assertEquals(shoppingCartPage.getQty3(), "3");
        //String expectedText3 = "3";
        //String actualText3 = shoppingCartPage.getQty3();
        //Assert.assertEquals(actualText3,expectedText3,"Qty does not match");
        //* Verify the product price ‘$135.00’
        String expectedText4 = "$135.00";
String actualText4 = shoppingCartPage.verifyPrice();
Assert.assertEquals(actualText4,expectedText4,"price does not match");
        //* Change Qty to ‘5’
shoppingCartPage.changeQty5("5");
        //* Click on ‘Update Shopping Cart’ button
shoppingCartPage.clickOnUpdateShoppingCart();
        //* Verify the product price ‘$225.00’
        String expectedText5 = "$225.00";
String actualText5 = shoppingCartPage.verifyPrice$225();
Assert.assertEquals(actualText5,expectedText5,"Price does not match");
    }
}
