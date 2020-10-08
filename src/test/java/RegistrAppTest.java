import cs.lab.RegistrApp;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class RegistrAppTest {
    @Test
    public void test1name() throws Exception {
        RegistrApp newregister=new RegistrApp();
        if(!newregister.nameuser("Ernesto Cadros")){
            throw new Exception("Error");
            }
    }
    @Test
    public void test2time() throws Exception{
        long starttime=System.currentTimeMillis();
        RegistrApp registerUser=new RegistrApp();
        registerUser.nameuser("Manuel Prado");
        registerUser.validate("2020-II CS2101 ES Teoría de la Computación, 1, Semana03, Juan Gutierrez,09/23 14:00-16:00 Laboratorio","https://utec.zoom.us/rec/share/2312312"
        long endtiem=System.currentTimeMillis();
        Assert.assertTrue((endtiem-starttime)<1000000);


    }

    @Test(invocationCount = 100, threadPoolSize =100)
    public void testCase3() throws Exception {
        RegistrApp registerUser=new RegistrApp();
        registerUser.nameuser("Manuel Prado");
        if(!registerUser.validate("2020-II CS2101 ES Teoría de la Computación, 1, Semana03, Juan Gutierrez,09/23 14:00-16:00 Laboratorio","https://utec.zoom.us/rec/share/2312312")){
            throw new Exception("Error");
        }

    }
}
