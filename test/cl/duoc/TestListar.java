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
        List<Empleado> esperado = new ArrayList<>();
        esperado.add(new Empleado("11111111", "Joaquina", 36, 3));
        esperado.add(new Empleado("22222222", "Jimena", 25, 5));
        esperado.add(new Empleado("33333333", "Soledad", 41, 6));
        esperado.add(new Empleado("44444444", "Roberto", 25, 8));
        esperado.add(new Empleado("55555555", "Karin", 19, 4));
        esperado.add(new Empleado("66666666", "Lorena", 37, 9));
        esperado.add(new Empleado("77777777", "Thomas", 28, 5));
        esperado.add(new Empleado("88888888", "Nelson", 45, 10));
        esperado.add(new Empleado("99999999", "Soraya", 52, 9));
        List<Empleado> obtenido = instance.Listar();
        assertEquals(esperado, obtenido);
    }
}
