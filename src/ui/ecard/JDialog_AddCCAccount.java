package ui.ecard;
/*
		A basic implementation of the JDialog class.
*/

public class JDialog_AddCCAccount extends javax.swing.JDialog
{
    private CardFrm parentframe;
    
	public JDialog_AddCCAccount(CardFrm parent)
	{
		super(parent);
		parentframe=parent;
		
		// This code is automatically generated by Visual Cafe when you add
		// components to the visual environment. It instantiates and initializes
		// the components. To modify the code, only use code syntax that matches
		// what Visual Cafe can generate, or Visual Cafe may be unable to back
		// parse your Java file into its visual environment.
		//{{INIT_CONTROLS
		setTitle("Add credit card account");
		setModal(true);
		getContentPane().setLayout(null);
		setSize(301,373);
		setVisible(false);
		JRadioButton_Gold.setText("Gold");
		JRadioButton_Gold.setActionCommand("Checkings");
		getContentPane().add(JRadioButton_Gold);
		JRadioButton_Gold.setBounds(36,12,84,24);
		JRadioButton_Silver.setText("Silver");
		JRadioButton_Silver.setActionCommand("Savings");
		getContentPane().add(JRadioButton_Silver);
		JRadioButton_Silver.setBounds(36,36,84,24);
		JLabel1.setText("Name");
		getContentPane().add(JLabel1);
		JLabel1.setForeground(java.awt.Color.black);
		JLabel1.setBounds(12,108,48,24);
		JLabel2.setText("Street");
		getContentPane().add(JLabel2);
		JLabel2.setForeground(java.awt.Color.black);
		JLabel2.setBounds(12,132,48,24);
		JLabel3.setText("City");
		getContentPane().add(JLabel3);
		JLabel3.setForeground(java.awt.Color.black);
		JLabel3.setBounds(12,156,48,24);
		JLabel4.setText("State");
		getContentPane().add(JLabel4);
		JLabel4.setForeground(java.awt.Color.black);
		JLabel4.setBounds(12,180,48,24);
		JLabel5.setText("Zip");
		getContentPane().add(JLabel5);
		JLabel5.setForeground(java.awt.Color.black);
		JLabel5.setBounds(12,204,48,24);
		JLabel6.setText("CC number");
		getContentPane().add(JLabel6);
		JLabel6.setForeground(java.awt.Color.black);
		JLabel6.setBounds(12,252,96,24);
		Label7.setText("Exp. Date");
		getContentPane().add(Label7);
		Label7.setForeground(java.awt.Color.black);
		Label7.setBounds(12,276,72,24);
		getContentPane().add(JTextField_NAME);
		JTextField_NAME.setBounds(84,108,156,20);
		getContentPane().add(JTextField_CT);
		JTextField_CT.setBounds(84,156,156,20);
		getContentPane().add(JTextField_ST);
		JTextField_ST.setBounds(84,180,156,20);
		getContentPane().add(JTextField_STR);
		JTextField_STR.setBounds(84,132,156,20);
		getContentPane().add(JTextField_ZIP);
		JTextField_ZIP.setBounds(84,204,156,20);
		getContentPane().add(JTextField_CCNR);
		JTextField_CCNR.setBounds(84,252,156,20);
		getContentPane().add(JTextField_ExpDate);
		JTextField_ExpDate.setBounds(84,276,156,20);
		JButton_OK.setText("OK");
		JButton_OK.setActionCommand("OK");
		getContentPane().add(JButton_OK);
		JButton_OK.setBounds(48,312,84,24);
		JButton_Cancel.setText("Cancel");
		JButton_Cancel.setActionCommand("Cancel");
		getContentPane().add(JButton_Cancel);
		JButton_Cancel.setBounds(156,312,84,24);
		JRadioButton_Bronze.setText("Bronze");
		JRadioButton_Bronze.setActionCommand("Savings");
		getContentPane().add(JRadioButton_Bronze);
		JRadioButton_Bronze.setBounds(36,60,84,24);
		JLabel7.setText("Email");
		getContentPane().add(JLabel7);
		JLabel7.setForeground(java.awt.Color.black);
		JLabel7.setBounds(12,228,48,24);
		getContentPane().add(JTextField_Email);
		JTextField_Email.setBounds(84,228,156,20);
		//}}
	
		//{{REGISTER_LISTENERS
		SymMouse aSymMouse = new SymMouse();
		JRadioButton_Gold.addMouseListener(aSymMouse);
		JRadioButton_Silver.addMouseListener(aSymMouse);
		SymAction lSymAction = new SymAction();
		JButton_OK.addActionListener(lSymAction);
		JButton_Cancel.addActionListener(lSymAction);
		JRadioButton_Bronze.addMouseListener(aSymMouse);
		//}}
	}




	//{{DECLARE_CONTROLS
	javax.swing.JRadioButton JRadioButton_Gold = new javax.swing.JRadioButton();
	javax.swing.JRadioButton JRadioButton_Silver = new javax.swing.JRadioButton();
	javax.swing.JLabel JLabel1 = new javax.swing.JLabel();
	javax.swing.JLabel JLabel2 = new javax.swing.JLabel();
	javax.swing.JLabel JLabel3 = new javax.swing.JLabel();
	javax.swing.JLabel JLabel4 = new javax.swing.JLabel();
	javax.swing.JLabel JLabel5 = new javax.swing.JLabel();
	javax.swing.JLabel JLabel6 = new javax.swing.JLabel();
	javax.swing.JLabel Label7 = new javax.swing.JLabel();
	javax.swing.JTextField JTextField_NAME = new javax.swing.JTextField();
	javax.swing.JTextField JTextField_CT = new javax.swing.JTextField();
	javax.swing.JTextField JTextField_ST = new javax.swing.JTextField();
	javax.swing.JTextField JTextField_STR = new javax.swing.JTextField();
	javax.swing.JTextField JTextField_ZIP = new javax.swing.JTextField();
	javax.swing.JTextField JTextField_CCNR = new javax.swing.JTextField();
	javax.swing.JTextField JTextField_ExpDate = new javax.swing.JTextField();
	javax.swing.JButton JButton_OK = new javax.swing.JButton();
	javax.swing.JButton JButton_Cancel = new javax.swing.JButton();
	javax.swing.JRadioButton JRadioButton_Bronze = new javax.swing.JRadioButton();
	javax.swing.JLabel JLabel7 = new javax.swing.JLabel();
	javax.swing.JTextField JTextField_Email = new javax.swing.JTextField();
	//}}


	class SymMouse extends java.awt.event.MouseAdapter
	{
		public void mouseClicked(java.awt.event.MouseEvent event)
		{
			Object object = event.getSource();
			if (object == JRadioButton_Gold)
				JRadioButtonChk_mouseClicked(event);
			else if (object == JRadioButton_Silver)
				JRadioButtonSav_mouseClicked(event);
			else if (object == JRadioButton_Bronze)
				JRadioButtonBronze_mouseClicked(event);
			
			
		}
	}

	void JRadioButtonChk_mouseClicked(java.awt.event.MouseEvent event)
	{
		JRadioButton_Gold.setSelected(true);
		JRadioButton_Silver.setSelected(false);
		JRadioButton_Bronze.setSelected(false);
	}

	void JRadioButtonSav_mouseClicked(java.awt.event.MouseEvent event)
	{
		JRadioButton_Gold.setSelected(false);
		JRadioButton_Silver.setSelected(true);
		JRadioButton_Bronze.setSelected(false);
	 
	}
	void JRadioButtonBronze_mouseClicked(java.awt.event.MouseEvent event)
	{
		JRadioButton_Gold.setSelected(false);
		JRadioButton_Silver.setSelected(false);
		JRadioButton_Bronze.setSelected(true);
			 
	}

	class SymAction implements java.awt.event.ActionListener
	{
		public void actionPerformed(java.awt.event.ActionEvent event)
		{
			Object object = event.getSource();
			if (object == JButton_OK)
				JButtonOK_actionPerformed(event);
			else if (object == JButton_Cancel)
				JButtonCalcel_actionPerformed(event);
		}
	}

	void JButtonOK_actionPerformed(java.awt.event.ActionEvent event)
	{
       parentframe.clientName=JTextField_NAME.getText();
       parentframe.street=JTextField_STR.getText();
       parentframe.city=JTextField_CT.getText();
       parentframe.zip=JTextField_ZIP.getText();
       parentframe.state=JTextField_ST.getText();
       parentframe.ccnumber=JTextField_CCNR.getText();
       parentframe.expdate=JTextField_ExpDate.getText();
       if (JRadioButton_Gold.isSelected())
           parentframe.accountType="Gold";
           else{
            if (JRadioButton_Silver.isSelected())
                parentframe.accountType="Silver";
                else
                parentframe.accountType="Bronze";
           }
           
	   parentframe.newaccount=true;
       dispose();
	}

	void JButtonCalcel_actionPerformed(java.awt.event.ActionEvent event)
	{
    //make this frame invisible if Cancel button is clicked
        dispose();
	}
}