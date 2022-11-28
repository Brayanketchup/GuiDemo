import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;



 class gui implements ActionListener {
	private static JFrame frame, frameF, frameC;
	private static JPanel panel, panelF, panelC;
	private static JLabel label, labelF, labelC, labelR;
	private static JButton button, button1, buttonF, buttonC, goHomeC, goHomeF;
	private static JTextField TextF;
//	private Toolkit tool;
//	private Dimension dimension;
	
	private gui (){
	
	//opening location	

	//panel and frame setup
	frame = new JFrame();
	panel = new JPanel();
	
	
	frame.setLocation(500,230);
	frame.setSize(300,300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.add(panel);
	
	panel.setLayout(null);
	
	label = new JLabel("select converter");
	label.setBounds(10,20,150,30);
	label.setFont(new Font("title", Font.ITALIC, 20));
	panel.add(label);
	
	//bottons
	buttonF = new JButton("Fahrenheits to Celsius");
	buttonF.setBounds(10,60,160,25);
	panel.add(buttonF);
	buttonF.addActionListener(this);
	
	buttonC = new JButton("Celsius to Fahrenheits");
	buttonC.setBounds(10,90,160,25);
	panel.add(buttonC);
	buttonC.addActionListener(this);
	}
	
	private void fahrenheit() {
		frameF = new JFrame();
		panelF = new JPanel();
		
		frameF.setLocation(500,230);
		frameF.setSize(300,400);
		frameF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameF.setVisible(true);
		frameF.add(panelF);
		panelF.setLayout(null);
		
		labelF = new JLabel("Fahrenheit to Celsius converter");
		labelF.setBounds(10,20,200,30);
		panelF.add(labelF);
		labelF = new JLabel("Please enter value in Fahrenheits:");
		labelF.setBounds(10,40,200,30);
		panelF.add(labelF);
		
		TextF = new JTextField(20);
		TextF.setBounds(10,65,200,30);
		panelF.add(TextF);
		frameF.setVisible(true);
		
		button = new JButton("Convert");
		button.setBounds(10,100,200,30);
		panelF.add(button);
		button.addActionListener(this);
		
		goHomeF = new JButton("Go Back home");
		goHomeF.setBounds(10,150,200,30);
		panelF.add(goHomeF);
		goHomeF.addActionListener(this);
		
		labelF = new JLabel("Fahrenheit to celsius is:");
		labelF.setBounds(10,125,200,30);
		panelF.add(labelF);
		
		labelR = new JLabel("");
		labelR.setBounds(150,125,200,30);
		panelF.add(labelR);
	}
	private void celsius() {
		frameC = new JFrame();
		panelC = new JPanel();
		
		frameC.setLocation(500,230);
		frameC.setSize(400,600);
		frameC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameC.setVisible(true);
		frameC.add(panelC);
		panelC.setLayout(null);
		
		labelC = new JLabel("Celsius to Fahrenheit converter");
		labelC.setBounds(10,20,200,30);
		panelC.add(labelC);
		labelC = new JLabel("Please enter value in Celsius:");
		labelC.setBounds(10,40,200,30);
		panelC.add(labelC);
		
		TextF = new JTextField(20);
		TextF.setBounds(10,65,200,30);
		panelC.add(TextF);
		frameC.setVisible(true);
		
		button1 = new JButton("Convert");
		button1.setBounds(10,100,200,30);
		panelC.add(button1);
		button1.addActionListener(this);
		
		goHomeC = new JButton("Go Back home");
		goHomeC.setBounds(10,150,200,30);
		panelC.add(goHomeC);
		goHomeC.addActionListener(this);
		
		labelC = new JLabel("celsius to Fahrenheit is:");
		labelC.setBounds(10,125,200,30);
		panelC.add(labelC);
		
		labelR = new JLabel("");
		labelR.setBounds(150,125,200,30);
		panelC.add(labelR);
	}
	
		private static void home() {
		// TODO Auto-generated method stub
			gui gui = new gui();
		
	}
		//Starting app
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		home();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == buttonF) {
			frame.setSize(401,600);
			System.out.println("F");
			frame.dispose();
			fahrenheit();
		}
		else if (e.getSource() == buttonC) {
			frame.setSize(401,600);
			System.out.println("C");
			frame.dispose();
			celsius();
		}
		
		if (e.getSource() == button) {
			String input = TextF.getText();
			try {
			double value = Double.valueOf(input);
			double output = toCelsius(value);
			labelR.setText(""+output);
			System.out.println(input);
			}catch (NumberFormatException P) {
				JOptionPane.showMessageDialog(null, "Invalid imput please retry again", "Error", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		else if (e.getSource() == button1) {
			
			String input = TextF.getText();
			try {
			double value = Double.valueOf(input);
			double output = toFahrenheit(value);
			labelR.setText(""+output);
			System.out.println(input);
			}catch (NumberFormatException P) {
				JOptionPane.showMessageDialog(null, "Invalid imput please retry again", "Error", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		if (e.getSource() == goHomeC) {
			frameC.dispose();
			home();
		}
		else if (e.getSource() == goHomeF) {
			frameF.dispose();
			home();
		}
		
		
	}

//Math
	public static double toFahrenheit (double input ){
		double fahrenheit = (input * 9/5) + 32;
		return fahrenheit;
	}
	
	public static double toCelsius (double input ){
		double celsius = (input-32) * 5/9;
		return celsius;
	}



		
	}


