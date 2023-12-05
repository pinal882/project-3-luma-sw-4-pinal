package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.PantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends TestBase {
    HomePage homePage = new HomePage();
    PantsPage pantsPage = new PantsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();


    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        //* Mouse Hover on Men Menu
homePage.mouseHoverOnMen();
        //* Mouse Hover on Bottoms
homePage.mouseHoverOnBottom();
        //* Click on Pants
homePage.clickOnPants();
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        pantsPage.mouseHoverOnProductName();
        pantsPage.clickOnSize();
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        pantsPage.mouseHoverOnProductName();
pantsPage.clickOnColour();
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        pantsPage.mouseHoverOnProductName();
pantsPage.clickonAddToCart();
        //* Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = pantsPage.verifyText();
        Assert.assertEquals(actualText,expectedText,"text does not match");
        //* Click on ‘shopping cart’ Link into message
shoppingCartPage.clickOnShoppingCart();
        //* Verify the text ‘Shopping Cart.’
        String expectedText1 = "Shopping Cart";
String actualText1 = shoppingCartPage.verifyShoppingCartText();
        //* Verify the product name ‘Cronus Yoga Pant’
        String expectedText2 = "Cronus Yoga Pant";
        String actualText2 = shoppingCartPage.verifyCronusYogaPantText();
        Assert.assertEquals(actualText2,expectedText2,"text does not match");
        //* Verify the product size ‘32’
        String expectedText3 = "32";
String actualText3 = shoppingCartPage.verifySizeText();
        //* Verify the product colour ‘Black’
        String expectedText4 = "Black";
        String actualText4 = shoppingCartPage.verifyColourText();
        Assert.assertEquals(actualText4,expectedText4,"text does not match");
    }
}
