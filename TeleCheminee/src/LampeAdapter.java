import appartement.AppareilAppart;
import appartement.AppareilAppartLampe;
import appartement.AppareilAppartThermostat;

public class LampeAdapter implements ElectronicObject{

    private AppareilAppartLampe lampe;
    private String desc;


    public LampeAdapter(AppareilAppartLampe l, String desc) {
        lampe = l;
        this.desc = desc;
    }

    public void allumer() {
        lampe.allumer();
    }

    public void eteindre() {
        lampe.eteindre();
    }

    public AppareilAppartLampe getLampe() {
        return lampe;
    }


}
