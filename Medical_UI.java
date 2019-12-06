/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical_ui;



/**
 *
 * @author herrerach_sd2022
 */
public class Medical_UI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Register reg = new Register();
        reg.setVisible(true);

//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/medicine_app", "root", "");
////here sonoo is database name, root is username and password  
//            Statement stmt = con.createStatement();
//            //insert into the table users
//            String sqlString = ("INSERT INTO `Users`(`ID`, `Name`, `Age`, `Username`, `Password`, `ConPassword`))" + "VALUES('" + name + "','" + age + "','" + user + "','" + pass + "','" + Confirmpass + "')");
//            String query = "SELECT * FROM `users`";
//            //String sqlString = ("INSERT INTO `Users`(`ID`, `Name`, `Age`, `Username`, `Password`, `ConPassword`))" + "VALUES('" + reg.name + "','" + age + "','" + user + "','" + pass + "','" + Confirmpass + "')");
//            //stmt.executeUpdate(sqlString);
//
//            //retrieve data from table users
//            ResultSet rs = stmt.executeQuery("Select * from users");
//            while (rs.next()) {
//                //System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " +rs.getString(4) + "  " +rs.getString(5) + "  " +rs.getString(5));
//            }
//            con.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//
//    void addData(String sqlString) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    Connection dbConnect() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
