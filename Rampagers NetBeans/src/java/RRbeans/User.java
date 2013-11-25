package RRbeans;


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
     * This method and creates and returns a Connection object to the database. 
     * All other methods that need database access should call this method.
     * @return a Connection object to the MySQL database
     */
    public Connection openDBConnection() {
        try {
            // Load driver and link to driver manager
            Class.forName("com.mysql.jdbc.Driver");
            // Create a connection to the specified database
            // ("jdbc:mysql://HOSTNAME:PORT/DATABASE","USERNAME","PASSWORD")
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://devsrv.cs.csbsju.edu:3306/RahalRampager", "JSpringer", "JSpringer");
            return myConnection;
        } catch (Exception E) {
            E.printStackTrace();
        }
        return null;
    }
    
    /**
     * Login function to access the features of the website
     * @return 0 = Customer, 1 = Admin, 2 = Invalid login credentials, 3 for unknown failure
     */
    public int login(){
        try {
            Connection con = openDBConnection();
            ResultSet rs;
            PreparedStatement stmt;
            String queryString = "Select * from USER where username like ? and password like ?";
            
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
    
    
}
