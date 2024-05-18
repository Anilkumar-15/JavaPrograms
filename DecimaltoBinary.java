public class  DecimaltoBinary {

  public static void main(String [] args){
     int n = 30;
int t = n;
     String s = "";
     while(n > 0){
       s = n % 2 + s; 
	n /= 2;
     }
System.out.println(t + " in binary " + s);
   }
}