package hangman.model;
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
     * @return score  
     */
    public int calculateScore (int correctCount , int incorrectCount){
        int res = 0;
        if ( correctCount <0 || incorrectCount <0){
            res = -1;
        }else if( (100 - (10 * incorrectCount )) <0 ){
            res =0;
        }
        else {  
            res = 100 - (10 * incorrectCount ) ;            
        }
        return res;
    }

}