package zipcodepkg;

/* Program for Zipcode restrictions.
 * if input is [94133,94133] [94226,94399] [94200,94299]
   Result : [94133,94133] [94200,94399]
 */
import java.util.ArrayList;
import java.util.Collections;

public class RangeList{
	
  public static void main(String[] args) throws Exception {
  ArrayList<Range> r = new ArrayList<Range>();
  
  //Assuming we are passing the input in constructor
  r.add(new Range(94133,94133));
  r.add(new Range(94226,94399));
  r.add(new Range(94200,94299));
  
   
  for (Range test : r){
	test.printRange();
    }
  //class method no need for object reference   
  r = compareMerge(r);
   
  System.out.println("Result");
  for (Range r1 : r){
  r1.printRange();
  }
  
 }// end of main
   
 //Sort compare and Merge
  public static ArrayList<Range> compareMerge(ArrayList<Range> rlist) {
	// TODO Auto-generated method stub
  ArrayList<Range> result = new ArrayList<Range>();
	
  // if there is only 0 or 1 element 
  if (rlist.size() == 0 || rlist.size() == 1)
   	return rlist;
	
  //sort the zip code[lower,upper ] elements in array list in order
  Collections.sort(rlist,new RangeComparator());
    
  //Getting the first element from the list for comparison in subsequent loop
  Range first = rlist.get(0);
  int begin = first.getLowerBound();
  int end = first.getUpperBound();
    
    
  //Comparing the previously fetched element with the next element in the loop
  for (int i =1; i < rlist.size(); i++){
  //getting the next element
  Range current = rlist.get(i);
  //if lower bound of range of current element is less than end(upper bound) of previous element then merge 
  if (current.getLowerBound() <= end){
  	  end = current.getUpperBound();
  }else{
  		 //no overlap in range now so add the element in result set
   	  result.add(new Range(begin,end));
      //repeat the same process to check the current element with next element in next iteration
      begin = current.getLowerBound();
      end = current.getUpperBound();
    }
   }
    //adding the last element of the Range list
    result.add(new Range(begin,end));
    
    //return the final result set
   return result;	
  }// end of  merge function

     
} // end of RangeDemo class



