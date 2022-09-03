package data;

public class CreationDate {
	
	 private String dataStorage;
	
	 
	 
	public void CrretionDate(String _dataStorage) {
		this.dataStorage = _dataStorage;
	}
	
    public String getDate() {
    	return dataStorage;
    }
    
    
    @Override
    public String toString() {
        return "Date of object creation is : " + dataStorage ;    
    }
	
}
