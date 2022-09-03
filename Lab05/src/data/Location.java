package data;

public class Location {
    private double x;
    private Long y; 
    private Integer z;  
    
    public Location(double _x, Long _y , Integer _z){
        this.x = _x;
        this.y = _y;
        this.z = _z;
    }
    
    
    public double getX() {
        return x;
    }
    
    public Long getY()
    {  return y;
    	
    }
    
    public Integer getZ() {
    	return z;
    }
    
    
    @Override
    public String toString() {
        return "Address [x =" + x + ", y=" + y + ", Z=" + z +"]";
    }
    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((z == null) ? 0 : z.hashCode());
        result = prime * result + ((y == null) ? 0 : y.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Location other = (Location) obj;
        if (y == null) {
            if (other.y != null)
                return false;
        } else if (!y.equals(other.y))
            return false;
        if (z == null) {
            if (other.z != null)
                return false;
        } else if (!z.equals(other.z))
            return false;
        return true;
    }

    public int compareTo(Location location) {
    	Long standard = y;
        if (y == standard)
            return 0;
        else if (y > standard)
            return 1;
        else
            return -1;
    }
}
