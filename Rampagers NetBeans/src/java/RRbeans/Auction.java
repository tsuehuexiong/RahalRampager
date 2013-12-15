package pjnowak.RahalRampagers;


import java.util.Date;
import java.io.*;
import java.sql.*;



public class Auction {
    
    private int itemID;
    private int bidderID;
    private int maxBid;
    private Date bidTime;
    
    public Auction(){
        
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getBidderID() {
        return bidderID;
    }

    public void setBidderID(int bidderID) {
        this.bidderID = bidderID;
    }

    public int getMaxBid() {
        return maxBid;
    }

    public void setMaxBid(int maxBid) {
        this.maxBid = maxBid;
    }

    public Date getBidTime() {
        return bidTime;
    }

    public void setBidTime(Date bidTime) {
        this.bidTime = bidTime;
    }
    
      public ResultSet getBidders() throws IllegalStateException {
    try {
            Connection con = DBConnection.openDBConnection();
      ResultSet rs;
      Statement stmt;
      stmt = con.createStatement();
            String queryString = "Select buyerRating,username,bidTime,maxBid from Auction,Customer where itemID = '"
        + this.getItemID()+"' and Auction.bidderID = Customer.cID";
            System.out.println(queryString);
                  rs = stmt.executeQuery(queryString);
      
      return rs;
    }
    catch(Exception e){
    }
    return null;
}
        public static void main(String [] args)
  {
         Auction a = new Auction();
         a.setItemID(1);
         
         try{
           ResultSet rs = a.getBidders();
           System.out.println(rs);
           while( rs.next()){
         System.out.println(rs.getString("username"));
         System.out.println(rs.getString("buyerRating"));
         System.out.println(rs.getString("bidTime"));
         System.out.println(rs.getString("maxBid"));
           }
        }
        
        catch (Exception e){
        e.printStackTrace();
        }
        }}
