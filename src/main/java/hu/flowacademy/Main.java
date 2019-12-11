package hu.flowacademy;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("hello");
        dbTeszt();
    }


    public static void dbTeszt()  throws ClassNotFoundException {
        //  a db_info.txt-ben is benne vannak a mysql server adatai
        String str = "CREATE TABLE MilleniumFalcons (id VARCHAR(255) PRIMARY KEY, tapasztalat DOUBLE);";
        DBManager manager = DBManager.getInstance();
        MilleniumFalcon mf = new MilleniumFalcon();
        manager.executeSQL(mf.getInsertSQL());
    }

}
