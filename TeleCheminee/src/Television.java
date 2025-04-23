//classe de test pour montrer un possible fonctionnement

public class Television implements ElectronicObject{

    //attribut permettant de savoir si la télé est allumé, si oui alors image vaut True, false sinon
    private boolean image;
    private int son = 0;


    public void allumer(){
        image = true;
        son = 0;
    }

    public void eteindre(){
        image = false;
        son = 0;
    }

    public void setSon(int s){
        son = s;
    }


}
