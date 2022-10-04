import org.example.GermanExample;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class FirstTestGerman {

    @Test
    public void verificationTestOnGradle(){
        assertEquals(GermanExample.printingSomething(),"Hola German desde Gradle!! TEst","No Funka!!");
    }
}
