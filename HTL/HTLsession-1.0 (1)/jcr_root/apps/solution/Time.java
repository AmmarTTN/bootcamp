package apps.solution;

import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;
import javax.script.Bindings;
import org.apache.sling.scripting.sightly.pojo.Use;

public class Time implements Use {

private String time;

@Override
	public void init(Bindings bindings) {

//String text = get("text", String.class);

   Date date = Calendar.getInstance().getTime();  
   DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");  
   time = dateFormat.format(date);  

}

public String getTime() {
return this.time;
}

}