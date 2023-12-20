/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxcal;

/**
 *
 * @author User
 */
public class Database {
    protected final static String DB_BASE_URL = "jdbc:mysql://localhost";
    //jdbc=java is a database connect
    protected final static String USER= "ooc2023";
    protected final static String PASSWORD ="ooc2023";
    // this will shows the database connected
    protected final static String DB_NAME = "taxcal";
    protected final static String TABLE_NAME = "userdata";
    //jdbc:mysql://localhost/taxcal
    protected final static String DB_URL = DB_BASE_URL +"/"+ DB_NAME;

}
