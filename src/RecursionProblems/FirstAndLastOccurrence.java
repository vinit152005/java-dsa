package RecursionProblems;

import java.util.Scanner;
public class FirstAndLastOccurrence {
    public static int first = -1;
    public static int last = -1;

    public static void occ(String str , int idx , char element){
        if (idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        occ(str , idx+1 , element);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char element = input.next().charAt(0);
        int idx = 0;
        occ(str , idx , element);
    }
}