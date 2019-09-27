package cl.duoc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestListar {

    public TestListar() {
    }
    
    @Test
    public void testListar() {
        System.out.println("Listar");
        BussEmpleado instance = new BussEmpleado();
        List<Empleado> esperado = ArrayList<Empleado>("11111111", "Joaquina", 36, 3);
        List<Empleado> obtenido = instance.Listar();
        assertEquals(esperado, obtenido);
    }
}
