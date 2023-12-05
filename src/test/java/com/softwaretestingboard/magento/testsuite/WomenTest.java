package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.JacketsPage;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenTest extends TestBase {
    HomePage homePage = new HomePage();
    JacketsPage jacketsPage = new JacketsPage();

    @Test
    public void verifyTheSortByProductNameFilter() {
        //* Mouse Hover on Women Menu
        homePage.mouseHoverOnWomen();
        //* Mouse Hover on Tops
        //homePage.mouseHoverOnTops();
        //* Click on Jackets
        homePage.clickOnJackets();
        //* Select Sort By filter “Product Name”
        jacketsPage.selectProductNameFilter("Product Name");
        //* Verify the products name display in alphabetical order
        Assert.assertEquals(jacketsPage.getProductList1(),jacketsPage.getProductList2());
    }
    @Test
    public void verifyTheSortByPriceFilter() throws InterruptedException {
       //* Mouse Hover on Women Menu
        homePage.mouseHoverOnWomen();
        //* Mouse Hover on Tops
        homePage.mouseHoverOnTops();
        //* Click on Jackets
        homePage.clickOnJackets();
        //* Select Sort By filter “Price”
        jacketsPage.selectProductNameFilter("Price");
        //* Verify the products price display in Low to High
       Assert.assertEquals(jacketsPage.getPriceList1(), jacketsPage.getPriceList2());
       Thread.sleep(3000);

    }
}