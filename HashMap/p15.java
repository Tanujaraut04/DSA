/*Q2: Size Check
Map madhe kahi values add karun
total entries count size() ne print kar.*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		int target=90;
		HashMap<String,Integer>hm=new HashMap();
		hm.put("Satish",90);
		hm.put("Aditya",92);
		hm.put("Prathmesh",85);
		System.out.println(hm.size());
	}
}