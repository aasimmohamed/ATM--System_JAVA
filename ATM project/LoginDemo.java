import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
import java.io.*;   

class Login1 extends JDialog   {   
	

	public void Login(){    
		
        // Creat components
        final JButton btn1,btn2;
        final JPanel panel;   
        final JLabel label1,label2,lbl1,lbl2;   
        final JTextField  text1;
       
        // Creat JFrame
        final JFrame frame = new JFrame("JAVA BANK");
        frame.setSize(700,350);  
        frame.setLocationRelativeTo(null);  
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Components design
        panel = new JPanel (new FlowLayout(FlowLayout.CENTER));
		panel.setBackground(Color.black);
	    label1 = new JLabel();
        label1.setText("WELCOME TO OUR ATM SYSTEM");
        label1.setFont(new Font("Adobe Gothic Std B",6,32));
	    label1.setForeground(Color.white);
	    

            label2 = new JLabel("PLEASE INPUT YOUR CREDIT CARD PIN NUMBER!");
			label2.setFont(new Font("Calibri",3,22));
			label2.setForeground(Color.white);
            text1 = new JPasswordField(25);
            btn1=new JButton("OK");
			btn1.setBackground(Color.gray);
			btn1.setForeground(Color.black);
            panel.add(label1);    
            panel.add(label2);
            panel.add(text1);    
            panel.add(btn1);
            frame.add(panel,BorderLayout.CENTER); 

        // If pin number wrong it display in down in msglbl
        JPanel msgpnl = new JPanel();
        final JLabel msglbl = new JLabel(" ");
        msgpnl.add(msglbl);
        frame.add("South",msgpnl);


        // btn1 click and what want to do
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent argO){

                String value1=text1.getText();
                    if (value1.equals("1234")) {  

                        try{
                
                            FileReader fr = new FileReader("BANK ACC.txt");
                            BufferedReader br = new BufferedReader(fr);

                            String s = br.readLine();
                            System.out.println(s);
                            fr.close();
                            int max = Integer.parseInt(s);
                            int max_out = max-500;
                            String fn = Integer.toString(max_out);
                
                	
                            // If pin right display main java file
                            main page = new main (); 
                            page.manuForm();
                            frame.setVisible(false);
                
                    

                            String word ="MAXIMUM AMOUNT OF MONEY YOU CAN AFFORD IS : "+fn ;  
                   
                            }catch (Exception ex) {
                            //JOptionPane.showMessageDialog(this,"Incorrect login or password","Error",JOptionPane.ERROR_MESSAGE);
                            }
            
                    }
                    else{    
                            msglbl.setText("ENTER THE VALID CREDIT CARD NUMBER PIN NUMBER!"); 
                            msglbl.setFont(new Font("Adobe Gothic Std B",6,20));
			    msglbl.setForeground(Color.red);
                    }
            }
        });  
            
    }  
}

// The main method in this class 
class LoginDemo  {    
    public static void main(String arg[])    { 
        Login1 obL = new Login1();
        obL.Login();
    }
}
 
