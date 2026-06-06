import java.util.Scanner;
public class MoveXToEnd {
    public static int count = 0;
    public static void newStr(String str , int idx){
        if(idx == str.length()){
            for(int i = 0; i < count; i++){
                System.out.print("x");
            }
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
        }
        else{
            System.out.print(currChar);
        }
        newStr(str,idx+1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idx = 0;
        String str = input.next();
        newStr(str , idx);
    }
}
