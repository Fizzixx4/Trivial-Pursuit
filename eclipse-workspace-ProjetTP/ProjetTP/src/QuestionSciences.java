import java.util.ArrayList;
import java.util.List;

public class QuestionSciences extends Question{

	static List<QuestionSciences> listeSciences = new ArrayList<QuestionSciences>();
	
	QuestionSciences (String question, String choix, String reponse){
		super(question, choix, reponse);
		this.type = Type.SCIENCES;
		QuestionSciences.listeSciences.add(this);
	}
	
}
