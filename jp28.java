import java.util.Scanner;
public class jp28 
{
    static boolean ip(String str,int start,int end){
        if (start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return ip(str,start+1,end-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        if(ip(str,0,str.length()-1)){
            System.out.println(str + " is a palindrome.");
        }
        else{
            System.out.println(str + " is not a palindrome.");
        }
    }
    

    }
    
