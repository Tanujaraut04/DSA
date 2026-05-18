/*keySet():
parameter:key
return:set of key
op:[Satish, Aditya]
*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap<String,Integer>hm=new HashMap();
		hm.put("Satish",90);
		hm.put("Aditya",92);
		System.out.println(hm.keySet());
		
	}
}