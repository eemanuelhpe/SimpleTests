import junit.framework.Assert;
import org.junit.Test;
import java.util.Random;
import org.junit.Ignore;

 
/**  
 * Created by gadiel on 15/11/2016.                         
 */  
public class SimpleTest {
	
   @Test  
   public void alwaysPass1()
   {
       Assert.assertEquals(1, 1);
   }

  // @Test
    public void alwaysPass2()
    {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void alwaysFail1()
    {
        Assert.assertEquals(1, 0);    }

     @Test
    public void alwaysFail2()
    {
        Assert.assertEquals(1, 0);
    }
	
	@Test
    public void alwaysFail3()
    {
        Assert.assertEquals(1, 2);
    }

	@Test
    public void sometimesPass1()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
    }

     @Test
    public void sometimesPass2()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
    }
	
	@Test
	@Ignore
    public void ignored1()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(99);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
    }
	
	@Test
	@Ignore
    public void ignored2()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
    }
}
 
