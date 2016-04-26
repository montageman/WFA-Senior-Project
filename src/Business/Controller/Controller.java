/*********************************************************************
	Rhapsody	: 8.0.3
	Login		: dxc122030
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Controller
//!	Generated Date	: Mon, 11, Apr 2016 
	File Path	: DefaultComponent/DefaultConfig/Business/Controller/Controller.java
*********************************************************************/

package Business.Controller;

//## operation calculateTrends() 
import TechServices.BooleanOperationExecutor.BooleanOperationExecutor;
import TechServices.CSVReader.CSVReader;
import TechServices.ReportSaver.ReportSaver;
import TechServices.TrendCalculator.TrendCalculator;
import Business.Model.Trend;
//## operation createWFAPeriod(WFAData,WFAData,WFAData) 
import Business.Model.WFAData;
//## attribute period 
import Business.Model.WFAPeriod;

//----------------------------------------------------------------------------
// Business/Controller/Controller.java                                                                  
//----------------------------------------------------------------------------

//## package Business::Controller 


//## class Controller 
public class Controller {
    
    protected WFAPeriod period;		//## attribute period 
    
    private static final Controller INSTANCE = new Controller();
    private CSVReader csvReader;
    private BooleanOperationExecutor boolOpExecutor;
    private TrendCalculator trendCalculator;
    private ReportSaver reportSaver;
    
    // Constructors
    
    //## auto_generated 
    private  Controller() {
    	//initialize WFA Period
    	period = new WFAPeriod();
    	
    	//initialize tech services this controller utilizes
    	csvReader = new CSVReader();
    	boolOpExecutor = new BooleanOperationExecutor();
    	trendCalculator = new TrendCalculator();
    	reportSaver = new ReportSaver();
    }

    /**
     * Returns Controller Singleton.
     * 
     * @author Daren Cheng
     * @return Controller Singleton for this class
     */
    public static Controller getInstance() 
    {
    	return(INSTANCE);
    }
    
    /**
     * Performs the given string of operations on this controller's WFA Period
     * and then calculates trends on the filtered WFA Period.
     * 
     * @author Daren Cheng
     * @param operations the boolean operations used to filter the WFA Period
     * @param metric the column to be used as a metric during trend calculation
     * @param dims the column to be used as a dimension during trend calculation
    */ 
    public Trend calculateTrend(String operations, String metric, String dims) {
		WFAPeriod filteredPeriod = boolOpExecutor.getFilteredPeriod(period, operations);
		Trend trend = trendCalculator.calculateTrend(filteredPeriod, metric, dims);
		return(trend);
    }
    
    /**
     * Sets the start, end, and activity data items for this controller's
     * WFA Period to be the given WFA Data items. 
     * 
     * @author Daren Cheng
     * @param start the WFAData for the start of this WFA Period
     * @param end the WFAData for the end of this WFA Period
     * @param activity the WFAData for the activities during this WFA Period
    */
    public void createWFAPeriod(WFAData start, WFAData end, WFAData activity) {
    	period.setStart(start);
    	period.setEnd(end);
    	period.setActivity(activity);
    }
    
    /**
     * Prompts the user to select a filename and location to 
     * save the current trend report.
     * 
     * @author Daren Cheng
     * @param trendReport the report to be saved on a file
    */
    public void exportData(String trendReport) {
        reportSaver.exportData(trendReport);
    }
    
    /**
     * Returns a report that is generated from the given trend.
     * 
     * @author Daren Cheng
     * @param trend the Trend to create the report from
     * @param metric the metric used in generating the report
     * @param dims the dims used in generating the report
     * @return A report based off of the current trend 
    */
    public String generateReport(Trend trend, String metric, String dims) {
    	String report = trendCalculator.generateReport(trend, metric, dims);
		return report;
    }
    
    /**
     * Prompts the user to select a CSV File and gets
     * the WFA Data inside of that CSV File.
     * 
     * @author Daren Cheng
     * @return WFAData from a user-selected CSV File.
     */
    public WFAData selectCSVFile() {
    	WFAData data = csvReader.selectCSVFile();
		return data;
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Business/Controller/Controller.java
*********************************************************************/

