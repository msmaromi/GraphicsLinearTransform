/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics.linear.transform;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author msmaromi
 */
public class GraphicsLinearTransform {
 
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws IOException {
    // TODO code application logic here
    String fileName = "file/romi.png";
    BufferedImage img;
    img = ImageIO.read(new File(fileName));
    
    int pixelHeight = img.getHeight();
    int pixelWidth = img.getWidth();
    
    int rgb = img.getRGB(pixelWidth-1, pixelHeight-1);
    int alpha = (rgb >> 24) & 0xFF;
    int red =   (rgb >> 16) & 0xFF;
    int green = (rgb >>  8) & 0xFF;
    int blue =  (rgb      ) & 0xFF;
    System.out.println(alpha);
    System.out.println(red);
    System.out.println(green);
    System.out.println(blue);    
  }
}
