package hu.flowacademy;

import java.util.Random;

public class XWing extends LazadoGep implements Hiperhajtomu {
    public XWing(double sebesseg, boolean meghibasodhatE) {
        super(sebesseg = 150, meghibasodhatE = true);
    }

    @Override
    public boolean elkapjaAVonosugar() {
        if (this.isMeghibasodhatE() && this.getSebesseg() < 10000) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void HiperUgras() {
        Random rnd = new Random();
        this.setSebesseg(rnd.nextDouble() * 100);

    }
}
