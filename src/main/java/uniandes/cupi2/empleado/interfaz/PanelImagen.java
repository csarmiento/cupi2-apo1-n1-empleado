/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  Universidad de los Andes (Bogotá - Colombia)
  Departamento de Ingeniería de Sistemas y Computación
  Licenciado bajo el esquema Academic Free License version 2.1

  Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
  Ejercicio: n1_empleado
  Autor: Equipo Cupi2 2017
  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package uniandes.cupi2.empleado.interfaz;

import javax.swing.*;

/**
 * Panel con la imagen del banner.
 */
@SuppressWarnings("serial")
public class PanelImagen extends JPanel {
    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del panel. <br>
     * <b>post: </b> Panel quedó inicializado.
     */
    public PanelImagen() {
        ImageIcon icono = new ImageIcon("./data/imagenes/Encabezado.png");
        JLabel imagen = new JLabel("");
        imagen.setIcon(icono);
        add(imagen);
    }

}
