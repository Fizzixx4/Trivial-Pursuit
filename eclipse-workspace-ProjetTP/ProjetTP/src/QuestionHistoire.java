
public class QuestionHistoire extends Question{

	QuestionHistoire (String question, String choix, String reponse){
		super(question, choix, reponse);
		this.type = Type.HISTOIRE;
	}

}
