package marleidealves;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TesteTest {

    @Test
public void testCalculo() {
    System.out.println("calculo");
    double x = 10.0;
    double y = 8.0;
    double z = 1.0;
    Teste instance = new Teste();
    double e = 15.0;
    double r = instance.calculo(x, y, z);
    assertEquals(e, r, 0.0);
}

    
}
