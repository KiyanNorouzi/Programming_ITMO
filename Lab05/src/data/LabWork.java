package data;



public class LabWork  {
	
	
    private long id; 
    private String name;
    private Coordinates coordinates;
    private String creationDate;// = LocalDateTime.now();
    private Integer minimalPoint; 
    private Long personalQualitiesMaximum; 
    private String description; 
    private Difficulty difficulty; 
    private Person author; 
    
    


    public LabWork(
    		long _id, String _name, Coordinates _coordinates, 
    		String _creationDate, Integer _minimalPoint,
    		Long _personalQualitiesMaximum, String _description , 
    		Difficulty _difficulty,Person _author) {
    	
        this.id = _id;
        this.name = _name;
        this.coordinates = _coordinates;
        this.creationDate = _creationDate;
        this.minimalPoint = _minimalPoint;
        this.personalQualitiesMaximum = _personalQualitiesMaximum;
        this.description = _description;
        this.difficulty = _difficulty;
        this.author = _author;
    }
    
    //////////////////////////////////////////////////////////
    


	public void setId(long id){
        this.id = id;
    }
    public long getId() {
        return id;
    }
    
    //////////////////////////////////////////////////////////
    
    public void setName(String _name) {
    	this.name = _name;
    }
    public String getName() {
        return name;
    }
    
    //////////////////////////////////////////////////////////
    
    public void setCoordinates(Coordinates _coordinates) {
    	this.coordinates = _coordinates;
    }
    public Coordinates getCoordinates() {
        return coordinates;
    }
    
    //////////////////////////////////////////////////////////
    
    public void setCreationDate(String _creationDate ) {
    	this.creationDate = _creationDate;
    }
    public String getCreationDate() {
        return creationDate;
    }
    
    ///////////////////////////////////////////////////////////
    
    public void setMinimalPoint(Integer _minimalPoint) {
    	this.minimalPoint = _minimalPoint;
    }
    
    public Integer getMinimalPoint(){
    	 return minimalPoint;
    }
    
    ///////////////////////////////////////////////////////////
    
    public void setPersonalQualitiesMaximum(Long _personalQualitiesMaximum) {
    	this.personalQualitiesMaximum = _personalQualitiesMaximum;
    }
    
    public Long getPersonalQualitiesMaximum(){
    	 return personalQualitiesMaximum;
    }
    
    ///////////////////////////////////////////////////////////
    
    public void setDescription(String _description) {
    	this.description = _description;
    }
    
    public String getDescription(){
    	 return description;
    }
    
    ///////////////////////////////////////////////////////////
    
    public void setDifficulty(Difficulty _difficulty) {
    	this.difficulty = _difficulty;
    }
    
    public Difficulty getDifficulty(){
    	 return difficulty;
    }
    
    ///////////////////////////////////////////////////////////
    
    public void setAuthor(Person _author) {
    	this.author = _author;
    }
    
    public Person getAuthor(){
    	 return author;
    }
    
    ///////////////////////////////////////////////////////////
 
  
    @Override
    public String toString() {
        String info = "";
        info += "Lab ID: " + id;
        //info += " (added " + creationDate.toLocalDate() + " " + creationDate.toLocalTime() + ")";
        info += "\n Name: " + name;
        info += "\n Coordinates: " + coordinates;

        
        return info;
    }
    
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof LabWork) {
        	LabWork other = (LabWork) obj;
            return (name.equals(other.getName())) 
            		&& coordinates.equals(other.getCoordinates())
                    && (creationDate == other.getCreationDate()) 
                    && (minimalPoint.equals(other.getMinimalPoint())) 
                    && (personalQualitiesMaximum.equals(other.getPersonalQualitiesMaximum()))
                    && (description.equals(other.getDescription()))
                    && (difficulty.equals(other.getDifficulty()))
                    && (author.equals(other.getAuthor()));
        }
        return false;
    }
}
