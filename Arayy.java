//LEVEL 00
//This code generates a number pattern using 2d array
public class Arayy {
    public static void main(String[] args){
        
        int[][] numb = new int[5][];
        numb[0] = new int[1];
        numb[1] = new int[2];
        numb[2] = new int[3];
        numb[3] = new int[4];
        numb[4] = new int[5];
        int i,j;
        int k = 0;

            //Loop to make and print the generated pattern
            for (i=0;i<5;i++){
                for (j=0;j<i+1;j++){
                    numb[i][j] = k;
                    System.out.print(numb[i][j] + " " );
                    k++;
                }
                System.out.println();
            }
    }
}
