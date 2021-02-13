package hangman.model;
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
    public int calculateScore (int correctCount , int incorrectCount);
}