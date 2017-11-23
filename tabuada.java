import java.util.*;
public class tabuada{//1
  public static void main(String[] args){//2
    Scanner lr = new Scanner(System.in);
    int i, c, r, t;
    float tt;
    System.out.printf("tabuada de qual algarismo?\n");
    System.out.printf("1) +\n2) -\n3) x\n4) ÷\n");
    System.out.printf("Opção: ");
    r = lr.nextInt();
    if (r == 3){//1
      System.out.printf("tabuada de qual numero?: ");
      i = lr.nextInt();
      for (c = 0; c < 13; c++){//2
        t = c * i;
        System.out.printf("%d x %d = %d\n", c, i, t);
// aqui termina o if
}//1
}//2
    else if (r == 2){//1
      System.out.printf("tabuada de qual numero?: ");
      i = lr.nextInt();
      for (c = 0; c < 13; c++){//2
        t = c - i;
        System.out.printf("%d - %d = %d\n", c, i, t);
//termina o segundo if
}//1
}//2
    else if (r == 1){//1
      System.out.printf("tabuada de qual numero?: ");
      i = lr.nextInt();
      for (c = 0; c < 13; c++){//2
        t = c + i;
        System.out.printf("%d + %d = %d\n", c, i, t);
}//1
}//2
    else if (r == 4){//1
      System.out.printf("tabuada de qual numero?: ");
      i = lr.nextInt();
      for (c = 0; c < 13; c++){//2
        tt = c / i;
        System.out.printf("%d ÷ %d = %f\n", c, i, tt);
}//1
}//2
   else{//3
     System.out.printf("não entendi!\n");
}//3
}//2
}//1
