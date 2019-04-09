package ujicobainventori.Helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.DatePicker;
import javax.swing.JTable;
import org.jdesktop.swingx.JXDatePicker;
import ujicobainventori.Frame.MainFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiddy
 */
public class Helper {
    
    public String getValueRows(JTable table, int index){
        return table.getValueAt(table.getSelectedRow(), index).toString();
    }
    
    public String getParsedDate(String _date) throws ParseException{
        Date date = new SimpleDateFormat("yyyy-mm-dd").parse(_date);
        String formatted = new SimpleDateFormat("mm/dd/yy").format(date);
        return formatted;
    }
    
    public String parseDataToDatabase(JXDatePicker dp) throws ParseException{
        Date date = (Date) dp.getDate();
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        String parsedDate = dt.format(date);
        
        return parsedDate;
    }
}
