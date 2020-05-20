<<<<<<< HEAD
<<<<<<< HEAD
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
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======
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
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}