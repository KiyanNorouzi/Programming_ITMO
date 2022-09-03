package commands;



public  class Item implements CharSequence {
	
	String a ;
	String b;
	
	public Item(String _a , String _b ) {
		
		this.a = _a;
		this.b = _b;
	}
	
	
	 public String getA() {
		 return a;
	 }
	 
	 public String getB() {
		 return b;
	 }
	 
	
	 @Override
	 public String toString() {
		 String info = "";
		 info += " A = "  + a;
		 info += " B = "  + b;
		 return info;
	 }


	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}


	






	
}
