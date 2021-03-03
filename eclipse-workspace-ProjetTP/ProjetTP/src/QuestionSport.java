import java.util.ArrayList;
import java.util.List;

public class QuestionSport extends Question{

	static List<QuestionSport> listeSport = new ArrayList<QuestionSport>();
	
//Contructeur
	QuestionSport (String question, String choix, String reponse){
		super(question, choix, reponse);
		this.type = Type.SPORT;
		QuestionSport.listeSport.add(this);
	}

}
