package Presentation;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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


public class GUI extends JFrame {

	private JPanel WFA_GUI;

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
		setBounds(100, 100, 953, 416);
		WFA_GUI = new JPanel();
		WFA_GUI.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(WFA_GUI);
		
		JComboBox SelectMetricComboBox = new JComboBox();
		SelectMetricComboBox.setBounds(55, 11, 175, 20);
		
		JButton CalculateButton = new JButton("Calculate");
		CalculateButton.setBounds(8, 350, 283, 23);
		
		JButton SaveButton = new JButton("Save");
		SaveButton.setBounds(301, 350, 636, 23);
		WFA_GUI.setLayout(null);
		WFA_GUI.add(SelectMetricComboBox);
		WFA_GUI.add(CalculateButton);
		WFA_GUI.add(SaveButton);
		
		JPanel TrendDataPanel = new JPanel();
		TrendDataPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Trend Data", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		TrendDataPanel.setBounds(8, 192, 929, 147);
		WFA_GUI.add(TrendDataPanel);
		TrendDataPanel.setLayout(null);
		
		JTextArea SumMetricsStartDisplay = new JTextArea();
		SumMetricsStartDisplay.setEditable(false);
		SumMetricsStartDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		SumMetricsStartDisplay.setBounds(81, 44, 57, 23);
		TrendDataPanel.add(SumMetricsStartDisplay);
		
		JTextArea SumMetricsEndDisplay = new JTextArea();
		SumMetricsEndDisplay.setEditable(false);
		SumMetricsEndDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		SumMetricsEndDisplay.setBounds(148, 44, 57, 23);
		TrendDataPanel.add(SumMetricsEndDisplay);
		
		JTextArea SumMetricsActivityDisplay = new JTextArea();
		SumMetricsActivityDisplay.setEditable(false);
		SumMetricsActivityDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		SumMetricsActivityDisplay.setBounds(215, 44, 57, 23);
		TrendDataPanel.add(SumMetricsActivityDisplay);
		
		JTextArea SumDimsStartDisplay = new JTextArea();
		SumDimsStartDisplay.setEditable(false);
		SumDimsStartDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		SumDimsStartDisplay.setBounds(81, 74, 57, 23);
		TrendDataPanel.add(SumDimsStartDisplay);
		
		JTextArea SumDimsEndDisplay = new JTextArea();
		SumDimsEndDisplay.setEditable(false);
		SumDimsEndDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		SumDimsEndDisplay.setBounds(148, 74, 57, 23);
		TrendDataPanel.add(SumDimsEndDisplay);
		
		JTextArea SumDimsActivityDisplay = new JTextArea();
		SumDimsActivityDisplay.setEditable(false);
		SumDimsActivityDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		SumDimsActivityDisplay.setBounds(215, 74, 57, 23);
		TrendDataPanel.add(SumDimsActivityDisplay);
		
		JTextArea AverageStartDisplay = new JTextArea();
		AverageStartDisplay.setEditable(false);
		AverageStartDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		AverageStartDisplay.setBounds(81, 108, 57, 23);
		TrendDataPanel.add(AverageStartDisplay);
		
		JTextArea AverageEndDisplay = new JTextArea();
		AverageEndDisplay.setEditable(false);
		AverageEndDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		AverageEndDisplay.setBounds(148, 107, 57, 23);
		TrendDataPanel.add(AverageEndDisplay);
		
		JTextArea ActivityAverageDisplay = new JTextArea();
		ActivityAverageDisplay.setEditable(false);
		ActivityAverageDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		ActivityAverageDisplay.setBounds(215, 107, 57, 23);
		TrendDataPanel.add(ActivityAverageDisplay);
		
		JLabel StartLabel = new JLabel("Start");
		StartLabel.setBounds(81, 23, 24, 14);
		TrendDataPanel.add(StartLabel);
		
		JLabel EndLabel = new JLabel("End");
		EndLabel.setBounds(148, 23, 24, 14);
		TrendDataPanel.add(EndLabel);
		
		JLabel ActivityLabel = new JLabel("Activity");
		ActivityLabel.setBounds(215, 23, 57, 14);
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
		
		JTextArea TrendDataDisplay = new JTextArea();
		TrendDataDisplay.setEditable(false);
		TrendDataDisplay.setBorder(new LineBorder(new Color(0, 0, 0)));
		TrendDataDisplay.setBounds(294, 19, 625, 115);
		TrendDataPanel.add(TrendDataDisplay);
		
		JPanel SelectCSVFilesPanel = new JPanel();
		SelectCSVFilesPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Select CSV Files", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		SelectCSVFilesPanel.setBounds(8, 42, 222, 139);
		WFA_GUI.add(SelectCSVFilesPanel);
		SelectCSVFilesPanel.setLayout(null);
		
		JButton SelectStartCSVButton = new JButton("Select Start CSV");
		SelectStartCSVButton.setBounds(44, 25, 128, 23);
		SelectCSVFilesPanel.add(SelectStartCSVButton);
		
		JButton SelectEndCSVButton = new JButton("Select End CSV");
		SelectEndCSVButton.setBounds(44, 59, 128, 23);
		SelectCSVFilesPanel.add(SelectEndCSVButton);
		
		JButton SelectActivityCSVButton = new JButton("Select Activity CSV");
		SelectActivityCSVButton.setBounds(44, 93, 128, 23);
		SelectCSVFilesPanel.add(SelectActivityCSVButton);
		
		JPanel DimensionsSelectionPanel = new JPanel();
		DimensionsSelectionPanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Dimensions Selection", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		DimensionsSelectionPanel.setBounds(240, 11, 697, 170);
		WFA_GUI.add(DimensionsSelectionPanel);
		DimensionsSelectionPanel.setLayout(null);
		
		JLabel DimensionsLabel = new JLabel("Dimensions:");
		DimensionsLabel.setBounds(10, 22, 71, 14);
		DimensionsSelectionPanel.add(DimensionsLabel);
		
		JComboBox DimSelectComboBox1 = new JComboBox();
		DimSelectComboBox1.setBounds(79, 19, 91, 20);
		DimensionsSelectionPanel.add(DimSelectComboBox1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(180, 19, 41, 20);
		DimensionsSelectionPanel.add(comboBox_1);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(646, 18, 41, 23);
		DimensionsSelectionPanel.add(btnNewButton);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(231, 19, 91, 20);
		DimensionsSelectionPanel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(332, 19, 41, 20);
		DimensionsSelectionPanel.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(383, 19, 91, 20);
		DimensionsSelectionPanel.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(484, 19, 41, 20);
		DimensionsSelectionPanel.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(535, 19, 91, 20);
		DimensionsSelectionPanel.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(79, 47, 91, 20);
		DimensionsSelectionPanel.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(180, 47, 41, 20);
		DimensionsSelectionPanel.add(comboBox_8);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setEditable(true);
		comboBox_9.setBounds(231, 47, 91, 20);
		DimensionsSelectionPanel.add(comboBox_9);
		
		JLabel lblMetric = new JLabel("Metric:");
		lblMetric.setBounds(10, 14, 46, 14);
		WFA_GUI.add(lblMetric);
	}
}
