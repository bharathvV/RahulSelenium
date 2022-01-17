import org.testng.Assert;
import org.testng.annotations.Test;

import com.beust.jcommander.Strings;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamTest {

	//v .important for java 8 labda thinfgs understand carefully revise when it is useful for qa interview
	@Test 
	public void arraylist() {
		List<String> names=new ArrayList<String>();
		names.add("Bharath");
		names.add("Sharath");
		names.add("Mharath");
		names.add("Kharath");
		names.add("BMharath");
		int cnt=0;
		for(int i=0;i<names.size();i++) {
			 String name=names.get(i);
			if(name.startsWith("B")) {
				cnt++;
			}
		}
        System.out.println(cnt);
	}
	
	//startsWith() function is is case sensitive
	@Test
	public void streamFilter() {
		List<String> names=new ArrayList<String>();
		names.add("Bharath");
		names.add("Sharath");
		names.add("Mharath");
		names.add("Kharath");
		names.add("BMharath");
	    //if middle is intermediate state and after filtering state is terminal state, if intermediate state return true onl then only terminal condition will work ok, don't confuse
//		if intermediate state return false, then terminal wont work
		long count1=names.stream().filter(e->e.startsWith("B")).count();
		System.out.println(count1);
		long count=names.stream().filter(e->
		{
			e.startsWith("Z");
			return true;
			
		}).count();

		System.out.println(count);
		
		 //if middle is intermediate state and after filtering state is terminal state, if intermediate state return true onl then only terminal condition will work ok, don't confuse
        //if intermediate state return false, then terminal wont work
		long d=Stream.of("Bannu","Zakir","Hussain","Mohammed","zliafroj").filter(s->{
			s.startsWith("z");
			return true;
		}).count();
		System.out.println(d);
		
		//prit all names of array list
		names.stream().filter(str->str.length()>4).forEach(s->System.out.println(s));
	}
	
	
	//print string with length >4 an convert it into uppercase ok don't confuse
	@Test
	public void streamMap() {
		  Stream.of("Bannu","Zakir","Hussain","Mohammed","zliafroj").filter(s->s.endsWith("j")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	
	
	//sort the elements along with alphabetical order observe carefully ok for sring array only
	@Test
	public void streamMapUpper() {
		
         System.out.println("this is inside stream sorted and uppercase conversion");
 		String[] arr= {"Aannu","Eakir","Bussain","ohammed","AlAafroj"};
// 		Arrays.sort(arr);
		List<String> names= Arrays.asList(arr);
		//names.stream().filter(s->{return true;}).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	    
	}
	
	@Test
	public void concat() {
		System.out.println("Concatenation test case");
		List<String> names=new ArrayList<String>();
		names.add("Bharath");
		names.add("Sharath");
		names.add("Mharath");
		names.add("Kharath");
		
		String[] arr= {"Aannu","Eakir","Bussain","ohammed","AlAafroj"};
        //Arrays.sort(arr);
		List<String> names1= Arrays.asList(arr);
		
		Stream<String> newstream=Stream.concat(names.stream(), names1.stream());
		//newstream.forEach(s->System.out.println(s));
		boolean flag= newstream.anyMatch(s->s.equalsIgnoreCase("ohammed"));
		Assert.assertTrue(flag);
//		System.out.println(flag);
		
	}
	
	
	
	///to convert stream of collection objects into list of method is collect some other sub method 
	@Test
	public void collect() {
		System.out.println("Inside collectors testcase");
		List<String> ls= Stream.of("Bannu","Zakir","Hussain","Mohammed","zliafroj").filter(s->s.endsWith("j")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
	}
     
	
	//
	@Test
	public void distinctAndSorted() {
		System.out.println("This test will do distinct and sort the elements ad print element with 3rd position i,e at 2nd second");
		List<Integer> numbers= Arrays.asList(1,2,3,4,1,2,1);
		List<Integer> sortednums= numbers.stream().distinct().sorted().collect(Collectors.toList());
	    System.out.println(sortednums.get(2));
	    System.out.println("over this function");
	}
}



