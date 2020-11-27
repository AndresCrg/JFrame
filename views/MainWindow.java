package views;

import javax.swing.JFrame;

public class MainWindow extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public MainWindow() {
		setTitle("Hola Mundo");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainWindow();
	}
}