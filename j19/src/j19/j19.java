package j19;

public class j19 {
	j19(String a, String b, String c){
		System.out.println("This is a constructor with String "+a+"+String"+b+"+String "+c);
	}
	j19(String a, String b, int c){
		System.out.println("This is a constructor with String "+a+"+String"+b+"+int "+c);
	}

	j19(String a, int b, int c){
		System.out.println("This is a constructor with String "+a+"+int"+b+"+int "+c);
	}
	
	public static void main(String args[]){
		new j19("a","b","c");
		new j19("a","b",20);
		new j19("a",12,30);
	}
}
