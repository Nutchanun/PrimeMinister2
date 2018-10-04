import java.util.*;
class PrimeMinister
{
    public static void main(String[] args) 
	{   Scanner sc = new Scanner(System.in);
        String a[] = new String[6];
        int b [][] = new int [6][3];
        for (int i = 1; i< 6 ;i++){
            System.out.print("ID : ");
            b[i][1] = sc.nextInt();
            System.out.print("Name : ");
            sc.nextLine();
			a[i] = sc.nextLine();
            
        }
        for(int i = 1 ; i < 201 ; i++) {
            System.out.print(" Vote : ");
           int v = sc.nextInt();
           b[v][2]++;
           System.out.println("Vote : " + b[v][1]);
		   System.out.println("Name : " + a[v]);
        }
        int max = 1;
        for (int i = 2; i< 6 ;i++){
            if (b[max][2] < b[i][2] )
				max = i ;
        }
            System.out.print(" Congratulations : ");
			System.out.println(a[max]+" "+""+b[max][2]);

        
            
     }   

    

}