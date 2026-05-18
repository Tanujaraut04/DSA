/*Q5: Print All Keys*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		String target="Prathmesh";
		HashMap<String,Integer>hm=new HashMap();
		hm.put("Satish",90);
		hm.put("Aditya",92);
		hm.put("Prathmesh",85);
		hm.put("Ajit",67);
		System.out.println(hm.keySet());
	}
}