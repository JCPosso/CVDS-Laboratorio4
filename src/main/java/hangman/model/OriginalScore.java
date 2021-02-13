package hagman.model;
/**
 *  - Es el esquema actual, se inicia con 100 puntos.
    - No se bonifican las letras correctas.
    - Se penaliza con 10 puntos con cada letra incorrecta.
    - El puntaje minimo es 0.
 */
public class OriginalScore implements GameScore{
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
        return null;
    }
}