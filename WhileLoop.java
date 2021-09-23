class WhileLoop{
public static void main(String[] args){
int outer=3;
while(outer>=0){
int inner=1;
while(inner<=2){
System.out.println(outer+""+inner);
++inner;
}
if(outer==1){
break;
}
}
System.out.println(outer);
}
}
