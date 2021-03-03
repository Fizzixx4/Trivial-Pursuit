import java.util.Scanner;

public class PionJoueur {
	
	String couleur;
	String nomJoueur;
	int scoreCamemebert;
	Case position;
	Dé dé;
	int indexPosition;
	
//Initialisation du saut de ligne
	static String sautLigne = System.getProperty("line.separator");
	
//Initialisation de Scanner
	static Scanner sc = new Scanner(System.in);
	
//Constructeur sans paramètre
	public PionJoueur(){}
	
//Constructeur avec paramètre
	public PionJoueur(String nomJoueur, String couleur,  Case position, Dé dé) {
		this.nomJoueur = nomJoueur;
		this.couleur = couleur;
		this.position = position;
		this.dé = dé;
	}
	
//Méthode de création d'un nouveau joueur
	public static void creationNouveauJoueur (PionJoueur nouveauJoueur) {
		
		System.out.println("Quel est ton nom nouveau joueur?"+sautLigne);
		String nomNouveauJoueur = sc.nextLine();
		System.out.println("Quelle est ta couleur préférée?"+sautLigne);
		String couleurNouveauPion=sc.nextLine();
		System.out.println("Je récapitule, tu t'appelles "+nomNouveauJoueur+" et tu auras le pion "+couleurNouveauPion+"."+sautLigne);
		
		nouveauJoueur.nomJoueur = nomNouveauJoueur;
		nouveauJoueur.couleur = couleurNouveauPion;
		nouveauJoueur.position = null;	
	}
	
//Méthode qui fait avancer le pion sur le plateau
	public void bougerPionJoueur(Case [] plateau) {
		do {System.out.println("Tu es sur une case "+this.position.type.type);
			
				this.dé.jetDeDé();
				System.out.println("Ton jet de dé est de "+this.dé.face+sautLigne);
				
				int indexDroite = this.indexPosition;
				int indexGauche = this.indexPosition;
				
			// à droite
				indexDroite += this.dé.face;
				if(indexDroite>41) {
					indexDroite = (indexDroite - 41)-1 ;
				}
				System.out.println("Si tu vas à droite, tu arriveras sur une case "+plateau[indexDroite].type.type+sautLigne);
				
			// à gauche
				indexGauche -= this.dé.face;
				if(indexGauche<0) {
					indexGauche = (indexGauche + 41)+1 ;
				}
				System.out.println("Si tu vas à gauche, tu arriveras sur une case "+plateau[indexGauche].type.type+sautLigne);
				
				
				System.out.println("Veux tu allez à gauche ou à droite?"+sautLigne);
				String choixGaucheDroite = sc.nextLine();
				
				while(!(choixGaucheDroite.equalsIgnoreCase("droite")||choixGaucheDroite.equalsIgnoreCase("gauche"))) {
					System.out.println("Cette direction n'existe pas.");
					choixGaucheDroite = sc.nextLine();
				}
				if(choixGaucheDroite.equalsIgnoreCase("gauche")){
					this.indexPosition = indexGauche;
					this.position = plateau[indexPosition];
				}
				else if(choixGaucheDroite.equalsIgnoreCase("droite")){
					this.indexPosition = indexDroite;
					this.position = plateau[indexPosition];
				}
				System.out.println("Tu es sur une case "+this.position.type.type);
			
		}while(this.position.type.equals(Type.REJOUER));
	}

//Méthode qui pause la question au joueur (En cours)
	public void poseLaQuestion() {
		switch(this.position.type) {
			case SCIENCES:
				break;
			case LITTERATURE:
				break;
			case HISTOIRE:
				break;
			case GEOGRAPHIE:
				break;
			case SPORT:
				break;
			case DIVERTISSEMENT:
		}
		
	}
}
