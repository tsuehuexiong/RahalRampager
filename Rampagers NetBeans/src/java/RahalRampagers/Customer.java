package jespringer.RahalRampagers;
import java.sql.*;

public class Customer {
    
    private int cID;
    private String username;
    private String fName;
    private String lName;
    private String ccNumber;
    private String ccType;
    private String ccExp;
    private String phone;
    private String email;
    private int sellerRating;
    private int buyerRating;
    
    public Customer(){
        
    }

    public int getcID() {
        return cID;
    }

    public void setcID(int cID) {
        this.cID = cID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public String getCcType() {
        return ccType;
    }

    public void setCcType(String ccType) {
        this.ccType = ccType;
    }

    public String getCcExp() {
        return ccExp;
    }

    public void setCcExp(String ccExp) {
        this.ccExp = ccExp;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSellerRating() {
        return sellerRating;
    }

    public void setSellerRating(int sellerRating) {
        this.sellerRating = sellerRating;
    }

    public int getBuyerRating() {
        return buyerRating;
    }

    public void setBuyerRating(int buyerRating) {
        this.buyerRating = buyerRating;
    }    
    public ResultSet getCustomerInfo() {
      try{
        Connection con = DBConnection.openDBConnection();
        ResultSet rs;
        String queryString = "Select * from Customer where username = '"+this.username+"'";
        Statement stmt;
        stmt = con.createStatement();
        rs = stmt.executeQuery(queryString);
        return rs;
      } catch(Exception e) {
        System.out.println("FAILURE:" + e.getMessage());
            System.out.println("FAILURE:" + e.getStackTrace());
        }
        return null;
    }
    
    public ResultSet getOtherCustomerInfo(String uname) {
      try{
        Connection con = DBConnection.openDBConnection();
        ResultSet rs;
        String queryString = "Select * from Customer where username = '"+uname+"'";
        Statement stmt;
        stmt = con.createStatement();
        rs = stmt.executeQuery(queryString);
        return rs;
      } catch(Exception e) {
        System.out.println("FAILURE:" + e.getMessage());
            System.out.println("FAILURE:" + e.getStackTrace());
        }
        return null;
    }
    
   public void editCustomerInfo(){
        Connection con = DBConnection.openDBConnection();
        try{
            Statement stmt = con.createStatement();
            String queryString = "update Customer set fName='"+this.getfName()+"', lName='"+this.getlName()+"',"
              +" email='"+this.getEmail()+"', phone='"+this.getPhone()+"', ccNumber='"+this.getCcNumber()+"',"
              +" ccExp='"+this.getCcExp()+"', ccType='"+this.getCcType()+"' where username ='"+this.getUsername()+"'";
            stmt.executeUpdate(queryString);
            stmt.close();
            con.close();
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
    
    public ResultSet getAllBuyerRatings() throws IllegalStateException {
              try {

            Connection con = DBConnection.openDBConnection();
            ResultSet rs;
            Statement stmt;
            stmt = con.createStatement();
            String queryString = "Select * from BuyerRating where buyerID = '" + this.getcID() + "'";
            rs = stmt.executeQuery(queryString);
            return rs;
        } catch (Exception e) {
            System.out.println("FAILURE:" + e.getMessage());
            System.out.println("FAILURE:" + e.getStackTrace());
        }
        return null;
    }
    
    public ResultSet getAllSellerRatings() throws IllegalStateException {

        try {
            Connection con = DBConnection.openDBConnection();
            ResultSet rs;
            Statement stmt;
            stmt = con.createStatement();
            String queryString = "Select * from SellerRating where sellerID = '" + this.getcID() + "'";
            rs = stmt.executeQuery(queryString);
            return rs;
        } catch (Exception e) {
            System.out.println("FAILURE:" + e.getMessage());
            System.out.println("FAILURE:" + e.getStackTrace());
        }
        return null;
    }
    
       public ResultSet getAllUnratedBoughtItems() throws IllegalStateException {
              try {

            Connection con = DBConnection.openDBConnection();
            ResultSet rs;
            Statement stmt;
            stmt = con.createStatement();
            String queryString = "Select * from Item i where i.status=2 and winnerID = '" + this.getcID() + "' and not exists(select * from SellerRating s where i.itemID = s.itemID)";
            rs = stmt.executeQuery(queryString);
            return rs;
        } catch (Exception e) {
            System.out.println("FAILURE:" + e.getMessage());
            System.out.println("FAILURE:" + e.getStackTrace());
        }
        return null;
    }

       public ResultSet getAllUnratedSoldItems() throws IllegalStateException {
              try {
            Connection con = DBConnection.openDBConnection();
            ResultSet rs;
            Statement stmt;
            stmt = con.createStatement();
            String queryString = "Select * from Item i where i.status=2 and i.sellerID = '" + this.getcID() + "' and not exists(select * from BuyerRating b where i.itemID = b.itemID)";
            rs = stmt.executeQuery(queryString);
            return rs;
        } catch (Exception e) {
            System.out.println("FAILURE:" + e.getMessage());
            System.out.println("FAILURE:" + e.getStackTrace());
        }
        return null;
    }
    
    public void addCustomer(){
      
    try {
      Connection con = DBConnection.openDBConnection();
      Statement stmt = con.createStatement();
      String queryString = "Insert into Customer (username, fName, lName, email) values ('" + getUsername() + "', '" + getfName() + "', '" + getlName() + "', '" + getEmail() + "')";
      
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