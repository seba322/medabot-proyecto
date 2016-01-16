public class Contadora {
public int contador=0;
public Contadora(){
while(contador < 10){
new Contadora(contador=contador+1);
}
}
public Contadora(int i){
contador=i;
}
public static void main(String[] args){
Contadora j =new Contadora();
System.out.println(j.contador);
}
}
