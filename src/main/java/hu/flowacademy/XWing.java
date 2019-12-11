package hu.flowacademy;

import java.util.Random;
import java.util.UUID;

public class XWing extends LazadoGep implements Hiperhajtomu {

    private UUID id;
    public XWing() {

        super(150, true);
        this.id = UUID.randomUUID();
    }

    @Override
    public boolean elkapjaAVonosugar() {
        return this.isMeghibasodhatE() && this.getSebesseg() < 10000;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void HiperUgras() {
        Random rnd = new Random();
        this.setSebesseg(this.getSebesseg() + rnd.nextDouble() * 100);
    }


    public String getSelectSQL(String param) {
        StringBuilder sb = new StringBuilder("SELECT id, sebesseg, MeghibasodhatE FROM XWing WHERE id ='");
        sb.append(param).append("';");
        return sb.toString();
    }

    public String getUpdateSQL(int seb, boolean hiba, String felt) {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE XWing SET ")
                .append("sebesseg="+seb+",")
                .append("MeghibasodhatE="+hiba)
                .append(" WHERE id='"+felt+"'");

        return sb.toString();
    }

    public String getInsertSQL() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO XWing (id, sebesseg, MeghibasodhatE) VALUES (")
                .append("'").append(this.id).append("', ")
                .append(this.getSebesseg()).append(",")
                .append(this.isMeghibasodhatE()).append(")");
        return sb.toString();
    }
}
