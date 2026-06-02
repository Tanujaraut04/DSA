
/*
1.Character Array of immutable..
Before Changes....
h
e
l
l
o
After Changes....
y
e
l
l
o*/
class Demo{
	public static void main(String[]args){
		char[]arr={'h','e','l','l','o'};
		System.out.println("Before Changes....");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("After Changes....");
		arr[0]='y';
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}