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
		
		//menu items
		JMenuItem newMenuItem = new JMenuItem("New");
		JMenuItem openMenuItem = new JMenuItem("Open...");
		JMenuItem saveMenuItem = new JMenuItem("Save");
		JMenuItem saveAsMenuItem = new JMenuItem("Save As...");
		JMenuItem pageSetupMenuItem = new JMenuItem("Page Setup...");
		JMenuItem printMenuItem = new JMenuItem("Print...");
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		
		JMenuItem undoMenuItem = new JMenuItem("Undo");
		JMenuItem cutMenuItem = new JMenuItem("Cut");
		JMenuItem copyMenuItem = new JMenuItem("Copy");
		JMenuItem pasteMenuItem = new JMenuItem("Paste");
		JMenuItem deleteSetupMenuItem = new JMenuItem("Delete");
		JMenuItem findMenuItem = new JMenuItem("Find...");
		JMenuItem findNextMenuItem = new JMenuItem("Find Next");
		JMenuItem replaceMenuItem = new JMenuItem("Replace...");
		JMenuItem goToMenuItem = new JMenuItem("Go To...");
		JMenuItem selectAllMenuItem = new JMenuItem("Select All");
		JMenuItem timeDateAsMenuItem = new JMenuItem("Time/Date");
		
		JMenuItem wordWrapMenuItem = new JMenuItem("Word Wrap");
		JMenuItem fontMenuItem = new JMenuItem("Font...");
		
		JMenuItem statusBarMenuItem = new JMenuItem("Status Bar");
		
		JMenuItem viewHelpWrapMenuItem = new JMenuItem("View Help");
		JMenuItem aboutNotepadMenuItem = new JMenuItem("About Notepad");
		
		//add items to menus
		fileMenu.add(newMenuItem);
		fileMenu.add(openMenuItem);
		fileMenu.add(saveMenuItem);
		fileMenu.add(saveAsMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(pageSetupMenuItem);
		fileMenu.add(printMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);
		
		editMenu.add(undoMenuItem);
		editMenu.addSeparator();
		editMenu.add(cutMenuItem);
		editMenu.add(copyMenuItem);
		editMenu.add(pasteMenuItem);
		editMenu.add(deleteSetupMenuItem);
		editMenu.addSeparator();
		editMenu.add(findMenuItem);
		editMenu.add(findNextMenuItem);
		editMenu.add(replaceMenuItem);
		editMenu.add(goToMenuItem);
		editMenu.addSeparator();
		editMenu.add(selectAllMenuItem);
		editMenu.add(timeDateAsMenuItem);
		
		formatMenu.add(wordWrapMenuItem);
		formatMenu.add(fontMenuItem);
		
		viewMenu.add(statusBarMenuItem);
		
		helpMenu.add(viewHelpWrapMenuItem);
		helpMenu.addSeparator();
		helpMenu.add(aboutNotepadMenuItem);
		
		// sets it
		frame.setJMenuBar(menuBar);
		
		JTextArea textArea = new JTextArea();
		frame.add(textArea);
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		frame.add(scrollPane, BorderLayout.CENTER);
		
		
		frame.setVisible(true);
	}
}
