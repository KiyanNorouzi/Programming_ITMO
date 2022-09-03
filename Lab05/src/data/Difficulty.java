package data;

public enum Difficulty {
    EASY,
    NORMAL,
    INSANE,
    TERRIBLE;



 
public static String nameList() {
    String nameList = "";
    for (Difficulty difficultyType : values()) {
        nameList += difficultyType.name() + ", ";
    }
    return nameList.substring(0, nameList.length() - 2);
}

}
