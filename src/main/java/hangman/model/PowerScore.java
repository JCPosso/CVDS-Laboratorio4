package hangman.model;

import hangman.exceptions.GameScoreExceptions;

/**
 *  - El juego inicia en 0 puntos.
    - La $i-ésima$ letra correcta se bonifica con $5^i$.
    - Se penaliza con 8 puntos cada letra incorrecta.
    - El puntaje mínimo es 0
    - Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500.
 */
public class PowerScore implements GameScore{
    public int score = 0;
    public int limit =500;
    /**
     * Este metodo que calcula en puntaje utilizando la formula (5^correctCount) - ( 8 * incorrectCount ) 
     * @pre inicia con 0 puntos
     * @pos Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500.
     * @param correctCount contador de letras correctas
     * @param incorrectCount contador de las letras incorrectas
     * @throws GameScoreException correctCount<0 || incorrectCount<0 || correctCount>3 || Math.pow(5, correctCount) < (8 * incorrectCount )
     * @return score  
     */
    @Override
    public int calculateScore (int correctCount , int incorrectCount) throws GameScoreExceptions{
        
        int form = (int) ((Math.pow(5, correctCount)) - (8 * incorrectCount));
        
        if(correctCount < 0 || incorrectCount < 0){
            throw new GameScoreExceptions(GameScoreExceptions.VALOR_NEGATIVO);
        }
        else if ( correctCount>3){
            throw new GameScoreExceptions(GameScoreExceptions.VALOR_FUERA_LIMITE);
        }
        else if(form < 0){
            throw new GameScoreExceptions(GameScoreExceptions.VALOR_NEGATIVO);
        }
        else if (form == 1){
            form = 0;
        }
        return form;
    }

    @Override
    public int getScore() {
        return score;
    }
    @Override
    public int getLimit() {
        return limit;
    }
}