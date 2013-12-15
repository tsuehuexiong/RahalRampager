/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jespringer.RahalRampagers;

import java.sql.ResultSet;
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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of getcID method, of class Customer.
     */
    @Test
    public void testGetcID() {
        System.out.println("getcID");
        Customer instance = new Customer();
        instance.setcID(0);
        int expResult = 0;
        int result = instance.getcID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setcID method, of class Customer.
     */
    @Test
    public void testSetcID() {
        System.out.println("setcID");
        int cID = 0;
        Customer instance = new Customer();
        instance.setcID(cID);
        int result = instance.getcID();
        assertEquals(0, result);
    }

    /**
     * Test of getUsername method, of class Customer.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Customer instance = new Customer();
        instance.setUsername("");
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsername method, of class Customer.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        Customer instance = new Customer();
        instance.setUsername(username);
        String result = instance.getUsername();
        assertEquals("", result);
    }

    /**
     * Test of getfName method, of class Customer.
     */
    @Test
    public void testGetfName() {
        System.out.println("getfName");
        Customer instance = new Customer();
        instance.setfName("");
        String expResult = "";
        String result = instance.getfName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setfName method, of class Customer.
     */
    @Test
    public void testSetfName() {
        System.out.println("setfName");
        String fName = "";
        Customer instance = new Customer();
        instance.setfName(fName);
        String result = instance.getfName();
        assertEquals("", result);
    }

    /**
     * Test of getlName method, of class Customer.
     */
    @Test
    public void testGetlName() {
        System.out.println("getlName");
        Customer instance = new Customer();
        instance.setlName("");
        String expResult = "";
        String result = instance.getlName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setlName method, of class Customer.
     */
    @Test
    public void testSetlName() {
        System.out.println("setlName");
        String lName = "";
        Customer instance = new Customer();
        instance.setlName(lName);
        String result = instance.getlName();
        assertEquals("", result);
    }

    /**
     * Test of getCcNumber method, of class Customer.
     */
    @Test
    public void testGetCcNumber() {
        System.out.println("getCcNumber");
        Customer instance = new Customer();
        instance.setCcNumber("");
        String expResult = "";
        String result = instance.getCcNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCcNumber method, of class Customer.
     */
    @Test
    public void testSetCcNumber() {
        System.out.println("setCcNumber");
        String ccNumber = "";
        Customer instance = new Customer();
        instance.setCcNumber(ccNumber);
        String result = instance.getCcNumber();
        assertEquals("", result);
    }

    /**
     * Test of getCcType method, of class Customer.
     */
    @Test
    public void testGetCcType() {
        System.out.println("getCcType");
        Customer instance = new Customer();
        instance.setCcType("");
        String expResult = "";
        String result = instance.getCcType();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCcType method, of class Customer.
     */
    @Test
    public void testSetCcType() {
        System.out.println("setCcType");
        String ccType = "";
        Customer instance = new Customer();
        instance.setCcType(ccType);
        String result = instance.getCcType();
        assertEquals("", result);
    }

    /**
     * Test of getCcExp method, of class Customer.
     */
    @Test
    public void testGetCcExp() {
        System.out.println("getCcExp");
        Customer instance = new Customer();
        instance.setCcExp("");
        String expResult = "";
        String result = instance.getCcExp();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCcExp method, of class Customer.
     */
    @Test
    public void testSetCcExp() {
        System.out.println("setCcExp");
        String ccExp = "";
        Customer instance = new Customer();
        instance.setCcExp(ccExp);
        String result = instance.getCcExp();
        assertEquals("", result);
    }

    /**
     * Test of getPhone method, of class Customer.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        Customer instance = new Customer();
        instance.setPhone("");
        String expResult = "";
        String result = instance.getPhone();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhone method, of class Customer.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "";
        Customer instance = new Customer();
        instance.setPhone(phone);
        String result = instance.getPhone();
        assertEquals("", result);
    }

    /**
     * Test of getEmail method, of class Customer.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Customer instance = new Customer();
        instance.setEmail("");
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class Customer.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Customer instance = new Customer();
        instance.setEmail(email);
        String result = instance.getEmail();
        assertEquals("", result);
    }

    /**
     * Test of getSellerRating method, of class Customer.
     */
    @Test
    public void testGetSellerRating() {
        System.out.println("getSellerRating");
        Customer instance = new Customer();
        instance.setSellerRating(0);
        int expResult = 0;
        int result = instance.getSellerRating();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSellerRating method, of class Customer.
     */
    @Test
    public void testSetSellerRating() {
        System.out.println("setSellerRating");
        int sellerRating = 0;
        Customer instance = new Customer();
        instance.setSellerRating(sellerRating);
        int result = instance.getSellerRating();
        assertEquals(0, result);
    }

    /**
     * Test of getBuyerRating method, of class Customer.
     */
    @Test
    public void testGetBuyerRating() {
        System.out.println("getBuyerRating");
        Customer instance = new Customer();
        instance.setBuyerRating(0);
        int expResult = 0;
        int result = instance.getBuyerRating();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBuyerRating method, of class Customer.
     */
    @Test
    public void testSetBuyerRating() {
        System.out.println("setBuyerRating");
        int buyerRating = 0;
        Customer instance = new Customer();
        instance.setBuyerRating(buyerRating);
        int result = instance.getBuyerRating();
        assertEquals(0, result);
    }

    /**
     * Test of getCustomerInfo method, of class Customer.
     */
    @Test
    public void testGetCustomerInfo() {
        System.out.println("getCustomerInfo");
        Customer instance = new Customer();
        ResultSet expResult = null;
        ResultSet result = instance.getCustomerInfo();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOtherCustomerInfo method, of class Customer.
     */
    @Test
    public void testGetOtherCustomerInfo() {
        System.out.println("getOtherCustomerInfo");
        String uname = "";
        Customer instance = new Customer();
        ResultSet expResult = null;
        ResultSet result = instance.getOtherCustomerInfo(uname);
        assertEquals(expResult, result);
    }

    /**
     * Test of editCustomerInfo method, of class Customer.
     */
    @Test
    public void testEditCustomerInfo() {
        System.out.println("editCustomerInfo");
        Customer instance = new Customer();
        instance.editCustomerInfo();
    }

    /**
     * Test of getAllBuyerRatings method, of class Customer.
     */
    @Test
    public void testGetAllBuyerRatings() {
        System.out.println("getAllBuyerRatings");
        Customer instance = new Customer();
        ResultSet expResult = null;
        ResultSet result = instance.getAllBuyerRatings();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllSellerRatings method, of class Customer.
     */
    @Test
    public void testGetAllSellerRatings() {
        System.out.println("getAllSellerRatings");
        Customer instance = new Customer();
        ResultSet expResult = null;
        ResultSet result = instance.getAllSellerRatings();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllUnratedBoughtItems method, of class Customer.
     */
    @Test
    public void testGetAllUnratedBoughtItems() {
        System.out.println("getAllUnratedBoughtItems");
        Customer instance = new Customer();
        ResultSet expResult = null;
        ResultSet result = instance.getAllUnratedBoughtItems();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllUnratedSoldItems method, of class Customer.
     */
    @Test
    public void testGetAllUnratedSoldItems() {
        System.out.println("getAllUnratedSoldItems");
        Customer instance = new Customer();
        ResultSet expResult = null;
        ResultSet result = instance.getAllUnratedSoldItems();
        assertEquals(expResult, result);
    }

    /**
     * Test of addCustomer method, of class Customer.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        Customer instance = new Customer();
        instance.addCustomer();
    }
}