import org.junit.Test;
import org.junit.Assert;
import hangman.model.*;

public class GameScoreTest {
    public OriginalScore os = new OriginalScore ();
    public BonusScore bs = new BonusScore ();
    public PowerScore ps = new PowerScore ();

    @Test
    public void verificarParametrosEntradaSonEnterosPositivosOriginalScore (){    
        Assert.assertEquals(-1 , os.calculateScore(-1, -1) );
    }

    @Test
    public void verificarParametrosEntradaSonEnterosPositivosBonusScore (){
        Assert.assertEquals(-1 , bs.calculateScore(-1, -1) );
    }

    @Test
    public void verificarParametrosEntradaSonEnterosPositivosPowerScore (){
        Assert.assertEquals(0 , ps.calculateScore(-1, -1));
    }

    @Test
    public void verificarQueNoSeBonificanLasLetrasCorrectas (){
        Assert.assertEquals(0, os.calculateScore(100,10));
    }
    
    @Test
    public void verificarPenalizacionEnOriginalScore (){
        Assert.assertEquals(50, os.calculateScore(0,5));
    }

    @Test
    public void verificarPuntajeMinimoSeaCeroOriginalScore (){
        Assert.assertEquals(0, os.calculateScore(0,100));
    }

    //---------------BONUS SCORE-------------------

    @Test
    public void verificarQueElJuegoInicieConCeroBonusScore (){
        Assert.assertEquals(0, bs.calculateScore(0,0));
    }

    @Test
    public void verificarQueBonifiqueLetrasCorrectasCon10Puntos (){
        Assert.assertEquals(10, bs.calculateScore(1,0));
    }

    @Test
    public void verificarQuePenalizeLetrasIncorrectasCon5Puntos (){
        Assert.assertEquals(5, bs.calculateScore(1,1));
    }

    @Test
    public void verificarPuntajeMinimoSeaCero (){
        Assert.assertEquals(0, bs.calculateScore(1,100));
    }

    @Test
    public void verificarQueElJuegoIniciaConCeroPowerScore (){
        Assert.assertEquals(0, ps.calculateScore(0,0));
    }

    @Test
    public void verificarIesimaLetraBonifiqueALaIesimaPotenciaPowerScore1 (){
        Assert.assertEquals(5, ps.calculateScore(1,0));        
    }

    @Test
    public void verificarIesimaLetraBonifiqueALaIesimaPotenciaPowerScore2 (){
        Assert.assertEquals(25, ps.calculateScore(2,0));        
    }

    @Test
    public void verificarIesimaLetraBonifiqueALaIesimaPotenciaPowerScore3 (){
        Assert.assertEquals(125, ps.calculateScore(3,0));        
    }

    @Test
    public void verificarPenalizacion8puntosLetraIncorrectaPowerScore (){
        Assert.assertEquals(17, ps.calculateScore(2,1));
    }

    @Test
    public void verificarPuntajeMinimoSeaCeroPowerScore (){
        Assert.assertEquals(0, ps.calculateScore(3,100));        
    }

    @Test
    public void verificarNoSupereLos500PuntosPowerScore (){
        Assert.assertEquals(500, ps.calculateScore(4,0)); 
    }
}
