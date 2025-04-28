import appartement.*;

public class AppartementAdapter {
    private Appartement appartement;
    private Telecommande telecommande;

    public AppartementAdapter() {
        appartement = Appartement.getTemoin();
        telecommande = new Telecommande();

        this.chargerTelecommande();
    }

    public void chargerTelecommande(){
        AppareilAppartLampe l1 = (AppareilAppartLampe) appartement.recupererAppareil("lampe", "Chambre1");
        telecommande.ajouterObjet(new LampeAdapter(l1, "Lampe Chambre 1"));

        AppareilAppartThermostat t1 = (AppareilAppartThermostat) appartement.recupererAppareil("thermostat", "Chambre1");
        telecommande.ajouterObjet(new AppartThermostatAdapter(t1, "Thermostat Chambre 1"));

        AppareilAppartLampe l2 = (AppareilAppartLampe) appartement.recupererAppareil("lampe", "Sejour");
        telecommande.ajouterObjet(new LampeAdapter(l2, "Lampe 1 Sejour"));

        AppareilAppartLampe l3 = (AppareilAppartLampe) appartement.recupererAppareil("lampe2", "Sejour");
        telecommande.ajouterObjet(new LampeAdapter(l3, "Lampe 2 Sejour"));

        AppareilAppartThermostat t2 = (AppareilAppartThermostat) appartement.recupererAppareil("thermostat", "Sejour");
        telecommande.ajouterObjet(new AppartThermostatAdapter(t2, "Thermostat Sejour"));

        AppareilAppartLampe l4 = (AppareilAppartLampe) appartement.recupererAppareil("lampe", "Chambre2");
        telecommande.ajouterObjet(new LampeAdapter(l4, "Lampe Chambre 2"));

        AppareilAppartHifi h1 = (AppareilAppartHifi) appartement.recupererAppareil("hifi", "Chambre2");
        telecommande.ajouterObjet(new HifiAdapter(h1, "Hifi Chambre 2"));

        System.out.println(t1.toString());
        System.out.println(t2.toString());

        System.out.println(t1 == t2);
    }

    public Appartement getAppart(){
        return this.appartement;
    }

    public Telecommande getTelecommande(){
        return this.telecommande;
    }
}
