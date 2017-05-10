class three {
	public void message (int a){
		System.out.println("hello world4");
	}
	
	public static String greeting(String s)
{
    return s;
}
}

class hellomate {
	public static void main (String args []){
		String b = "Hello again";
		three x = new three ();
		x.greeting (b); 
	}
}