package adneom;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class TestPartition {

	@Test
	public void testListe(){
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < 6; i++) {
			list.add(new Integer(i));
		}
		 ArrayList<ArrayList<Integer>> expected = new ArrayList<ArrayList<Integer>> ();
         expected.add(new ArrayList<Integer>(Arrays.asList((Integer)1,(Integer)2)));
         expected.add(new ArrayList<Integer>(Arrays.asList((Integer)3,(Integer)4)));
         expected.add(new ArrayList<Integer>(Arrays.asList((Integer)5)));
		 assertEquals(expected, Partiton.partition(list, 2));

	}

}
