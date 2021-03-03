
public class QuestionDivertissement extends Question{

	QuestionDivertissement (String question, String choix, String reponse){
		super(question, choix, reponse);
		this.type = Type.DIVERTISSEMENT;
	}

}
