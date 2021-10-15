class Armstrong{
public static void main(String[] args){
for(int i=1;i<=1000;i++){
int sum=0,count=0,numb=i,temp=i;
while(numb!=0){
numb=numb/10;
count++;
}
numb=i;
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
if(temp==sum){
System.out.println(temp);
}
}
}
}