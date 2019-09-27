package cl.duoc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;


public class testModificar {

    public testModificar() {
    }
        @Test
    public void testModificar() {
        System.out.println("Modificar");
        Empleado obj = new Empleado("11111111", "Joaquina", 36, 3);
        BussEmpleado instance = new BussEmpleado();
        boolean  esperado = true;
        boolean obtenido = instance.Modificar(obj);
        assertEquals(esperado, obtenido);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
