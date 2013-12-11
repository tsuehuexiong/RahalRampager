package kakutzke.RahalRampagers;
import java.io.*;
import java.sql.*;

public class SellerRating {
    
    private int itemID;
    private int sellerID, buyerID;
    private String itemName, comment;
    private int satisfaction, quality, delivery;
 
    public SellerRating() {
  
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

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getDelivery() {
        return delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }
    
    public void addSellerRating() {
        Connection con = DBConnection.openDBConnection();
        try {
            String queryString = "insert into SellerRating values(?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(queryString);
            ps.clearParameters();
            ps.setInt(1, this.getItemID());
            ps.setInt(2, this.getSellerID());
            ps.setInt(3, this.getBuyerID());
            ps.setString(4, this.getItemName());
            ps.setInt(5, this.getSatisfaction());
            ps.setInt(6, this.getQuality());
            ps.setInt(7, this.getDelivery());
            ps.setString(8, this.getComment());
            ps.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public ResultSet getSellerRating() {
        Connection con = DBConnection.openDBConnection();
        try {
            Statement stmt = con.createStatement();
            String qs = "select * from SellerRating where itemID ='" + this.getItemID()+"'";
            ResultSet rs = stmt.executeQuery(qs);
            return rs;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
 
