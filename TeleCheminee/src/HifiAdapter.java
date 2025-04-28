import appartement.AppareilAppartHifi;
import appartement.Appartement;

public class HifiAdapter implements ElectronicObject{
    private AppareilAppartHifi a;
    private int son;
    private String desc;

    public HifiAdapter(AppareilAppartHifi app, String desc){
        a = app;
        son = 0;
    }

    @Override
    public void allumer() {
        son += 10;
        a.changerSon(son);
    }

    @Override
    public void eteindre() {
        son = 0;
        a.changerSon(0);
    }
}
