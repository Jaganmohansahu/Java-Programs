//an applet to play sound files
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Audio extends Applet implements ActionListener
{
	Label lbl;
	TextField tf;
	Button b1, b2;
	AudioClip clip;

	public void init()
	{
		lbl = new Label("Enter .au or .wav filename: ", Label.RIGHT);

		tf = new TextField(15);

		b1 = new Button("Play");
		b2 = new Button("Stop");

		add(lbl);
		add(tf);
		add(b1);
		add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		String str = tf.getText();

		str = str.trim();

		clip = getAudioClip(getDocumentBase(), str);

		Button b = (Button)ae.getSource();

		if(b == b1)
			clip.play();
		else clip.stop();
	}
}