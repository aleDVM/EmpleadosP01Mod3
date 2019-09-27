package cl.duoc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;


public class testEliminar {

    public testEliminar() {
    }
    
      @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String rut = "11111111";
        BussEmpleado instance = new BussEmpleado();
        boolean obtenido = true;
        boolean esperado = instance.Eliminar(rut);
        assertEquals(obtenido, esperado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
