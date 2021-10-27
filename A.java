class A{
public static void main(String[] args){
	
	
	int numb1 = 1;	
for(int numb=1;numb<=145;numb++){
	//int numb=145;	
	int sum=0;
	
	while(numb!=0 && numb1!=0){
		int rem = numb%10;
		int fact = 1;
		
	while(rem!=0){		
	    fact = fact * rem;	
        --rem;		
	}
	sum = sum+fact;
	numb1 = numb/10;	
	
}
   
	System.out.println(sum);
}
}
}