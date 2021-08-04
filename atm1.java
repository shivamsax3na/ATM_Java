import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JScrollPane; 
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.applet.*;

public class atm1 implements ActionListener
{
JFrame f,frame1;
BorderLayout bl;
JTable table;
 		String acc= "";
String dep= "";
String with = "";

 DefaultTableModel model;

JPanel mp,p1,p2,p3,p4,p7,p8,p9,p10,p11,p12;

JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l17,l20,l21,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43,l44,l45,l46,l47,l48,l49,l50,l51,l52,l53,l54;
JTextField t1,t2,t8,t9,t10,t11,t12,t13,t14,t15,t16;
JPasswordField pf1,pf2,pf3,pf4;
Font ff1,ff2,f1,f2,f3,f4,f5,f6,f7,f8,f13,f16,f17,f18,f19,f20,f21,f22,f23,f24,f25,f26,f27,f28,f29,f30,f31,f32,f33,f34,f35,f38,fa1,fa2,fa3,fa4,fa5,fa6,fa7;
JComboBox cb1,cb2;
ImageIcon icon,ic,img1,icon1,icon2,icon3,icon4,icon5,icon6,icon7,icon8,icon9,icon10,icon11;
JScrollPane png;
String s1,s2,ss1,ss2,ss3,ss4,ss5,ss6,ss7,ss8,ss9,ss10,ss11,ss12,ss13,ss14;
Integer i1,i2,i3,i4;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29;
CardLayout cl;
String s3,s4,s5,s6,s7,s8,s9,s10;
String sa1,sa2,sa3,sa4,sa5,sa6,sa7,sa9;

String[] columnNames = {"accountno", "deposit", "withdraw"};

public void a1()
{

f=new JFrame();
mp=new JPanel();
f.getContentPane().add(mp);
f.setVisible(true);
f.setSize(500,600);
f38 = new Font("SansSerif",Font.BOLD,20);
cl=new CardLayout();
mp.setLayout(cl);

//====================Panel 1==================== 
p1=new JPanel();
p1.setLayout(null);

		icon=new ImageIcon("az2.jpg");
		l11=new JLabel(icon);

		l2=new JLabel("ATM Services");
		l2.setFont(new Font("Times New Roman",Font.BOLD,50));
		l2.setForeground(Color.BLUE);
		
		l3=new JLabel("Press OK To Use ATM Service or Press Exit to quit");
		l3.setFont(new Font("Times New Roman",Font.BOLD,30));
		l3.setForeground(Color.RED);
		
		b1=new JButton("Ok",new ImageIcon("ok.png"));
		b1.setFont(f1);
	 	b1.addActionListener(this);

		b2=new JButton("Exit",new ImageIcon("cancel.png"));
		b2.setFont(f2);
		b2.addActionListener(this);

l11.setBounds(10,50,1350,300);
l2.setBounds(550,300,400,300);
l3.setBounds(350,350,800,350);
b1.setBounds(500,580,130,40);
b2.setBounds(850,580,130,40);

		p1.setBackground(Color.orange);
		p1.add(l11);
		p1.add(l2);
		p1.add(l3);
		p1.add(b1);
		p1.add(b2);
		
//====================Panel 2==================== 
p2=new JPanel();
p2.setLayout(null);
		
		icon1=new ImageIcon("login.jpeg");
		l44=new JLabel(icon1);
		
		l5=new JLabel("Account No.");
		Font f4=new Font("Arial Rounded MT",Font.BOLD,20);
		l5.setFont(f4);

		l6=new JLabel("Password");
		Font f5=new Font("Arial Rounded MT",Font.BOLD,20);
		l6.setFont(f5);
		
		t1=new JTextField(50);
		pf1=new JPasswordField(50);

		b3=new JButton("Sign In");
		b3.addActionListener(this);
		
		b4=new JButton("Sign Up");
		b4.addActionListener(this);
		
		b28=new JButton("Back");
		b28.addActionListener(this);


l44.setBounds(10,5,1150,300);
l5.setBounds(400,280,250,20);
t1.setBounds(530,280,250,20);
l6.setBounds(400,330,250,20);
pf1.setBounds(530,330,250,20);
b3.setBounds(400,380,180,20);
b4.setBounds(600,380,180,20);
b28.setBounds(500,410,180,20);

		p2.setBackground(Color.orange);
		p2.add(l44);
		p2.add(l5);
		p2.add(l6);
		p2.add(b28);
		p2.add(t1);
		p2.add(pf1);
		p2.add(b3);
		p2.add(b4);

//====================Panel 3====================
p3=new JPanel();
p3.setLayout(null);
		
		icon3=new ImageIcon("select.jpg");
		l46=new JLabel(icon3);
		
		icon4=new ImageIcon("select1.jpg");
		l47=new JLabel(icon4);

		l7=new JLabel("Select Any One Option From The Following");
		Font f6=new Font("Gill Sans",Font.BOLD,40);
		l7.setFont(f6);
		
		b5=new JButton("Cash Withdrawal");
		b5.addActionListener(this);
		
		b6=new JButton("Balance Enquiry");
		b6.addActionListener(this);
		
		b7=new JButton("Mini Statement");
		b7.addActionListener(this);
	
		b8=new JButton("Pin Change");
		b8.addActionListener(this);
		
		b9=new JButton("Cash Deposit");
		b9.addActionListener(this);
		
		b10=new JButton("Loan Information");
		b10.addActionListener(this);
		
		b11=new JButton("Help");
		b11.addActionListener(this);
		
		b12=new JButton("Cancel",new ImageIcon("cancel.png"));
		b12.addActionListener(this);
		

l46.setBounds(5,5,150,150);
l47.setBounds(5,5,2485,200);
l7.setBounds(220,150,900,80);
b5.setBounds(350,250,190,40);
b6.setBounds(350,300,190,40);
b7.setBounds(350,350,190,40);
b8.setBounds(850,250,190,40);
b9.setBounds(850,300,190,40);
b10.setBounds(850,350,190,40);
b11.setBounds(600,400,190,40);
b12.setBounds(600,450,190,40);

		p3.setBackground(Color.orange);
		p3.add(l7);
		p3.add(l46);
		p3.add(l47);
		p3.add(b5);
		p3.add(b6);
		p3.add(b7);
		p3.add(b8);
		p3.add(b9);
		p3.add(b10);
		p3.add(b11);
		p3.add(b12);
		
//====================Panel 4====================
p4=new JPanel();
p4.setLayout(null);

		icon5=new ImageIcon("images.jpeg");
		l9=new JLabel(icon5);
				
		icon6=new ImageIcon("cash1.jpg");
		l48=new JLabel(icon6);

		l10=new JLabel("Enter the amount to withdrawal");
		Font f8=new Font("Tahoma",Font.BOLD,25);
		l10.setFont(f8);

		t2=new JTextField(50);
		
		b13=new JButton("Enter",new ImageIcon("ok.png"));
		b13.addActionListener(this);
		
		b14=new JButton("Clear",new ImageIcon("clear.png"));
		b14.addActionListener(this);
		
		b15=new JButton("Cancel",new ImageIcon("cancel.png"));
		b15.addActionListener(this);
		
		
l9.setBounds(5,5,1150,200);
l48.setBounds(5,400,2000,300);
l10.setBounds(200,250,400,30);
t2.setBounds(650,250,200,30);
b13.setBounds(300,350,130,40);
b14.setBounds(450,350,130,40);
b15.setBounds(600,350,130,40);

		p4.setBackground(Color.orange);
		p4.add(l9);
		p4.add(l48);
		p4.add(l10);
		p4.add(t2);
		p4.add(b13);
		p4.add(b14);
		p4.add(b15);
		
//====================Panel 7====================
p7=new JPanel();
p7.setLayout(null);
		
		icon7=new ImageIcon("pin.png");
		l49=new JLabel(icon7);
		
		l20=new JLabel("Enter new PIN no");
		Font f16=new Font("Tahoma",Font.BOLD,15);
		l20.setFont(f16);
		
		l21=new JLabel("Confirm new PIN no");
		Font f17=new Font("Tahoma",Font.BOLD,15);
		l21.setFont(f17);
		
		pf3=new JPasswordField(50);
		pf4=new JPasswordField(50);
		
		b18=new JButton("Enter",new ImageIcon("ok.png"));
		b18.setFont(f18);
		b18.addActionListener(this);

		b19=new JButton("Clear",new ImageIcon("clear.png"));
		b19.setFont(f19);
		b19.addActionListener(this);

		b20=new JButton("Cancel",new ImageIcon("cancel.png"));
		b20.setFont(f20);
		b20.addActionListener(this);
		

l49.setBounds(5,0,1300,350);
l20.setBounds(300,380,300,30);
pf3.setBounds(500,380,300,30);
l21.setBounds(300,440,300,30);
pf4.setBounds(500,440,300,30);
b18.setBounds(300,520,130,40);
b19.setBounds(500,520,130,40);
b20.setBounds(700,520,130,40);

		p7.setBackground(Color.orange);
		p7.add(l49);
		p7.add(l20);
		p7.add(l21);
		p7.add(pf3);
		p7.add(pf4);
		p7.add(b18);
		p7.add(b19);
		p7.add(b20);
		
//====================Panel 8====================
p8=new JPanel();
p8.setLayout(null);
		
		icon8=new ImageIcon("deposit1.png");
		l50=new JLabel(icon8);
	
		l23=new JLabel("Enter the amount to be deposit");
		Font ff2=new Font("Tahoma",Font.BOLD,25);
		l23.setFont(ff2);
		
		t9=new JTextField(50);
		
		b21=new JButton("Enter",new ImageIcon("ok.png"));
		b21.setFont(f22);
		b21.addActionListener(this);

		b22=new JButton("Clear",new ImageIcon("clear.png"));
		b22.setFont(f23);
		b22.addActionListener(this);

		b23=new JButton("Cancel",new ImageIcon("cancel.png"));
		b23.setFont(f24);
		b23.addActionListener(this);
		

l50.setBounds(5,5,1300,300);
l23.setBounds(320,350,400,30);
t9.setBounds(770,350,200,30);
b21.setBounds(350,450,130,40);
b22.setBounds(550,450,130,40);
b23.setBounds(750,450,130,40);

		p8.setBackground(Color.orange);
		p8.add(l50);
		p8.add(l23);
		p8.add(t9);
		p8.add(b21);
		p8.add(b22);
		p8.add(b23);
		
//====================Panel 9====================
p9=new JPanel();
p9.setLayout(null);

			icon9=new ImageIcon("loan.jpg");
			l24=new JLabel(icon9);
			l24.setBounds(5,15,1300,300);
			p9.add(l24);
			
			icon10=new ImageIcon("loan1.jpg");
			l54=new JLabel(icon10);
			l54.setBounds(5,400,2250,300);
			p9.add(l54);

			l25=new JLabel("Home Loan @ only 9%.");
			Font fa1=new Font("Tahoma",Font.BOLD,20);
			l25.setFont(fa1);
			l25.setBounds(200,330,800,30);
			p9.add(l25);

			l26=new JLabel("Personal Loan @ only 10%.");
			Font fa2=new Font("Tahoma",Font.BOLD,20);
			l26.setFont(fa2);
			l26.setBounds(200,360,800,30);
			p9.add(l26);

			l27=new JLabel("Car Loan @ only 12%.");
			Font fa3=new Font("Tahoma",Font.BOLD,20);
			l27.setFont(fa3);
			l27.setBounds(200,390,800,30);
			p9.add(l27);

			l28=new JLabel("Student Loan @ only 5%.");
			Font fa4=new Font("Tahoma",Font.BOLD,20);
			l28.setFont(fa4);
			l28.setBounds(200,420,800,30);
	    	p9.add(l28);
			
			l51=new JLabel("Computer or Laptop Loan @ only 8%.");
			Font fa5=new Font("Tahoma",Font.BOLD,20);
			l51.setFont(fa5);
			l51.setBounds(200,450,800,30);
	    	p9.add(l51);
			
			l53=new JLabel("Got your identity proof, address proof and PAN card handy? Then you're sorted.");
			Font fa7=new Font("Tahoma",Font.BOLD,20);
			l53.setFont(fa7);
			l53.setBounds(100,500,1000,30);
	    	p9.add(l53);
			
			l52=new JLabel("Visit the nearest branch of our Bank to get updated about more loan rates.");
			Font fa6=new Font("Tahoma",Font.BOLD,20);
			l52.setFont(fa6);
			l52.setBounds(100,530,800,30);
	    	p9.add(l52);
			
			b24=new JButton("Apply");
			b24.setBounds(320,600,130,40);
			b24.addActionListener(this);
			p9.add(b24);

			b25=new JButton("Cancel",new ImageIcon("cancel.png"));
			b25.setBounds(570,600,130,40);
			b25.addActionListener(this);
			p9.add(b25);
			
			p9.setBackground(Color.orange);
		
//====================Panel 10====================
p10=new JPanel();
p10.setLayout(null);

			icon11=new ImageIcon("help.png");
			l29=new JLabel(icon11);
			l29.setBounds(5,5,1300,300);
			p10.add(l29);
		
			l30=new JLabel("1. Cash withdrawal options used to getting money from the ATM.");
			Font f27=new Font("Tahoma",Font.BOLD,20);
			l30.setFont(f27);
			l30.setBounds(300,350,670,25);
			p10.add(l30);

			l31=new JLabel("2. Balance enquiry used to display and print your balance.");
			Font f28=new Font("Tahoma",Font.BOLD,20);
			l31.setFont(f28);
			l31.setBounds(300,380,670,25);
	    	p10.add(l31);

	    	l32=new JLabel("3. Mini statement used to print your balance.");
		    Font f29=new Font("Tahoma",Font.BOLD,20);
			l32.setFont(f29);
			l32.setBounds(300,410,650,25);
			p10.add(l32);

			l33=new JLabel("4. PIN change option used to change PIN no of ATM card.");
			Font f30=new Font("Tahoma",Font.BOLD,20);
			l33.setFont(f30);
			l33.setBounds(300,440,670,25);
			p10.add(l33);

			l34=new JLabel("5. Loan information option used to give various loan rate.");
			Font f31=new Font("Tahoma",Font.BOLD,20);
			l34.setFont(f31);
			l34.setBounds(300,470,650,25);
			p10.add(l34);

			l35=new JLabel("6. For more information Visit our your nearest branch of our Bank.");
			Font f32=new Font("Tahoma",Font.BOLD,20);
			l35.setFont(f32);
			l35.setBounds(300,500,700,25);
			p10.add(l35);

			l36=new JLabel("This ATM software developed by: MEGHA BEDI");
			l36.setFont(new Font("Times New Roman",Font.BOLD,30));
			l36.setForeground(Color.BLUE);
			l36.setBounds(280,550,1000,50);
			p10.add(l36);

			p10.setBackground(Color.orange);
			b26=new JButton("Cancel",new ImageIcon("cancel.png"));
			b26.setFont(f34);
			b26.addActionListener(this);
			b26.setBounds(540,620,130,40);
			b26.addActionListener(this);
			p10.add(b26);
			
//====================Panel 11====================
p11=new JPanel();
p11.setLayout(null);
		
		icon2=new ImageIcon("online.jpg");
		l45=new JLabel(icon2);

		l37=new JLabel("REGISTRATION FORM");
		l37.setFont(new Font("Times New Roman",Font.BOLD,30));
		l37.setForeground(Color.BLUE);

		l38=new JLabel("Name");
		l38.setFont(f38);

		l39=new JLabel("Password");
		l39.setFont(f38);

		l40=new JLabel("Email-id");
		l40.setFont(f38);

		l41=new JLabel("City");
		l41.setFont(f38);

		l42=new JLabel("Gender");
		l42.setFont(f38);

		l43=new JLabel("Amount");
		l43.setFont(f38);

		t13=new JTextField(30);
		t14=new JTextField(30);
		t15=new JTextField(30);
		pf2=new JPasswordField(30);

		String s1[]={"Delhi","Mumbai","Maharashtra","Bangalore","Karnataka","Hyderabad","Ahmedabad","Gujarat","Chennai","Tamil Nadu","Jaipur","Rajasthan","Lucknow","Uttar Pradesh","Kanpur","Uttar Pradesh"};
		cb1=new JComboBox(s1);

		String s2[]={"Male","Female"};
		cb2=new JComboBox(s2);

		b27=new JButton("Submit");
		b27.addActionListener(this);
		
		b29=new JButton("Home");
		b29.addActionListener(this);


l45.setBounds(10,280,1250,420);
l37.setBounds(400,20,800,40);
l38.setBounds(250,70,300,25);
t13.setBounds(450,70,300,25);
l39.setBounds(250,100,300,25);
pf2.setBounds(450,100,300,25);
l40.setBounds(250,130,300,25);
t14.setBounds(450,130,300,25);
l41.setBounds(250,160,300,25);
cb1.setBounds(450,160,300,25);
l42.setBounds(250,190,300,25);
cb2.setBounds(450,190,300,25);
l43.setBounds(250,220,300,25);
t15.setBounds(450,220,300,25);
b27.setBounds(450,250,120,25);
b29.setBounds(620,250,120,25);

		p11.setBackground(Color.orange);
		p11.add(l37);
		p11.add(l45);
		p11.add(l38);
		p11.add(l39);
		p11.add(l40);
		p11.add(l41);
		p11.add(l42);
		p11.add(l43);
		p11.add(t13);
		p11.add(t14);
		p11.add(t15);
		p11.add(cb1);
		p11.add(cb2);
		p11.add(pf2);
		p11.add(b27);
		p11.add(b29);
		

//====================add sub panel into main Panel====================
mp.add(p1,"aa");
mp.add(p2,"bb");
mp.add(p3,"cc");
mp.add(p4,"dd");
mp.add(p7,"gg");
mp.add(p8,"hh");
mp.add(p9,"ii");
mp.add(p10,"jj");
mp.add(p11,"kk");

}
public void actionPerformed(ActionEvent ae)
{
	
	if(ae.getSource()==b4)
	{
		cl.show(mp,"kk");
	}


if(ae.getSource()==b27)
	{
String S1="";
		s3=new String(t13.getText());
		s5=new String(pf2.getText());
		s6=new String(t14.getText());
		s7=(String)cb1.getSelectedItem();
		s8=(String)cb2.getSelectedItem();
		s9=new String(t15.getText());
		//System.out.print(s3+s4+s5+s6+s7+s8+s9);
		
		try
{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "123456");
			PreparedStatement ps=con.prepareStatement("insert into masters (name,password,emailid,city,gender,amount)values('"+s3+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"')");
			ps.executeUpdate();
			t13.setText(S1);
			pf2.setText(S1);
			t14.setText(S1);
			t15.setText(S1);			
}
		catch(Exception e)
{
System.out.print("data base not found");
}

		try
{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "123456");
			PreparedStatement ps=con.prepareStatement("select  accountno from masters  ORDER BY accountno DESC LIMIT 1 ");
//ps.setString(1,s1);

			ResultSet rs=ps.executeQuery();
	while(rs.next())
{
			String ss1=rs.getString(1);
//System.out.print(ss1);

	JOptionPane.showMessageDialog(null,ss1,"YOUR ACCOUNT NO. IS: ",JOptionPane.INFORMATION_MESSAGE);
}
cl.show(mp,"bb");
}
		catch(Exception e)
{
System.out.print("Database not found");
}
	}
	
if(ae.getSource()==b1)
{
		cl.show(mp,"bb");
}

if(ae.getSource()==b3)
{
	
String SQ1="";
		sa1=new String (t1.getText());
		sa2=new String (pf1.getText());
		
		try
{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "123456");
			PreparedStatement ps=con.prepareStatement("select * from masters where accountno=? and password=?");
			ps.setString(1,sa1);
			ps.setString(2,sa2);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
{
t1.setText(SQ1);
pf1.setText(SQ1);

cl.show(mp,"cc");




}
else
{
	JOptionPane.showMessageDialog(null,"Wrong Password","Display Message",JOptionPane.INFORMATION_MESSAGE);
}
}

		catch(Exception e)
{
System.out.print("Database not found");
}
}

if(ae.getSource()==b5)
{
		cl.show(mp,"dd");
}
	
if(ae.getSource()==b13)
{
		try
{
			ss1=new String(t2.getText());
			//System.out.print(ss1+ss2+"8888");
			Class.forName("com.mysql.jdbc.Driver");			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "123456");
			PreparedStatement ps=con.prepareStatement("insert into trans(accountno,withdraw) values('"+sa1+"','"+ss1+"')");
			ps.executeUpdate();		
			t2.setText(ss3);
			
}
		catch(Exception e)
{
System.out.print("data base not found");
}

		try
{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "123456");
			PreparedStatement ps=con.prepareStatement("select amount from masters where accountno=?");
			ps.setString(1,sa1);
			ResultSet rs=ps.executeQuery();


while(rs.next())
{

ss4=rs.getString(1);
 	
}
	i1=Integer.parseInt(ss4);
	i2=Integer.parseInt(ss1);
	i3=i1-i2;
	ss6=Integer.toString(i3);

}
		catch(Exception e)
{
System.out.print("Database not found");
}


		try
{
			//s9=new String(t5.getText());
			//System.out.print(s15+s9);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "123456");
			PreparedStatement ps=con.prepareStatement("update masters set amount='"+ss6+"' where accountno='"+sa1+"' ");
			ps.executeUpdate();
			cl.show(mp,"cc");
}
		catch(Exception e)
{
	System.out.print("Database not found");
}
	}
	
if(ae.getSource()==b14)
{
	String SS="";
	t2.setText(SS);
}
if(ae.getSource()==b15)
{
			//f.setVisible(false);
cl.show(mp,"cc");
}
	
if(ae.getSource()==b6)
{
		try
{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "123456");
			PreparedStatement ps=con.prepareStatement("select amount from masters where accountno=?");
			ps.setString(1,sa1);
			ResultSet rs=ps.executeQuery();

while(rs.next())
{

String sa7=rs.getString(1);
//JOptionPane.showMessageDialog(null,"Total Amount",JOptionPane.INFORMATION_MESSAGE);
JOptionPane.showMessageDialog(null,sa7,"Total Balance In RS.",JOptionPane.INFORMATION_MESSAGE);

//System.out.print(sa3); 	
}
 }
		catch(Exception e)
{
	System.out.print("Database not found");
}
}
if(ae.getSource()==b9)
{
		cl.show(mp,"hh");
	
}
if(ae.getSource()==b21)
{
		try
{
			ss2=new String(t9.getText());

			Class.forName("com.mysql.jdbc.Driver");			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "123456");
			PreparedStatement ps=con.prepareStatement("insert into trans(accountno,deposit) values('"+sa1+"','"+ss2+"')");
			ps.executeUpdate();
			t9.setText(ss3);
}
		catch(Exception e)
{
System.out.print("data base not found");
}

		try
{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "123456");
			PreparedStatement ps=con.prepareStatement("select amount from masters where accountno=?");
			ps.setString(1,sa1);
			ResultSet rs=ps.executeQuery();

while(rs.next())
{

sa3=rs.getString(1);
 	
}
	i1=Integer.parseInt(sa3);
	i2=Integer.parseInt(ss2);
	i3=i1+i2;
	sa4=Integer.toString(i3);
}
		catch(Exception e)
{
System.out.print("Database not found");
}

		try
{
			//s9=new String(t5.getText());
			//System.out.print(s15+s9);
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "123456");
			PreparedStatement ps=con.prepareStatement("update masters set amount='"+sa4+"' where accountno='"+sa1+"' ");
			ps.executeUpdate();
			cl.show(mp,"cc");
}
		catch(Exception e)
{
	System.out.print("Database not found");
}
	}

if(ae.getSource()==b22)
{
	String SS="";
	t9.setText(SS);
}

if(ae.getSource()==b23)
{
	//f.setVisible(false);
cl.show(mp,"cc");
}

if(ae.getSource()==b8)
{
cl.show(mp,"gg");
}
if(ae.getSource()==b29)
{
cl.show(mp,"bb");
}
	
if(ae.getSource()==b18)
{
	String SQ2="";
	sa5=new String(pf3.getText());
	sa6=new String(pf4.getText());


if(sa5.equals(sa6))
{
	String sss1=sa5;
	
		try
{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "123456");
				PreparedStatement ps=con.prepareStatement("update masters set password='"+sss1+"' where accountno='"+sa1+"'");
				ps.executeUpdate();	
				//boolean result=true;
			
			
				JOptionPane.showMessageDialog(null,"Your password is successfully updated","Display Message",JOptionPane.INFORMATION_MESSAGE);
pf3.setText(SQ2);
pf4.setText(SQ2);
cl.show(mp,"cc");
				
				
				
}
		catch(Exception e)
{
		System.out.print("Database not found");
}


}
else
{
	
	JOptionPane.showMessageDialog(null,"Your password or repassword is not matched","Display Message",JOptionPane.INFORMATION_MESSAGE);
				
	
	
}


}

if(ae.getSource()==b19)
{
	String SS1="";
	pf3.setText(SS1);
	pf4.setText(SS1);
}

if(ae.getSource()==b20)
{
	//f.setVisible(false);
cl.show(mp,"cc");
}

if(ae.getSource()==b10)
{
	cl.show(mp,"ii");
}

if(ae.getSource()==b24)
{
		JOptionPane.showMessageDialog(null,"For more information Visit www.icicibank.com or call Toll free no 1800 2000 1211 ","Display Message",JOptionPane.INFORMATION_MESSAGE);
cl.show(mp,"cc");
}

if(ae.getSource()==b25)
{
	cl.show(mp,"cc");
}

if(ae.getSource()==b11)
{
	cl.show(mp,"jj");
}

if(ae.getSource()==b26)
{
	cl.show(mp,"cc");
}

if(ae.getSource()==b28)
{
	cl.show(mp,"aa");
}

if(ae.getSource()==b12)
{
	cl.show(mp,"bb");
}

if(ae.getSource()==b2)
{
	System.exit(0);
}

if(ae.getSource()==b7)
{
	showTableData();
}

}
public void showTableData()
{

frame1 = new JFrame("Database Search Result");

frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame1.setLayout(new BorderLayout()); 
//TableModel tm = new TableModel();
DefaultTableModel model = new DefaultTableModel();
model.setColumnIdentifiers(columnNames);
//DefaultTableModel model = new DefaultTableModel(tm.getData1(), tm.getColumnNames()); 
//table = new JTable(model);
table = new JTable();
table.setModel(model); 
table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
table.setFillsViewportHeight(true);
JScrollPane scroll = new JScrollPane(table);
scroll.setHorizontalScrollBarPolicy(
JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
scroll.setVerticalScrollBarPolicy(
JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 

String acc= "";
String dep= "";
String with = "";
try
{ 
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "123456");
PreparedStatement ps=con.prepareStatement("select accountno,deposit, withdraw from trans where accountno='"+sa1+"'");

ResultSet rs = ps.executeQuery();
int i =0;
while(rs.next())
{
acc = rs.getString("accountno");
dep = rs.getString("deposit");
with = rs.getString("withdraw");
 
model.addRow(new Object[]{acc, dep, with});
i++; 
}
if(i <1)
{
JOptionPane.showMessageDialog(null, "No Record Found","Error",
JOptionPane.ERROR_MESSAGE);
}
if(i ==1)
{
System.out.println(i+" Record Found");
}
else
{
System.out.println(i+" Records Found");
}
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null, e.getMessage(),"Error",
JOptionPane.ERROR_MESSAGE);
}
frame1.add(scroll);

frame1.setVisible(true);
frame1.setSize(400,300);
}


public static void main(String[] args)
{
atm1 ob=new atm1();
ob.a1();
}
}