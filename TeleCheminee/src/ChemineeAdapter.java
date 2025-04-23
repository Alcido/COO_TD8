public class ChemineeAdapter extends Cheminee implements ElectronicObject {

    public ChemineeAdapter(){
        super();
    }

    public void allumer(){
        super.changerIntensite(super.getLumiere()+10);
    }

    public void eteindre(){
        super.changerIntensite(0);
    }
}
