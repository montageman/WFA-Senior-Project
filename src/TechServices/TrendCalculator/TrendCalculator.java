/*********************************************************************
	Rhapsody	: 8.0.3
	Login		: dxc122030
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: TrendCalculator
//!	Generated Date	: Mon, 11, Apr 2016 
	File Path	: DefaultComponent/DefaultConfig/TechServices/TrendCalculator/TrendCalculator.java
*********************************************************************/

package TechServices.TrendCalculator;

//## operation calculateTrend(WFAPeriod) 
import java.util.ArrayList;

import Business.Model.Trend;
//## operation calculateTrend(WFAPeriod) 
import Business.Model.WFAPeriod;

//----------------------------------------------------------------------------
// TechServices/TrendCalculator/TrendCalculator.java                                                                  
//----------------------------------------------------------------------------

//## package TechServices::TrendCalculator 


//## class TrendCalculator 
public class TrendCalculator {
    
    
    // Constructors
    
    //## auto_generated 
    public  TrendCalculator() {
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
		
		//get metric and dims indexes
		int startMetricIndex = period.getStart().getColumns().indexOf(metric);
		int startDimsIndex = period.getStart().getColumns().indexOf(dims);
		int endMetricIndex = period.getEnd().getColumns().indexOf(metric);
		int endDimsIndex = period.getEnd().getColumns().indexOf(dims);
		int activityMetricIndex = period.getActivity().getColumns().indexOf(metric);
		int activityDimsIndex = period.getActivity().getColumns().indexOf(dims);

		//metric calculation
		
        //calculate sum of entries for the start metric column
        for(ArrayList<String> entry : period.getStart().getEntries())
        {
        	double value = Double.valueOf(entry.get(startMetricIndex));
        	trend.setStartSumMetric(trend.getStartSumMetric() + value);
        }
        
        //calculate sum of entries for the end metric column
        for(ArrayList<String> entry : period.getEnd().getEntries())
        {
        	double value = Double.valueOf(entry.get(endMetricIndex));
        	trend.setEndSumMetric(trend.getEndSumMetric() + value);
        }

        //calculate sum of entries for the activity metric column
        for(ArrayList<String> entry : period.getActivity().getEntries())
        {
        	double value = Double.valueOf(entry.get(activityMetricIndex));
        	trend.setActivitySumMetric(trend.getActivitySumMetric() + value);
        }

		//dims calculation
        
        //calculate sum of entries for the start dims column
        for(ArrayList<String> entry : period.getStart().getEntries())
        {
        	double value = Double.valueOf(entry.get(startDimsIndex));
        	trend.setStartSumDims(trend.getStartSumDims() + value);
        }
        
        //calculate sum of entries for the end dims column
        for(ArrayList<String> entry : period.getEnd().getEntries())
        {
        	double value = Double.valueOf(entry.get(endDimsIndex));
        	trend.setEndSumDims(trend.getEndSumDims() + value);
        }

        //calculate sum of entries for the activity dims column
        for(ArrayList<String> entry : period.getActivity().getEntries())
        {
        	double value = Double.valueOf(entry.get(activityDimsIndex));
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
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/TechServices/TrendCalculator/TrendCalculator.java
*********************************************************************/

