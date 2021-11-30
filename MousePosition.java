import java.awt.MouseInfo;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
class MousePosition 
{
    public static void main(String[] args) throws InterruptedException {
        int x = MouseInfo.getPointerInfo().getLocation().x;
        int y = MouseInfo.getPointerInfo().getLocation().y;
        while (true) {

            if (x != MouseInfo.getPointerInfo().getLocation().x || y != MouseInfo.getPointerInfo().getLocation().y) {
                System.out.println("(" + MouseInfo.getPointerInfo().getLocation().x + ", "
                        + MouseInfo.getPointerInfo().getLocation().y + ")");
                x = MouseInfo.getPointerInfo().getLocation().x;
                y = MouseInfo.getPointerInfo().getLocation().y;
            }
        }
    }
}