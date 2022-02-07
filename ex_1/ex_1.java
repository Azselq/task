package ex_1;



public class ex_1 {
    public static int S_string(String str)
    {
        String s = "0" ;

      if(str=="")
      {
          System.out.println("0");
      }
      int sum = 0;
      for(int i =0; i<str.length();i++) {
          char symbol = str.charAt(i);
          if (Character.isDigit(symbol))
          {
              s += symbol;
              sum += Integer.parseInt(s);
              s="0";

          }


      }
      return  sum;
    }

    public static void main (String[] args) {
        String ex1 = "asd7das1kolp9";
        System.out.println(S_string(ex1));

    }
    }
