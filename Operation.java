class Operation{
public static void main(String[] args){
int numb=153,sum=0,count=0,temp=numb;
while(numb!=0){
	numb=numb/10;
	count++;
}
numb=temp;
while(numb!=0){
	int rem=numb%10;
	int power=count;
	int powgen=1;
	while(power>0){
		powgen=powgen*rem;
		power--;
	}
	sum=sum+powgen;
	numb=numb/10;
}
String res=(temp==sum)?"Armstrong":"Not Armstrong";
System.out.println(res);
}
}
