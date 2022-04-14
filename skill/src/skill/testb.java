 package skill;
import java.util.Scanner;

public class testb{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String line;
        System.out.print("Sentence: ");
        line = scanner.nextLine();
        char phrase[] = line.toCharArray();
        int i = 0;
        int n = 0;

        while(phrase[i] != '\0') {
            if(phrase[i] == ' ') {
                for(n=i; n<phrase.length; n++) {
                    phrase[n] = phrase[n+1];
                }
            }
            i++;
        }

        String output = new String(phrase);
        System.out.print(output);
    }
}