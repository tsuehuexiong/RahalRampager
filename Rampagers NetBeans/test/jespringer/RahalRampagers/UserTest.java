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
public class UserTest {
    
    public UserTest() {
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
     * Test of isLoggedIn method, of class User.
     */
    @Test
    public void testIsLoggedIn() {
        System.out.println("isLoggedIn");
        User instance = new User();
        Boolean expResult = null;
        Boolean result = instance.isLoggedIn();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUsername method, of class User.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        User instance = new User();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }

    /**
     * Test of setUsername method, of class User.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        User instance = new User();
        instance.setUsername(username);
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        User instance = new User();
        instance.setPassword(password);
    }

    /**
     * Test of getIsAdmin method, of class User.
     */
    @Test
    public void testGetIsAdmin() {
        System.out.println("getIsAdmin");
        User instance = new User();
        Boolean expResult = null;
        Boolean result = instance.getIsAdmin();
        assertEquals(expResult, result);
    }

    /**
     * Test of setIsAdmin method, of class User.
     */
    @Test
    public void testSetIsAdmin() {
        System.out.println("setIsAdmin");
        Boolean isAdmin = null;
        User instance = new User();
        instance.setIsAdmin(isAdmin);
    }

    /**
     * Test of login method, of class User.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        User instance = new User();
        int expResult = 0;
        int result = instance.login();
        assertEquals(expResult, result);
    }

    /**
     * Test of logout method, of class User.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        User instance = new User();
        instance.logout();
    }

    /**
     * Test of getCommissionReport method, of class User.
     */
    @Test
    public void testGetCommissionReport() {
        System.out.println("getCommissionReport");
        User instance = new User();
        ResultSet expResult = null;
        ResultSet result = instance.getCommissionReport();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOverallCommission method, of class User.
     */
    @Test
    public void testGetOverallCommission() {
        System.out.println("getOverallCommission");
        User instance = new User();
        ResultSet expResult = null;
        ResultSet result = instance.getOverallCommission();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSalesSummaryReport method, of class User.
     */
    @Test
    public void testGetSalesSummaryReport() {
        System.out.println("getSalesSummaryReport");
        User instance = new User();
        ResultSet expResult = null;
        ResultSet result = instance.getSalesSummaryReport();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllUsers method, of class User.
     */
    @Test
    public void testGetAllUsers() {
        System.out.println("getAllUsers");
        User instance = new User();
        ResultSet expResult = null;
        ResultSet result = instance.getAllUsers();
        assertEquals(expResult, result);
    }

    /**
     * Test of addUser method, of class User.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        User instance = new User();
        instance.addUser();
    }
}