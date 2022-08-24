//import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ATM2 extends Frame implements ActionListener
{
	//Frame win ;

	Button convert;
	Button exit;
	Button clear;
	Button about;
	
	Label enterTexts;
	Label five_thousand;
	Label thousand;
	Label five_hundred;
	Label hundred;
	Label fifty;
	Label twenty;
	Label ten;
	Label five;
	Label two;
	Label one;

	TextField enter_tf;
	TextField five_thousand_tf;
	TextField thousand_tf;
	TextField five_hundred_tf;
	TextField hundred_tf;
	TextField fifty_tf;
	TextField twenty_tf;
	TextField ten_tf;
	TextField five_tf;
	TextField two_tf;
	TextField one_tf;
	int amount;
	ATM2()
	{
		//Frame win = new Frame("Dani");
		
		
		 convert = new Button("Convert");		
		convert.setBounds(350,50,100,25);
		 exit = new Button("EXIT");
		exit.setBounds(50,650,100,25);
		 clear = new Button("CLEAR");
		clear.setBounds(150,650,100,25);
		 about = new Button("ABOUT");
		about.setBounds(250,650,100,25);
		
		convert.addActionListener(this);
		exit.addActionListener(this);
		clear.addActionListener(this);
		about.addActionListener(this);
		
		 enterTexts=new Label("Enter amount ATM ");
		enterTexts.setBounds(10,50,100,25);
		 five_thousand=new Label("5000");
		five_thousand.setBounds(50,150,100,25);
		 thousand=new Label("1000");
		thousand.setBounds(50,200,100,25);
		 five_hundred=new Label("500");
		five_hundred.setBounds(50,250,100,25);
		 hundred=new Label("100");
		hundred.setBounds(50,300,100,25);
		 fifty=new Label("50");
		fifty.setBounds(50,350,100,25);
		 twenty=new Label("20");
		twenty.setBounds(50,400,100,25);
		 ten=new Label("10");
		ten.setBounds(50,450,100,25);
		 five=new Label("5");
		five.setBounds(50,500,100,25);
		 two=new Label("2");
		two.setBounds(50,550,100,25);
		 one=new Label("1");
		one.setBounds(50,600,100,25);
		

		 enter_tf=new TextField();
		 enter_tf.setBounds(200,50,100,25);
		 five_thousand_tf=new TextField(); 
		 five_thousand_tf.setBounds(200,150,100,25);
		 thousand_tf=new TextField();
	 thousand_tf.setBounds(200,200,100,25);
		 five_hundred_tf=new TextField();
	 five_hundred_tf.setBounds(200,250,100,25);
		 hundred_tf=new TextField();
	 hundred_tf.setBounds(200,300,100,25);
		 fifty_tf=new TextField();
	 fifty_tf.setBounds(200,350,100,25);
		 twenty_tf=new TextField();
	 twenty_tf.setBounds(200,400,100,25);
		 ten_tf=new TextField();
	 ten_tf.setBounds(200,450,100,25);
		 five_tf=new TextField();
	 five_tf.setBounds(200,500,100,25);
		 two_tf=new TextField();
	 two_tf.setBounds(200,550,100,25);
		 one_tf=new TextField();
	 one_tf.setBounds(200,600,100,25);
	 
		add(enterTexts);
		add(five_thousand);
		add(thousand);
		add(five_hundred);
		add(hundred);
		add(fifty);
		add(twenty);
		add(ten);
		add(five);
		add(two);
		add(one);
		
		add(enter_tf);
		add(five_thousand_tf);
		add(thousand_tf);
		add(five_hundred_tf);
		add(hundred_tf);
		add(fifty_tf);
		add(twenty_tf);
		add(ten_tf);
		add(five_tf);
		add(two_tf);
		add(one_tf);
		
		add(convert);
		add(exit);
		add(clear);
		add(about);
		
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
	}
	private void clear(){
		enter_tf.setText("");
		five_thousand_tf.setText("");
		thousand_tf.setText("");
		five_hundred_tf.setText("");
		hundred_tf.setText("");
		fifty_tf.setText("");
		twenty_tf.setText("");
		ten_tf.setText("");
		five_tf.setText("");
		two_tf.setText("");
		one_tf.setText("");
	}
	public void  actionPerformed(ActionEvent e)
	{
		try{
		if(convert==e.getSource())
		{
			String a = enter_tf.getText();
			amount = Integer.parseInt(a);
			
			five_thousand_tf.setText(""+(amount/5000));
			amount=amount%5000;
			thousand_tf.setText(""+(amount/1000));
			amount=amount%1000;
			five_hundred_tf.setText(""+(amount/500));
			amount=amount%500;
			hundred_tf.setText(""+(amount/100));
			amount=amount%100;
			fifty_tf.setText(""+(amount/50));
			amount=amount%50;
			twenty_tf.setText(""+(amount/20));
			amount=amount%20;
			ten_tf.setText(""+(amount/10));
			amount=amount%10;
			five_tf.setText(""+(amount/5));
			amount=amount%5;
			two_tf.setText(""+(amount/2));
			amount=amount%2;
			one_tf.setText(""+(amount/1));
		}
		if(e.getSource()==clear){
			clear();
		}
		if(e.getSource()==exit){
			System.exit(0);
		}
		if(e.getSource()==about){
			JOptionPane.showMessageDialog(null,"Name: Danish Azeem \nOrganization: Muet \nEmail: danisanghroo@gmail.com \nContact: 03003030032");
		}
		}catch(Exception ex){System.out.println(ex);}
	}
	public static void main(String args[])
	{
	new ATM2();
	}
}