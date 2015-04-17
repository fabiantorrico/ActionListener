import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Sum implements ActionListener {
	//]Frame:Windows frame
	private JFrame frame;
	//JPanel:Separetes section in a frame
	private JPanel panel;
	//JLabel: text
	private JLabel label2;
	private JLabel label1;
	private JLabel output;
	//JTextfield: for user input
	private JTextField textField1;
	private JTextField textField2;
	//JButton:User can click
	private JButton button;
	//JConstructor" to initialize the instance variables

	public Sum(){
		frame = new JFrame("Calculator");
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		
		label1 = new JLabel();
		label1.setText("Enter number");
		label1.setForeground(Color.BLACK);
		
		label2 = new JLabel();
		label2.setText("Enter number");
		label2.setForeground(Color.BLACK);
		
		output = new JLabel();
		output.setText("------");
		output.setForeground(Color.BLACK);
		
		
		textField1 = new JTextField(5);
		textField2 = new JTextField(5);
		
		button = new JButton("Find Sum");
		button.addActionListener(this);
		
		panel.add(label1);
		panel.add(textField1);
		panel.add(label2);
		panel.add(textField2);
		panel.add(button);
		panel.add(output);
		
		frame.add(panel);
	}
	public void actionPerformed(ActionEvent e){
		double num1 =Double.parseDouble(textField1.getText());
		double num2 =Double.parseDouble(textField1.getText());
		double sum = num1+num2;
		
		output.setText(String.valueOf(sum));
		
	}

}


