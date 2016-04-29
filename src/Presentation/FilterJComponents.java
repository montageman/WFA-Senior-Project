package Presentation;

import javax.swing.JComboBox;

//custom combo box classes


/**
 * @author Ryan Duan
 * 
 * class for boolean selection combo boxes
 */
class BoolSelectJComboBox extends JComboBox
{
	private static String[] ComboBoxBools = new String[] {" ", "and", "or"};
	
	public BoolSelectJComboBox()
	{
		super(ComboBoxBools);
	}		
}

/**
 * @author Ryan Duan
 * 
 * class for logical operator boolean selection combo boxes
 */
class LBoolSelectJComboBox extends JComboBox
{
	private static String[] ComboBoxBools = new String[] {" ", "and", "or"};
	
	public LBoolSelectJComboBox()
	{
		super(ComboBoxBools);
	}		
}

/**
 * @author Ryan Duan
 *
 * class for operation combo boxes
 */
class OpSelectJComboBox extends JComboBox
{
	private static String[] ComboBoxOps = new String[] {" ", "==", ">", ">=", "<", "<=", "!="};
	
	public OpSelectJComboBox()
	{
		super(ComboBoxOps);
	}		
}