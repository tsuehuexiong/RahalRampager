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
public class BuyerRatingTest {
    
    public BuyerRatingTest() {
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
     * Test of getItemID method, of class BuyerRating.
     */
    @Test
    public void testGetItemID() {
        System.out.println("getItemID");
        BuyerRating instance = new BuyerRating();
        instance.setItemID(0);
        int expResult = 0;
        int result = instance.getItemID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setItemID method, of class BuyerRating.
     */
    @Test
    public void testSetItemID() {
        System.out.println("setItemID");
        int itemID = 0;
        BuyerRating instance = new BuyerRating();
        instance.setItemID(itemID);
        int result = instance.getItemID();
        assertEquals(0, result);
    }

    /**
     * Test of getSellerID method, of class BuyerRating.
     */
    @Test
    public void testGetSellerID() {
        System.out.println("getSellerID");
        BuyerRating instance = new BuyerRating();
        instance.setSellerID(0);
        int expResult = 0;
        int result = instance.getSellerID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSellerID method, of class BuyerRating.
     */
    @Test
    public void testSetSellerID() {
        System.out.println("setSellerID");
        int sellerID = 0;
        BuyerRating instance = new BuyerRating();
        instance.setSellerID(sellerID);
        int result = instance.getSellerID();
        assertEquals(0, result);
    }

    /**
     * Test of getBuyerID method, of class BuyerRating.
     */
    @Test
    public void testGetBuyerID() {
        System.out.println("getBuyerID");
        BuyerRating instance = new BuyerRating();
        instance.setBuyerID(0);
        int expResult = 0;
        int result = instance.getBuyerID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBuyerID method, of class BuyerRating.
     */
    @Test
    public void testSetBuyerID() {
        System.out.println("setBuyerID");
        int buyerID = 0;
        BuyerRating instance = new BuyerRating();
        instance.setBuyerID(buyerID);
        int result = instance.getBuyerID();
        assertEquals(0, result);
    }

    /**
     * Test of getItemName method, of class BuyerRating.
     */
    @Test
    public void testGetItemName() {
        System.out.println("getItemName");
        BuyerRating instance = new BuyerRating();
        instance.setItemName("");
        String expResult = "";
        String result = instance.getItemName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setItemName method, of class BuyerRating.
     */
    @Test
    public void testSetItemName() {
        System.out.println("setItemName");
        String itemName = "";
        BuyerRating instance = new BuyerRating();
        instance.setItemName(itemName);
        String result = instance.getItemName();
        assertEquals("", result);
    }

    /**
     * Test of getComment method, of class BuyerRating.
     */
    @Test
    public void testGetComment() {
        System.out.println("getComment");
        BuyerRating instance = new BuyerRating();
        instance.setComment("");
        String expResult = "";
        String result = instance.getComment();
        assertEquals(expResult, result);
    }

    /**
     * Test of setComment method, of class BuyerRating.
     */
    @Test
    public void testSetComment() {
        System.out.println("setComment");
        String comment = "";
        BuyerRating instance = new BuyerRating();
        instance.setComment(comment);
        String result = instance.getComment();
        assertEquals("", result);
    }

    /**
     * Test of getSatisfaction method, of class BuyerRating.
     */
    @Test
    public void testGetSatisfaction() {
        System.out.println("getSatisfaction");
        BuyerRating instance = new BuyerRating();
        instance.setSatisfaction(0);
        int expResult = 0;
        int result = instance.getSatisfaction();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSatisfaction method, of class BuyerRating.
     */
    @Test
    public void testSetSatisfaction() {
        System.out.println("setSatisfaction");
        int satisfaction = 0;
        BuyerRating instance = new BuyerRating();
        instance.setSatisfaction(satisfaction);
        int result = instance.getSatisfaction();
        assertEquals(0, result);
    }

    /**
     * Test of getPayment method, of class BuyerRating.
     */
    @Test
    public void testGetPayment() {
        System.out.println("getPayment");
        BuyerRating instance = new BuyerRating();
        instance.setPayment(0);
        int expResult = 0;
        int result = instance.getPayment();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPayment method, of class BuyerRating.
     */
    @Test
    public void testSetPayment() {
        System.out.println("setPayment");
        int payment = 0;
        BuyerRating instance = new BuyerRating();
        instance.setPayment(payment);
        int result = instance.getPayment();
        assertEquals(0, result);
    }

    /**
     * Test of addBuyerRating method, of class BuyerRating.
     */
    @Test
    public void testAddBuyerRating() {
        System.out.println("addBuyerRating");
        BuyerRating instance = new BuyerRating();
        instance.setBuyerID(0);
        instance.setComment("testing");
        instance.setItemID(100);
        instance.setItemName("test");
        instance.setPayment(1);
        instance.setSatisfaction(1);
        instance.setSellerID(1);
        instance.addBuyerRating();
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
            assertEquals(instance.getPayment(), rs.getInt("payment"));
            assertEquals(instance.getSatisfaction(), rs.getInt("satisfaction"));
            assertEquals(instance.getSellerID(), rs.getInt("sellerID"));
        }
        catch (Exception e){
            
        }
    }

    /**
     * Test of getBuyerRating method, of class BuyerRating.
     */
    @Test
    public void testGetBuyerRating() {
        System.out.println("getBuyerRating");
        BuyerRating instance = new BuyerRating();
        instance.setBuyerID(0);
        instance.setComment("testing");
        instance.setItemID(100);
        instance.setItemName("test");
        instance.setPayment(1);
        instance.setSatisfaction(1);
        instance.setSellerID(1);
        ResultSet result = instance.getBuyerRating();
        try {
            result.next();
            assertEquals(instance.getBuyerID(), result.getInt("buyerID"));
            assertEquals(instance.getComment(), result.getString("comment"));
            assertEquals(instance.getItemID(), result.getInt("itemID"));
            assertEquals(instance.getItemName(), result.getString("itemName"));
            assertEquals(instance.getPayment(), result.getInt("payment"));
            assertEquals(instance.getSatisfaction(), result.getInt("satisfaction"));
            assertEquals(instance.getSellerID(), result.getInt("sellerID"));
        }
        catch (Exception e){
            
        }
    }
}