/*size()=no parameter
return =key-value element*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap<String,Integer>hm=new HashMap();
		hm.put("Tanu",90);
		hm.put("Ash",92);
		System.out.println(hm);
		System.out.println(hm.size());
	}
}