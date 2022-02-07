package ex_2;

public class ex_2 {

    public static void s(int number)
    {
        int k = 2;
        while (number >1)
        {
            if(number % k == 0) {
                System.out.print(k + " ");
                number /=k;
            }
            else
            {
                if( k ==2)
                    k++;
                else
                    k+=2;
            }


        }
    }


    public static void main(String[] args) {
        s(8);
    }
    }

