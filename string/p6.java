/*op:Tanuja
925858445
TanujaRaut
798154996 
object banle aahet 
Scp:1 object*/
class Demo{
	public static void main(String[]args){
		String s ="Tanuja";
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		s=s.concat("Raut");
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
	}
}