class weather {
	public static void main (String args []){
	
	boolean summerA = true; 
	
	if (summerA == true) {
	System.out.println("it's summer!");
	}
	else { System.out.println("relax, it's not summer");
	}
	
	int temp = 75;
	
	if (temp > 60 && temp <90){		
	System.out.println("Summer");
	}
	else if(temp < 60 || temp >90) {
	System.out.println("Not Summer");	
	}
	} 
}

