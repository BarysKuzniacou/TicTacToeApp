import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JLabel;

public class TicTacToe {
	final int boardWidth = 600;
	final int boardHeight = 650;
	
	JFrame frame = new JFrame();
	JLabel  textLabel = new JLabel();
	JPanel textPanel = new JPanel();
	
	TicTacToe() {
		frame.setVisible(true);
		frame.setSize(boardWidth, boardHeight);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		textLabel.setBackground(Color.DARK_GRAY);
		textLabel.setForeground(Color.WHITE);
		textLabel.setFont(new Font("Arial", Font.BOLD, 50));
		textLabel.setHorizontalAlignment(JLabel.CENTER); // центрирует текст, а не привязывает его к левой стороне
	}

}
