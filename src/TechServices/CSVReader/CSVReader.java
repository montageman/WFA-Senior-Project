/*********************************************************************
	Rhapsody	: 8.0.3
	Login		: dxc122030
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: CSVReader
//!	Generated Date	: Mon, 11, Apr 2016 
	File Path	: DefaultComponent/DefaultConfig/TechServices/CSVReader/CSVReader.java
*********************************************************************/

package TechServices.CSVReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

//## operation selectCSVFile() 
import Business.Model.WFAData;

//----------------------------------------------------------------------------
// TechServices/CSVReader/CSVReader.java                                                                  
//----------------------------------------------------------------------------

//## package TechServices::CSVReader 


//## class CSVReader 
public class CSVReader {
    
    
    // Constructors
    
    //## auto_generated 
    public  CSVReader() {
    }
    
    /**
     * Generates and returns a WFAData from a user-selected csv 
     * file. This method also displays a JFileChooser allowing 
     * the user to select their desired csv file. 
     * 
     * @author Daren Cheng
     * @return WFAData created from the user-selected csv file
    */
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
        	   //and create a list for that column's data
        	   for(String column : columns)
        	   {
        	       data.getColumns().add(column);
        	       data.getEntries().add(new ArrayList<String>());
        	   }

        	   //put each entry into the appropriate column
        	   for (int i = 1; i < lines.size(); i++)
        	   {
        	       String[] line = lines.get(i).split(",");
        	       for (int j = 0; j < columns.length; j++)
        	       {
        	           data.getEntries().get(j).add(line[j]);
        	       }
        	   }
           }
           catch (FileNotFoundException e) {
        	   // TODO Auto-generated catch block
        	   e.printStackTrace();
           }
	    }
	    
	    return data;
	}
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/TechServices/CSVReader/CSVReader.java
*********************************************************************/

