package jespringer.RahalRampagers;


import java.sql.*;


public class User {
  
  private String username;
  private String password;
  private Boolean isAdmin;
  
  
  /**
   * The following stores whether or not the customer has successfully logged
   * to the System
   */    
  private boolean loggedIn = false;
  
  /**
   * A getter for class field loggedIn
   * @return whether the Customer is logged in or not
   */
  public Boolean isLoggedIn() {
    return this.loggedIn;
  }
  
  public User(){
    
  }
  
  public String getUsername() {
    return username;
  }
  
  public void setUsername(String username) {
    this.username = username;
  }
  
  public String getPassword() {
    return password;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }
  
  public Boolean getIsAdmin() {
    return isAdmin;
  }
  
  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }
  
  /**
   * Login function to access the features of the website
   * @return 0 = Customer, 1 = Admin, 2 = Invalid login credentials, 3 for unknown failure
   */
  public int login(){
    try {
      Connection con = DBConnection.openDBConnection();
      ResultSet rs;
      PreparedStatement stmt;
      String queryString = "Select * from User where username = ? and password = ?";
      
      stmt = con.prepareStatement(queryString);
      stmt.clearParameters();
      stmt.setString(1,getUsername());
      stmt.setString(2,getPassword());
      rs = stmt.executeQuery();
      
      if (rs.next()){
        this.loggedIn = true;
        if (rs.getBoolean("isAdmin") == true){
          return 1;
        }
        else {
          return 0;
        }
      }
      else {
        this.loggedIn = false;
        return 2;
      }
    }
    catch (Exception e){
      System.out.println("FAILURE:" + e.getMessage());
      System.out.println("FAILURE:" + e.getStackTrace());
      this.loggedIn = false;
      return 3;
    }
  }
  
  /**
   * sets loggedIn class field to false
   * @throws IllegalStateException if the method is called when loggedIn = false
   */
  public void logout() throws IllegalStateException {
    if(! isLoggedIn())
      throw new IllegalStateException("MUST BE LOGGED IN FIRST!");
    
    this.username = "";
    this.loggedIn = false;
    this.password = "";
  }
  
  public ResultSet getCommissionReport(){
    
    try {
      Connection con = DBConnection.openDBConnection();
      Statement stmt;
      String queryString = "Select * from CommissionReport";
      stmt = con.createStatement();
      
      return stmt.executeQuery(queryString);
    }
    catch (Exception e){
      System.out.println("FAILURE:" + e.getMessage());
      System.out.println("FAILURE:" + e.getStackTrace());
      return null;
    }
  }
  
  public ResultSet getOverallCommission(){
    
    try {
      Connection con = DBConnection.openDBConnection();
      Statement stmt;
      String queryString = "Select Sum(commission) from CommissionReport";
      stmt = con.createStatement();
      
      return stmt.executeQuery(queryString);
    }
    catch (Exception e){
      System.out.println("FAILURE:" + e.getMessage());
      System.out.println("FAILURE:" + e.getStackTrace());
      return null;
    }
  }
  
  public ResultSet getSalesSummaryReport(){
    
    try {
      Connection con = DBConnection.openDBConnection();
      Statement stmt;
      String queryString = "Select * from SalesSummaryReport";
      stmt = con.createStatement();
      
      return stmt.executeQuery(queryString);
    }
    catch (Exception e){
      System.out.println("FAILURE:" + e.getMessage());
      System.out.println("FAILURE:" + e.getStackTrace());
      return null;
    }
  }
  
  public ResultSet getAllUsers(){
    
    try {
      Connection con = DBConnection.openDBConnection();
      Statement stmt;
      String queryString = "Select * from User Left Outer Join Customer on User.username=Customer.username order by User.isAdmin desc, cID";
      stmt = con.createStatement();
      
      return stmt.executeQuery(queryString);
    }
    catch (Exception e){
      System.out.println("FAILURE:" + e.getMessage());
      System.out.println("FAILURE:" + e.getStackTrace());
      return null;
    }
  }
  
  public void addUser() {
    
    try {
      Connection con = DBConnection.openDBConnection();
      Statement stmt = con.createStatement();
      String queryString = "Insert into User values ('" + getUsername() + "', '" + getPassword() + "', " + getIsAdmin() + ")";
      
      stmt.executeUpdate(queryString);
      stmt.close();
      con.close();
    }
    catch (Exception e){
      System.out.println("FAILURE:" + e.getMessage());
      System.out.println("FAILURE:" + e.getStackTrace());
    }
  }
  
}
