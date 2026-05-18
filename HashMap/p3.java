/*key dili ki value return krte
values dili tr null return krte
 hashmap key vr search krto*/
import java.util.*;
class Demo{
	public static void main(String[]args){
	     HashMap<String,Integer> hm=new HashMap();
		hm.put("Satish",90);
		hm.put("Aditya",90);
		hm.put("Prathmesh",95);
		hm.put("Ravi",50);
		System.out.println(hm);
		System.out.println(hm.get("Aditya"));
		System.out.println(hm.get(90));
			
	}
}