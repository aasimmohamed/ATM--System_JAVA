import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.*;

public class BALANCE_Frame extends JFrame {

	public void balance(){

		// Creat JFrame
		final JFrame f1 = new JFrame();
		f1.setSize(700,350);
		f1.setTitle("BALANCE");
		f1.setLocationRelativeTo(null);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Creat conponents
		JLabel lbl1;
		JLabel lbl2;
		JButton btn1;
		JButton btn2;
		FileReader fr;
		BufferedReader br;

		// Creat panel and adding conponent
		JPanel up = new JPanel();
		lbl1 = new JLabel("a ");
		up.setBackground(Color.black);
                lbl1.setBackground(Color.black);
		lbl1.setForeground(Color.black);
		lbl1.setFont(new Font("Adobe Gothic Std B",3,22));
		lbl2 = new JLabel("v ");
		up.setBackground(Color.black);
		lbl2.setForeground(Color.black);
		lbl2.setFont(new Font("Adobe Gothic Std B",3,22));
		JPanel p1 = new JPanel(new GridLayout(2,1));
		p1.add(lbl1);
		p1.add(lbl2);
		up.add("Center",p1);
		f1.add("North",up);

		// Creat panel and adding conponent
		JPanel p2 = new JPanel();
		p2.setBackground(Color.black);
		btn1 = new JButton("EXIT");
		btn2 = new JButton("BACK");
		btn1.setBackground(Color.gray);
		btn2.setBackground(Color.gray);
		btn1.setForeground(Color.black);
		btn2.setForeground(Color.black);
		p2.add(btn1);
		p2.add(btn2);
		f1.add("Center",p2);
		
		// Creat exit btn ActionListner
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent argo){
				System.exit(0);
			}
		});

		// Creat back btn ActionListner
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent argo){
				main m = new main();
				m.manuForm();
				f1.setVisible(false);
			}
		});
		
			try{
				
				fr = new FileReader("BANK ACC.txt");
				br = new BufferedReader(fr);

				String s = br.readLine();
				System.out.println(s);
				fr.close();

				lbl1.setText("YOUR CURRENT BALANCE IS : "+s);
				lbl2.setText("THANKS FOR USING OUR SERVICE !");
				

			}catch (Exception ex) {

			}
			
			f1.setVisible(true);
	}

	
	// Don't delete (this main method)
	/*btn1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent argO){
        	System.exit(0);

	    }           
    });*/
}
