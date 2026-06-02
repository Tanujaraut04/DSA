/*How to string store in memory
1.Point the different address
2.only 2 object create
3.Store in Heap
4.SCP create 1 object
*/
class Demo{
	public static void main(String[]args){
		String s1 = new String("Tanuja");
		String s2 = new String("Tanuja");
		System.out.println(s1);
		System.out.println(s2);
	}
}