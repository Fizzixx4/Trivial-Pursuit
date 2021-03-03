import java.util.Scanner;

public abstract class Question {
	
	String question;
	String choix;
	String reponse;
	Type type;
	
	Scanner choixReponse = new Scanner (System.in);
	
//Contructeur
	public Question (String question, String choix, String reponse) {
		this.question = question;
		this.choix = choix;
		this.reponse = reponse;
	}
	
//Pause la question (En cours)
	public void enonceLaQuestion(Type type) {
		System.out.println(this.question);
		System.out.println(this.choix);	
		String reponseScanner = choixReponse.nextLine();
		if(reponseScanner.equalsIgnoreCase(this.reponse)) {
			System.out.println("Bonne réponse!");
			System.out.println();
		}
		else {
			System.out.println("Mauvaise réponse!");
			System.out.println();
		}
	}
}