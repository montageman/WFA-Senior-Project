/*********************************************************************
	Rhapsody	: 8.0.3
	Login		: dxc122030
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: WFAPeriod
//!	Generated Date	: Mon, 11, Apr 2016 
	File Path	: DefaultComponent/DefaultConfig/Business/Model/WFAPeriod.java
*********************************************************************/

package Business.Model;


//----------------------------------------------------------------------------
// Business/Model/WFAPeriod.java                                                                  
//----------------------------------------------------------------------------

//## package Business::Model 


//## class WFAPeriod 
public class WFAPeriod {
    
    protected WFAData activity;		//## attribute activity 
    
    protected WFAData end;		//## attribute end 
    
    protected WFAData start;		//## attribute start 
    
    
    // Constructors
    
    //## auto_generated 
    public  WFAPeriod() {
    	activity = new WFAData();
    	end = new WFAData();
    	start = new WFAData();
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
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Business/Model/WFAPeriod.java
*********************************************************************/

