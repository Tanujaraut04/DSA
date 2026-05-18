/*Map madhe 4 entries add kar
 ek specific key remove kar
 remove nantar map print kar*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		String target="Prathmesh";
		HashMap<String,Integer>hm=new HashMap();
		hm.put("Satish",90);
		hm.put("Aditya",92);
		hm.put("Prathmesh",85);
		hm.put("Ajit",67);
		for(String str:hm.keySet()){
			if(str==target){
				System.out.println(str);
			}
		}
	}
}