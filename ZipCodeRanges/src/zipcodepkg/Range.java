package zipcodepkg;

/* Class for Range of Zipcode [lowerbound, upperbound] defined*/
import java.util.*;

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
    
}// end of Range Inner class

//Inner class
class RangeComparator implements Comparator<Range>
{
   public int compare(Range r1, Range r2)
   {
       return r1.getLowerBound() - r2.getLowerBound(); 
   }
   
}






