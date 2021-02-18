package hangman.model;
import hangman.exceptions.GameScoreExceptions;
/*
* Interface que calcula el puntaje del juego
*/
public interface GameScore {
    /**
     * Metodo que calcula el puntaje
     * @param correctCount contador de letras correctas
     * @param incorrectCount contador de letras incorrectas
     * @return score 
     **/
    int getScore();
    int getLimit();
    public int calculateScore (int correctCount , int incorrectCount) throws GameScoreExceptions ;
}