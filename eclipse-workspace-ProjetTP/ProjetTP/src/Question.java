import java.util.Scanner;

public abstract class Question {
	
	String question;
	String choix;
	String reponse;
	Type type;
	
	
	Scanner choixReponse = new Scanner (System.in);
	
	public Question (String question, String choix, String reponse) {
		this.question = question;
		this.choix = choix;
		this.reponse = reponse;
	}
	
	public void poseLaQuestion() {
		System.out.println(this.question);
		System.out.println(this.choix);	
		String reponseScience = choixReponse.nextLine();
		if(reponseScience.equalsIgnoreCase(this.reponse)) {
			System.out.println("Bonne réponse!");
			System.out.println();
		}
		else {
			System.out.println("Mauvaise réponse!");
			System.out.println();
		}
	}
}