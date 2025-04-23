public class ChemineeAdapter implements ElectronicObject {

    private Cheminee c;

    public ChemineeAdapter(){
        c = new Cheminee();
    }

    public void allumer(){
        c.changerIntensite(c.getLumiere()+10);
    }

    public void eteindre(){
        c.changerIntensite(0);
    }

    public int getIntensite(){
        return c.getLumiere();
    }
}
