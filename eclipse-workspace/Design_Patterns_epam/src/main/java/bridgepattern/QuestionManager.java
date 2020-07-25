package bridgepattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
	
public class QuestionManager  {  
		final Logger logger=LogManager.getLogger(QuestionManager.class);
	    protected Question q;  
	    private String catalog;  
	    public QuestionManager(String catalog) {  
	    this.catalog=catalog;  
	    }  
	    public void next() {  
	    q.nextQuestion();  
	    }  
	    public void previous() {  
	    q.previousQuestion();  
	    }  
	    public void newOne(String quest) {  
	    q.newQuestion(quest);  
	    }  
	    public void delete(String quest) {  
	    q.deleteQuestion(quest);  
	    }  
	    public void display() {  
	    q.displayQuestion();  
	    }  
	    public void displayAll() {  
	        logger.debug("Question Paper: " + catalog);  
	    q.displayAllQuestions();  
	    }  
	}