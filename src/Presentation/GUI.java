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
import java.util.ArrayList;
import javax.swing.JTextField;


public class GUI extends JFrame {

	private JPanel WFA_GUI;
	private Trend trend = new Trend();
	private static Controller controller = Controller.getInstance();
	private static WFAData start = new WFAData();
	private static WFAData end = new WFAData();
	private static WFAData activity = new WFAData();
	private String operations = "";
	private static String metric = "";
	private String dims = "";	
	static int DimRows = 1;
	private static String[] ComboBoxOps = new String[] {" ", "=", ">", "<", "!="};
	private static String[] ComboBoxBools = new String[] {" ", "AND", "OR"};
		
	static DefaultComboBoxModel<String> SelectMetricComboBoxModel = new DefaultComboBoxModel<String>();
	static DefaultComboBoxModel<String> DimSelectComboBoxModel1 = new DefaultComboBoxModel<String>();
	static DefaultComboBoxModel<String> DimSelectComboBoxModel1_2 = new DefaultComboBoxModel<String>();
	static DefaultComboBoxModel<String> DimSelectComboBoxModel1_3 = new DefaultComboBoxModel<String>();
	static DefaultComboBoxModel<String> DimSelectComboBoxModel1_4 = new DefaultComboBoxModel<String>();
	static DefaultComboBoxModel<String> DimSelectComboBoxModel1_5 = new DefaultComboBoxModel<String>();
	JComboBox<String> SelectMetricComboBox = new JComboBox<String>();
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
	static JPanel DimensionsSelectionPanel = new JPanel();
	JLabel DimensionsLabel = new JLabel("Dimensions:");
	static JButton addDimsButton = new JButton("+");
	static JButton removeDimsButton = new JButton("-");
	
	static JComboBox DimSelectComboBox1 = new JComboBox();
	static JComboBox OpSelectComboBox1 = new JComboBox(ComboBoxOps);
	static JTextField FilterTextField1 = new JTextField("");
	static JComboBox BoolSelectComboBox1 = new JComboBox(ComboBoxBools);
	static JComboBox OpSelectComboBox2 = new JComboBox(ComboBoxOps);
	static JTextField FilterTextField2 = new JTextField("");
	static JComboBox BoolSelectComboBox2 = new JComboBox(ComboBoxBools);
	static JComboBox OpSelectComboBox3 = new JComboBox(ComboBoxOps);	
	static JTextField FilterTextField3 = new JTextField("");
	
	static JComboBox BoolSelectComboBox0_2 = new JComboBox(ComboBoxBools);
	static JComboBox DimSelectComboBox1_2 = new JComboBox();
	static JComboBox OpSelectComboBox1_2 = new JComboBox(ComboBoxOps);
	static JTextField FilterTextField1_2 = new JTextField("");
	static JComboBox BoolSelectComboBox1_2 = new JComboBox(ComboBoxBools);
	static JComboBox OpSelectComboBox2_2 = new JComboBox(ComboBoxOps);
	static JTextField FilterTextField2_2 = new JTextField("");
	static JComboBox BoolSelectComboBox2_2 = new JComboBox(ComboBoxBools);
	static JComboBox OpSelectComboBox3_2 = new JComboBox(ComboBoxOps);	
	static JTextField FilterTextField3_2 = new JTextField("");
	
	static JComboBox BoolSelectComboBox0_3 = new JComboBox(ComboBoxBools);
	static JComboBox DimSelectComboBox1_3 = new JComboBox();
	static JComboBox OpSelectComboBox1_3 = new JComboBox(ComboBoxOps);
	static JTextField FilterTextField1_3 = new JTextField("");
	static JComboBox BoolSelectComboBox1_3 = new JComboBox(ComboBoxBools);
	static JComboBox OpSelectComboBox2_3 = new JComboBox(ComboBoxOps);
	static JTextField FilterTextField2_3 = new JTextField("");
	static JComboBox BoolSelectComboBox2_3 = new JComboBox(ComboBoxBools);
	static JComboBox OpSelectComboBox3_3 = new JComboBox(ComboBoxOps);	
	static JTextField FilterTextField3_3 = new JTextField("");
	
	static JComboBox BoolSelectComboBox0_4 = new JComboBox(ComboBoxBools);
	static JComboBox DimSelectComboBox1_4 = new JComboBox();
	static JComboBox OpSelectComboBox1_4 = new JComboBox(ComboBoxOps);
	static JTextField FilterTextField1_4 = new JTextField("");
	static JComboBox BoolSelectComboBox1_4 = new JComboBox(ComboBoxBools);
	static JComboBox OpSelectComboBox2_4 = new JComboBox(ComboBoxOps);
	static JTextField FilterTextField2_4 = new JTextField("");
	static JComboBox BoolSelectComboBox2_4 = new JComboBox(ComboBoxBools);
	static JComboBox OpSelectComboBox3_4 = new JComboBox(ComboBoxOps);	
	static JTextField FilterTextField3_4 = new JTextField("");
	
	static JComboBox BoolSelectComboBox0_5 = new JComboBox(ComboBoxBools);
	static JComboBox DimSelectComboBox1_5 = new JComboBox();
	static JComboBox OpSelectComboBox1_5 = new JComboBox(ComboBoxOps);
	static JTextField FilterTextField1_5 = new JTextField("");
	static JComboBox BoolSelectComboBox1_5 = new JComboBox(ComboBoxBools);
	static JComboBox OpSelectComboBox2_5 = new JComboBox(ComboBoxOps);
	static JTextField FilterTextField2_5 = new JTextField("");
	static JComboBox BoolSelectComboBox2_5 = new JComboBox(ComboBoxBools);
	static JComboBox OpSelectComboBox3_5 = new JComboBox(ComboBoxOps);	
	static JTextField FilterTextField3_5 = new JTextField("");


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
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1069, 452);
		WFA_GUI = new JPanel();
		WFA_GUI.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(WFA_GUI);

		WFA_GUI.setLayout(null);
		WFA_GUI.add(SelectMetricComboBox);
		
		SelectMetricComboBox.setMaximumRowCount(30);
		SelectMetricComboBox.setBounds(55, 11, 175, 20);
		SelectMetricComboBox.setModel(SelectMetricComboBoxModel);
		
		DimSelectComboBox1.setBounds(99, 20, 114, 20);
		DimensionsSelectionPanel.add(DimSelectComboBox1);
		DimSelectComboBox1.setModel(DimSelectComboBoxModel1);
		OpSelectComboBox1.setBounds(223, 20, 47, 20);
		DimensionsSelectionPanel.add(OpSelectComboBox1);
		BoolSelectComboBox1.setBounds(353, 20, 55, 20);		
		DimensionsSelectionPanel.add(BoolSelectComboBox1);
		OpSelectComboBox2.setBounds(418, 20, 47, 20);		
		DimensionsSelectionPanel.add(OpSelectComboBox2);
		BoolSelectComboBox2.setBounds(548, 20, 55, 20);		
		DimensionsSelectionPanel.add(BoolSelectComboBox2);
		OpSelectComboBox3.setBounds(613, 20, 47, 20);		
		DimensionsSelectionPanel.add(OpSelectComboBox3);
		FilterTextField1.setBounds(280, 20, 63, 20);
		DimensionsSelectionPanel.add(FilterTextField1);
		FilterTextField2.setBounds(475, 20, 63, 20);
		DimensionsSelectionPanel.add(FilterTextField2);
		FilterTextField3.setBounds(670, 20, 63, 20);
		DimensionsSelectionPanel.add(FilterTextField3);
		
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

		TrendDataPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Trend Data", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		TrendDataPanel.setBounds(8, 225, 1045, 152);
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

		TrendDataDisplay.setEditable(false);
		TrendDataDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		TrendDataDisplay.setBounds(353, 19, 682, 114);
		TrendDataPanel.add(TrendDataDisplay);

		SelectCSVFilesPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Select CSV Files", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		SelectCSVFilesPanel.setBounds(8, 42, 222, 172);
		WFA_GUI.add(SelectCSVFilesPanel);
		SelectCSVFilesPanel.setLayout(null);

		SelectStartCSVButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				start = controller.selectCSVFile();
				SelectStartCSVButton.setEnabled(false);
				
				if(!SelectStartCSVButton.isEnabled() && !SelectEndCSVButton.isEnabled() && !SelectActivityCSVButton.isEnabled())
				{
					setComboBox(SelectMetricComboBoxModel); 
					setComboBox(DimSelectComboBoxModel1);
				}
			}
		});
		SelectStartCSVButton.setBounds(44, 25, 144, 23);
		SelectCSVFilesPanel.add(SelectStartCSVButton);

		SelectEndCSVButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				end = controller.selectCSVFile();
				SelectEndCSVButton.setEnabled(false);
				
				if(!SelectStartCSVButton.isEnabled() && !SelectEndCSVButton.isEnabled() && !SelectActivityCSVButton.isEnabled())
				{
					setComboBox(SelectMetricComboBoxModel); 
					setComboBox(DimSelectComboBoxModel1);
				}
			}
		});
		SelectEndCSVButton.setBounds(44, 59, 144, 23);
		SelectCSVFilesPanel.add(SelectEndCSVButton);

		SelectActivityCSVButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activity = controller.selectCSVFile();
				SelectActivityCSVButton.setEnabled(false);
				
				if(!SelectStartCSVButton.isEnabled() && !SelectEndCSVButton.isEnabled() && !SelectActivityCSVButton.isEnabled())
				{
					setComboBox(SelectMetricComboBoxModel); 
					setComboBox(DimSelectComboBoxModel1);
				}
			}
		});
		SelectActivityCSVButton.setBounds(44, 93, 144, 23);
		SelectCSVFilesPanel.add(SelectActivityCSVButton);
		
		JButton resetCSVButton = new JButton("Reset CSV Files");
		resetCSVButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				start = new WFAData();
				end = new WFAData();
				activity = new WFAData();
				
				SelectMetricComboBoxModel.removeAllElements();
				DimSelectComboBoxModel1.removeAllElements();

				while(DimRows > 1)
				{
					DimRows--; 
					removeDimRows(DimRows);
				}
				
				SelectStartCSVButton.setEnabled(true);
				SelectEndCSVButton.setEnabled(true);
				SelectActivityCSVButton.setEnabled(true);				
			}
		});
		resetCSVButton.setBounds(44, 127, 144, 23);
		SelectCSVFilesPanel.add(resetCSVButton);

		DimensionsSelectionPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Dimensions Selection", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		DimensionsSelectionPanel.setBounds(240, 14, 813, 203);
		WFA_GUI.add(DimensionsSelectionPanel);
		DimensionsSelectionPanel.setLayout(null);

		addDimsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				DimRows++;				
				addDimRows(DimRows);
			}
		});
		addDimsButton.setBounds(756, 19, 47, 23);
		DimensionsSelectionPanel.add(addDimsButton);
		
		removeDimsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				DimRows--;				
				removeDimRows(DimRows);
			}
		});
		removeDimsButton.setBounds(756, -15, 47, 23);
		
		DimensionsLabel.setBounds(10, 22, 71, 14);
		DimensionsSelectionPanel.add(DimensionsLabel);

		
		JLabel lblMetric = new JLabel("Metric:");
		lblMetric.setBounds(10, 14, 46, 14);
		WFA_GUI.add(lblMetric);
		
		
		JButton CalculateButton = new JButton("Calculate");
		CalculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				metric = SelectMetricComboBox.getSelectedItem().toString();
				dims = DimSelectComboBox1.getSelectedItem().toString();
				trend = controller.calculateTrend(operations, metric, dims);
				
				SumMetricsStartDisplay.setText("" + trend.getStartSumMetric());
				SumMetricsEndDisplay.setText("" + trend.getEndSumMetric());
				SumMetricsActivityDisplay.setText("" + trend.getActivitySumMetric());
				SumDimsStartDisplay.setText("" + trend.getStartSumDims());
				SumDimsEndDisplay.setText("" + trend.getEndSumDims());
				SumDimsActivityDisplay.setText("" + trend.getActivitySumDims());
				AverageStartDisplay.setText("" + trend.getStartAverage());
				AverageEndDisplay.setText("" + trend.getEndAverage());
				AverageActivityDisplay.setText("" + trend.getActivityAverage());
				
				TrendDataDisplay.setText(controller.generateReport(trend, metric, dims));
				
				//operations = string generated by comboboxes
			}
		});
		CalculateButton.setBounds(8, 388, 333, 23);
		
		JButton SaveButton = new JButton("Save");
		SaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String trendReport = controller.generateReport(trend, metric, dims);
				controller.exportData(trendReport);				
			}
		});
		SaveButton.setBounds(364, 388, 677, 23);
		
		WFA_GUI.add(CalculateButton);
		WFA_GUI.add(SaveButton);
	}
	
	private static void addDimRows(int rows)
	{
		addDimsButton.setBounds(756, addDimsButton.getY() + 35, 47, 23);
		removeDimsButton.setBounds(756, removeDimsButton.getY() + 35, 47, 23);
		
		switch(DimRows) {		
		case 2:			
			DimensionsSelectionPanel.add(BoolSelectComboBox0_2);
			DimensionsSelectionPanel.add(DimSelectComboBox1_2);
			setComboBox(DimSelectComboBoxModel1_2);
			DimensionsSelectionPanel.add(OpSelectComboBox1_2);	
			DimensionsSelectionPanel.add(BoolSelectComboBox1_2);	
			DimensionsSelectionPanel.add(OpSelectComboBox2_2);		
			DimensionsSelectionPanel.add(BoolSelectComboBox2_2);
			DimensionsSelectionPanel.add(OpSelectComboBox3_2);
			DimensionsSelectionPanel.add(FilterTextField1_2);
			DimensionsSelectionPanel.add(FilterTextField2_2);
			DimensionsSelectionPanel.add(FilterTextField3_2);
			break;
			
		case 3:
			DimensionsSelectionPanel.add(BoolSelectComboBox0_3);
			DimensionsSelectionPanel.add(DimSelectComboBox1_3);
			setComboBox(DimSelectComboBoxModel1_3);
			DimensionsSelectionPanel.add(OpSelectComboBox1_3);	
			DimensionsSelectionPanel.add(BoolSelectComboBox1_3);	
			DimensionsSelectionPanel.add(OpSelectComboBox2_3);		
			DimensionsSelectionPanel.add(BoolSelectComboBox2_3);
			DimensionsSelectionPanel.add(OpSelectComboBox3_3);
			DimensionsSelectionPanel.add(FilterTextField1_3);
			DimensionsSelectionPanel.add(FilterTextField2_3);
			DimensionsSelectionPanel.add(FilterTextField3_3);	
			break;
			
		case 4:
			DimensionsSelectionPanel.add(BoolSelectComboBox0_4);
			DimensionsSelectionPanel.add(DimSelectComboBox1_4);
			setComboBox(DimSelectComboBoxModel1_4);
			DimensionsSelectionPanel.add(OpSelectComboBox1_4);	
			DimensionsSelectionPanel.add(BoolSelectComboBox1_4);	
			DimensionsSelectionPanel.add(OpSelectComboBox2_4);		
			DimensionsSelectionPanel.add(BoolSelectComboBox2_4);
			DimensionsSelectionPanel.add(OpSelectComboBox3_4);
			DimensionsSelectionPanel.add(FilterTextField1_4);
			DimensionsSelectionPanel.add(FilterTextField2_4);
			DimensionsSelectionPanel.add(FilterTextField3_4);	
			break;		
			
		case 5:
			DimensionsSelectionPanel.add(BoolSelectComboBox0_5);
			DimensionsSelectionPanel.add(DimSelectComboBox1_5);
			setComboBox(DimSelectComboBoxModel1_5);
			DimensionsSelectionPanel.add(OpSelectComboBox1_5);	
			DimensionsSelectionPanel.add(BoolSelectComboBox1_5);	
			DimensionsSelectionPanel.add(OpSelectComboBox2_5);		
			DimensionsSelectionPanel.add(BoolSelectComboBox2_5);
			DimensionsSelectionPanel.add(OpSelectComboBox3_5);
			DimensionsSelectionPanel.add(FilterTextField1_5);
			DimensionsSelectionPanel.add(FilterTextField2_5);
			DimensionsSelectionPanel.add(FilterTextField3_5);
			DimensionsSelectionPanel.remove(addDimsButton);
			break;
		}
		
		DimensionsSelectionPanel.add(removeDimsButton);
		
		DimensionsSelectionPanel.revalidate();
		DimensionsSelectionPanel.repaint();
	}
	
	private static void removeDimRows(int rows)
	{
		addDimsButton.setBounds(756, addDimsButton.getY() - 35, 47, 23);
		removeDimsButton.setBounds(756, removeDimsButton.getY() - 35, 47, 23);
		
		switch(DimRows) {		
		case 1:
			DimensionsSelectionPanel.remove(BoolSelectComboBox0_2);
			DimensionsSelectionPanel.remove(DimSelectComboBox1_2);
			DimSelectComboBoxModel1_2.removeAllElements();
			DimensionsSelectionPanel.remove(OpSelectComboBox1_2);	
			DimensionsSelectionPanel.remove(BoolSelectComboBox1_2);	
			DimensionsSelectionPanel.remove(OpSelectComboBox2_2);		
			DimensionsSelectionPanel.remove(BoolSelectComboBox2_2);
			DimensionsSelectionPanel.remove(OpSelectComboBox3_2);
			DimensionsSelectionPanel.remove(FilterTextField1_2);
			DimensionsSelectionPanel.remove(FilterTextField2_2);
			DimensionsSelectionPanel.remove(FilterTextField3_2);
			DimensionsSelectionPanel.remove(removeDimsButton);
			break;
			
		case 2:
			DimensionsSelectionPanel.remove(BoolSelectComboBox0_3);
			DimensionsSelectionPanel.remove(DimSelectComboBox1_3);
			DimSelectComboBoxModel1_3.removeAllElements();
			DimensionsSelectionPanel.remove(OpSelectComboBox1_3);	
			DimensionsSelectionPanel.remove(BoolSelectComboBox1_3);	
			DimensionsSelectionPanel.remove(OpSelectComboBox2_3);		
			DimensionsSelectionPanel.remove(BoolSelectComboBox2_3);
			DimensionsSelectionPanel.remove(OpSelectComboBox3_3);
			DimensionsSelectionPanel.remove(FilterTextField1_3);
			DimensionsSelectionPanel.remove(FilterTextField2_3);
			DimensionsSelectionPanel.remove(FilterTextField3_3);	
			break;
			
		case 3:
			DimensionsSelectionPanel.remove(BoolSelectComboBox0_4);
			DimensionsSelectionPanel.remove(DimSelectComboBox1_4);
			DimSelectComboBoxModel1_4.removeAllElements();
			DimensionsSelectionPanel.remove(OpSelectComboBox1_4);	
			DimensionsSelectionPanel.remove(BoolSelectComboBox1_4);	
			DimensionsSelectionPanel.remove(OpSelectComboBox2_4);		
			DimensionsSelectionPanel.remove(BoolSelectComboBox2_4);
			DimensionsSelectionPanel.remove(OpSelectComboBox3_4);
			DimensionsSelectionPanel.remove(FilterTextField1_4);
			DimensionsSelectionPanel.remove(FilterTextField2_4);
			DimensionsSelectionPanel.remove(FilterTextField3_4);	
			break;	
			
		case 4:
			DimensionsSelectionPanel.remove(BoolSelectComboBox0_5);
			DimensionsSelectionPanel.remove(DimSelectComboBox1_5);
			DimSelectComboBoxModel1_5.removeAllElements();
			DimensionsSelectionPanel.remove(OpSelectComboBox1_5);	
			DimensionsSelectionPanel.remove(BoolSelectComboBox1_5);	
			DimensionsSelectionPanel.remove(OpSelectComboBox2_5);		
			DimensionsSelectionPanel.remove(BoolSelectComboBox2_5);
			DimensionsSelectionPanel.remove(OpSelectComboBox3_5);
			DimensionsSelectionPanel.remove(FilterTextField1_5);
			DimensionsSelectionPanel.remove(FilterTextField2_5);
			DimensionsSelectionPanel.remove(FilterTextField3_5);
			break;
		}
		
		DimensionsSelectionPanel.add(addDimsButton);
		
		DimensionsSelectionPanel.revalidate();
		DimensionsSelectionPanel.repaint();
	}
	
	
	
	private static void setComboBox(DefaultComboBoxModel box)
	{
		//controller.createWFAPeriod(start, end, activity);
		
		ArrayList<String> columns = new ArrayList<String>();
		
		columns.addAll(start.getColumns());
		
		//insert some sort of column checking/filtering here
		
		box.removeAllElements();
		for(String metric : columns)
		{
			box.addElement(metric);		
		}
	}
}
