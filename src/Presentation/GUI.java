package Presentation;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

import Business.Controller.Controller;
import Business.Model.Trend;
import Business.Model.WFAData;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Font;


/**
 * @author Ryan Duan
 * 
 * all the GUI stuff in one class
 * im all about good coding practices
 * yee
 */
/**
 * @author Ryan Duan
 *
 */
public class GUI extends JFrame {

	private JPanel WFA_GUI;
	private Trend trend = new Trend();
	private static Controller controller = Controller.getInstance();
	
	//WFAData objects
	private static WFAData start = new WFAData();
	private static WFAData end = new WFAData();
	private static WFAData activity = new WFAData();
	private String operations = "";
	private static String metric = "";
	private String dims = "";	
	
	//Number of filter rows
	static int DimRows = 1;
	
	//used for formatting metric boxes
	DecimalFormat dc = new DecimalFormat("0.00");
		
	//everything is hardcoded
	
	//ComboBoxModels define contents of ComboBoxes
	static DefaultComboBoxModel<String> SelectMetricComboBoxModel = new DefaultComboBoxModel<String>();
	static DefaultComboBoxModel<String> HyperDimensionComboBoxModel = new DefaultComboBoxModel<String>();
	static DefaultComboBoxModel<String> DimSelectComboBoxModel1 = new DefaultComboBoxModel<String>();
	static DefaultComboBoxModel<String> DimSelectComboBoxModel1_2 = new DefaultComboBoxModel<String>();
	static DefaultComboBoxModel<String> DimSelectComboBoxModel1_3 = new DefaultComboBoxModel<String>();
	static DefaultComboBoxModel<String> DimSelectComboBoxModel1_4 = new DefaultComboBoxModel<String>();
	static DefaultComboBoxModel<String> DimSelectComboBoxModel1_5 = new DefaultComboBoxModel<String>();
	JComboBox<String> SelectMetricComboBox = new JComboBox<String>();
	JComboBox<String> HyperDimensionComboBox = new JComboBox<String>();
	JPanel TrendDataPanel = new JPanel();
	JTextArea SumMetricsStartDisplay = new JTextArea();
	JTextArea SumMetricsEndDisplay = new JTextArea();
	JTextArea SumMetricsActivityDisplay = new JTextArea();
	JTextArea SumDimsStartDisplay = new JTextArea();
	JTextArea SumDimsEndDisplay = new JTextArea();
	JTextArea SumDimsActivityDisplay = new JTextArea();
	JTextArea AverageStartDisplay = new JTextArea();
	JTextArea AverageEndDisplay = new JTextArea();
	JTextArea AverageActivityDisplay = new JTextArea();
	JTextArea TrendDataDisplay = new JTextArea();
	JPanel SelectCSVFilesPanel = new JPanel();
	JButton SelectStartCSVButton = new JButton("Select Start CSV");
	JButton SelectEndCSVButton = new JButton("Select End CSV");
	JButton SelectActivityCSVButton = new JButton("Select Activity CSV");
	JButton resetCSVButton = new JButton("Reset CSV Files");
	static JPanel FiltersSelectionPanel = new JPanel();
	JLabel FiltersLabel = new JLabel("Filters:");
	static JButton addDimsButton = new JButton("+");
	static JButton removeDimsButton = new JButton("-");
	
	static JComboBox DimSelectComboBox1 = new JComboBox();
	static JComboBox OpSelectComboBox1 = new OpSelectJComboBox();
	static JTextField FilterTextField1 = new JTextField("");
	static JComboBox BoolSelectComboBox1 = new BoolSelectJComboBox();
	static JComboBox OpSelectComboBox2 = new OpSelectJComboBox();
	static JTextField FilterTextField2 = new JTextField("");
	static JComboBox BoolSelectComboBox2 = new BoolSelectJComboBox();
	static JComboBox OpSelectComboBox3 = new OpSelectJComboBox();	
	static JTextField FilterTextField3 = new JTextField("");
	
	static JComboBox BoolSelectComboBox0_2 = new LBoolSelectJComboBox();
	static JComboBox DimSelectComboBox1_2 = new JComboBox();
	static JComboBox OpSelectComboBox1_2 = new OpSelectJComboBox();
	static JTextField FilterTextField1_2 = new JTextField("");
	static JComboBox BoolSelectComboBox1_2 = new BoolSelectJComboBox();
	static JComboBox OpSelectComboBox2_2 = new OpSelectJComboBox();
	static JTextField FilterTextField2_2 = new JTextField("");
	static JComboBox BoolSelectComboBox2_2 = new BoolSelectJComboBox();
	static JComboBox OpSelectComboBox3_2 = new OpSelectJComboBox();	
	static JTextField FilterTextField3_2 = new JTextField("");
	
	static JComboBox BoolSelectComboBox0_3 = new LBoolSelectJComboBox();
	static JComboBox DimSelectComboBox1_3 = new JComboBox();
	static JComboBox OpSelectComboBox1_3 = new OpSelectJComboBox();
	static JTextField FilterTextField1_3 = new JTextField("");
	static JComboBox BoolSelectComboBox1_3 = new BoolSelectJComboBox();
	static JComboBox OpSelectComboBox2_3 = new OpSelectJComboBox();
	static JTextField FilterTextField2_3 = new JTextField("");
	static JComboBox BoolSelectComboBox2_3 = new BoolSelectJComboBox();
	static JComboBox OpSelectComboBox3_3 = new OpSelectJComboBox();	
	static JTextField FilterTextField3_3 = new JTextField("");
	
	static JComboBox BoolSelectComboBox0_4 = new LBoolSelectJComboBox();
	static JComboBox DimSelectComboBox1_4 = new JComboBox();
	static JComboBox OpSelectComboBox1_4 = new OpSelectJComboBox();
	static JTextField FilterTextField1_4 = new JTextField("");
	static JComboBox BoolSelectComboBox1_4 = new BoolSelectJComboBox();
	static JComboBox OpSelectComboBox2_4 = new OpSelectJComboBox();
	static JTextField FilterTextField2_4 = new JTextField("");
	static JComboBox BoolSelectComboBox2_4 = new BoolSelectJComboBox();
	static JComboBox OpSelectComboBox3_4 = new OpSelectJComboBox();	
	static JTextField FilterTextField3_4 = new JTextField("");
	
	static JComboBox BoolSelectComboBox0_5 = new LBoolSelectJComboBox();
	static JComboBox DimSelectComboBox1_5 = new JComboBox();
	static JComboBox OpSelectComboBox1_5 = new OpSelectJComboBox();
	static JTextField FilterTextField1_5 = new JTextField("");
	static JComboBox BoolSelectComboBox1_5 = new BoolSelectJComboBox();
	static JComboBox OpSelectComboBox2_5 = new OpSelectJComboBox();
	static JTextField FilterTextField2_5 = new JTextField("");
	static JComboBox BoolSelectComboBox2_5 = new BoolSelectJComboBox();
	static JComboBox OpSelectComboBox3_5 = new OpSelectJComboBox();	
	static JTextField FilterTextField3_5 = new JTextField("");
	
	static JComponent[] Row1Components = {DimSelectComboBox1, OpSelectComboBox1, FilterTextField1, BoolSelectComboBox1, OpSelectComboBox2, FilterTextField2, BoolSelectComboBox2, OpSelectComboBox3, FilterTextField3};
	static JComponent[] Row2Components = {BoolSelectComboBox0_2, DimSelectComboBox1_2, OpSelectComboBox1_2, FilterTextField1_2, BoolSelectComboBox1_2, OpSelectComboBox2_2, FilterTextField2_2, BoolSelectComboBox2_2, OpSelectComboBox3_2, FilterTextField3_2};
	static JComponent[] Row3Components = {BoolSelectComboBox0_3, DimSelectComboBox1_3, OpSelectComboBox1_3, FilterTextField1_3, BoolSelectComboBox1_3, OpSelectComboBox2_3, FilterTextField2_3, BoolSelectComboBox2_3, OpSelectComboBox3_3, FilterTextField3_3};
	static JComponent[] Row4Components = {BoolSelectComboBox0_4, DimSelectComboBox1_4, OpSelectComboBox1_4, FilterTextField1_4, BoolSelectComboBox1_4, OpSelectComboBox2_4, FilterTextField2_4, BoolSelectComboBox2_4, OpSelectComboBox3_4, FilterTextField3_4};
	static JComponent[] Row5Components = {BoolSelectComboBox0_5, DimSelectComboBox1_5, OpSelectComboBox1_5, FilterTextField1_5, BoolSelectComboBox1_5, OpSelectComboBox2_5, FilterTextField2_5, BoolSelectComboBox2_5, OpSelectComboBox3_5, FilterTextField3_5};
	static JComponent[][] Rows = {Row1Components, Row2Components, Row3Components, Row4Components, Row5Components};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		
		//initialize the GUI
		//yeah everything is hardcoded
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1069, 477);
		WFA_GUI = new JPanel();
		WFA_GUI.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(WFA_GUI);

		WFA_GUI.setLayout(null);
		WFA_GUI.add(SelectMetricComboBox);
		
		
		//Metric and Dim Boxes
		SelectMetricComboBox.setMaximumRowCount(50);
		SelectMetricComboBox.setBounds(98, 11, 132, 20);
		SelectMetricComboBox.setModel(SelectMetricComboBoxModel);
		
		
		//Filter Selection Panel Initialization
		DimSelectComboBox1.setBounds(99, 20, 114, 20);
		FiltersSelectionPanel.add(DimSelectComboBox1);
		DimSelectComboBox1.setModel(DimSelectComboBoxModel1);
		OpSelectComboBox1.setBounds(223, 20, 47, 20);
		FiltersSelectionPanel.add(OpSelectComboBox1);
		BoolSelectComboBox1.setBounds(353, 20, 55, 20);		
		FiltersSelectionPanel.add(BoolSelectComboBox1);
		OpSelectComboBox2.setBounds(418, 20, 47, 20);		
		FiltersSelectionPanel.add(OpSelectComboBox2);
		BoolSelectComboBox2.setBounds(548, 20, 55, 20);		
		FiltersSelectionPanel.add(BoolSelectComboBox2);
		OpSelectComboBox3.setBounds(613, 20, 47, 20);		
		FiltersSelectionPanel.add(OpSelectComboBox3);
		FilterTextField1.setBounds(280, 20, 63, 20);
		FiltersSelectionPanel.add(FilterTextField1);
		FilterTextField2.setBounds(475, 20, 63, 20);
		FiltersSelectionPanel.add(FilterTextField2);
		FilterTextField3.setBounds(670, 20, 63, 20);
		FiltersSelectionPanel.add(FilterTextField3);
		
		BoolSelectComboBox0_2.setBounds(34, 55, 55, 20);
		DimSelectComboBox1_2.setBounds(99, 55, 114, 20);
		DimSelectComboBox1_2.setModel(DimSelectComboBoxModel1_2);
		OpSelectComboBox1_2.setBounds(223, 55, 47, 20);
		BoolSelectComboBox1_2.setBounds(353, 55, 55, 20);
		OpSelectComboBox2_2.setBounds(418, 55, 47, 20);
		BoolSelectComboBox2_2.setBounds(548, 55, 55, 20);
		OpSelectComboBox3_2.setBounds(613, 55, 47, 20);
		FilterTextField1_2.setBounds(280, 55, 63, 20);
		FilterTextField2_2.setBounds(475, 55, 63, 20);
		FilterTextField3_2.setBounds(670, 55, 63, 20);
		
		BoolSelectComboBox0_3.setBounds(34, 90, 55, 20);
		DimSelectComboBox1_3.setBounds(99, 90, 114, 20);
		DimSelectComboBox1_3.setModel(DimSelectComboBoxModel1_3);
		OpSelectComboBox1_3.setBounds(223, 90, 47, 20);
		BoolSelectComboBox1_3.setBounds(353, 90, 55, 20);
		OpSelectComboBox2_3.setBounds(418, 90, 47, 20);
		BoolSelectComboBox2_3.setBounds(548, 90, 55, 20);
		OpSelectComboBox3_3.setBounds(613, 90, 47, 20);
		FilterTextField1_3.setBounds(280, 90, 63, 20);
		FilterTextField2_3.setBounds(475, 90, 63, 20);
		FilterTextField3_3.setBounds(670, 90, 63, 20);
		
		BoolSelectComboBox0_4.setBounds(34, 125, 55, 20);
		DimSelectComboBox1_4.setBounds(99, 125, 114, 20);
		DimSelectComboBox1_4.setModel(DimSelectComboBoxModel1_4);
		OpSelectComboBox1_4.setBounds(223, 125, 47, 20);
		BoolSelectComboBox1_4.setBounds(353, 125, 55, 20);
		OpSelectComboBox2_4.setBounds(418, 125, 47, 20);
		BoolSelectComboBox2_4.setBounds(548, 125, 55, 20);
		OpSelectComboBox3_4.setBounds(613, 125, 47, 20);
		FilterTextField1_4.setBounds(280, 125, 63, 20);
		FilterTextField2_4.setBounds(475, 125, 63, 20);
		FilterTextField3_4.setBounds(670, 125, 63, 20);
		
		BoolSelectComboBox0_5.setBounds(34, 160, 55, 20);
		DimSelectComboBox1_5.setBounds(99, 160, 114, 20);
		DimSelectComboBox1_5.setModel(DimSelectComboBoxModel1_5);
		OpSelectComboBox1_5.setBounds(223, 160, 47, 20);
		BoolSelectComboBox1_5.setBounds(353, 160, 55, 20);
		OpSelectComboBox2_5.setBounds(418, 160, 47, 20);
		BoolSelectComboBox2_5.setBounds(548, 160, 55, 20);
		OpSelectComboBox3_5.setBounds(613, 160, 47, 20);
		FilterTextField1_5.setBounds(280, 160, 63, 20);
		FilterTextField2_5.setBounds(475, 160, 63, 20);
		FilterTextField3_5.setBounds(670, 160, 63, 20);

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		//Trend Data Panel Stuff
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		TrendDataPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Trend Data", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		TrendDataPanel.setBounds(8, 252, 1045, 152);
		WFA_GUI.add(TrendDataPanel);
		TrendDataPanel.setLayout(null);

		SumMetricsStartDisplay.setEditable(false);
		SumMetricsStartDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		SumMetricsStartDisplay.setBounds(91, 44, 75, 25);
		TrendDataPanel.add(SumMetricsStartDisplay);

		SumMetricsEndDisplay.setEditable(false);
		SumMetricsEndDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		SumMetricsEndDisplay.setBounds(176, 44, 75, 25);
		TrendDataPanel.add(SumMetricsEndDisplay);

		SumMetricsActivityDisplay.setEditable(false);
		SumMetricsActivityDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		SumMetricsActivityDisplay.setBounds(261, 44, 75, 25);
		TrendDataPanel.add(SumMetricsActivityDisplay);

		SumDimsStartDisplay.setEditable(false);
		SumDimsStartDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		SumDimsStartDisplay.setBounds(91, 74, 75, 25);
		TrendDataPanel.add(SumDimsStartDisplay);

		SumDimsEndDisplay.setEditable(false);
		SumDimsEndDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		SumDimsEndDisplay.setBounds(176, 74, 75, 25);
		TrendDataPanel.add(SumDimsEndDisplay);

		SumDimsActivityDisplay.setEditable(false);
		SumDimsActivityDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		SumDimsActivityDisplay.setBounds(261, 74, 75, 25);
		TrendDataPanel.add(SumDimsActivityDisplay);

		AverageStartDisplay.setEditable(false);
		AverageStartDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		AverageStartDisplay.setBounds(91, 108, 75, 25);
		TrendDataPanel.add(AverageStartDisplay);

		AverageEndDisplay.setEditable(false);
		AverageEndDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		AverageEndDisplay.setBounds(176, 108, 75, 25);
		TrendDataPanel.add(AverageEndDisplay);

		AverageActivityDisplay.setEditable(false);
		AverageActivityDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		AverageActivityDisplay.setBounds(261, 108, 75, 25);
		TrendDataPanel.add(AverageActivityDisplay);
		
		//Labels
		JLabel StartLabel = new JLabel("Start");
		StartLabel.setBounds(91, 23, 40, 14);
		TrendDataPanel.add(StartLabel);
		
		JLabel EndLabel = new JLabel("End");
		EndLabel.setBounds(176, 23, 47, 14);
		TrendDataPanel.add(EndLabel);
		
		JLabel ActivityLabel = new JLabel("Activity");
		ActivityLabel.setBounds(260, 23, 57, 14);
		TrendDataPanel.add(ActivityLabel);
		
		JLabel SumMetricsLabel = new JLabel("Sum Metrics");
		SumMetricsLabel.setBounds(10, 48, 88, 14);
		TrendDataPanel.add(SumMetricsLabel);
		
		JLabel SumDimsLabel = new JLabel("Sum Dims");
		SumDimsLabel.setBounds(10, 78, 88, 14);
		TrendDataPanel.add(SumDimsLabel);
		
		JLabel AverageLabel = new JLabel("Average");
		AverageLabel.setBounds(10, 112, 88, 14);
		TrendDataPanel.add(AverageLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(353, 26, 682, 107);
		TrendDataPanel.add(scrollPane);
		scrollPane.setViewportView(TrendDataDisplay);
		
		TrendDataDisplay.setEditable(false);
		TrendDataDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		//CSV File Selection Panel
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------			
		SelectCSVFilesPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Select CSV Files", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		SelectCSVFilesPanel.setBounds(8, 69, 222, 172);
		WFA_GUI.add(SelectCSVFilesPanel);
		SelectCSVFilesPanel.setLayout(null);
		
		//add buttons to panel
		SelectStartCSVButton.setBounds(44, 25, 144, 23);
		SelectCSVFilesPanel.add(SelectStartCSVButton);
		SelectEndCSVButton.setBounds(44, 59, 144, 23);
		SelectCSVFilesPanel.add(SelectEndCSVButton);
		SelectActivityCSVButton.setBounds(44, 93, 144, 23);
		SelectCSVFilesPanel.add(SelectActivityCSVButton);
		resetCSVButton.setBounds(44, 127, 144, 23);
		SelectCSVFilesPanel.add(resetCSVButton);
		
		//On-click events for buttons
		
		SelectStartCSVButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//controller gets CSV file
				start = controller.selectCSVFile();
				
				//error checking for invalid file or no file
				if(!(start != null))
					JOptionPane.showMessageDialog(null,"Either you did not select a file, or the file you selected is not a CSV file.","INCORRECT FILETYPE ALERT",JOptionPane.WARNING_MESSAGE);
				else
				{
					//disable button
					SelectStartCSVButton.setEnabled(false);
					
					//if all files selected, load data and generate fields
					if(!SelectStartCSVButton.isEnabled() && !SelectEndCSVButton.isEnabled() && !SelectActivityCSVButton.isEnabled())
					{
						setColumnSource();
					}
				}
			}
		});

		SelectEndCSVButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//controller gets CSV File
				end = controller.selectCSVFile();
				
				//error checking for invalid file or no file
				if(!(end != null))
					JOptionPane.showMessageDialog(null,"Either you did not select a file, or the file you selected is not a CSV file.","INCORRECT FILETYPE ALERT",JOptionPane.WARNING_MESSAGE);
				else
				{				
					//disable button
					SelectEndCSVButton.setEnabled(false);
					
					//if all files selected, load data and generate fields
					if(!SelectStartCSVButton.isEnabled() && !SelectEndCSVButton.isEnabled() && !SelectActivityCSVButton.isEnabled())
					{
						setColumnSource();
					}
				}
			}
		});

		SelectActivityCSVButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//controller gets csv file
				activity = controller.selectCSVFile();
				
				//error checking for invalid file or no file
				if(!(activity != null))
					JOptionPane.showMessageDialog(null,"Either you did not select a file, or the file you selected is not a CSV file.","INCORRECT FILETYPE ALERT",JOptionPane.WARNING_MESSAGE);
				else
				{
					//disable button
					SelectActivityCSVButton.setEnabled(false);
					
					//if all files selected, load data and generate fields
					if(!SelectStartCSVButton.isEnabled() && !SelectEndCSVButton.isEnabled() && !SelectActivityCSVButton.isEnabled())
					{
						setColumnSource();
					}
				}
			}
		});
		
		resetCSVButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//reset all data
				start = new WFAData();
				end = new WFAData();
				activity = new WFAData();
				
				//reset comboboxes
				SelectMetricComboBoxModel.removeAllElements();
				HyperDimensionComboBoxModel.removeAllElements();
				DimSelectComboBoxModel1.removeAllElements();
				DimSelectComboBoxModel1_2.removeAllElements();
				DimSelectComboBoxModel1_3.removeAllElements();
				DimSelectComboBoxModel1_4.removeAllElements();
				DimSelectComboBoxModel1_5.removeAllElements();

				//remove rows from filter selection panel
				while(DimRows > 1)
				{
					DimRows--; 
					removeDimRows(DimRows);
				}
				
				//clear first set of filters
				for(JComponent component : Row1Components)
				{
					if(component instanceof JComboBox)
					{
						JComboBox temp = (JComboBox)component;
						temp.setSelectedIndex(-1);
					}
					else
					{
						JTextField temp = (JTextField)component;
						temp.setText("");
					}
				}
				
				//re-enable buttons
				SelectStartCSVButton.setEnabled(true);
				SelectEndCSVButton.setEnabled(true);
				SelectActivityCSVButton.setEnabled(true);				
			}
		});
		
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------		
		//CSV File Selection Panel
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------			
		FiltersSelectionPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Filters Selection", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		FiltersSelectionPanel.setBounds(240, 14, 813, 227);
		WFA_GUI.add(FiltersSelectionPanel);
		FiltersSelectionPanel.setLayout(null);
		
		addDimsButton.setBounds(756, 55, 47, 23);
		FiltersSelectionPanel.add(addDimsButton);
		removeDimsButton.setBounds(756, 20, 47, 23);

		//button for adding filter rows
		addDimsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				DimRows++;				
				addDimRows(DimRows);
			}
		});

		//button for removing filter rows
		removeDimsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				DimRows--;				
				removeDimRows(DimRows);
			}
		});

		
		FiltersLabel.setBounds(27, 23, 71, 14);
		FiltersSelectionPanel.add(FiltersLabel);

		JLabel lblMetric = new JLabel("Metric:");
		lblMetric.setBounds(10, 14, 46, 14);
		WFA_GUI.add(lblMetric);
		
		
		//button for calculating trend data
		JButton CalculateButton = new JButton("Calculate");
		CalculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				metric = SelectMetricComboBox.getSelectedItem().toString();
				dims = HyperDimensionComboBox.getSelectedItem().toString();
				
				//code to generate operations string
				operations = generateOperationsString();		
				
				
				trend = controller.calculateTrend(operations, metric, dims);
				
				//display information
				SumMetricsStartDisplay.setText("" + dc.format(trend.getStartSumMetric()));
				SumMetricsEndDisplay.setText("" + dc.format(trend.getEndSumMetric()));
				SumMetricsActivityDisplay.setText("" + dc.format(trend.getActivitySumMetric()));
				SumDimsStartDisplay.setText("" + dc.format(trend.getStartSumDims()));
				SumDimsEndDisplay.setText("" + dc.format(trend.getEndSumDims()));
				SumDimsActivityDisplay.setText("" + dc.format(trend.getActivitySumDims()));
				AverageStartDisplay.setText("" + dc.format(trend.getStartAverage()));
				AverageEndDisplay.setText("" + dc.format(trend.getEndAverage()));
				AverageActivityDisplay.setText("" + dc.format(trend.getActivityAverage()));
				
				TrendDataDisplay.setText(controller.generateReport(trend, metric, dims));
			}
		});
		CalculateButton.setBounds(8, 415, 338, 23);
		
		JButton SaveButton = new JButton("Save");
		SaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//save data to file
				String trendReport = controller.generateReport(trend, metric, dims);
				controller.exportData(trendReport);				
			}
		});
		SaveButton.setBounds(362, 415, 691, 23);
		
		WFA_GUI.add(CalculateButton);
		WFA_GUI.add(SaveButton);
		
		JLabel DimensionLabel = new JLabel("Dimension:");
		DimensionLabel.setBounds(10, 45, 78, 14);
		WFA_GUI.add(DimensionLabel);
		
		HyperDimensionComboBox.setMaximumRowCount(50);
		HyperDimensionComboBox.setBounds(98, 42, 132, 20);
		HyperDimensionComboBox.setModel(HyperDimensionComboBoxModel);
		WFA_GUI.add(HyperDimensionComboBox);
	}
	
	/**
	 * Add rows to filter selection panel
	 * 
	 * @param rows number of rows to display
	 */
	private static void addDimRows(int rows)
	{
		//change placement of +/- button
		addDimsButton.setBounds(756, addDimsButton.getY() + 35, 47, 23);
		removeDimsButton.setBounds(756, removeDimsButton.getY() + 35, 47, 23);
		
		//add components
		for(JComponent component : Rows[DimRows-1])
			FiltersSelectionPanel.add(component);
		
		if(DimRows == 5)
			FiltersSelectionPanel.remove(addDimsButton);
		
		FiltersSelectionPanel.add(removeDimsButton);
		
		FiltersSelectionPanel.revalidate();
		FiltersSelectionPanel.repaint();
	}
	
	/**
	 * Remove rows from filter selection panel
	 * 
	 * @param rows number of rows to display
	 */
	private static void removeDimRows(int rows)
	{
		//change placement of +/- buttons
		addDimsButton.setBounds(756, addDimsButton.getY() - 35, 47, 23);
		removeDimsButton.setBounds(756, removeDimsButton.getY() - 35, 47, 23);
		
		//reset filters, then remove components
		for(JComponent component : Rows[DimRows])
		{
			if(component instanceof JComboBox)
			{
				JComboBox temp = (JComboBox)component;
				temp.setSelectedIndex(-1);
			}
			else
			{
				JTextField temp = (JTextField)component;
				temp.setText("");
			}
				
			FiltersSelectionPanel.remove(component);
		}
		
		
		if(DimRows == 1)
			FiltersSelectionPanel.remove(removeDimsButton);
		
		FiltersSelectionPanel.add(addDimsButton);
		
		FiltersSelectionPanel.revalidate();
		FiltersSelectionPanel.repaint();
	}
	
	/**
	 * Generates operations string from filters
	 * 
	 * @return string of operations to be fed to BoolOpExecutor
	 */
	private static String generateOperationsString()
	{
		String operations = "";		
		
		int done = 0;
		
		
		//for each row of filters enables
		for(int j = 0; j < DimRows; j++)
		{
			done = 0;
			String rowDim = "";
			
			//check each component for data
			//if empty, stop generating string for that row
			//else, add operations to the string
			for(int i = 0; i < Rows[j].length; i++)
			{
				
				if(done != 1)
				{
					if(Rows[j][i] instanceof OpSelectJComboBox)
					{
						OpSelectJComboBox OpSelect = (OpSelectJComboBox)Rows[j][i];
						String op = OpSelect.getSelectedItem().toString();
						if(op.equals(" "))
						{
							done = 1;
							continue;
						}
						else
							operations += (rowDim + op + ":");	
					}	
					else if(Rows[j][i] instanceof BoolSelectJComboBox)
					{
						BoolSelectJComboBox BoolSelect = (BoolSelectJComboBox)Rows[j][i];
						String bool = BoolSelect.getSelectedItem().toString();
						if(bool.equals(" "))
						{
							done = 1;
							continue;
						}
						else
							operations += ("::" + bool + "::");	
					}
					else if(Rows[j][i] instanceof LBoolSelectJComboBox)
					{
						LBoolSelectJComboBox LBoolSelect = (LBoolSelectJComboBox)Rows[j][i];
						String bool = LBoolSelect.getSelectedItem().toString();
						if(bool.equals(" "))
						{
							done = 1;
							continue;
						}
						else
							operations += ("&&&" + bool + "&&&");	
					}
					else if(Rows[j][i] instanceof JTextField)
					{
						JTextField Filter = (JTextField)Rows[j][i];
						String filter = Filter.getText();
						if(filter.equals(""))
						{
							done = 1;
							continue;
						}
						else
							operations += filter;
						
					}
					else
					{
						JComboBox DimSelect = (JComboBox)Rows[j][i];
						String dim = DimSelect.getSelectedItem().toString();
						if(dim.equals(""))
						{
							done = 1;
							continue;
						}
						else
							rowDim = dim + ":";
					}
				}
			}		
		}
		return operations;		
	}
	
	/**
	 * creates internal WFAPeriod and sets comboboxes
	 */
	private static void setColumnSource()
	{	
		ArrayList<String> columns = new ArrayList<String>();
		columns.addAll(start.getColumns());

/*		Code to remove extra activity columns
 * 		doesnt work at the moment so commented out
 
  		ArrayList<String> activityColumns = new ArrayList<String>();
		ArrayList<ArrayList<String>> activityEntries = new ArrayList<ArrayList<String>>();
		
		activityColumns.addAll(activity.getColumns());
		activityEntries.addAll(activity.getEntries());
		
		for(int i = 0; i < columns.size(); i++)
		{
			if(columns.get(i) != activityColumns.get(i))
			{
				activityColumns.remove(i);
				activityEntries.remove(i);
				i--;
			}				
		}
		
		activity.setColumns(activityColumns);
		activity.setEntries(activityEntries);*/
		controller.createWFAPeriod(start, end, activity);
		
		setComboBox(SelectMetricComboBoxModel, columns); 
		setComboBox(HyperDimensionComboBoxModel, columns);
		
		columns.add(0, "");
		
		setComboBox(DimSelectComboBoxModel1, columns);
		setComboBox(DimSelectComboBoxModel1_2, columns);
		setComboBox(DimSelectComboBoxModel1_3, columns);
		setComboBox(DimSelectComboBoxModel1_4, columns);
		setComboBox(DimSelectComboBoxModel1_5, columns);
	}
	
	/**
	 * Sets up rows for specified combobox
	 * 
	 * @param box ComboBoxModel to set rows for
	 * @param columns columns from data files
	 */
	private static void setComboBox(DefaultComboBoxModel<String> box, ArrayList<String> columns)
	{
		box.removeAllElements();
		for(String metric : columns)
		{
			box.addElement(metric);		
		}
	}
}

