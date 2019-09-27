package cl.duoc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class testMontoBono {

    public testMontoBono() {
    }
        @Test
    public void testMontoBono() {
        System.out.println("montoBono");
        BussEmpleado instance = new BussEmpleado();
        int obtenido = 250000;
        int esperado = instance.montoBono("11111111");
        assertEquals(obtenido, esperado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
