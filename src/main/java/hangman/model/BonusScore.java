package hangman.model;

import hangman.exceptions.GameScoreExceptions;

/**
 *  - El juego inicia en 0 puntos.
    - Se bonifica con 10 puntos cada letra correcta.
    - Se penaliza con 5 puntos cada letra incorrecta.
    - El puntaje mínimo es 0
 */
public class BonusScore implements GameScore {
    /**
     * Este metodo que calcula en puntaje utilizando la formula ( 10 * correctCount ) - (5 * incorrectCount ) 
     * @pre inicia con 0 puntos
     * @pos el puntaje maximo es 100
     * @param correctCount contador de letras correctas
     * @param incorrectCount contador de las letras incorrectas
     * @throws GameScoreException incorrectCount<0 || correctCount<0 || 10*correctCount-5*incorrectCount >100 || 10*correctCount < 5*incorrectCount
     * @return score  
     */
    @Override
    public int calculateScore (int correctCount , int incorrectCount) throws GameScoreExceptions{
        int form = ((10 * correctCount ) - (5 * incorrectCount));

        if ( correctCount <0 || incorrectCount <0){
            throw new GameScoreExceptions(GameScoreExceptions.VALOR_NEGATIVO);
        }
        else if( form < 0 ){
            form = 0;
        }
        else if(form > 100){
            form = 100;
        }
        return form;
    }

    @Override
    public int getScore() {
        return 0;
    }

    @Override
    public int getLimit() {
        return 0;
    }
}