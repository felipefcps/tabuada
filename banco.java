public class banco{
  public int input;
  int loop;
  int t;
  public void somar(){
    for (loop = 0; loop < 13; loop++){
      t = loop + input;
      System.out.printf ("%d + %d = %d\n", loop, input, t);


    }



  }
  public void diminuir(){
    for (loop = 0; loop < 13; loop++){
      t = loop - input;
      if (t < 0){ 
        System.out.printf ("%d - %d = 0\n", loop, input);
      }
      else{

      System.out.printf ("%d - %d = %d\n", loop, input, t);
      }

    }

  }
  public void dividir(){
    double tv;
    for (loop = 0; loop < 13; loop++){
      tv = loop / input;
      if (t < 0){ 
        System.out.printf ("%d ÷ %d = 0\n", loop, input);
      }
      else{

      System.out.printf ("%d ÷ %d = %f\n", loop, input, tv);
     }  
  }


  }
  public void multiplicar(){
    
    for (loop = 0; loop < 13; loop++){
      t = loop * input;
      System.out.printf ("%d x %d = %d\n", loop, input, t);


    }
  }


}
