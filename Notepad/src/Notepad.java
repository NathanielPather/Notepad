import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;


public class Notepad {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Untitled - Notepad");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1450, 750);
		
		// Bar
		JMenuBar menuBar = new JMenuBar();
		
		// menu
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu formatMenu = new JMenu("Format");
		JMenu viewMenu = new JMenu("View");
		JMenu helpMenu = new JMenu("Help");
		
		//add menu to bar, but not set yet.
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(formatMenu);
		menuBar.add(viewMenu);
		menuBar.add(helpMenu);
		
		// sets it
		frame.setJMenuBar(menuBar);
		
		JTextArea textArea = new JTextArea();
		frame.add(textArea);
		
		frame.setVisible(true);
	}
}
