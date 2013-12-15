package pjnowak.RahalRampagers;


import java.util.Date;
import java.io.*;
import java.sql.*;



public class Item {
  
  private int itemID;
  private String iName;
  private String category;
  private Date auctionStart;
  private Date auctionEnd;
  private int startPrice;
  private String description;
  private String photo;
  private int sellerID;
  private int currentBid;
  private int status;
  private String aucLength;
  
  public Item(){
    
  }
  
  public int getItemID() {
    return itemID;
  }
  
  public void setItemID(int itemID) {
    this.itemID = itemID;
  }
  
  public String getiName() {
    return iName;
  }
  
  public void setiName(String iName) {
    this.iName = iName;
  }
  
  public String getCategory() {
    return category;
  }
  
  public void setCategory(String category) {
    this.category = category;
  }
  
  public Date getAuctionStart() {
    return auctionStart;
  }
  
  public void setAuctionStart(Date auctionStart) {
    this.auctionStart = auctionStart;
  }
  
  public Date getAuctionEnd() {
    return auctionEnd;
  }
  
  public void setAuctionEnd(Date auctionEnd) {
    this.auctionEnd = auctionEnd;
  }
  
  public int getStartPrice() {
    return startPrice;
  }
  
  public void setStartPrice(int startPrice) {
    this.startPrice = startPrice;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public String getPhoto() {
    return photo;
  }
  
  public void setPhoto(String photo) {
    this.photo = photo;
  }
  
  public int getSellerID() {
    return sellerID;
  }
  
  public void setSellerID(int sellerID) {
    this.sellerID = sellerID;
  }
  
  public int getCurrentBid() {
    return currentBid;
  }
  
  public void setCurrentBid(int currentBid) {
    this.currentBid = currentBid;
  }
  
  public int getStatus() {
    return status;
  }
  
  public void setStatus(int status) {
    this.status = status;
  }
  public void setAucLength(String s){
   aucLength = s; 
  }
  
    public String getAucLength() {
    return aucLength;
  }
    
  public void addItem() throws Exception {
    
      Connection con = DBConnection.openDBConnection();
      ResultSet rs;
      PreparedStatement stmt;
     // stmt = con.createStatement();
      String queryString = "insert into Item (iName,category,auctionStart,auctionEnd,startPrice,description,photo,sellerID,currentBid,status,winnerID) values(?,?,NOW(),?,?,?,?,?,0,1,0)";
      stmt = con.prepareStatement(queryString);
      stmt.clearParameters();
      long oneDay = 1 * 24 * 60 * 60 * 1000;
Date date = new Date();
Timestamp t = new Timestamp(date.getTime());
if(this.getAucLength().equals("1")){
 t.setTime(t.getTime() + oneDay/2); 
}
else if (this.getAucLength().equals("2")){
 t.setTime(t.getTime() + oneDay); 
}
else {
  t.setTime(t.getTime() + oneDay*2);
}
stmt.setString(1,this.getiName());
stmt.setString(2,this.getCategory());
stmt.setTimestamp(3,t);
stmt.setInt(4,this.getStartPrice());

stmt.setString(5,this.getDescription());
stmt.setString(6,this.getPhoto());
stmt.setInt(7,this.getSellerID());

      System.out.println(stmt);
      stmt.executeUpdate();
      stmt.close();
      con.close();
      
    
  
  }
  
  public ResultSet getItemInfo() throws IllegalStateException {
    try {     
      Connection con = DBConnection.openDBConnection();
      ResultSet rs;
      Statement stmt;
      stmt = con.createStatement();
      String queryString = "Select * from Item where itemID = '"
        + this.getItemID()+"'";
      System.out.println(queryString);
      rs = stmt.executeQuery(queryString);
      
      return rs;
    } 
    catch (Exception e) {
      System.out.println("FAILURE:" + e.getMessage());
      System.out.println("FAILURE:" + e.getStackTrace());
    }
    return null;
  }
  
    public int getTopBidder() throws IllegalStateException {
    try {
            Connection con = DBConnection.openDBConnection();
      ResultSet rs;
      Statement stmt;
       
      stmt = con.createStatement();
     
      String bidID = "Select winning_bidder(?) as winner";   
   PreparedStatement ps = con.prepareStatement(bidID);

ps.setEscapeProcessing(true);
ps.clearParameters();
ps.setInt(1, this.getItemID());

 rs = ps.executeQuery(); 
 rs.next();
 int id = rs.getInt("winner");
return id;
     // String queryString ="Select Item.currentBid, Customer.username, customer.buyerRating from Item, Customer where
        
    }
      catch (Exception e) {
      System.out.println("FAILURE:" + e.getMessage());
      System.out.println("FAILURE:" + e.getStackTrace());
    }
      return -1;
    }
      
  public static void main(String [] args)
  {
    Item i=new Item();
    i.setItemID(2);
    int temp = i.getTopBidder();

    try{
System.out.println(temp);

    }
    catch(Exception e){
      e.printStackTrace();
    }
  }
}
