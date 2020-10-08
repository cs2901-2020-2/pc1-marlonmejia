import cs.lab.RegistrApp;
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

    @Test(invocationCount = 100, threadPoolSize =100)
    public void testCase2(){

    }
}
