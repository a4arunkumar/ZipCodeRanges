package zipcodepkg;

/* Class for Range of Zipcode [lowerbound, upperbound] defined*/


class Range {

	private int lowerbound;
	private int upperbound;
	
	Range(){
	
	lowerbound = 0;
	upperbound = 0;
	
	}
	
	Range(int lowerbound, int upperbound){
	
		this.upperbound = upperbound;
		this.lowerbound = lowerbound;
	}

    public int getUpperBound(){
        return upperbound;
     }
    
    public int getLowerBound(){
    	return lowerbound;
    }
    
    public void printRange()
    {
       System.out.println("[" + this.lowerbound + "," + this.upperbound + "]");
      
    }
    
}// end of Range  class







