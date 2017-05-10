class two {
	public void message (String b){
		System.out.println(b);
	}
}


class hello3 {
	public static void main (String args []){
		String b = "Hello again";
		two x = new two ();
		x.message (b); 
	}
}