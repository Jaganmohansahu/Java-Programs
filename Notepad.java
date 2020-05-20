<<<<<<< HEAD
<<<<<<< HEAD


import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.print.attribute.*;
import java.awt.print.*;
import javax.swing.undo.*;
import javax.swing.event.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import java.util.*;
import java.text.SimpleDateFormat;

public class Notepad extends JFrame implements ActionListener, Printable
{
	JMenuBar mbr;
	JMenu file, edit, format, view, help;
	JMenuItem New, open, save, saveas, pagesetup, print, exit;
	JMenuItem undo, cut, copy, paste, delete, find, findnext, replace, g, selectall, time;
	JMenuItem wordwrap, font;
	JMenuItem statusbar, aboutnotepad, viewhelp;

	JTextArea ta1;
	String content, path = "";
	static about abt;
	static font_chooser fc;
	static find finder;

	Notepad()
	{
		setTitle("Notepad");
		setIconImage(Toolkit.getDefaultToolkit().getImage("NotepadIcon.ico"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);

		ta1 = new JTextArea(10, 10);
		ta1.setBackground(new Color(200, 200, 200));
		add(ta1);

		mbr = new JMenuBar();
		setJMenuBar(mbr);

		file = new JMenu("File");
		edit = new JMenu("Edit");
		format = new JMenu("Format");
		view = new JMenu("View");
		help = new JMenu("Help");

		New = new JMenuItem("New");
		open = new JMenuItem("Open...");
		save = new JMenuItem("Save");
		saveas = new JMenuItem("Save As...");
		pagesetup = new JMenuItem("Page Setup");
		print = new JMenuItem("Print");
		exit = new JMenuItem("EXIT");

		undo = new JMenuItem("Undo");
		cut = new JMenuItem("Cut");
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		delete = new JMenuItem("Delete");
		find = new JMenuItem("Find...");
		findnext = new JMenuItem("Find Next");
		replace = new JMenuItem("Replace...");
		g = new JMenuItem("Go To...");
		selectall = new JMenuItem("Select All");
		time = new JMenuItem("Time/Date");

		wordwrap = new JMenuItem("Word Wrap");
		font = new JMenuItem("Font");
		statusbar = new JMenuItem("Status Bar");

		viewhelp = new JMenuItem("View Help");
		aboutnotepad = new JMenuItem("About Notepad");

		file.add(New);
		file.add(open);
		file.add(save);
		file.add(saveas);
		file.addSeparator();
		file.add(pagesetup);
		file.add(print);
		file.addSeparator();
		file.add(exit);

		edit.add(undo);
		edit.addSeparator();
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(delete);
		edit.addSeparator();
		edit.add(find);
		edit.add(findnext);
		edit.add(replace);
		edit.add(g);
		edit.addSeparator();
		edit.add(selectall);
		edit.add(time);

		format.add(wordwrap);
		format.add(font);

		view.add(statusbar);

		help.add(viewhelp);
		help.addSeparator();
		help.add(aboutnotepad);

		mbr.add(file);
		mbr.add(format);
		mbr.add(view);
		mbr.add(help);

		New.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		saveas.addActionListener(this);

		pagesetup.addActionListener(this);
		print.addActionListener(this);
		exit.addActionListener(this);

		undo.addActionListener(this);
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		delete.addActionListener(this);
		find.addActionListener(this);
		findnext.addActionListener(this);
		replace.addActionListener(this);

		selectall.addActionListener(this);
		wordwrap.addActionListener(this);
		viewhelp.addActionListener(this);
		font.addActionListener(this);
		abt = new about(this);
		font_chooser fc = new font_chooser(this);
		finder = new find(this);
		finder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == New)
			file_new();
		if(e.getSource() == open)
			file_open();
		if(e.getSource() == save)
			file_save();
		if(e.getSource() == saveas)
			file_saveas();
		if(e.getSource() == pagesetup)
			page_setup();
		if(e.getSource() == print)
			file_print();
		if(e.getSource() == exit)
			file_close();

		if(e.getSource() == cut)
			edit_cut();
		if(e.getSource() == copy)
			edit_copy();
		if(e.getSource() == paste)
			edit_paste();
		if(e.getSource() == delete)
			edit_delete();
		if(e.getSource() == time)
			edit_timedate();
		if(e.getSource() == selectall)
			edit_selectall();
		if(e.getSource() == wordwrap)
			format_wordwrap();
		if(e.getSource() == viewhelp)
			help_about();
		if(e.getSource() == font)
			format_font();
		if(e.getSource() == find)
			edit_find();
		if(e.getSource() == findnext)
			edit_find_next();
	}

	public void file_new()
	{
		if(ta1.getText().equals("") || ta1.getText().equals(content))
		{
			ta1.setText("");
			content = "";

			path = "";

			setTitle("untitled - Notepad");
		}
		else
		{
			int a = JOptionPane.showConfirmDialog(null, "The text has been changed\n Do you want to save the changes?");
			if(a == 0)
				file_save();
			else if(a == 1)
			{
				ta1.setText("");
				path = "";
				setTitle("untitled - Notepad");
			}
			else if(a == 2)
				return;
		}
	}

	public void file_save()
	{
		System.out.print("Helloooooooo");
		if(path.equals(""))
		{
			file_save_as();
			return;
		}
		try
		{
			FileWriter fw = new FileWriter(path);

			fw.write(ta1.getText());
			content = ta1.getText();

			fw.close();
		}
		catch(IOException i)
		{
			JOptionPane.showMessageDialog(this, "Failed to save the file", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void file_save_as()
	{
		JFileChooser fc = new JFileChooser();

		fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int r = fc.showSaveDialog(this);
		if(r == JFileChooser.CANCEL_OPTION)
			return;
		
		File myfile = fc.getSelectedFile();
		System.out.println(myfile);

		if(myfile == null || myfile.getName().equals(""))
		{
			JOptionPane.showMessageDialog(this, "Please enter a file name!", "ERROR", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if(myfile.exists())
		{
			r = JOptionPane.showConfirmDialog(this, "A file with same name already exists!\n Are you sure want to overwrite?");
			if(r != 0)
				return;
		}
		try
		{
			FileWriter fw = new FileWriter(myfile);

			fw.write(ta1.getText());
			content = ta1.getText();
			setTitle(myfile.getName()+" - Notepad");
			fw.close();
		}
		catch(IOException i)
		{
			JOptionPane.showMessageDialog(this, "Failed to save the file", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void file_open()
	{
		JFileChooser fc = new JFileChooser();

		fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int r = fc.showOpenDialog(this);
		if(r == fc.CANCEL_OPTION)
			return;

		File myfile = fc.getSelectedFile();

		if(myfile == null || myfile.getName().equals(""))
		{
			JOptionPane.showMessageDialog(this, "Select a file!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		try
		{
			BufferedReader input = new BufferedReader(new FileReader(myfile));
			StringBuffer str = new StringBuffer();
			String line;
			while((line = input.readLine()) != null)
				str.append(line+"\n");
			ta1.setText(str.toString());
			content = ta1.getText();
			path = myfile.toString();
			setTitle(myfile.getName()+" - Notepad");
		}
		catch(FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "File not found: "+e);
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null, "IO ERROR: "+e);
		}
	}
	public void page_setup()
	{
		PrinterJob job = PrinterJob.getPrinterJob();
		PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
		PageFormat pf = job.pageDialog(aset);
		job.setPrintable(obj, pf);
		boolean ok = job.printDialog(aset);
		if(ok)
		{
			try
			{
				job.print(aset);
			}
			catch(PrinterException ex)
			{
				/* The job did not successfully complete */
			}
		}
		//System.exit(0);
	}

	public int print(Graphics g, PageFormat pf, int page)	throws PrinterException
	{
		if(page > 0)
		{
			/*We have only one page, and 'page' is zero-based*/
			return NO_SUCH_PAGE;
		}
		/* User(0, 0) is typically outside the imageable area,
		 so we must translate by X and Y values in the PageFormat to avoid clipping */
		 Graphics2D g2d = (Graphics2D)g;
		 g2d.translate(pf.getImageableX(), pf.getImageableY());

		 /* Now we perform our rendering */
		 g.drawString(ta1.getText(), 100, 100);

		 /* tell the caller that this page is part of the printed document */
		 return PAGE_EXISTS;
	}

	public void file_print()
	{
		PrinterJob printer = PrinterJob.getPrinterJob();
		//printer.setPrintable(this);
		HashPrintRequestAttributeSet printAttr = new HashPrintRequestAttributeSet();
		printer.setPrintable(obj);
		if(printer.printDialog(printAttr))
		{
			try
			{
				printer.print(printAttr);
			}
			catch(PrinterException e)
			{
				JOptionPane.showMessageDialog(this, "Failed to print the file: "+e, "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public void file_close()
	{
		if(ta1.getText().equals(content))
		{
			ta1.setText("");
			path = "";
			System.exit(0);
		}
		else if(ta1.getText().equals("") && content == null)
		{
			ta1.setText("");
			path = "";
			System.exit(0);
		}
		else
		{
			int a = JOptionPane.showConfirmDialog(null, "The text has been changed\n Do you want to save the changes?");
			if(a == 0)
				file_save();
			else if(a == 1)
			{
				ta1.setText("");
				path = "";
				setTitle("untitled - Notepad");
			}
			else if(a == 2)
				return;
		}
	}

	public void edit_cut()
	{
		ta1.cut();
	}

	public void edit_copy()
	{
		ta1.copy();
	}

	public void edit_paste()
	{
		ta1.paste();
	}

	public void edit_delete()
	{
		String temp = ta1.getText();
		ta1.setText(temp.substring(0, ta1.getSelectionStart())+temp.substring(ta1.getSelectionEnd()));
	}

	public void edit_selectall()
	{
		ta1.selectAll();
	}

	public void edit_timedate()
	{
		try
		{
			int start = ta1.getSelectionStart();
			int end = ta1.getSelectionEnd();
			Calender cal = Calender.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy h:m a");
			String now = sdf.format(cal.getTime());
			String temp1 = ta1.getText().substring(0, start);
			String temp2 = ta1.getText().substring(end);
			ta1.setText(temp1+" "+now+" "+temp2);
			ta1.select(start+1, start+1+now.length());
		}
		catch(NullPointerException e){}
	}

	public void format_wordwrap()
	{
		if(ta1.getLineWrap() == false)
			ta1.setLineWrap(true);
		else
			ta1.setLineWrap(false);
	}

	public void help_about()
	{
		abt.window.setVisible(true);
	}

	public void format_font()
	{
		fc.window.setVisible(true);
	}

	public void edit_find()
	{
		finder.setVisible(true);
	}

	public void edit_find_next()
	{
		finder.find_next();
	}

	public void edit_replace()
	{
		finder.setVisible(true);
	}

	static Notepad obj;
	public static void main(String[] args) 
	{
		obj = new Notepad();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setVisible(true);	
	}
=======


import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.print.attribute.*;
import java.awt.print.*;
import javax.swing.undo.*;
import javax.swing.event.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import java.util.*;
import java.text.SimpleDateFormat;

public class Notepad extends JFrame implements ActionListener, Printable
{
	JMenuBar mbr;
	JMenu file, edit, format, view, help;
	JMenuItem New, open, save, saveas, pagesetup, print, exit;
	JMenuItem undo, cut, copy, paste, delete, find, findnext, replace, g, selectall, time;
	JMenuItem wordwrap, font;
	JMenuItem statusbar, aboutnotepad, viewhelp;

	JTextArea ta1;
	String content, path = "";
	static about abt;
	static font_chooser fc;
	static find finder;

	Notepad()
	{
		setTitle("Notepad");
		setIconImage(Toolkit.getDefaultToolkit().getImage("NotepadIcon.ico"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);

		ta1 = new JTextArea(10, 10);
		ta1.setBackground(new Color(200, 200, 200));
		add(ta1);

		mbr = new JMenuBar();
		setJMenuBar(mbr);

		file = new JMenu("File");
		edit = new JMenu("Edit");
		format = new JMenu("Format");
		view = new JMenu("View");
		help = new JMenu("Help");

		New = new JMenuItem("New");
		open = new JMenuItem("Open...");
		save = new JMenuItem("Save");
		saveas = new JMenuItem("Save As...");
		pagesetup = new JMenuItem("Page Setup");
		print = new JMenuItem("Print");
		exit = new JMenuItem("EXIT");

		undo = new JMenuItem("Undo");
		cut = new JMenuItem("Cut");
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		delete = new JMenuItem("Delete");
		find = new JMenuItem("Find...");
		findnext = new JMenuItem("Find Next");
		replace = new JMenuItem("Replace...");
		g = new JMenuItem("Go To...");
		selectall = new JMenuItem("Select All");
		time = new JMenuItem("Time/Date");

		wordwrap = new JMenuItem("Word Wrap");
		font = new JMenuItem("Font");
		statusbar = new JMenuItem("Status Bar");

		viewhelp = new JMenuItem("View Help");
		aboutnotepad = new JMenuItem("About Notepad");

		file.add(New);
		file.add(open);
		file.add(save);
		file.add(saveas);
		file.addSeparator();
		file.add(pagesetup);
		file.add(print);
		file.addSeparator();
		file.add(exit);

		edit.add(undo);
		edit.addSeparator();
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(delete);
		edit.addSeparator();
		edit.add(find);
		edit.add(findnext);
		edit.add(replace);
		edit.add(g);
		edit.addSeparator();
		edit.add(selectall);
		edit.add(time);

		format.add(wordwrap);
		format.add(font);

		view.add(statusbar);

		help.add(viewhelp);
		help.addSeparator();
		help.add(aboutnotepad);

		mbr.add(file);
		mbr.add(format);
		mbr.add(view);
		mbr.add(help);

		New.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		saveas.addActionListener(this);

		pagesetup.addActionListener(this);
		print.addActionListener(this);
		exit.addActionListener(this);

		undo.addActionListener(this);
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		delete.addActionListener(this);
		find.addActionListener(this);
		findnext.addActionListener(this);
		replace.addActionListener(this);

		selectall.addActionListener(this);
		wordwrap.addActionListener(this);
		viewhelp.addActionListener(this);
		font.addActionListener(this);
		abt = new about(this);
		font_chooser fc = new font_chooser(this);
		finder = new find(this);
		finder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == New)
			file_new();
		if(e.getSource() == open)
			file_open();
		if(e.getSource() == save)
			file_save();
		if(e.getSource() == saveas)
			file_saveas();
		if(e.getSource() == pagesetup)
			page_setup();
		if(e.getSource() == print)
			file_print();
		if(e.getSource() == exit)
			file_close();

		if(e.getSource() == cut)
			edit_cut();
		if(e.getSource() == copy)
			edit_copy();
		if(e.getSource() == paste)
			edit_paste();
		if(e.getSource() == delete)
			edit_delete();
		if(e.getSource() == time)
			edit_timedate();
		if(e.getSource() == selectall)
			edit_selectall();
		if(e.getSource() == wordwrap)
			format_wordwrap();
		if(e.getSource() == viewhelp)
			help_about();
		if(e.getSource() == font)
			format_font();
		if(e.getSource() == find)
			edit_find();
		if(e.getSource() == findnext)
			edit_find_next();
	}

	public void file_new()
	{
		if(ta1.getText().equals("") || ta1.getText().equals(content))
		{
			ta1.setText("");
			content = "";

			path = "";

			setTitle("untitled - Notepad");
		}
		else
		{
			int a = JOptionPane.showConfirmDialog(null, "The text has been changed\n Do you want to save the changes?");
			if(a == 0)
				file_save();
			else if(a == 1)
			{
				ta1.setText("");
				path = "";
				setTitle("untitled - Notepad");
			}
			else if(a == 2)
				return;
		}
	}

	public void file_save()
	{
		System.out.print("Helloooooooo");
		if(path.equals(""))
		{
			file_save_as();
			return;
		}
		try
		{
			FileWriter fw = new FileWriter(path);

			fw.write(ta1.getText());
			content = ta1.getText();

			fw.close();
		}
		catch(IOException i)
		{
			JOptionPane.showMessageDialog(this, "Failed to save the file", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void file_save_as()
	{
		JFileChooser fc = new JFileChooser();

		fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int r = fc.showSaveDialog(this);
		if(r == JFileChooser.CANCEL_OPTION)
			return;
		
		File myfile = fc.getSelectedFile();
		System.out.println(myfile);

		if(myfile == null || myfile.getName().equals(""))
		{
			JOptionPane.showMessageDialog(this, "Please enter a file name!", "ERROR", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if(myfile.exists())
		{
			r = JOptionPane.showConfirmDialog(this, "A file with same name already exists!\n Are you sure want to overwrite?");
			if(r != 0)
				return;
		}
		try
		{
			FileWriter fw = new FileWriter(myfile);

			fw.write(ta1.getText());
			content = ta1.getText();
			setTitle(myfile.getName()+" - Notepad");
			fw.close();
		}
		catch(IOException i)
		{
			JOptionPane.showMessageDialog(this, "Failed to save the file", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void file_open()
	{
		JFileChooser fc = new JFileChooser();

		fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int r = fc.showOpenDialog(this);
		if(r == fc.CANCEL_OPTION)
			return;

		File myfile = fc.getSelectedFile();

		if(myfile == null || myfile.getName().equals(""))
		{
			JOptionPane.showMessageDialog(this, "Select a file!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		try
		{
			BufferedReader input = new BufferedReader(new FileReader(myfile));
			StringBuffer str = new StringBuffer();
			String line;
			while((line = input.readLine()) != null)
				str.append(line+"\n");
			ta1.setText(str.toString());
			content = ta1.getText();
			path = myfile.toString();
			setTitle(myfile.getName()+" - Notepad");
		}
		catch(FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "File not found: "+e);
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null, "IO ERROR: "+e);
		}
	}
	public void page_setup()
	{
		PrinterJob job = PrinterJob.getPrinterJob();
		PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
		PageFormat pf = job.pageDialog(aset);
		job.setPrintable(obj, pf);
		boolean ok = job.printDialog(aset);
		if(ok)
		{
			try
			{
				job.print(aset);
			}
			catch(PrinterException ex)
			{
				/* The job did not successfully complete */
			}
		}
		//System.exit(0);
	}

	public int print(Graphics g, PageFormat pf, int page)	throws PrinterException
	{
		if(page > 0)
		{
			/*We have only one page, and 'page' is zero-based*/
			return NO_SUCH_PAGE;
		}
		/* User(0, 0) is typically outside the imageable area,
		 so we must translate by X and Y values in the PageFormat to avoid clipping */
		 Graphics2D g2d = (Graphics2D)g;
		 g2d.translate(pf.getImageableX(), pf.getImageableY());

		 /* Now we perform our rendering */
		 g.drawString(ta1.getText(), 100, 100);

		 /* tell the caller that this page is part of the printed document */
		 return PAGE_EXISTS;
	}

	public void file_print()
	{
		PrinterJob printer = PrinterJob.getPrinterJob();
		//printer.setPrintable(this);
		HashPrintRequestAttributeSet printAttr = new HashPrintRequestAttributeSet();
		printer.setPrintable(obj);
		if(printer.printDialog(printAttr))
		{
			try
			{
				printer.print(printAttr);
			}
			catch(PrinterException e)
			{
				JOptionPane.showMessageDialog(this, "Failed to print the file: "+e, "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public void file_close()
	{
		if(ta1.getText().equals(content))
		{
			ta1.setText("");
			path = "";
			System.exit(0);
		}
		else if(ta1.getText().equals("") && content == null)
		{
			ta1.setText("");
			path = "";
			System.exit(0);
		}
		else
		{
			int a = JOptionPane.showConfirmDialog(null, "The text has been changed\n Do you want to save the changes?");
			if(a == 0)
				file_save();
			else if(a == 1)
			{
				ta1.setText("");
				path = "";
				setTitle("untitled - Notepad");
			}
			else if(a == 2)
				return;
		}
	}

	public void edit_cut()
	{
		ta1.cut();
	}

	public void edit_copy()
	{
		ta1.copy();
	}

	public void edit_paste()
	{
		ta1.paste();
	}

	public void edit_delete()
	{
		String temp = ta1.getText();
		ta1.setText(temp.substring(0, ta1.getSelectionStart())+temp.substring(ta1.getSelectionEnd()));
	}

	public void edit_selectall()
	{
		ta1.selectAll();
	}

	public void edit_timedate()
	{
		try
		{
			int start = ta1.getSelectionStart();
			int end = ta1.getSelectionEnd();
			Calender cal = Calender.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy h:m a");
			String now = sdf.format(cal.getTime());
			String temp1 = ta1.getText().substring(0, start);
			String temp2 = ta1.getText().substring(end);
			ta1.setText(temp1+" "+now+" "+temp2);
			ta1.select(start+1, start+1+now.length());
		}
		catch(NullPointerException e){}
	}

	public void format_wordwrap()
	{
		if(ta1.getLineWrap() == false)
			ta1.setLineWrap(true);
		else
			ta1.setLineWrap(false);
	}

	public void help_about()
	{
		abt.window.setVisible(true);
	}

	public void format_font()
	{
		fc.window.setVisible(true);
	}

	public void edit_find()
	{
		finder.setVisible(true);
	}

	public void edit_find_next()
	{
		finder.find_next();
	}

	public void edit_replace()
	{
		finder.setVisible(true);
	}

	static Notepad obj;
	public static void main(String[] args) 
	{
		obj = new Notepad();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
=======


import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.print.attribute.*;
import java.awt.print.*;
import javax.swing.undo.*;
import javax.swing.event.*;
import javax.print.attribute.HashPrintRequestAttributeSet;
import java.util.*;
import java.text.SimpleDateFormat;

public class Notepad extends JFrame implements ActionListener, Printable
{
	JMenuBar mbr;
	JMenu file, edit, format, view, help;
	JMenuItem New, open, save, saveas, pagesetup, print, exit;
	JMenuItem undo, cut, copy, paste, delete, find, findnext, replace, g, selectall, time;
	JMenuItem wordwrap, font;
	JMenuItem statusbar, aboutnotepad, viewhelp;

	JTextArea ta1;
	String content, path = "";
	static about abt;
	static font_chooser fc;
	static find finder;

	Notepad()
	{
		setTitle("Notepad");
		setIconImage(Toolkit.getDefaultToolkit().getImage("NotepadIcon.ico"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setVisible(true);

		ta1 = new JTextArea(10, 10);
		ta1.setBackground(new Color(200, 200, 200));
		add(ta1);

		mbr = new JMenuBar();
		setJMenuBar(mbr);

		file = new JMenu("File");
		edit = new JMenu("Edit");
		format = new JMenu("Format");
		view = new JMenu("View");
		help = new JMenu("Help");

		New = new JMenuItem("New");
		open = new JMenuItem("Open...");
		save = new JMenuItem("Save");
		saveas = new JMenuItem("Save As...");
		pagesetup = new JMenuItem("Page Setup");
		print = new JMenuItem("Print");
		exit = new JMenuItem("EXIT");

		undo = new JMenuItem("Undo");
		cut = new JMenuItem("Cut");
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		delete = new JMenuItem("Delete");
		find = new JMenuItem("Find...");
		findnext = new JMenuItem("Find Next");
		replace = new JMenuItem("Replace...");
		g = new JMenuItem("Go To...");
		selectall = new JMenuItem("Select All");
		time = new JMenuItem("Time/Date");

		wordwrap = new JMenuItem("Word Wrap");
		font = new JMenuItem("Font");
		statusbar = new JMenuItem("Status Bar");

		viewhelp = new JMenuItem("View Help");
		aboutnotepad = new JMenuItem("About Notepad");

		file.add(New);
		file.add(open);
		file.add(save);
		file.add(saveas);
		file.addSeparator();
		file.add(pagesetup);
		file.add(print);
		file.addSeparator();
		file.add(exit);

		edit.add(undo);
		edit.addSeparator();
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(delete);
		edit.addSeparator();
		edit.add(find);
		edit.add(findnext);
		edit.add(replace);
		edit.add(g);
		edit.addSeparator();
		edit.add(selectall);
		edit.add(time);

		format.add(wordwrap);
		format.add(font);

		view.add(statusbar);

		help.add(viewhelp);
		help.addSeparator();
		help.add(aboutnotepad);

		mbr.add(file);
		mbr.add(format);
		mbr.add(view);
		mbr.add(help);

		New.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		saveas.addActionListener(this);

		pagesetup.addActionListener(this);
		print.addActionListener(this);
		exit.addActionListener(this);

		undo.addActionListener(this);
		cut.addActionListener(this);
		copy.addActionListener(this);
		paste.addActionListener(this);
		delete.addActionListener(this);
		find.addActionListener(this);
		findnext.addActionListener(this);
		replace.addActionListener(this);

		selectall.addActionListener(this);
		wordwrap.addActionListener(this);
		viewhelp.addActionListener(this);
		font.addActionListener(this);
		abt = new about(this);
		font_chooser fc = new font_chooser(this);
		finder = new find(this);
		finder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == New)
			file_new();
		if(e.getSource() == open)
			file_open();
		if(e.getSource() == save)
			file_save();
		if(e.getSource() == saveas)
			file_saveas();
		if(e.getSource() == pagesetup)
			page_setup();
		if(e.getSource() == print)
			file_print();
		if(e.getSource() == exit)
			file_close();

		if(e.getSource() == cut)
			edit_cut();
		if(e.getSource() == copy)
			edit_copy();
		if(e.getSource() == paste)
			edit_paste();
		if(e.getSource() == delete)
			edit_delete();
		if(e.getSource() == time)
			edit_timedate();
		if(e.getSource() == selectall)
			edit_selectall();
		if(e.getSource() == wordwrap)
			format_wordwrap();
		if(e.getSource() == viewhelp)
			help_about();
		if(e.getSource() == font)
			format_font();
		if(e.getSource() == find)
			edit_find();
		if(e.getSource() == findnext)
			edit_find_next();
	}

	public void file_new()
	{
		if(ta1.getText().equals("") || ta1.getText().equals(content))
		{
			ta1.setText("");
			content = "";

			path = "";

			setTitle("untitled - Notepad");
		}
		else
		{
			int a = JOptionPane.showConfirmDialog(null, "The text has been changed\n Do you want to save the changes?");
			if(a == 0)
				file_save();
			else if(a == 1)
			{
				ta1.setText("");
				path = "";
				setTitle("untitled - Notepad");
			}
			else if(a == 2)
				return;
		}
	}

	public void file_save()
	{
		System.out.print("Helloooooooo");
		if(path.equals(""))
		{
			file_save_as();
			return;
		}
		try
		{
			FileWriter fw = new FileWriter(path);

			fw.write(ta1.getText());
			content = ta1.getText();

			fw.close();
		}
		catch(IOException i)
		{
			JOptionPane.showMessageDialog(this, "Failed to save the file", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void file_save_as()
	{
		JFileChooser fc = new JFileChooser();

		fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int r = fc.showSaveDialog(this);
		if(r == JFileChooser.CANCEL_OPTION)
			return;
		
		File myfile = fc.getSelectedFile();
		System.out.println(myfile);

		if(myfile == null || myfile.getName().equals(""))
		{
			JOptionPane.showMessageDialog(this, "Please enter a file name!", "ERROR", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if(myfile.exists())
		{
			r = JOptionPane.showConfirmDialog(this, "A file with same name already exists!\n Are you sure want to overwrite?");
			if(r != 0)
				return;
		}
		try
		{
			FileWriter fw = new FileWriter(myfile);

			fw.write(ta1.getText());
			content = ta1.getText();
			setTitle(myfile.getName()+" - Notepad");
			fw.close();
		}
		catch(IOException i)
		{
			JOptionPane.showMessageDialog(this, "Failed to save the file", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void file_open()
	{
		JFileChooser fc = new JFileChooser();

		fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int r = fc.showOpenDialog(this);
		if(r == fc.CANCEL_OPTION)
			return;

		File myfile = fc.getSelectedFile();

		if(myfile == null || myfile.getName().equals(""))
		{
			JOptionPane.showMessageDialog(this, "Select a file!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		try
		{
			BufferedReader input = new BufferedReader(new FileReader(myfile));
			StringBuffer str = new StringBuffer();
			String line;
			while((line = input.readLine()) != null)
				str.append(line+"\n");
			ta1.setText(str.toString());
			content = ta1.getText();
			path = myfile.toString();
			setTitle(myfile.getName()+" - Notepad");
		}
		catch(FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "File not found: "+e);
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null, "IO ERROR: "+e);
		}
	}
	public void page_setup()
	{
		PrinterJob job = PrinterJob.getPrinterJob();
		PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
		PageFormat pf = job.pageDialog(aset);
		job.setPrintable(obj, pf);
		boolean ok = job.printDialog(aset);
		if(ok)
		{
			try
			{
				job.print(aset);
			}
			catch(PrinterException ex)
			{
				/* The job did not successfully complete */
			}
		}
		//System.exit(0);
	}

	public int print(Graphics g, PageFormat pf, int page)	throws PrinterException
	{
		if(page > 0)
		{
			/*We have only one page, and 'page' is zero-based*/
			return NO_SUCH_PAGE;
		}
		/* User(0, 0) is typically outside the imageable area,
		 so we must translate by X and Y values in the PageFormat to avoid clipping */
		 Graphics2D g2d = (Graphics2D)g;
		 g2d.translate(pf.getImageableX(), pf.getImageableY());

		 /* Now we perform our rendering */
		 g.drawString(ta1.getText(), 100, 100);

		 /* tell the caller that this page is part of the printed document */
		 return PAGE_EXISTS;
	}

	public void file_print()
	{
		PrinterJob printer = PrinterJob.getPrinterJob();
		//printer.setPrintable(this);
		HashPrintRequestAttributeSet printAttr = new HashPrintRequestAttributeSet();
		printer.setPrintable(obj);
		if(printer.printDialog(printAttr))
		{
			try
			{
				printer.print(printAttr);
			}
			catch(PrinterException e)
			{
				JOptionPane.showMessageDialog(this, "Failed to print the file: "+e, "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public void file_close()
	{
		if(ta1.getText().equals(content))
		{
			ta1.setText("");
			path = "";
			System.exit(0);
		}
		else if(ta1.getText().equals("") && content == null)
		{
			ta1.setText("");
			path = "";
			System.exit(0);
		}
		else
		{
			int a = JOptionPane.showConfirmDialog(null, "The text has been changed\n Do you want to save the changes?");
			if(a == 0)
				file_save();
			else if(a == 1)
			{
				ta1.setText("");
				path = "";
				setTitle("untitled - Notepad");
			}
			else if(a == 2)
				return;
		}
	}

	public void edit_cut()
	{
		ta1.cut();
	}

	public void edit_copy()
	{
		ta1.copy();
	}

	public void edit_paste()
	{
		ta1.paste();
	}

	public void edit_delete()
	{
		String temp = ta1.getText();
		ta1.setText(temp.substring(0, ta1.getSelectionStart())+temp.substring(ta1.getSelectionEnd()));
	}

	public void edit_selectall()
	{
		ta1.selectAll();
	}

	public void edit_timedate()
	{
		try
		{
			int start = ta1.getSelectionStart();
			int end = ta1.getSelectionEnd();
			Calender cal = Calender.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy h:m a");
			String now = sdf.format(cal.getTime());
			String temp1 = ta1.getText().substring(0, start);
			String temp2 = ta1.getText().substring(end);
			ta1.setText(temp1+" "+now+" "+temp2);
			ta1.select(start+1, start+1+now.length());
		}
		catch(NullPointerException e){}
	}

	public void format_wordwrap()
	{
		if(ta1.getLineWrap() == false)
			ta1.setLineWrap(true);
		else
			ta1.setLineWrap(false);
	}

	public void help_about()
	{
		abt.window.setVisible(true);
	}

	public void format_font()
	{
		fc.window.setVisible(true);
	}

	public void edit_find()
	{
		finder.setVisible(true);
	}

	public void edit_find_next()
	{
		finder.find_next();
	}

	public void edit_replace()
	{
		finder.setVisible(true);
	}

	static Notepad obj;
	public static void main(String[] args) 
	{
		obj = new Notepad();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setVisible(true);	
	}
>>>>>>> db80c5c9e978e8d9089e4f7e7e0501a2ee2f811a
}