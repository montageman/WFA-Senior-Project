package testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileDialogTest {
	
	public class WFAData {
	    
	    protected ArrayList<String> columns;		//## attribute columns 
	    
	    protected ArrayList<ArrayList<String>> entries;		//## attribute entries 
	    
	    
	    // Constructors
	    
	    //## auto_generated 
	    public WFAData() {
	    	columns = new ArrayList<String>();
	    	entries = new ArrayList<ArrayList<String>>();
	    }
	    
	    //## auto_generated 
	    public ArrayList<String> getColumns() {
	        return columns;
	    }
	    
	    //## auto_generated 
	    public void setColumns(ArrayList<String> p_columns) {
	        columns = p_columns;
	    }
	    
	    //## auto_generated 
	    public ArrayList<ArrayList<String>> getEntries() {
	        return entries;
	    }
	    
	    //## auto_generated 
	    public void setEntries(ArrayList<ArrayList<String>> p_entries) {
	        entries = p_entries;
	    }
	    
	}

	public class WFAPeriod {
	    
	    protected WFAData activity;		//## attribute activity 
	    
	    protected WFAData end;		//## attribute end 
	    
	    protected WFAData start;		//## attribute start 
	    
	    
	    // Constructors

	    public  WFAPeriod() {
	    	start = new WFAData();
	    	end = new WFAData();
	    	activity = new WFAData();
	    }
	    //## auto_generated 
	    public  WFAPeriod(WFAData start, WFAData end, WFAData activity) {
	    	this.start = start;
	    	this.end = end;
	    	this.activity = activity;
	    }
	    
	    //## auto_generated 
	    public WFAData getActivity() {
	        return activity;
	    }
	    
	    //## auto_generated 
	    public void setActivity(WFAData p_activity) {
	        activity = p_activity;
	    }
	    
	    //## auto_generated 
	    public WFAData getEnd() {
	        return end;
	    }
	    
	    //## auto_generated 
	    public void setEnd(WFAData p_end) {
	        end = p_end;
	    }
	    
	    //## auto_generated 
	    public WFAData getStart() {
	        return start;
	    }
	    
	    //## auto_generated 
	    public void setStart(WFAData p_start) {
	        start = p_start;
	    }
	    
	}

	public class Trend {
	    
	    protected double activityAverage;		//## attribute activityAverage 
	    
	    protected double activitySumDims;		//## attribute activitySumDums 
	    
	    protected double activitySumMetric;		//## attribute activitySumMetric 
	    
	    protected double endAverage;		//## attribute endAverage 
	    
	    protected double endSumDims;		//## attribute endSumDims 
	    
	    protected double endSumMetric;		//## attribute endSumMetrc 
	    
	    protected double startAverage;		//## attribute startAverage 
	    
	    protected double startSumDims;		//## attribute startSumDims 
	    
	    protected double startSumMetric;		//## attribute startSumMetric 
	    
	    
	    // Constructors
	    
	    //## auto_generated 
	    public  Trend() {
	    	activityAverage = 0.0;
	    	activitySumDims = 0.0;
	    	activitySumMetric = 0.0;
	    	endAverage = 0.0;
	    	endSumDims = 0.0;
	    	endSumMetric = 0.0;
	    	startAverage = 0.0;
	    	startSumDims = 0.0;
	    	startSumMetric = 0.0;
	    }
	    
	    //## auto_generated 
	    public double getActivityAverage() {
	        return activityAverage;
	    }
	    
	    //## auto_generated 
	    public void setActivityAverage(double p_activityAverage) {
	        activityAverage = p_activityAverage;
	    }
	    
	    //## auto_generated 
	    public double getActivitySumDims() {
	        return activitySumDims;
	    }
	    
	    //## auto_generated 
	    public void setActivitySumDims(double p_activitySumDims) {
	        activitySumDims = p_activitySumDims;
	    }
	    
	    //## auto_generated 
	    public double getActivitySumMetric() {
	        return activitySumMetric;
	    }
	    
	    //## auto_generated 
	    public void setActivitySumMetric(double p_activitySumMetric) {
	        activitySumMetric = p_activitySumMetric;
	    }
	    
	    //## auto_generated 
	    public double getEndAverage() {
	        return endAverage;
	    }
	    
	    //## auto_generated 
	    public void setEndAverage(double p_endAverage) {
	        endAverage = p_endAverage;
	    }
	    
	    //## auto_generated 
	    public double getEndSumDims() {
	        return endSumDims;
	    }
	    
	    //## auto_generated 
	    public void setEndSumDims(double p_endSumDims) {
	        endSumDims = p_endSumDims;
	    }
	    
	    //## auto_generated 
	    public double getEndSumMetric() {
	        return endSumMetric;
	    }
	    
	    //## auto_generated 
	    public void setEndSumMetric(double p_endSumMetrc) {
	        endSumMetric = p_endSumMetrc;
	    }
	    
	    //## auto_generated 
	    public double getStartAverage() {
	        return startAverage;
	    }
	    
	    //## auto_generated 
	    public void setStartAverage(double p_startAverage) {
	        startAverage = p_startAverage;
	    }
	    
	    //## auto_generated 
	    public double getStartSumDims() {
	        return startSumDims;
	    }
	    
	    //## auto_generated 
	    public void setStartSumDims(double p_startSumDims) {
	        startSumDims = p_startSumDims;
	    }
	    
	    //## auto_generated 
	    public double getStartSumMetric() {
	        return startSumMetric;
	    }
	    
	    //## auto_generated 
	    public void setStartSumMetric(double p_startSumMetric) {
	        startSumMetric = p_startSumMetric;
	    }
	    
	}

    public WFAData selectCSVFile() {
		WFAData data = new WFAData();
		
		//create a new file chooser and set it's default directory
		JFileChooser chooser = new JFileChooser();
	    
		//set default directory and filter of the chooser
	    chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
	    chooser.setFileFilter(new FileNameExtensionFilter("CSV Files", "csv"));
	    
	    //show file chooser
	    int fileSelected = chooser.showOpenDialog(null);
	    
	    //check if file was selected, process file if so
	    if(fileSelected == JFileChooser.APPROVE_OPTION) {
	    	ArrayList<String> lines = new ArrayList<String>();
	    	
           //get every line of the csv file
           File CSVFile = chooser.getSelectedFile();
           try {
        	   Scanner s = new Scanner(CSVFile);
        	   while(s.hasNextLine()) {
        		   String token = s.nextLine();
        		   lines.add(token);
        	   }
        	   
        	   //first line contains column names
        	   String[] columns = lines.get(0).split(",");

        	   //put each column into the WFAData
        	   for(String column : columns)
        	   {
        	       data.getColumns().add(column);
        	   }

        	   //put each entry into the list of entries
        	   for (int i = 1; i < lines.size(); i++)
        	   {
        	       String[] line = lines.get(i).split(",");
        	       
        	       ArrayList<String> entry = new ArrayList<String>();
        	       for (int j = 0; j < columns.length; j++)
        	       {
        	    	   entry.add(line[j]);
        	       }
        	       data.getEntries().add(entry);
        	   }
           }
           catch (FileNotFoundException e) {
        	   // TODO Auto-generated catch block
        	   e.printStackTrace();
           }
	    }
	    
	    return data;
	}

    /**
    * Given a WFA Period, returns a trend consisting 
    * of the sum and average of metric and dim values.
    * 
    * @author Daren Cheng
    * @param period the filtered WFA Period to calculate trends on
    * @param metric the column to be used as a metric during trend calculation
    * @param dims the column to be used as a dimension during trend calculation
    * @return Trend generated from the given WFA period
   */ 
    public Trend calculateTrend(WFAPeriod period, String metric, String dims) {
		Trend trend = new Trend();  //trend to return
		int metricIndex = 0;        //index of metric to calculate
		int dimsIndex = 0;          //index of dims to calculate
		
		//get metric and dims indexes
		metricIndex = period.getStart().getColumns().indexOf(metric);
		dimsIndex = period.getStart().getColumns().indexOf(dims);

		//metric calculation
		
        //calculate sum of entries for the start metric column
        for(ArrayList<String> entry : period.getStart().getEntries())
        {
        	double value = Double.valueOf(entry.get(metricIndex));
        	trend.setStartSumMetric(trend.getStartSumMetric() + value);
        }
        
        //calculate sum of entries for the end metric column
        for(ArrayList<String> entry : period.getEnd().getEntries())
        {
        	double value = Double.valueOf(entry.get(metricIndex));
        	trend.setEndSumMetric(trend.getEndSumMetric() + value);
        }

        //calculate sum of entries for the activity metric column
        for(ArrayList<String> entry : period.getActivity().getEntries())
        {
        	double value = Double.valueOf(entry.get(metricIndex));
        	trend.setActivitySumMetric(trend.getActivitySumMetric() + value);
        }

		//dims calculation
        
        //calculate sum of entries for the start dims column
        for(ArrayList<String> entry : period.getStart().getEntries())
        {
        	double value = Double.valueOf(entry.get(dimsIndex));
        	trend.setStartSumDims(trend.getStartSumDims() + value);
        }
        
        //calculate sum of entries for the end dims column
        for(ArrayList<String> entry : period.getEnd().getEntries())
        {
        	double value = Double.valueOf(entry.get(dimsIndex));
        	trend.setEndSumDims(trend.getEndSumDims() + value);
        }

        //calculate sum of entries for the activity dims column
        for(ArrayList<String> entry : period.getActivity().getEntries())
        {
        	double value = Double.valueOf(entry.get(dimsIndex));
        	trend.setActivitySumDims(trend.getActivitySumDims() + value);
        }
        
        //average calculations
        trend.setStartAverage(trend.getStartSumDims() / trend.getStartSumMetric());
        trend.setEndAverage(trend.getEndSumDims() / trend.getEndSumMetric());
        trend.setActivityAverage(trend.getActivitySumDims() / trend.getActivitySumMetric());
        
        //trend calculation complete, return trend
        return trend;
   }
   
   /**
    * Given a trend, returns a string that summarizes 
    * the information stored in that trend
    * 
    * @author Daren Cheng
    * @param trend the trend to summarize into a report
    * @param metric the column used as a metric during trend calculation
    * @param dims the column used as a dimension during trend calculation
    * @return String containing a report summarizing the given trend
   */
    public String generateReport(Trend trend, String metric, String dims) {
   	String report = "Trend Report: " + "\n";
   	/* Extra information to add in at later iterations
       report += "Date Generated: " + DateTime.Today.ToShortDateString() + "\n";
       report += "Start Period: " + StartDataFile + "\n";
       report += "End Period: " + EndDataFile + "\n";
       report += "Activity Period: " + ActivityDataFile + "\n";
       report += "\n";
       */

       //include metric sums
       report += "Sum of Metric \"" + metric
           + "\" is " + trend.getStartSumMetric() + " for start period." + "\n";
       report += "Sum of Metric \"" + metric
           + "\" is " + trend.getEndSumMetric() + " for end period." + "\n";
       report += "Sum of Metric \"" + metric
           + "\" is " + trend.getActivitySumMetric() + " for activity period." + "\n";
       report += "\n";

       //include dim sums (Yum!)
       report += "Sum of Dims \"" + dims
           + "\" is " + trend.getStartSumDims() + " for start period." + "\n";
       report += "Sum of Dims \"" + dims
           + "\" is " + trend.getEndSumDims() + " for end period." + "\n";
       report += "Sum of Dims \"" + dims
           + "\" is " + trend.getActivitySumDims() + " for activity period." + "\n";
       report += "\n";
       
       //include averages
       report += "Average of \"" + metric + " / " + dims + "\" is " 
       		+ trend.getStartAverage()+ " for start period." + "\n";
       report += "Average of \"" + metric + " / " + dims + "\" is " 
       		+ trend.getEndAverage()+ " for end period." + "\n";
       report += "Average of \"" + metric + " / " + dims + "\" is " 
       		+ trend.getActivityAverage()+ " for activity period." + "\n";
       report += "\n";
       
       return report;
   }
   
   /**
    * Saves the given report into a txt file. This method also
    * displays a JFileChooser to let the user choose where to
    * save the report.
    * 
    * @author Daren Cheng
    * @param report the report to be written to the file
   */
    public void exportData(String report) {
		//create a new file chooser and set it's default directory
		JFileChooser chooser = new JFileChooser();
	    
		//set default directory and type of the file
	    chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
	    chooser.setFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
	    
	    //show file saver
	    int fileSaved = chooser.showSaveDialog(null);
	    
	    //check if file was selected, save file if so
	    if(fileSaved == JFileChooser.APPROVE_OPTION) {
	    	
	    	//try to save the file
	    	try(FileWriter fw = new FileWriter(chooser.getSelectedFile()+".txt")) {
	    	    fw.write(report);
	    	} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}

    //regex values
    public static final String OPERATION_REGEX = "&&&";
    public static final String OPERAND_REGEX = "::";
    public static final String STATEMENT_REGEX = ":";
    
    //boolean operations and constants
    public static final String TRUE = "true";
    public static final String FALSE = "false";
    public static final String AND = "and";
    public static final String OR = "or";
    
    //statement operations
    public static final String EQUAL_TO = "==";
    public static final String NOT_EQUAL_TO = "!=";
    public static final String GREATER_THAN = ">";
    public static final String LESS_THAN = "<";
    public static final String GREATER_THAN_OR_EQUAL_TO = ">=";
    public static final String LESS_THAN_OR_EQUAL_TO = "<=";
    
    //AND
    public static String and(String operand1, String operand2) {
    	return operand1.equals(TRUE) && operand2.equals(TRUE) ? TRUE : FALSE;
    }
    
    //OR
    public static String or(String operand1, String operand2) {
    	return operand1.equals(TRUE) || operand2.equals(TRUE) ? TRUE : FALSE;
    }
    
    //EQUAL_TO
    public static String equalTo(String operand1, String operand2) {
    	return operand1.equals(operand2) ? TRUE : FALSE;
    }

    //NOT_EQUAL_TO
    public static String notEqualTo(String operand1, String operand2) {
    	return !operand1.equals(operand2) ? TRUE : FALSE;
    }

    //GREATER_THAN
    public static String greaterThan(String operand1, String operand2) {
    	return Double.valueOf(operand1) > Double.valueOf(operand2) ? TRUE : FALSE;
    }

    //LESS_THAN
    public static String lessThan(String operand1, String operand2) {
    	return Double.valueOf(operand1) < Double.valueOf(operand2) ? TRUE : FALSE;
    }

    //GREATER_THAN_OR_EQUAL_TO
    public static String greaterThanOrEqualTo(String operand1, String operand2) {
    	return Double.valueOf(operand1) >= Double.valueOf(operand2) ? TRUE : FALSE;
    }

    //LESS_THAN_OR_EQUAL_TO
    public static String lessThanOrEqualTo(String operand1, String operand2) {
    	return Double.valueOf(operand1) <= Double.valueOf(operand2) ? TRUE : FALSE;
    }
    
    //evaluates a single statement without any boolean operations to "true" or "false"
    public static String evaluateStatement(ArrayList<String> entries, ArrayList<String> columns, 
    		String statement) {
    	String evaluation = null;  //true/false evaluation of this statement
    	String[] tokens = statement.split(STATEMENT_REGEX);

    	//we should always have three tokens as follows
    	String operation = tokens[1];
    	String operand1 = tokens[0];
    	String operand2 = tokens[2];
    	
    	//need to find the matching value for operand1
    	System.out.print(operand1 + ", " + columns.indexOf(operand1) 
    			+ ", " + entries.size() + ": ");
    	
    	operand1 = entries.get(columns.indexOf(operand1));
    	System.out.println(operand1);
    	
    	//find matching statement operation
    	//note: the following is a possible candidate for polymorphism
    	if(operation.equals(EQUAL_TO)) {
    		evaluation = equalTo(operand1, operand2);
    	}
    	else if(operation.equals(NOT_EQUAL_TO)) {
    		evaluation = notEqualTo(operand1, operand2);
    	}
    	else if(operation.equals(GREATER_THAN)) {
    		evaluation = greaterThan(operand1, operand2);
    	}
    	else if(operation.equals(LESS_THAN)) {
    		evaluation = lessThan(operand1, operand2);
    	}
    	else if(operation.equals(GREATER_THAN_OR_EQUAL_TO)) {
    		evaluation = greaterThanOrEqualTo(operand1, operand2);
    	}
    	else if(operation.equals(LESS_THAN_OR_EQUAL_TO)) {
    		evaluation = lessThanOrEqualTo(operand1, operand2);
    	}
    	else {
    		//should never execute, print error message indicating so
    		System.out.println("Error, unexpected statement operation: " + operation);
    	}
    	
    	//return evaluation of this statement
    	return evaluation;
    }
    
    //evaluates a single boolean operation, evaluates operand statements if not "true" or "false"
    public static String evaluateBooleanOperation(ArrayList<String> entries, ArrayList<String> columns, 
    		String operation, String operand1, String operand2) {
    	String evaluation = null;  //true/false evaluation of this operation
    	
    	//evaluate operand statements 1 & 2 if it they have not already been evaluated
    	if(!operand1.equals(TRUE) && !operand1.equals(FALSE)) {
    		operand1 = evaluateStatement(entries, columns, operand1);
    	}
    	if(!operand2.equals(TRUE) && !operand2.equals(FALSE)) {
    		operand2 = evaluateStatement(entries, columns, operand2);
    	}
    	
    	//perform the indicated logical operation
    	if(operation.equals(AND)){
    		evaluation = and(operand1, operand2);
    	}
    	else if(operation.equals(OR)) {
    		evaluation = or(operand1, operand2);
    	}
    	else {
    		//should never execute, print error message indicating so
    		System.out.println("Error, unexpected logical operation: " + operation);
    	}
    	
    	//return evaluation of this operation
    	return evaluation;
    }
    
    //evaluates a single operand to true/false
    public static String evaluateGroup(ArrayList<String> entries, ArrayList<String> columns, 
    		String operand) {
    	//create stacks to evaluate the operand with
    	Stack<String> operands = new Stack<String>();
		Stack<String> operations = new Stack<String>();
		
		//split operations using regex
    	String[] tokens = operand.split(OPERAND_REGEX);
    	
    	//check for degenerate case of one statement/token
    	if(tokens.length == 1) {
    		return evaluateStatement(entries, columns, tokens[0]); 
    	}
    	else {
    		//put operands and operators into their respective stacks
        	//note: we add them in reverse to preserve stack order
        	for(int i = tokens.length - 1; i >= 0; i = i - 2) { 
        		operands.push(tokens[i]);
        	}
        	for(int i = tokens.length - 2; i >= 0; i = i - 2) { 
        		operations.push(tokens[i]);
        	}
        	
        	//execute operations until the stack is empty
        	while(!operations.isEmpty()) {
        		String operation = operations.pop();
        		String operand1 = operands.pop();
        		String operand2 = operands.pop();
        		operands.push(evaluateBooleanOperation(entries, columns,
        				operation, operand1, operand2));
        	}

        	//return evaluation of this operand group
        	return operands.pop();
    	}
    }
    
    //evaluates a single boolean operation, evaluates operand groups if not "true" or "false"
    public static String evaluateBooleanOperations(ArrayList<String> entries, ArrayList<String> columns, 
    		String operation, String operand1, String operand2) {
    	String evaluation = null;  //true/false evaluation of this operation
    	
    	//evaluate operand groups 1 & 2 if it they have not already been evaluated
    	if(!operand1.equals(TRUE) && !operand1.equals(FALSE)) {
    		operand1 = evaluateGroup(entries, columns, operand1);
    	}
    	if(!operand2.equals(TRUE) && !operand2.equals(FALSE)) {
    		operand2 = evaluateGroup(entries, columns, operand2);
    	}
    	
    	//perform the indicated logical operation
    	if(operation.equals(AND)){
    		evaluation = and(operand1, operand2);
    	}
    	else if(operation.equals(OR)) {
    		evaluation = or(operand1, operand2);
    	}
    	else {
    		//should never execute, print error message indicating so
    		System.out.println("Error, unexpected logical operation: " + operation);
    	}
    	
    	//return evaluation of this operation
    	return evaluation;
    }

    //evaluates a string operation to true or false
    private Boolean passesFilter(ArrayList<String> entries, ArrayList<String> columns, 
    		String input) {
    	//check if string is empty
    	if (input != null && !input.isEmpty()) {
    		Stack<String> operands = new Stack<String>();
    		Stack<String> operations = new Stack<String>();
    		
    		//split operations using regex
        	String[] tokens = input.split(OPERATION_REGEX);
        	
        	//check for degenerate case of one statement/token
        	if(tokens.length == 1) {
        		return evaluateGroup(entries, columns, tokens[0]).equals(TRUE) ? true : false; 
        	}
        	else {
            	//put operands and operators into their respective stacks
            	//note: we add them in reverse to preserve stack order
            	for(int i = tokens.length - 1; i >= 0; i = i - 2) { 
            		operands.push(tokens[i]);
            	}
            	for(int i = tokens.length - 2; i >= 0; i = i - 2) { 
            		operations.push(tokens[i]);
            	}
            	
            	//evaluate boolean operations until the stack is empty
            	while(!operations.isEmpty()) {
            		String operation = operations.pop();
            		String operand1 = operands.pop();
            		String operand2 = operands.pop();
            		operands.push(evaluateBooleanOperations(entries, columns,
            				operation, operand1, operand2));
            	}
            	
            	return operands.pop().equals(TRUE) ? true : false;
        	}
    	}
    	else {
    		//no filtering operations, thus return true
    		return true;
    	}
    }
    

    /**
     * @param period
     * @param filters
    */
    public WFAPeriod getFilteredPeriod(WFAPeriod period, String filter) {
    	WFAPeriod filteredPeriod = new WFAPeriod();  //filtered period to return
    	
    	//copy over columns
    	filteredPeriod.getStart().setColumns(period.getStart().getColumns());
    	filteredPeriod.getEnd().setColumns(period.getEnd().getColumns());
    	filteredPeriod.getActivity().setColumns(period.getActivity().getColumns());
    	
    	//add start entries that pass the filter
    	for(ArrayList<String> entry : period.getStart().getEntries()) {
    		if (passesFilter(entry, period.getStart().getColumns(), filter)){
    			filteredPeriod.getStart().getEntries().add(entry);
    		}
    	}
    	
    	//add end entries that pass the filter
    	for(ArrayList<String> entry : period.getEnd().getEntries()) {
    		if (passesFilter(entry, period.getEnd().getColumns(), filter)){
    			filteredPeriod.getEnd().getEntries().add(entry);
    		}
    	}

    	//add start entries that pass the filter
    	for(ArrayList<String> entry : period.getActivity().getEntries()) {
    		if (passesFilter(entry, period.getActivity().getColumns(), filter)){
    			filteredPeriod.getActivity().getEntries().add(entry);
    		}
    	}
    	
    	//return filtered period
    	return filteredPeriod;
    }
    
    public static void main(String[] args) {
    	String input = "::CN:OP:EV::LO::CN:OP:EV::LO::CN:OP:EV::LO::CN:OP:EV::&&&L1&&&::CN:OP:EV::LO::CN:OP:EV::LO::CN:OP:EV::LO::CN:OP:EV::&&&L2&&&::CN:OP:EV::LO::CN:OP:EV::LO::CN:OP:EV::LO::CN:OP:EV::";
    	//String test = "false::or::true&&&or&&&true::or::false::and::false&&&";
    	//String test = "lies:!=:pies&&&and&&&true::or::false::and::1:!=:2";
    	String test = "Headcount:==:0&&&and&&&State:==:E::or::State:==:G";

    	FileDialogTest foo = new FileDialogTest();
    	WFAData start = foo.selectCSVFile();
    	WFAData end = foo.selectCSVFile();
    	WFAData activity = foo.selectCSVFile();
    	WFAPeriod period = foo.new WFAPeriod(start, end, activity);
    	WFAPeriod filteredPeriod = foo.getFilteredPeriod(period, test);
    	Trend trend = foo.calculateTrend(filteredPeriod, "Headcount", "Std Hours/Week");
    	String report = foo.generateReport(trend, "Headcount", "Std Hours/Week");
    	System.out.println(report);
    	
    	
    	/*
    	//check if string is empty
    	if (input != null && !input.isEmpty()) {
    		Stack<String> operands = new Stack<String>();
    		Stack<String> operations = new Stack<String>();
    		
    		//split operations using regex
        	String[] tokens = test.split(OPERATION_REGEX);
        	
        	//check for degenerate case of one statement/token
        	if(tokens.length == 1) {
            	System.out.println(evaluateGroup(tokens[0]));
        	}
        	else {
            	//put operands and operators into their respective stacks
            	//note: we add them in reverse to preserve stack order
            	for(int i = tokens.length - 1; i >= 0; i = i - 2) { 
            		operands.push(tokens[i]);
            	}
            	for(int i = tokens.length - 2; i >= 0; i = i - 2) { 
            		operations.push(tokens[i]);
            	}
            	
            	//evaluate boolean operations until the stack is empty
            	while(!operations.isEmpty()) {
            		String operation = operations.pop();
            		String operand1 = operands.pop();
            		String operand2 = operands.pop();
            		operands.push(evaluateBooleanOperations(operation, operand1, operand2));
            	}

            	System.out.println(operands.pop());
        	}
    	}
    	else {
    		//no filtering boolean operations, thus return given WFA Period
    	}*/
    	
    	/*
    	FileDialogTest foo = new FileDialogTest();
    	WFAData start = foo.selectCSVFile();
    	WFAData end = foo.selectCSVFile();
    	WFAData activity = foo.selectCSVFile();
    	WFAPeriod period = foo.new WFAPeriod(start, end, activity);
    	Trend trend = foo.calculateTrend(period, "Headcount", "Std Hours/Week");
    	String report = foo.generateReport(trend, "Headcount", "Std Hours/Week");
    	System.out.println(report);
    	*/
	}

}
