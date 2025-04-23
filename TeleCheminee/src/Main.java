
public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		Lampe l1=new Lampe("Lampe1");
		t.ajouterObjet(l1);
		Hifi h1 = new Hifi();
		t.ajouterObjet(h1);
		ChemineeAdapter c1 = new ChemineeAdapter();
		t.ajouterObjet(c1);

		TelecommandeGraphique tg=new TelecommandeGraphique(t);
	}
	
}
