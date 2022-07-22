import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class main extends AbstractButton
{
	public void manuForm()
	{
		// Frame
		final JFrame f1 = new JFrame();
		f1.setSize(700,350);
		f1.setTitle("MENU");
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		// Margin Line in North part
		JPanel pt = new JPanel();
		JLabel lt = new JLabel(" PLEASE SELECT YOUR OPTION!");
		pt.setBackground(Color.black);
		lt.setForeground(Color.white);
		lt.setFont(new Font("Adobe Gothic Std B",6,32));
		pt.add(lt);
		f1.add("North", pt);

		

		// Buttons in center part
		JPanel p2 = new JPanel(new GridLayout(2,2,2,2));
		p2.setBackground(Color.black);
		Button b1 = new Button("Check Balance");
		Button b2 = new Button("Withdraw");
		Button b3 = new Button("Deposit");
		Button b4 = new Button("Exit");
		b1.setFont(new Font("Tahoma", 1, 18));
		b2.setFont(new Font("Tahoma", 1, 18));
		b3.setFont(new Font("Tahoma", 1, 18));
		b4.setFont(new Font("Tahoma", 1, 18));
		b1.setBackground(Color.gray);
		b2.setBackground(Color.gray);
		b3.setBackground(Color.gray);
		b4.setBackground(Color.gray);
		b1.setForeground(Color.black);
		b2.setForeground(Color.black);
		b3.setForeground(Color.black);
		b4.setForeground(Color.black);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		f1.add("Center", p2);

		// Cording for Check Button
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent argO)
			{
			BALANCE_Frame bf = new BALANCE_Frame();
			bf.balance();
			f1.setVisible(false);
			
			}
		});

		// Cording for Withdraw Button
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent argo)
			{
			withdrawal_F wff = new withdrawal_F();
			wff.Withdrawal();
			f1.setVisible(false);
			
			}
		});

		// Cording for Deposit Button
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent argo)
			{
			deposit_pp tf= new deposit_pp ();
			tf.deposit();
			f1.setVisible(false);
			
			}
		});

		// Cording for EXIT
		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent argo)
			{
				System.exit(0);
			}
		});

		f1.setVisible(true);
	}
	// Don't delete (this main method) 
	/*public static void main(String args[])
	{
		main wc = new main();
		wc.manuForm();
	}*/
}
