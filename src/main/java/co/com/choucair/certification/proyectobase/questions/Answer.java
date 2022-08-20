package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.tasks.Search;
import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer Tothe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String nameCourse = Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        if (question.equals(nameCourse)) {
            return true;
        }
        return false;
    }
}
