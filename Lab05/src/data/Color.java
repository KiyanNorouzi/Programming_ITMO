package data;

public enum Color {
    GREEN,
    YELLOW,
    ORANGE,
    WHITE,
    BROWN;


	public static String nameList() {
	    String nameList = "";
	    for (Color colorType : values()) {
	        nameList += colorType.name() + ", ";
	    }
	    return nameList.substring(0, nameList.length() - 2);
	}

	

}


