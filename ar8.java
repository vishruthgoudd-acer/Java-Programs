public class ar8 
{
    public static void main(String[] args)
    {
        int[][] zer = new int[4][4];
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==j){
                    System.out.print(" 0");
                }else
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
    
}

