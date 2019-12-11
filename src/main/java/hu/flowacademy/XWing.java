package hu.flowacademy;

import java.util.Random;

public class XWing extends LazadoGep implements Hiperhajtomu {
    public XWing() {
        super(150, true);
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
}
