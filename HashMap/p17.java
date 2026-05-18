/*Q4: Contains Check
Map madhe data add karun:
check kar key exist aahe ka (containsKey)
check kar value exist aahe ka (containsValue)*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		String target="Prathmesh";
		HashMap<String,Integer>hm=new HashMap();
		hm.put("Satish",90);
		hm.put("Aditya",92);
		hm.put("Prathmesh",85);
		hm.put("Ajit",67);
		System.out.println(hm.containsKey("Satish"));
		System.out.println(hm.containsValue(90));
	}
}
