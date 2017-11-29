import java.util.*;
class main{
  public static void main(String[] args){
  int r;
  Scanner l = new Scanner(System.in);
  banco dd = new banco();
  System.out.printf ("Tabuada de qual operação?\n(1) + (2) - (3) ÷ (4) x\nOpção: ");
  r = l.nextInt();
  System.out.printf ("Tabuada de qual numero: ");
  dd.input = l.nextInt();
  if (r == 1){
    dd.somar();
  }
  else if (r == 2){
    dd.diminuir();
  }
  else if (r == 3){
    dd.dividir();
  }
  else if (r == 4){
    dd.multiplicar();
  }
  else{
    System.out.printf ("Operação inválida!\n");
  }


  }




}
