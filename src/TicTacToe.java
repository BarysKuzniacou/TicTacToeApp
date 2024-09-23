import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JLabel;

public class TicTacToe {
	final int boardWidth = 600;
	final int boardHeight = 650;
	
	JFrame frame = new JFrame("Tic-Tac-Toe Game");
	JLabel  textLabel = new JLabel();
	JPanel textPanel = new JPanel();
	JPanel boardPanel = new JPanel();
	
	JButton[][] board = new JButton[3][3];
	
	String playerX = "X";
	String playerO = "O";
	String currentPlayer = playerX;
	
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
		textLabel.setHorizontalAlignment(JLabel.CENTER); 
		// центрирует текст, а не привязывает его к левой стороне
		textLabel.setText("Tic-Tac-Toe");
		textLabel.setOpaque(true); 
		/*Кроме цвета шрифта можно задать цвет фона JLabel. Делается это с 
		 * помощью метода setBackground. Интересный момент. По умолчанию, 
		 * даже если цвет фона установлен, фон у JLabel не отображается. 
		 * Для того, чтобы JLabel стал показывать фон необходимо вызвать метод 
		 * setOpaque и передать туда true.*/
		
		textPanel.setLayout(new BorderLayout());
		textPanel.add(textLabel);
		frame.add(textPanel, BorderLayout.NORTH);
		
		boardPanel.setLayout(new GridLayout(3, 3));
		boardPanel.setBackground(Color.darkGray);
		frame.add(boardPanel);
		
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				JButton tile = new JButton();
				board[row][col] = tile;
				boardPanel.add(tile);
				
				tile.setBackground(Color.darkGray);
				tile.setForeground(Color.WHITE);
				tile.setFont(new Font("Arial", Font.BOLD, 120));
				tile.setFocusable(false);
				
				tile.addActionListener(new ActionListener() {
					public void actionPerformed (ActionEvent e) {
						JButton tile = (JButton) e.getSource();
						tile.setText(currentPlayer);
					}
				}); 
				
			}
		}
	}

}
