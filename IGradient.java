
package projekdhandiadam;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public interface IGradient {
      Color getColorStart();

    void setColorStart(Color colorStart);

    Color getColorEnd();

    void setColorEnd(Color colorEnd);
}
