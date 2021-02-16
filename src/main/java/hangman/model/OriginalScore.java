package hangman.model;
/**
 *  - Es el esquema actual, se inicia con 100 puntos.
    - No se bonifican las letras correctas.
    - Se penaliza con 10 puntos con cada letra incorrecta.
    - El puntaje minimo es 0.
 */
public class OriginalScore implements GameScore{
    public int score = 100;
    /**
     * Este metodo que calcula en puntaje utilizando la formula 100 - (10 * incorrectCount )
     * @pre inicia con 100 puntos
     * @pre no se bonifican las letras incorrectas
     * @pos el puntaje minumo es cero
     * @param correctCount contador de letras correctas
     * @param incorrectCount contador de las letras incorrectas
     * @return score  
     */
    public int calculateScore (int correctCount , int incorrectCount){
        int res = 0;
        int form = (100 - (10 * incorrectCount ));
        if ( correctCount <0 || incorrectCount <0){
            res = -1;
        }else if( form <0 ){
            res =0;
        }
        else {  
            res = form;
        }

        return res;
    }
}