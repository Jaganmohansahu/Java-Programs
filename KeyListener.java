import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

class Main 
{

  public static void main(String[] argv) throws Exception {

    JTextField textField = new JTextField();

    textField.addKeyListener(new Keychecker());

    JFrame jframe = new JFrame();

    jframe.add(textField);

    jframe.setSize(400, 350);

    jframe.setVisible(true);

    }
}

class Keychecker extends KeyAdapter {

    @Override
    public void keyPressed(KeyEvent event) {

    char ch = event.getKeyChar();

    System.out.println(event.getKeyChar());

    }
}