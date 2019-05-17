package zipcodepkg;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class ZipcodeTest {

	@Test
	public void test() {
		
		ArrayList<Range> inputRange = new ArrayList<Range>();

		inputRange.add(new Range(94200,94300));
		inputRange.add(new Range(94350,94399));
		
		ArrayList<Range> outputRange = new ArrayList<Range>();
		outputRange.add(new Range(94200,94300));
		outputRange.add(new Range(94350,94399));
		
		Collections.sort(inputRange,new RangeComparator());
		
		RangeList testClass = new RangeList();
		assertArrayEquals(outputRange.toArray(), testClass.compareMerge(inputRange).toArray());

	}

}
