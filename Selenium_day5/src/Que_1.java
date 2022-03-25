import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Que_1 {
	public static void main(String[] args){
		//Count using Arraylist
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhishek");
		names.add("Dikesh");
		names.add("Devsh");
		names.add("Debram");
		names.add("Rahul");
		System.out.println(names);

		long count = 0;
		for(String i : names) {
			if(i.startsWith("D"))
				count++;
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Count: " + count);
		//Count using Stream
		List<String> strList = Arrays.asList("Abhishek" ,"Dikesh" , "Devsh" , "Debram", "Rahul");
		long count1 = strList.stream()
				.filter(x -> x.startsWith("D"))
				.count();
		System.out.println("Count: " + count1);
	}
}
