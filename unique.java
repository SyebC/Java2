class unique
{
	public static void main(String args[]){
		int num1 = 4;
		int num2 = 5;
		int num3 = 4;
		int num4 = 0;
		
		int result = num1 + num2 + num3; 
		
		if (num1 == num2 && num1 == num3){
		System.out.println(num4);}
		if (num2 == num1 && num2 == num3){
		System.out.println(num4);}
		if (num3 == num2 && num3 == num1){
		System.out.println(num4);}
		else {
		System.out.println("sum:" + result);
	}
}
}
		
	