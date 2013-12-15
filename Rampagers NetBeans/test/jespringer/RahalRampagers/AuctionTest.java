/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jespringer.RahalRampagers;

import java.sql.Connection;
import java.sql.ResultSet;
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
public class AuctionTest {
    
    public AuctionTest() {
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
     * Test of getItemID method, of class Auction.
     */
    @Test
    public void testGetItemID() {
        System.out.println("getItemID");
        Auction instance = new Auction();
        instance.setItemID(0);
        int expResult = 0;
        int result = instance.getItemID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setItemID method, of class Auction.
     */
    @Test
    public void testSetItemID() {
        System.out.println("setItemID");
        int itemID = 0;
        Auction instance = new Auction();
        instance.setItemID(itemID);
        int result = instance.getItemID();
        assertEquals(0, result);
    }

    /**
     * Test of getBidderID method, of class Auction.
     */
    @Test
    public void testGetBidderID() {
        System.out.println("getBidderID");
        Auction instance = new Auction();
        instance.setBidderID(0);
        int expResult = 0;
        int result = instance.getBidderID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBidderID method, of class Auction.
     */
    @Test
    public void testSetBidderID() {
        System.out.println("setBidderID");
        int bidderID = 0;
        Auction instance = new Auction();
        instance.setBidderID(bidderID);
        int result = instance.getBidderID();
        assertEquals(0, result);
    }

    /**
     * Test of getMaxBid method, of class Auction.
     */
    @Test
    public void testGetMaxBid() {
        System.out.println("getMaxBid");
        Auction instance = new Auction();
        instance.setMaxBid(0);
        int expResult = 0;
        int result = instance.getMaxBid();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaxBid method, of class Auction.
     */
    @Test
    public void testSetMaxBid() {
        System.out.println("setMaxBid");
        int maxBid = 0;
        Auction instance = new Auction();
        instance.setMaxBid(maxBid);
        int result = instance.getMaxBid();
        assertEquals(0, result);
    }

    /**
     * Test of getBidTime method, of class Auction.
     */
    @Test
    public void testGetBidTime() {
        System.out.println("getBidTime");
        Auction instance = new Auction();
        Date test = new Date();
        instance.setBidTime(test);
        Date expResult = test;
        Date result = instance.getBidTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBidTime method, of class Auction.
     */
    @Test
    public void testSetBidTime() {
        System.out.println("setBidTime");
        Date bidTime = new Date();
        Auction instance = new Auction();
        instance.setBidTime(bidTime);
        Date result = instance.getBidTime();
        assertEquals(bidTime, result);
    }
}