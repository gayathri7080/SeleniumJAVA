package coreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;


public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Count the no. names starting with letter R and print them
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Rama");
		names.add("seetha");
		names.add("Raja");
		names.add("Rani");
		names.add("Chinny");
		names.add("vanitha");
		int count =0;
		for (String stringnames : names)
		{
			if ( stringnames.startsWith("R"))
			{
				count++;
				System.out.println(stringnames);
			}
		}
		System.out.println(count);
		//instead of using above all code we can use streams easily in one liner code and time efficient
		//Strames using above array
		long d = names.stream().filter(s->s.startsWith("s")).count();
		System.out.println(d);
		//Streams without using array Count the no. names starting with letter R
		long m = Stream.of("Rama", "seetha", "Raja", "Rani", "Chinny").filter(s->s.startsWith("R")).count();
		System.out.println(m);
		//Print the no. names starting with letter R
		names.stream().filter(s->s.startsWith("R")).forEach(s->System.out.println("Print the  names starting with letter R " + s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println("In array names length is >4" +s));
		names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println("names array ends with a and change them to upper case " + s));
		
		List <String> names1 = Arrays.asList("Gayathri", "Padma", "Jyothi");
		names1.stream().filter(s->s.startsWith("R")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println("Names array strats with R Upper case sorted " + s));
		//Merging 2 different lists
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		//newStream.sorted().forEach(s->System.out.println("Merging 2 different lists in sorted order" + s));
		boolean result = newStream.anyMatch(s->s.equalsIgnoreCase("Padma"));
		System.out.println(result);
		Assert.assertTrue(result);
		
		List<String> Is = names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println("Convert to Collectors list " + Is.get(0));
		
	}

}
