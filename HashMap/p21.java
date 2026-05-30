import java.util.*;
class Demo{
	public static void main(String[]args){
		int[]arr={1,2,3,3,4,5};
		HashMap<Integer,Integer>hm=new HashMap<>();
		for(int i=0;i<arr.length;i++){
		hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
		}
		int search=12;
		boolean isfound=false;
		/*System.out.println(hm);
		System.out.println(hm.size());
		for(int num:hm.keySet()){
			System.out.println(num);
		}
		for(int num:hm.values()){
			System.out.println(num);
		}
		System.out.println(hm.get(arr[2]));
		for(int num:hm.keySet()){
			if(hm.get(num)==2){
				System.out.println(num);
			}
		}
		System.out.println(isfound);
		System.out.println(hm.containsKey(2));
		System.out.println(hm.containsValue(2));
		hm.remove(2);
		System.out.println(hm);
		for(Map.Entry<Integer,Integer>e:hm.entrySet()){
		System.out.println(e.getKey()+"="+e.getValue());*/
		}
	}
}