import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.*;


public class withdrawal_F extends JFrame {

	public void Withdrawal(){

		// Creat JFrame
		final JFrame f1 = new JFrame();
		f1.setSize(700,300);
		f1.setTitle("WITHDRAWAL");
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Creat conponents
		final JLabel lbl1;
		final JTextField txt1;
		final JButton btn1;
		final JButton btn2;
		final JButton btn3;
		final JLabel lbl2;
		final JLabel lbl3;
		final JLabel lbl4;
		final JLabel lbl5;
		final JButton btn4;

		// Creat panel and adding conponent
		JPanel p1 = new JPanel();
		lbl1 = new JLabel("PLEASE ENTER YOUR AMOUNT");
		lbl1.setFont(new Font("Adobe Gothic Std B",3,22));
		p1.setBackground(Color.black);
		lbl1.setForeground(Color.white);
		txt1 = new JTextField(10);
		p1.add(lbl1);
		p1.add(txt1);
		f1.add("North",p1);

		// Creat panel and adding conponent
		JPanel p2 = new JPanel();
		p2.setBackground(Color.black);
		btn1 = new JButton("WITHDRAWAL");
		btn2 = new JButton("BACK");
		btn3 = new JButton("EXIT");
		btn1.setBackground(Color.gray);
		btn2.setBackground(Color.gray);
		btn3.setBackground(Color.gray);
		btn1.setForeground(Color.black);
		btn2.setForeground(Color.black);
		btn3.setForeground(Color.black);
		p2.add(btn1);
		p2.add(btn2);
		p2.add(btn3);
		f1.add("Center",p2);

		// Creat panel and adding conponent
		JPanel down = new JPanel();
		lbl2 = new JLabel("");
		lbl3 = new JLabel("");
		JPanel p3 = new JPanel(new GridLayout(2,1));
		p3.setBackground(Color.white);
		p3.add(lbl2);
		p3.add(lbl3);
		down.add("Center",p3);
		f1.add("South",down);

		// Creat exit btn ActionListner
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent argo){
				System.exit(0);
			}
		});

		// Creat back btn ActionListner
		btn2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent argo)
			{
				main m = new main();
				m.manuForm();
				f1.setVisible(false);
			}
		});
	
		
		btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent argO){
			
				try{
				
					String input = txt1.getText();
					int in1 = Integer.parseInt(input);
					FileReader fr = new FileReader("BANK ACC.txt");
					BufferedReader br = new BufferedReader(fr);

					String s = br.readLine();
					System.out.println(s);
					fr.close();
					int m = Integer.parseInt(s);

					int Amount;
						if(m>in1){ 
							Amount = m-in1;
						}
						else{	
							int getAmount = m-500;
							String fn = Integer.toString(getAmount);
							System.out.println("money is not enough");
							String word = "THE MAXIMUM AMOUNT YOU CAN TAKE IS  : " +fn +"  RUPEES";
							//JOptionPane.showMessageDialog(null,word);
 							Amount =m;
						}

				
						String fn = Integer.toString(Amount);
						FileWriter stream =new  FileWriter("BANK ACC.txt");
						BufferedWriter out = new BufferedWriter(stream);
						out.write(fn);
						out.close();

						lbl2.setText("YOUR CURRENT BALANCE IS : "+fn);
						lbl2.setForeground(Color.black);
						lbl2.setFont(new Font("Franklin Gothic",4,16));
						lbl3.setText("THANKS FOR USING OUR SERVICE !");
						lbl3.setForeground(Color.black);
						lbl3.setFont(new Font("Franklin Gothic",4,16));

				}catch (Exception ex) {

				}

			}
		});
				f1.setVisible(true);
		}

		// Don't delete (this main method)
		/*public static void main(String []ard){
		withdrawal_Frame w = new withdrawal_Frame ();	
		w.Withdrawal();
		}*/	
}
