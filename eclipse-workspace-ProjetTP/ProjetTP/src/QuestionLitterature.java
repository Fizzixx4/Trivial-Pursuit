import java.util.ArrayList;
import java.util.List;

public class QuestionLitterature extends Question{

	static List<QuestionLitterature> listeLitterature = new ArrayList<QuestionLitterature>();
	
//Contructeur
	QuestionLitterature (String question, String choix, String reponse){
		super(question, choix, reponse);
		this.type = Type.LITTERATURE;
		QuestionLitterature.listeLitterature.add(this);
	}
	
}
