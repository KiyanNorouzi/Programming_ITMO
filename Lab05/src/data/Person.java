package data;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Person {

	 private String name; 
	 private String height; 
	 private Color eyeColor; 
	 private Location location; 
	
	 
	 public Person(String _name,String _height , Color _eyeColor , Location _location) {
		 this.name = _name;
		 this.height = _height;
		 this.eyeColor = _eyeColor;
		 this.location = _location;
	 }
	 
	 
	 public String getName() {
		 return name;
	 }
	 
	 public String getHeight() {
		 return height;
	 }
	 
	 public Color getEyeColor() {
		 return eyeColor;
	 }
	 
	 public Location getLocation() {
		 return location;
	 }
	 

	 
	 
	 
	 @Override
	 public String toString() {
		 String info = "";
		 info += "\n-Name =  "  + name;
		 info += "\n-Height =  "  + height;
		 info += "\n- Eye Color =  "  + eyeColor;
		 info += "\n- Location =  "  + location;
		 return info;
	 }
	 
}
 