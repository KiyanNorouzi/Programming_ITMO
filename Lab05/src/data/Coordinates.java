package data;

public class Coordinates {
	 	private long x; 
	    private long y; 

	    public Coordinates(long _x, long _y) {
	        this.x = _x;
	        this.y = _y;
	    }


	    public long getX() {
	        return x;
	    }


	    public float getY() {
	        return y;
	    }

	    @Override
	    public String toString() {
	        return "X:" + x + " Y:" + y;
	    }

	    @Override
	    public int hashCode() {
	        return ((Long) y).hashCode() + (int) x;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj instanceof Coordinates) {
	            Coordinates coordinatesObj = (Coordinates) obj;
	            return (x == coordinatesObj.getX()) && ((Long) y).equals(coordinatesObj.getY());
	        }
	        return false;
	    }
	}

