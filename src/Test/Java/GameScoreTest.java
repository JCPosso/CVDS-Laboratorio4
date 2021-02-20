package hangman;
import org.junit.Test;
import org.junit.Assert;

import hangman.exceptions.GameScoreExceptions;
import hangman.model.*;

public class GameScoreTest {
    public OriginalScore os = new OriginalScore ();
    public BonusScore bs = new BonusScore ();
    public PowerScore ps = new PowerScore ();

    @Test
    public void verificarParametrosEntradaSonEnterosPositivosOriginalScore (){    
        try{
            os.calculateScore(-1, -1);
            Assert.fail(); 
        }catch(GameScoreExceptions e){
        Assert.assertEquals(e.getMessage(),GameScoreExceptions.VALOR_NEGATIVO);
        }
    }

    @Test
    public void verificarParametrosEntradaSonEnterosPositivosBonusScore (){
        try{
        bs.calculateScore(-1, -1) ;
        Assert.fail();
    } catch (GameScoreExceptions e){
        Assert.assertEquals(e.getMessage(),GameScoreExceptions.VALOR_NEGATIVO);
    }
    }

    @Test
    public void verificarParametrosEntradaSonEnterosPositivosPowerScore (){
        try{
            ps.calculateScore(-1, -1);
            Assert.fail();
        }catch(GameScoreExceptions e){
            Assert.assertEquals(e.getMessage(),GameScoreExceptions.VALOR_NEGATIVO);
        }
    }


  //---------------ORIGINAL SCORE-------------------
    @Test
    public void verificarPuntajeMinimoSeaCeroOriginalScore (){
        try{
            os.calculateScore(0,100);
            Assert.fail();
        }catch(GameScoreExceptions e){
            Assert.assertEquals(e.getMessage(),GameScoreExceptions.VALOR_FUERA_LIMITE);//limite Superior
        }
    }

    @Test
    public void verificarQueNoSeBonificanLasLetrasCorrectas (){
        try {
            Assert.assertEquals(0, os.calculateScore(100,10));            
        } catch (Exception e) {
            Assert.fail();
        }
    }
    
    @Test
    public void verificarPenalizacionEnOriginalScore (){
        try {
            Assert.assertEquals(50, os.calculateScore(0,5));
            
        } catch (Exception e) {
            Assert.fail();
        }
    }



    //---------------BONUS SCORE-------------------
    @Test
    public void verificarPuntajeMinimoSeaCeroBonusScore (){
        try {
            bs.calculateScore(1,100);  
            Assert.fail();          
        } catch (Exception e) {
            Assert.assertEquals(e.getMessage(),GameScoreExceptions.VALOR_FUERA_LIMITE);//limite         
        }
    }
    @Test
    public void verificarQueElJuegoInicieConCeroBonusScore (){
        try {
            Assert.assertEquals(0, bs.calculateScore(0,0));            
        } catch (Exception e) {
            Assert.fail();          
        }
    }

    @Test
    public void verificarQueBonifiqueLetrasCorrectasCon10Puntos (){
       try {
        Assert.assertEquals(10, bs.calculateScore(1,0));  
       } catch (Exception e) {
        Assert.fail();          
        } 
    }

    @Test
    public void verificarQuePenalizeLetrasIncorrectasCon5Puntos (){
        try {
            Assert.assertEquals(5, bs.calculateScore(1,1));         
        } catch (Exception e) {
            Assert.fail();          
        }
    }

    //---------------POWER SCORE-------------------
    @Test
    public void verificarPuntajeMinimoSeaCeroPowerScore (){
        try {
            Assert.assertEquals(0, ps.calculateScore(3,100));  
            Assert.fail();                  
        } catch (GameScoreExceptions e) {
            Assert.assertEquals(e.getMessage(),GameScoreExceptions.VALOR_NEGATIVO);//limite          
        }
    }

    @Test
    public void verificarNoSupereLos500PuntosPowerScore (){
        try {
            Assert.assertEquals(500, ps.calculateScore(4,0));       
            Assert.fail();                        
        } catch (GameScoreExceptions e) {
            Assert.assertEquals(e.getMessage(),GameScoreExceptions.VALOR_FUERA_LIMITE);//limite          
        }
    }

    @Test
    public void verificarQueElJuegoIniciaConCeroPowerScore (){
        try {
            Assert.assertEquals(0, ps.calculateScore(0,0));            
        } catch (Exception e) {
            Assert.fail();                        
        }
    }

    @Test
    public void verificarIesimaLetraBonifiqueALaIesimaPotenciaPowerScore1 (){
        try {
            Assert.assertEquals(5, ps.calculateScore(1,0));                    
        } catch (Exception e) {
            Assert.fail();                        
        }
    }

    @Test
    public void verificarIesimaLetraBonifiqueALaIesimaPotenciaPowerScore2 (){
        try {
            Assert.assertEquals(25, ps.calculateScore(2,0));                  
        } catch (Exception e) {
            Assert.fail();                        
        }
    }

    @Test
    public void verificarIesimaLetraBonifiqueALaIesimaPotenciaPowerScore3 (){
        try {
            Assert.assertEquals(125, ps.calculateScore(3,0));                    
        } catch (Exception e) {
            Assert.fail();                        
        }

    }

    @Test
    public void verificarPenalizacion8puntosLetraIncorrectaPowerScore (){
        try {
            Assert.assertEquals(17, ps.calculateScore(2,1));            
        } catch (Exception e) {
            Assert.fail();                        
        }
    }
}
