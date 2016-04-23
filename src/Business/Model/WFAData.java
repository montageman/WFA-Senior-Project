/*********************************************************************
	Rhapsody	: 8.0.3
	Login		: dxc122030
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: WFAData
//!	Generated Date	: Mon, 11, Apr 2016 
	File Path	: DefaultComponent/DefaultConfig/Business/Model/WFAData.java
*********************************************************************/

package Business.Model;

import java.util.ArrayList;


//----------------------------------------------------------------------------
// Business/Model/WFAData.java                                                                  
//----------------------------------------------------------------------------

//## package Business::Model 


//## class WFAData 
public class WFAData {
    
	protected ArrayList<String> columns;		//## attribute columns 
    
    protected ArrayList<ArrayList<String>> entries;		//## attribute entries 
    
    
    // Constructors
    
    //## auto_generated 
    public  WFAData() {
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
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Business/Model/WFAData.java
*********************************************************************/

