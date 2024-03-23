package Datos;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ScreenShot {

    
    public static void takephoto() {
        // obtenemos el tamaño del rectangulo
        Rectangle rectangleTam = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        try {
            Robot robot = new Robot();
            // tomamos una captura de pantalla( screenshot )
            BufferedImage bufferedImage = robot.createScreenCapture(rectangleTam);

            String nombreFichero=System.getProperty("user.home")+File.separatorChar+"nuevafoto.jpg";
            System.out.println("Generando el fichero: "+nombreFichero );
            FileOutputStream out = new FileOutputStream(nombreFichero);

            // esbribe la imagen a fichero
            ImageIO.write(bufferedImage, "jpg", out);

        } catch (AWTException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
