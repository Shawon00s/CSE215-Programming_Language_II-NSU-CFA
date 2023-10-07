package GUI;

import java.awt.GridLayout;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


class BasicGUIFrameV4 extends JFrame{
	
	JLabel inp1Label,inp2Label,resultLabel;
	JTextField inp1TxtFld,inp2TxtFld,resultTxtFld;
	JButton addBtn, subBtn;
	JPanel panel;
	DecimalFormat df;
	double num1,num2;
	
	BasicGUIFrameV4(){
		inp1Label = new JLabel("Input1 ");
		inp2Label = new JLabel("Input2 ");
		resultLabel = new JLabel("Result ");
		
		inp1TxtFld = new JTextField(20);
		inp2TxtFld = new JTextField(20);
		resultTxtFld = new JTextField(20);
		
		addBtn = new JButton("Add");
		subBtn = new JButton("Subtract");
		
		
		panel = new JPanel();
		
		
		//Using GridLayout
		panel.setLayout(new GridLayout(4,2,10,10));
		panel.setBorder(new EmptyBorder(10,10,10,10));
		inp1Label.setHorizontalAlignment(SwingConstants.RIGHT);
		inp2Label.setHorizontalAlignment(SwingConstants.RIGHT);
		resultLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		panel.add(inp1Label);panel.add(inp1TxtFld);
		panel.add(inp2Label);panel.add(inp2TxtFld);
		panel.add(resultLabel);panel.add(resultTxtFld);
		panel.add(addBtn); panel.add(subBtn);
		
		add(panel);
		
		df = new DecimalFormat("0.00");
		
		addBtn.addActionListener(e -> {
				num1 = Double.parseDouble(inp1TxtFld.getText());
				num2 = Double.parseDouble(inp2TxtFld.getText());
				resultTxtFld.setText("The sum is: "+df.format((num1+num2)));
		});
		
		subBtn.addActionListener(e-> {
				num1 = Double.parseDouble(inp1TxtFld.getText());
				num2 = Double.parseDouble(inp2TxtFld.getText());
				resultTxtFld.setText("The difference is: "+df.format((num1-num2)));
		});
		
	}
	
}


public class BasicGUI_LambdaExpression {

	public static void main(String[] args) {
		
		BasicGUIFrameV4 frame = new BasicGUIFrameV4();
		frame.setTitle("Basic GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(275, 150);
		frame.setSize(350, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		//frame.setResizable(false);

	}

}
