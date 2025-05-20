import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class SalutApplet extends Applet {
    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.MAGENTA);
        g.drawString("Salut de la BeautyShop!", 20, 20);
    }
}