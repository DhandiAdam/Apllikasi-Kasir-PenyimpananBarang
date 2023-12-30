/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projekdhandiadam;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author ACER
 */
public abstract class Around extends JPanel {
    
      public abstract int getRoundTopLeft();

    public abstract void setRoundTopLeft(int roundTopLeft);

    public abstract int getRoundTopRight();

    public abstract void setRoundTopRight(int roundTopRight);

    public abstract int getRoundBottomLeft();

    public abstract void setRoundBottomLeft(int roundBottomLeft);

    public abstract int getRoundBottomRight();

    public abstract void setRoundBottomRight(int roundBottomRight);

   
}
