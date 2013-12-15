/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jespringer.RahalRampagers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class SellerRatingTest {
    
    public SellerRatingTest() {
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
     * Test of getItemID method, of class SellerRating.
     */
    @Test
    public void testGetItemID() {
        System.out.println("getItemID");
        SellerRating instance = new SellerRating();
        instance.setItemID(0);
        int expResult = 0;
        int result = instance.getItemID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setItemID method, of class SellerRating.
     */
    @Test
    public void testSetItemID() {
        System.out.println("setItemID");
        int itemID = 0;
        SellerRating instance = new SellerRating();
        instance.setItemID(itemID);
        int result = instance.getItemID();
        assertEquals(0, result);
    }

    /**
     * Test of getSellerID method, of class SellerRating.
     */
    @Test
    public void testGetSellerID() {
        System.out.println("getSellerID");
        SellerRating instance = new SellerRating();
        instance.setSellerID(0);
        int expResult = 0;
        int result = instance.getSellerID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSellerID method, of class SellerRating.
     */
    @Test
    public void testSetSellerID() {
        System.out.println("setSellerID");
        int sellerID = 0;
        SellerRating instance = new SellerRating();
        instance.setSellerID(sellerID);
        int result = instance.getSellerID();
        assertEquals(0, result);
    }

    /**
     * Test of getBuyerID method, of class SellerRating.
     */
    @Test
    public void testGetBuyerID() {
        System.out.println("getBuyerID");
        SellerRating instance = new SellerRating();
        instance.setBuyerID(0);
        int expResult = 0;
        int result = instance.getBuyerID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBuyerID method, of class SellerRating.
     */
    @Test
    public void testSetBuyerID() {
        System.out.println("setBuyerID");
        int buyerID = 0;
        SellerRating instance = new SellerRating();
        instance.setBuyerID(buyerID);
        int result = instance.getBuyerID();
        assertEquals(0, result);
    }

    /**
     * Test of getItemName method, of class SellerRating.
     */
    @Test
    public void testGetItemName() {
        System.out.println("getItemName");
        SellerRating instance = new SellerRating();
        instance.setItemName("");
        String expResult = "";
        String result = instance.getItemName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setItemName method, of class SellerRating.
     */
    @Test
    public void testSetItemName() {
        System.out.println("setItemName");
        String itemName = "";
        SellerRating instance = new SellerRating();
        instance.setItemName(itemName);
        String result = instance.getItemName();
        assertEquals("", result);
    }

    /**
     * Test of getComment method, of class SellerRating.
     */
    @Test
    public void testGetComment() {
        System.out.println("getComment");
        SellerRating instance = new SellerRating();
        instance.setComment("");
        String expResult = "";
        String result = instance.getComment();
        assertEquals(expResult, result);
    }

    /**
     * Test of setComment method, of class SellerRating.
     */
    @Test
    public void testSetComment() {
        System.out.println("setComment");
        String comment = "";
        SellerRating instance = new SellerRating();
        instance.setComment(comment);
        String result = instance.getComment();
        assertEquals("", result);
    }

    /**
     * Test of getSatisfaction method, of class SellerRating.
     */
    @Test
    public void testGetSatisfaction() {
        System.out.println("getSatisfaction");
        SellerRating instance = new SellerRating();
        instance.setSatisfaction(0);
        int expResult = 0;
        int result = instance.getSatisfaction();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSatisfaction method, of class SellerRating.
     */
    @Test
    public void testSetSatisfaction() {
        System.out.println("setSatisfaction");
        int satisfaction = 0;
        SellerRating instance = new SellerRating();
        instance.setSatisfaction(satisfaction);
        int result = instance.getSatisfaction();
        assertEquals(0, result);
    }

    /**
     * Test of getQuality method, of class SellerRating.
     */
    @Test
    public void testGetQuality() {
        System.out.println("getQuality");
        SellerRating instance = new SellerRating();
        instance.setQuality(0);
        int expResult = 0;
        int result = instance.getQuality();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuality method, of class SellerRating.
     */
    @Test
    public void testSetQuality() {
        System.out.println("setQuality");
        int quality = 0;
        SellerRating instance = new SellerRating();
        instance.setQuality(quality);
        int result = instance.getQuality();
        assertEquals(0, result);
    }

    /**
     * Test of getDelivery method, of class SellerRating.
     */
    @Test
    public void testGetDelivery() {
        System.out.println("getDelivery");
        SellerRating instance = new SellerRating();
        instance.setDelivery(0);
        int expResult = 0;
        int result = instance.getDelivery();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDelivery method, of class SellerRating.
     */
    @Test
    public void testSetDelivery() {
        System.out.println("setDelivery");
        int delivery = 0;
        SellerRating instance = new SellerRating();
        instance.setDelivery(delivery);
        int result = instance.getDelivery();
        assertEquals(0, result);
    }

    /**
     * Test of addSellerRating method, of class SellerRating.
     */
    @Test
    public void testAddSellerRating() {
        System.out.println("addSellerRating");
        SellerRating instance = new SellerRating();
        instance.setBuyerID(0);
        instance.setComment("testing");
        instance.setItemID(100);
        instance.setItemName("test");
        instance.setDelivery(1);
        instance.setSatisfaction(1);
        instance.setSellerID(1);
        instance.setQuality(1);
        instance.addSellerRating();
        try {
            Connection con = DBConnection.openDBConnection();
            Statement stmt = con.createStatement();
            String queryString = "select * from BuyerRating where buyerID = '0' and itemID = '100' and sellerID = '1'";
            ResultSet rs = stmt.executeQuery(queryString);
            rs.next();
            assertEquals(instance.getBuyerID(), rs.getInt("buyerID"));
            assertEquals(instance.getComment(), rs.getString("comment"));
            assertEquals(instance.getItemID(), rs.getInt("itemID"));
            assertEquals(instance.getItemName(), rs.getString("itemName"));
            assertEquals(instance.getDelivery(), rs.getInt("delivery"));
            assertEquals(instance.getSatisfaction(), rs.getInt("satisfaction"));
            assertEquals(instance.getQuality(), rs.getInt("quality"));
            assertEquals(instance.getSellerID(), rs.getInt("sellerID"));
        }
        catch (Exception e){
            
        }
    }

    /**
     * Test of getSellerRating method, of class SellerRating.
     */
    @Test
    public void testGetSellerRating() {
        System.out.println("getSellerRating");
        SellerRating instance = new SellerRating();
        instance.setBuyerID(0);
        instance.setComment("testing");
        instance.setItemID(100);
        instance.setItemName("test");
        instance.setDelivery(1);
        instance.setSatisfaction(1);
        instance.setSellerID(1);
        instance.setQuality(1);
        ResultSet rs = instance.getSellerRating();
        try {
            rs.next();
            assertEquals(instance.getBuyerID(), rs.getInt("buyerID"));
            assertEquals(instance.getComment(), rs.getString("comment"));
            assertEquals(instance.getItemID(), rs.getInt("itemID"));
            assertEquals(instance.getItemName(), rs.getString("itemName"));
            assertEquals(instance.getDelivery(), rs.getInt("delivery"));
            assertEquals(instance.getSatisfaction(), rs.getInt("satisfaction"));
            assertEquals(instance.getQuality(), rs.getInt("quality"));
            assertEquals(instance.getSellerID(), rs.getInt("sellerID"));
        }
        catch (Exception e){
            
        }
    }
}