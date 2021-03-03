import java.util.ArrayList;
import java.util.List;

public class QuestionDivertissement extends Question{

	static List<QuestionDivertissement> listeDivertissement = new ArrayList<QuestionDivertissement>();
	
//Contructeur
	QuestionDivertissement (String question, String choix, String reponse){
		super(question, choix, reponse);
		this.type = Type.DIVERTISSEMENT;
		QuestionDivertissement.listeDivertissement.add(this);
	}

}
