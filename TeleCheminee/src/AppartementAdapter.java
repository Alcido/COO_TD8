import appartement.Appartement;

public class AppartementAdapter {
    private Appartement appartement;
    private Telecommande telecommande;

    public AppartementAdapter(){
        appartement = Appartement.getTemoin();
        telecommande = new Telecommande();
    }


}
