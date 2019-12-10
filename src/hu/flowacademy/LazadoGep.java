package hu.flowacademy;

public abstract class LazadoGep implements Urhajo{
    private double sebesseg;
    private boolean meghibasodhatE;

    public LazadoGep(double sebesseg, boolean meghibasodhatE) {
        this.sebesseg = sebesseg;
        this.meghibasodhatE = meghibasodhatE;
    }

    @Override
    public boolean legyorsuljaE(Urhajo urhajo) {
        if (urhajo instanceof LazadoGep) {
            LazadoGep lg = (LazadoGep) urhajo;
            return lg.meghibasodhatE && lg.sebesseg < this.sebesseg;
        }
        // millenium falcon feltétel
        return false;
    }

    @Override
    public double milyengyors() {
        return sebesseg;
    }

    public abstract boolean elkapjaAVonosugar();

    public double getSebesseg() {
        return sebesseg;
    }

    public void setSebesseg(double sebesseg) {
        this.sebesseg = sebesseg;
    }

    public boolean isMeghibasodhatE() {
        return meghibasodhatE;
    }

    public void setMeghibasodhatE(boolean meghibasodhatE) {
        this.meghibasodhatE = meghibasodhatE;
    }
}
