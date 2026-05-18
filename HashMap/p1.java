/*tyani banun thevlela class aahe to aapan use krnar aahe 
  method put in class HashMap<K,V> cannot be applied to given types karan aapan type dilela nahi*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap hm = new HashMap();
		hm.put(10);
		System.out.println(hm);
	}
}