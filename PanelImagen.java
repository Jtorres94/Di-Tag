package imagen;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 * Clase para crear un JPanel con una imagen distintiva de nuestro programa
 */
public class PanelImagen extends JPanel{
    @Override
    /**
     * metodo que selecciona y establece una imagen predeterminada para el programa
     */
    public void paintComponent(Graphics g){
         Dimension tam=getSize();
         ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource("/imagen/Ditag.jpg")).getImage());
         g.drawImage(imagen.getImage(), 0, 0, tam.width, tam.height, null);
    }
}
