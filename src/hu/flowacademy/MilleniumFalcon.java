package hu.flowacademy;

public class MilleniumFalcon implements Urhajo, Hiperhajtomu {

    private double tapasztalat;

    public MilleniumFalcon() {
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
                "tapasztalat=" + tapasztalat +
                '}';
    }
}
