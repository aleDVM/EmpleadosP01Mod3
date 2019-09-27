package cl.duoc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;


public class TestCrear {
        @Test
    public void testCrear() {
        System.out.println("Crear");
        Empleado obj = new Empleado("121324-4", "Juan", 23, 4);
        BussEmpleado instance = new BussEmpleado();
        boolean expResult = true;
        boolean result = instance.Crear(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
