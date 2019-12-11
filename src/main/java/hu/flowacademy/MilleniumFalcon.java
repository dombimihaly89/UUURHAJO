package hu.flowacademy;

import java.util.UUID;

public class MilleniumFalcon implements Urhajo, Hiperhajtomu {

    private UUID id;
    private double tapasztalat;

    public MilleniumFalcon() {
        this.id = UUID.randomUUID();
        this.tapasztalat = 100;
    }

    @Override
    public void HiperUgras() {
        this.tapasztalat += 500;
    }

    @Override
    public boolean legyorsuljaE(Urhajo urhajo) {
        if (urhajo.milyengyors() < this.milyengyors()) return true;
        return false;
    }

    @Override
    public double milyengyors() {
        return tapasztalat * 2;
    }

    @Override
    public String toString() {
        return "MilleniumFalcon{" +
                "id=" + id.toString() +
                ", tapasztalat=" + tapasztalat +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public double getTapasztalat() {
        return tapasztalat;
    }

    public void setTapasztalat(double tapasztalat) {
        this.tapasztalat = tapasztalat;
    }

    public String getInsertSQL() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO MilleniumFalcons (id, tapasztalat) VALUES (")
                .append("'").append(this.id).append("', ")
                .append("'").append(this.tapasztalat).append("')");
        return sb.toString();
    }
}
