/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jespringer.RahalRampagers;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jespringer
 */
public class ItemTest {
    
    public ItemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getItemID method, of class Item.
     */
    @Test
    public void testGetItemID() {
        System.out.println("getItemID");
        Item instance = new Item();
        instance.setItemID(0);
        int expResult = 0;
        int result = instance.getItemID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setItemID method, of class Item.
     */
    @Test
    public void testSetItemID() {
        System.out.println("setItemID");
        int itemID = 0;
        Item instance = new Item();
        instance.setItemID(itemID);
        int result = instance.getItemID();
        assertEquals(0, result);
    }

    /**
     * Test of getiName method, of class Item.
     */
    @Test
    public void testGetiName() {
        System.out.println("getiName");
        Item instance = new Item();
        instance.setiName("");
        String expResult = "";
        String result = instance.getiName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setiName method, of class Item.
     */
    @Test
    public void testSetiName() {
        System.out.println("setiName");
        String iName = "";
        Item instance = new Item();
        instance.setiName(iName);
        String result = instance.getiName();
        assertEquals("", result);
    }

    /**
     * Test of getCategory method, of class Item.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        Item instance = new Item();
        instance.setCategory("");
        String expResult = "";
        String result = instance.getCategory();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCategory method, of class Item.
     */
    @Test
    public void testSetCategory() {
        System.out.println("setCategory");
        String category = "";
        Item instance = new Item();
        instance.setCategory(category);
        String result = instance.getCategory();
        assertEquals("", result);
    }

    /**
     * Test of getAuctionStart method, of class Item.
     */
    @Test
    public void testGetAuctionStart() {
        System.out.println("getAuctionStart");
        Item instance = new Item();
        Date expResult = new Date();
        instance.setAuctionStart(expResult);
        Date result = instance.getAuctionStart();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAuctionStart method, of class Item.
     */
    @Test
    public void testSetAuctionStart() {
        System.out.println("setAuctionStart");
        Date auctionStart = new Date();
        Item instance = new Item();
        instance.setAuctionStart(auctionStart);
        Date result = instance.getAuctionStart();
        assertEquals(auctionStart, result);
    }

    /**
     * Test of getAuctionEnd method, of class Item.
     */
    @Test
    public void testGetAuctionEnd() {
        System.out.println("getAuctionEnd");
        Item instance = new Item();
        Date expResult = new Date();
        instance.setAuctionEnd(expResult);
        Date result = instance.getAuctionEnd();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAuctionEnd method, of class Item.
     */
    @Test
    public void testSetAuctionEnd() {
        System.out.println("setAuctionEnd");
        Date auctionEnd = new Date();
        Item instance = new Item();
        instance.setAuctionEnd(auctionEnd);
        Date result = instance.getAuctionEnd();
        assertEquals(auctionEnd, result);
    }

    /**
     * Test of getStartPrice method, of class Item.
     */
    @Test
    public void testGetStartPrice() {
        System.out.println("getStartPrice");
        Item instance = new Item();
        instance.setStartPrice(0);
        int expResult = 0;
        int result = instance.getStartPrice();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStartPrice method, of class Item.
     */
    @Test
    public void testSetStartPrice() {
        System.out.println("setStartPrice");
        int startPrice = 0;
        Item instance = new Item();
        instance.setStartPrice(startPrice);
        int result = instance.getStartPrice();
        assertEquals(0, result);
    }

    /**
     * Test of getDescription method, of class Item.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Item instance = new Item();
        instance.setDescription("");
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDescription method, of class Item.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Item instance = new Item();
        instance.setDescription(description);
        String result = instance.getDescription();
        assertEquals("", result);
    }

    /**
     * Test of getPhoto method, of class Item.
     */
    @Test
    public void testGetPhoto() {
        System.out.println("getPhoto");
        Item instance = new Item();
        instance.setPhoto("");
        String expResult = "";
        String result = instance.getPhoto();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhoto method, of class Item.
     */
    @Test
    public void testSetPhoto() {
        System.out.println("setPhoto");
        String photo = "";
        Item instance = new Item();
        instance.setPhoto(photo);
        String result = instance.getPhoto();
        assertEquals("", result);
    }

    /**
     * Test of getSellerID method, of class Item.
     */
    @Test
    public void testGetSellerID() {
        System.out.println("getSellerID");
        Item instance = new Item();
        instance.setSellerID(0);
        int expResult = 0;
        int result = instance.getSellerID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSellerID method, of class Item.
     */
    @Test
    public void testSetSellerID() {
        System.out.println("setSellerID");
        int sellerID = 0;
        Item instance = new Item();
        instance.setSellerID(sellerID);
        int result = instance.getSellerID();
        assertEquals(0, result);
    }

    /**
     * Test of getCurrentBid method, of class Item.
     */
    @Test
    public void testGetCurrentBid() {
        System.out.println("getCurrentBid");
        Item instance = new Item();
        instance.setCurrentBid(0);
        int expResult = 0;
        int result = instance.getCurrentBid();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCurrentBid method, of class Item.
     */
    @Test
    public void testSetCurrentBid() {
        System.out.println("setCurrentBid");
        int currentBid = 0;
        Item instance = new Item();
        instance.setCurrentBid(currentBid);
        int result = instance.getCurrentBid();
        assertEquals(0, result);
    }

    /**
     * Test of getStatus method, of class Item.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Item instance = new Item();
        instance.setStatus(0);
        int expResult = 0;
        int result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatus method, of class Item.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        int status = 0;
        Item instance = new Item();
        instance.setStatus(status);
        int result = instance.getStatus();
        assertEquals(0, result);
    }
}