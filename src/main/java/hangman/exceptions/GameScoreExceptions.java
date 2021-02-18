package hangman.exceptions;


public class GameScoreExceptions extends Exception {
    public static final String  VALOR_NEGATIVO = "Uno de los parametros contiene un valor negativo";
    public static final String  VALOR_FUERA_LIMITE = "Uno de los valores supera el limite de puntuación";
    public GameScoreExceptions( String message){
        super(message);
    }
}
