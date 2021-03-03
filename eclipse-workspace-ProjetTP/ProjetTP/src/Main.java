import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	////Initialisation du saut de ligne
		String sautLigne = System.getProperty("line.separator");
		
	//Création des dés
		Dé dé1 = new Dé();
		Dé dé2 = new Dé();	
		
	//Instanciation des cases
		Case caseSciences = new Case (Type.SCIENCES,false);
		Case caseSciencesCamembert = new Case (Type.SCIENCES,true);
		Case caseLitterature = new Case (Type.LITTERATURE,false);
		Case caseLitteratureCamembert = new Case (Type.LITTERATURE,true);
		Case caseHistoire = new Case (Type.HISTOIRE,false);
		Case caseHistoireCamembert = new Case (Type.HISTOIRE,true);
		Case caseGeographie = new Case (Type.GEOGRAPHIE,false);
		Case caseGeographieCamembert = new Case (Type.GEOGRAPHIE,true);
		Case caseSport = new Case (Type.SPORT,false);
		Case caseSportCamembert = new Case (Type.SPORT,true);
		Case caseDivertissement = new Case (Type.DIVERTISSEMENT,false);
		Case caseDivertissementCamembert = new Case (Type.DIVERTISSEMENT,true);
		Case caseRejouer = new Case (Type.REJOUER,false);
		caseRejouer.rejouer = true;
		
	//Création du plateau
		Case[] plateau = new Case[42];
		
		plateau[0] = caseDivertissement;plateau[1] = caseRejouer;plateau[2] = caseGeographie;plateau[3] = caseHistoire;
		plateau[4] = caseRejouer;plateau[5] = caseSport;plateau[6] = caseLitteratureCamembert;plateau[7] = caseSport;
		plateau[8] = caseRejouer;plateau[9] = caseDivertissement;plateau[10] = caseSciences;plateau[11] = caseRejouer;
		plateau[12] = caseHistoire;plateau[13] = caseGeographieCamembert;plateau[14] = caseHistoire;plateau[15] = caseRejouer;
		plateau[16] = caseSport;plateau[17] = caseLitterature;plateau[18] = caseRejouer;plateau[19] = caseSciences;
		plateau[20] = caseDivertissementCamembert;plateau[21] = caseSciences;plateau[22] = caseRejouer;plateau[23] = caseHistoire;
		plateau[24] = caseGeographie;plateau[25] = caseRejouer;plateau[26] = caseLitterature;plateau[27] = caseSportCamembert;
		plateau[28] = caseLitterature;plateau[29] = caseRejouer;plateau[30] = caseSciences;plateau[31] = caseDivertissement;
		plateau[32] = caseRejouer;plateau[33] = caseGeographie;plateau[34] = caseHistoireCamembert;plateau[35] = caseGeographie;
		plateau[36] = caseRejouer;plateau[37] = caseLitterature;plateau[38] = caseSport;plateau[39] = caseRejouer;
		plateau[40] = caseDivertissement;plateau[41] = caseSciencesCamembert;
	
	//Instanciation des questions SCIENCES
		QuestionSciences qSc1 = new QuestionSciences("Quelle est la matière la plus dure que comporte le corps humain?",
				"A.Les os"+sautLigne+"B.Le cartilage"+sautLigne+"C.L'émail des dents"+sautLigne+"D.Les nerfs",
				"C");
		
		QuestionSciences qSc2 = new QuestionSciences("Quel métal est liquide à température ambiante?",
				"A.Le fer"+sautLigne+"B.Le mercure"+sautLigne+"C.Le cuivre"+sautLigne+"D.Le plomb",
				"B");
		
		QuestionSciences qSc3 = new QuestionSciences("Quels atomes composent une molécule d'ozone?",
				"A.Trois atomes d'oxygéne"+sautLigne+"B.Un atome d'hydrogène et deux atomes d'oxygène"+sautLigne+"C.Deux atomes d'oxygène et un atome d'hydrogène"+sautLigne+"D.Un atome d'hydrogène et deux atomes d'azote",
				"A");
		
		QuestionSciences qSc4 = new QuestionSciences("Que vantait le premier spam de l'histoire de l'informatique?",
				"A.Un médicament pour maigrir"+sautLigne+"B.Un ordinateur"+sautLigne+"C.Une pizzeria"+sautLigne+"D.Un site de rencontre",
				"B");
		
		QuestionSciences qSc5 = new QuestionSciences("En informatique que signifie RAM?",
				"A.Random Acces Memory"+sautLigne+"B.Real Access Memory"+sautLigne+"C.Real Activity Memory"+sautLigne+"D.Recovery Activity Memory",
				"A");
		
	//Instanciation des questions LITTERATURE
		QuestionLitterature qL1 = new QuestionLitterature("Comment s'appelle les deux protagonistes dans Des souris et des hommes de John Steinbeck?",
				"A.Bob et Johny"+sautLigne+"B.Chris et Joe"+sautLigne+"C.John et Andrew"+sautLigne+"D.Georges et Lennie",
				"D");
		
		QuestionLitterature qL2 = new QuestionLitterature("Dans la suite de livre La Passe Miroir de Christelle Dabos, combien y a-t-il de tomes?",
				"A.2"+sautLigne+"B.3"+sautLigne+"C.4"+sautLigne+"D.5",
				"C");
		
		QuestionLitterature qL3 = new QuestionLitterature("Qui a écrit la pièce Horace?",
				"A.Molière"+sautLigne+"B.Corneille"+sautLigne+"C.Racine"+sautLigne+"D.Shakespeare",
				"B");
		
		QuestionLitterature qL4 = new QuestionLitterature("Dans la saga Harry Potter, à quelle maison appartient Luna Lovegood?",
				"A.Gryfondor"+sautLigne+"B.Serdaigle"+sautLigne+"C.Poussoufle"+sautLigne+"D.Serpentard",
				"B");
	
		QuestionLitterature qL5 = new QuestionLitterature("Dans La ferme des Animaux de Georges Orwell, qui sont les nouveaux chef de la ferme après la mort du propriétaire?",
				"A.Les vaches"+sautLigne+"B.Les chiens"+sautLigne+"C.Les chevaux"+sautLigne+"D.Les cochons",
				"D");
		
	//Création du joueur 1
		System.out.println("Bienvenue pour cette partie de Trivial Pursuit!"+sautLigne);
		
		System.out.println("Quel est ton nom?"+sautLigne);	
		
		Scanner sc = new Scanner(System.in);
		String nomJoueur1=sc.nextLine();
		
		System.out.println("Bienvenue "+nomJoueur1+"!... Avec un nom pareil j'espère que tu as fait un procès à tes parents."+sautLigne);
		System.out.println("Quelle est ta couleur préférée? Cela déterminera la couleur de ton pion.");
		
		String couleurPion1=sc.nextLine();
		
		System.out.println("C'est original..."+sautLigne);
		System.out.println("Je récapitule, tu t'appelles "+nomJoueur1+" et tu auras le pion "+couleurPion1+"."+sautLigne);
		
		PionJoueur joueur1 = new PionJoueur(nomJoueur1,couleurPion1,plateau[0],dé1);
				
	//S'il y a un autre joueur création du joueur 2
		System.out.println("Y a-t-il un autre joueur? Oui/Non"+sautLigne);
		
		PionJoueur joueur2 = new PionJoueur();
		
		String choixNouveauJoueur = sc.nextLine();
		
		while(!(choixNouveauJoueur.equalsIgnoreCase("oui")||choixNouveauJoueur.equalsIgnoreCase("non"))) {
			System.out.println("Tu ne sais pas écrire? Tu as besoin d'aide?"+sautLigne);
			System.out.println("Y a-t-il un autre joueur? Oui/Non"+sautLigne);
			choixNouveauJoueur = sc.nextLine();
			}
		
		if(choixNouveauJoueur.equalsIgnoreCase("oui")) {
			PionJoueur.creationNouveauJoueur(joueur2);
			joueur2.position = plateau[0];
			joueur2.dé = dé2;
		}
		else if(choixNouveauJoueur.equalsIgnoreCase("non")){
			System.out.println("Tu es seul(e) à jouer. Tu n'as pas d'ami?"+sautLigne);
		}
		
		System.out.println("Ok c'est parti!"+sautLigne);
		
	//Jet de dé pour savoir qui commence
			if(joueur2.nomJoueur!=null) {
				do{	System.out.println("Un jet de dé est lancé pour chaque joueur afin de savoir qui commence."+sautLigne);
					joueur1.dé.jetDeDé();
					System.out.println(dé1.face+" pour "+joueur1.nomJoueur);
					joueur2.dé.jetDeDé();
					System.out.println(dé2.face+" pour "+joueur2.nomJoueur+sautLigne);
						if(dé1.face>dé2.face) {
							System.out.println(joueur1.nomJoueur+" commence!"+sautLigne);
						}
						else if(dé1.face<dé2.face) {
							System.out.println(joueur2.nomJoueur+" commence!"+sautLigne);
						}
						else {
							System.out.println("On recommence!"+sautLigne);
						}
				} while(dé1.face==dé2.face);
			}

	//Bouger pion
		joueur1.bougerPionJoueur(plateau);
	
	//Pose question en fonction de la case sur laquelle est le joueur
		
		
	}
}