/*Why String are immutable
op:
Tanuja
925858445
Raut
798154996
*/
class Demo{
	public static void main(String[]args){
		String s ="Tanuja";
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		s="Raut";
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
	}
}