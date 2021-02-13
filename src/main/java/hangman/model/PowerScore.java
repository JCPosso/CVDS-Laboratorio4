package hangman.model;
/**
 *  - El juego inicia en 0 puntos.
    - La $i-ésima$ letra correcta se bonifica con $5^i$.
    - Se penaliza con 8 puntos cada letra incorrecta.
    - El puntaje mínimo es 0
    - Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500.
 */
public class PowerScore implements GameScore{
    /**
     * Este metodo que calcula en puntaje utilizando la formula (5^correctCount) - ( 8 * incorrectCount ) 
     * @pre inicia con 0 puntos
     * @pos Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500.
     * @param correctCount contador de letras correctas
     * @param incorrectCount contador de las letras incorrectas
     * @return score  
     */
    public int calculateScore (int correctCount , int incorrectCount){
        return null;
    }
}