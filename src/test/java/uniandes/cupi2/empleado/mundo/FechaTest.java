/*
  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  Universidad de los Andes (Bogotá - Colombia)
  Departamento de Ingeniería de Sistemas y Computación
  Licenciado bajo el esquema Academic Free License version 2.1
  <p>
  Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
  Ejercicio: n1_empleado
  Autor: Equipo Cupi2 2017
  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package uniandes.cupi2.empleado.mundo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Clase usada para verificar que los métodos de la clase Fecha estén correctamente implementados.
 */
public class FechaTest {

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Fecha 1 de prueba.
     */
    private Fecha fecha1;

    /**
     * Fecha 2 de prueba.
     */
    private Fecha fecha2;

    /**
     * Fecha 3 de prueba.
     */
    private Fecha fecha3;

    /**
     * Fecha 4 de prueba.
     */
    private Fecha fecha4;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Escenario 1: Construye la cuatro fechas.
     */
    private void setupEscenario1() {
        fecha1 = new Fecha(14, 11, 1982);
        fecha2 = new Fecha(15, 11, 1983);
        fecha3 = new Fecha(15, 12, 1982);
        fecha4 = new Fecha(14, 10, 1984);
    }

    /**
     * Prueba 1: Se encarga de verificar el método inicializar.<br>
     * <b> Métodos a probar: </b> <br>
     * Fecha<br>
     * inicializar<br>
     * darDia<br>
     * darMes<br>
     * darAnho<br>
     * <b> Caso de prueba: </b> <br>
     * 1. Se construye la fecha correctamente.
     */
    @Test
    public void testInicializar() {
        setupEscenario1();
        assertEquals("El día de la fecha no es el esperado.", 14, fecha1.darDia());
        assertEquals("El mes de la fecha no es el esperado.", 11, fecha1.darMes());
        assertEquals("El año de la fecha no es el esperado.", 1982, fecha1.darAnio());

        assertEquals("El día de la fecha no es el esperado.", 15, fecha2.darDia());
        assertEquals("El mes de la fecha no es el esperado.", 11, fecha2.darMes());
        assertEquals("El año de la fecha no es el esperado.", 1983, fecha2.darAnio());

        assertEquals("El mes de la fecha no es el esperado.", 12, fecha3.darMes());
        assertEquals("El año de la fecha no es el esperado.", 1982, fecha3.darAnio());
    }

    /**
     * Prueba 2: Método que se encarga de verificar el método darDiferenciaEnMeses. <br>
     * <b> Métodos a probar: </b> <br>
     * darDiferenciaEnMeses<br>
     * <b> Casos de prueba: </b> <br>
     * 1. Las dos fechas tienen 12 meses de diferencia. <br>
     * 2. Las dos fechas tienen 1 mes de diferencia. <br>
     * 3. Las dos fechas tienen 23 meses de diferencia. <br>
     */
    @Test
    public void testDarDiferenciaEnMeses() {
        setupEscenario1();

        assertEquals("La diferencia entre " + fecha1 + " y " + fecha2 + " debe ser 12 meses", 12, fecha1.darDiferenciaEnMeses(fecha2));
        assertEquals("La diferencia entre " + fecha1 + " y " + fecha3 + " debe ser 1 mes", 1, fecha1.darDiferenciaEnMeses(fecha3));
        assertEquals("La diferencia entre " + fecha1 + " y " + fecha4 + " debe ser 23 meses", 23, fecha1.darDiferenciaEnMeses(fecha4));
    }
}
