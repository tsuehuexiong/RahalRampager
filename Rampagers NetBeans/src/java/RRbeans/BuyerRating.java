package kakutzke.RahalRampagers;
import java.io.*;
import java.sql.*;

public class BuyerRating {
    
    private int itemID;
    private int sellerID, buyerID;
    private String itemName, comment;
    private int satisfaction, payment;
 
    public BuyerRating() {
  
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public int getBuyerID() {
        return buyerID;
    }

    public void setBuyerID(int buyerID) {
        this.buyerID = buyerID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public void addBuyerRating() {
        Connection con = DBConnection.openDBConnection();
        try {
            String queryString = "insert into SellerRating values(itemID=?, sellerID=?, buyerID=?, itemName=?, satisfaction=?, payment=?, comment=?)";
            PreparedStatement ps = con.prepareStatement(queryString);
            ps.clearParameters();
            ps.setInt(1, this.getItemID());
            ps.setInt(2, this.getSellerID());
            ps.setInt(3, this.getBuyerID());
            ps.setString(4, this.getItemName());
            ps.setInt(5, this.getSatisfaction());
            ps.setInt(6, this.getPayment());
            ps.setString(7, this.getComment());
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ResultSet getBuyerRating() {
        Connection con = DBConnection.openDBConnection();
        try {
            Statement stmt = con.createStatement();
            String qs = "select * from BuyerRating where itemID ='" + this.getItemID()+"'";
            ResultSet rs = stmt.executeQuery(qs);
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}
 
