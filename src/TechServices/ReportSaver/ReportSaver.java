/*********************************************************************
	Rhapsody	: 8.0.3
	Login		: dxc122030
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: ReportSaver
//!	Generated Date	: Mon, 11, Apr 2016 
	File Path	: DefaultComponent/DefaultConfig/TechServices/ReportSaver/ReportSaver.java
*********************************************************************/

package TechServices.ReportSaver;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


//----------------------------------------------------------------------------
// TechServices/ReportSaver/ReportSaver.java                                                                  
//----------------------------------------------------------------------------

//## package TechServices::ReportSaver 


//## class ReportSaver 
public class ReportSaver {
    
    
    // Constructors
    
    //## auto_generated 
    public  ReportSaver() {
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
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/TechServices/ReportSaver/ReportSaver.java
*********************************************************************/

