package cl.duoc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;


public class testBuscar {

    public testBuscar() {
    }
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        String rut = "55555555";
        BussEmpleado instance = new BussEmpleado();
        Empleado esperado = new Empleado("55555555", "Karin", 19, 4);
        Empleado obtenido = instance.Buscar(rut);
        assertEquals(esperado, obtenido);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
