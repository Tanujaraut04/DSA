/*overwrite zal aahe karan duplicate key chalat nahi*/
import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap<Integer,String>hm=new HashMap();
			hm.put(1,"Tanu");
			hm.put(1,"Ash");
			System.out.println(hm);
	}
}