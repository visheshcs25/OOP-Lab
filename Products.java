import java.util.Scanner;


public class Products {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int max = arr[0];
        int least = arr[0];
        int sum = 0;
        int count = 0;

        
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Enter " + (i+1) +" element: ");
            int inp = scanner.nextInt();
            arr[i] = inp;
        }
        
        for (int i = 0; i < 10; i++)
        {
            if (arr[i] > max)
                {max = arr[i];}
        }
        System.out.println("Max: "+max);

        for (int i = 0; i < 10; i++)
        {
            if (arr[i] < least)
                {least = arr[i];}
        }
        System.out.println("Least: "+least);

        for (int i = 0; i < 10; i++)
        {  
            sum = sum + arr[i];
        }
    
        int average=(sum/10);
        System.out.println("Average: "+average);

        for (int i = 0; i < 10; i++)
        {  
            if (arr[i] > 1000)
            {
                count = count + 1;
            }
        }
        System.out.println("Number of producs priced higher than 1000: "+count);
    }
}
