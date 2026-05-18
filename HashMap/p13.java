/*Values():
parameter:key
return:set of values
op:[90, 92]
*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap<String,Integer>hm=new HashMap();
		hm.put("Satish",90);
		hm.put("Aditya",92);
		System.out.println(hm.values());
		
	}
}