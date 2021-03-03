import java.util.ArrayList;
import java.util.List;

public class QuestionHistoire extends Question{
	
	static List<QuestionHistoire> listeHistoire = new ArrayList<QuestionHistoire>();

	QuestionHistoire (String question, String choix, String reponse){
		super(question, choix, reponse);
		this.type = Type.HISTOIRE;
		QuestionHistoire.listeHistoire.add(this);
	}

}
