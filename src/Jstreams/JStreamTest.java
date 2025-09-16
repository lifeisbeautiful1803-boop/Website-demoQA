package Jstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class JStreamTest {
	
	
//	@Test
	public void filter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Alex");
		names.add("Tam");
		names.add("Aron");

		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).startsWith("A")) {
				count++;
			}
		}
		System.out.println("count" + count);
	}

// @Test
public void Streamfilter() {
	ArrayList<String> names = new ArrayList<String>();
	names.add("Alex");
	names.add("Tam");
	names.add("Aron");

	Long count = names.stream().filter(s->s.startsWith("A")).count();
	System.out.println("count of stream " + count);
	
	
	names.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
}



//print all names starting with A and convert in UPPERCASE- first try with normal and then via streams
@Test
public void check() {

	// array
	String[] Arr = { "Aaron", "ram", "dexter", "alex", "Ali" };
	int countA = 0, countAL = 0;
	for (int i = 0; i < Arr.length; i++) {
		if (Arr[i].startsWith("A")) {
			countA++;
			System.out.println(" count of names starting with A " + countA);
			System.out.println(" name is " + Arr[i].toUpperCase());
		}
	}
	// array list- first convert array into array list
	List<String> arrlist = Arrays.asList(Arr);
	Iterator<String> it = arrlist.iterator();
	while (it.hasNext()) {

		String value = it.next();
		if (value.startsWith("A")) {
			countAL++;
			System.out.println(" count of names starting with A " + countAL);
			System.out.println(" name is " +value.toUpperCase());
		}

	}
	
	// streams
	arrlist.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
}



}

//print all names ending with A ,sort and convert in uppercase

