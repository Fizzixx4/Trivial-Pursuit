import java.util.ArrayList;
import java.util.List;

public class QuestionGeographie extends Question{

	static List<QuestionGeographie> listeGeographie = new ArrayList<QuestionGeographie>();
	
	QuestionGeographie (String question, String choix, String reponse){
		super(question, choix, reponse);
		this.type = Type.GEOGRAPHIE;
		QuestionGeographie.listeGeographie.add(this);
	}


}
