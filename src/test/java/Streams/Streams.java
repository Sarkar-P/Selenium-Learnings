package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Streams {

	@Test
	public void streamFilter()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Priyanka");
		names.add("Ruma");
		names.add("Pihu");
		names.add("Piku");
		long c=names.stream().filter(s->s.startsWith("P")).count();
		System.out.println(c);
		long d=Stream.of("Priyanka","Ruma","Pihu","Piku").filter(s->  //to create the stream directly without creating arraylist
		{
			s.startsWith("P");
			return true;
		}).count();
		System.out.println(d);
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
	
	@Test
	public void streammaps() {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Priyanka");
		names.add("Ruma");
		names.add("Pihu");
		names.add("asad");
		names.add("oliya");
		//prints the names that has last letter as A with Uppercase
		Stream.of("Priyanka","Ruma","Pihu","Piku").filter(s->s.endsWith("A")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		//prints the names that has first letter as A with Uppercase and sorted
		List<String> names1=Arrays.asList("Priyanka","Ruma","Pihu","Piku");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		//merging or concating to Streams
		Stream<String> newStream=Stream.concat(names.stream(), names1.stream());
		//find value present in the new stream if found return true or false
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Pihu"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
	}
}
