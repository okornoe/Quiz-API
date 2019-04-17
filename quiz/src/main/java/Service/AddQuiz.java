package Service;

import DAO.DAOO;
import Entities.Questions;
import Entities.Quiz;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;



public class AddQuiz {

    Quiz q;
    Questions questions;
    DAOO dAo;
    AddQuiz(String t,String quest,String choice1,String choice2,String choice3,String choice4,String rightanswer){
        q = new Quiz();
        q.type = t;
        UUID temp = UUID.randomUUID();
        q.ID = temp;
        questions = new Questions();
        questions.ID = temp;
        questions.question = quest;
        questions.choice1 = choice1;
        questions.choice2 = choice2;
        questions.choice3 = choice3;
        questions.choice4 = choice4;
        questions.rightanswer = rightanswer;
        this.dAo = dAo;
    }

    @Autowired
    public void intializeDatabase(DAOO dAo){
        this.dAo = dAo;
    }
}
