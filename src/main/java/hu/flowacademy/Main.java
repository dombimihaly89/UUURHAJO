package hu.flowacademy;

import java.sql.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException { ;
        dbTeszt();
    }


    public static void dbTeszt() throws ClassNotFoundException, SQLException {
        //  a db_info.txt-ben is benne vannak a mysql server adatai
        //String str = "CREATE TABLE XWing (id VARCHAR(255) PRIMARY KEY, sebesseg INT, MeghibasodhatE BOOLEAN);";
        DBManager manager = DBManager.getInstance();
        Connection conn = DriverManager.getConnection(DBManager.DB_URL, DBManager.USER,DBManager.PASS);
        Statement st = conn.createStatement();
        MilleniumFalcon mf = new MilleniumFalcon();
        XWing xw = new XWing();
        String id = "dda34974-23b9-4a41-be5f-263d2f49f9e0";
        // manager.executeSQL(xw.getInsertSQL());
        manager.executeSQL(xw.getUpdateSQL(111,true,id));

        String query = manager.executeSQL(xw.getSelectSQL());;
        ResultSet rs = st.executeQuery(query);
        while (rs.next()) {
            String azon = rs.getString(1);
            int seb = rs.getInt(2);
            boolean hiba = rs.getBoolean(3);
            System.out.println("ID: " + azon + ", sebesség: "+ seb + ", meghibásodhatE: " + hiba +  "\n");
        }
    }

}
