import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
		
		// menu mnemonic keys
		fileMenu.setMnemonic(KeyEvent.VK_F);
		editMenu.setMnemonic(KeyEvent.VK_E);
		formatMenu.setMnemonic(KeyEvent.VK_O);
		viewMenu.setMnemonic(KeyEvent.VK_V);
		helpMenu.setMnemonic(KeyEvent.VK_H);
		
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
		JMenuItem deleteMenuItem = new JMenuItem("Delete");
		JMenuItem findMenuItem = new JMenuItem("Find...");
		JMenuItem findNextMenuItem = new JMenuItem("Find Next");
		JMenuItem replaceMenuItem = new JMenuItem("Replace...");
		JMenuItem goToMenuItem = new JMenuItem("Go To...");
		JMenuItem selectAllMenuItem = new JMenuItem("Select All");
		JMenuItem timeDateMenuItem = new JMenuItem("Time/Date");
		
		JMenuItem wordWrapMenuItem = new JMenuItem("Word Wrap");
		JMenuItem fontMenuItem = new JMenuItem("Font...");
		
		JMenuItem statusBarMenuItem = new JMenuItem("Status Bar");
		
		JMenuItem viewHelpMenuItem = new JMenuItem("View Help");
		JMenuItem aboutNotepadMenuItem = new JMenuItem("About Notepad");
		
		// sub menu accelerators keys
		newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
		openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
		saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
		printMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_DOWN_MASK));
		
		undoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
		cutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK));
		copyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
		pasteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_DOWN_MASK));
		deleteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
		findMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.CTRL_DOWN_MASK));
		findNextMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
		replaceMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, KeyEvent.CTRL_DOWN_MASK));
		goToMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, KeyEvent.CTRL_DOWN_MASK));
		selectAllMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));
		timeDateMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
		
		// sub menu mnemonic keys
		newMenuItem.setMnemonic(KeyEvent.VK_N);
		openMenuItem.setMnemonic(KeyEvent.VK_O);
		saveMenuItem.setMnemonic(KeyEvent.VK_S);
		saveAsMenuItem.setMnemonic(KeyEvent.VK_A);
		saveAsMenuItem.setDisplayedMnemonicIndex(5);
		pageSetupMenuItem.setMnemonic(KeyEvent.VK_U);
		printMenuItem.setMnemonic(KeyEvent.VK_P);
		exitMenuItem.setMnemonic(KeyEvent.VK_X);
		
		undoMenuItem.setMnemonic(KeyEvent.VK_U);
		cutMenuItem.setMnemonic(KeyEvent.VK_T);
		copyMenuItem.setMnemonic(KeyEvent.VK_C);
		pasteMenuItem.setMnemonic(KeyEvent.VK_P);
		deleteMenuItem.setMnemonic(KeyEvent.VK_L);
		findMenuItem.setMnemonic(KeyEvent.VK_F);
		findNextMenuItem.setMnemonic(KeyEvent.VK_N);
		findNextMenuItem.setDisplayedMnemonicIndex(5);
		replaceMenuItem.setMnemonic(KeyEvent.VK_R);
		goToMenuItem.setMnemonic(KeyEvent.VK_G);
		selectAllMenuItem.setMnemonic(KeyEvent.VK_A);
		timeDateMenuItem.setMnemonic(KeyEvent.VK_D);
		
		wordWrapMenuItem.setMnemonic(KeyEvent.VK_W);
		fontMenuItem.setMnemonic(KeyEvent.VK_F);
		
		statusBarMenuItem.setMnemonic(KeyEvent.VK_S);
		
		viewHelpMenuItem.setMnemonic(KeyEvent.VK_H);
		aboutNotepadMenuItem.setMnemonic(KeyEvent.VK_A);
		
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
		editMenu.add(deleteMenuItem);
		editMenu.addSeparator();
		editMenu.add(findMenuItem);
		editMenu.add(findNextMenuItem);
		editMenu.add(replaceMenuItem);
		editMenu.add(goToMenuItem);
		editMenu.addSeparator();
		editMenu.add(selectAllMenuItem);
		editMenu.add(timeDateMenuItem);
		
		formatMenu.add(wordWrapMenuItem);
		formatMenu.add(fontMenuItem);
		
		viewMenu.add(statusBarMenuItem);
		
		helpMenu.add(viewHelpMenuItem);
		helpMenu.addSeparator();
		helpMenu.add(aboutNotepadMenuItem);
		
		// sets it
		frame.setJMenuBar(menuBar);
		
		JTextArea textArea = new JTextArea();
		frame.add(textArea);
		
		// actions
		saveAsMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				FileWriter fw;
				try {
					fw = new FileWriter(new File("C:/Users/Lexhanatin/Desktop/wombat.txt"));
					fw.write(textArea.getText());
					System.out.print(textArea.getText());
					fw.close();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				// finalChooser
				final JFileChooser fc = new JFileChooser();
				fc.showSaveDialog(frame);
			}
		});
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		frame.setResizable(true);
		frame.add(scrollPane, BorderLayout.CENTER);
		
		frame.setVisible(true);
	}
}
