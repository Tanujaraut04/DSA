/*HashMap<String, Integer>
Q1: Basic Put + Get
 madhe 5 students add kar.
Specific student cha marks print kar get() ne.*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		int target=90;
		HashMap<String,Integer>hm=new HashMap();
		hm.put("Satish",90);
		hm.put("Aditya",92);
		hm.put("Prathmesh",85);
		for(String str:hm.keySet()){
			if(hm.get(str)==target){
				System.out.println(str);
			}
		}
	}
}