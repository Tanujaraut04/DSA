/*
op:	{Tanuja=90, Vaishi=92}
	{Tanuja=90, Vaishi=95}
override zal aahe
*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap<String,Integer>hm=new HashMap();
		hm.put("Tanuja",90);
		hm.put("Vaishi",92);
		System.out.println(hm);
		hm.put("Vaishi",95);
		System.out.println(hm);
	}
}