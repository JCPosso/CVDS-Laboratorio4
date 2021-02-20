package hangman.model;
import hangman.exceptions.GameScoreExceptions;
/**
 *  - Es el esquema actual, se inicia con 100 puntos.
    - No se bonifican las letras correctas.
    - Se penaliza con 10 puntos con cada letra incorrecta.
    - El puntaje minimo es 0.
 */
public class OriginalScore implements GameScore{
    private int score = 100;
    private int limit = 100;

    public OriginalScore(){
        
    }

    /**
     * Este metodo que calcula en puntaje utilizando la formula 100 - (10 * incorrectCount )
     * @pre inicia con 100 puntos
     * @pre no se bonifican las letras incorrectas
     * @pos el puntaje minimo es cero
     * @param correctCount contador de letras correctas
     * @param incorrectCount contador de las letras incorrectas
     * @throws GameScoreException   correctCount<0 || incorrectCount<0 || 100 - (10 * incorrectCount )<0
     * @return score  
     */
    @Override
    public int calculateScore (int correctCount , int incorrectCount) throws GameScoreExceptions{

        int form = (100 - (10 * incorrectCount));

        if ( correctCount < 0 || incorrectCount <0){
            throw new GameScoreExceptions(GameScoreExceptions.VALOR_NEGATIVO);
        }
        if ( form < 0){
            form = 0;
        }
        
        return form;
    }

    public int getScore() {
        return score;
    }

    public int getLimit() {
        return limit;
    }
}