import java.util.Scanner;
import java.lang.Math;

public class ScissorRockPaper {
    
    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in);
        String output = "The computer is ";

        System.out.print("Select scissor(0), rock(1), paper(2): ");
        short pick = input.nextShort();

        short AI = (short)(Math.random() * 3);

        switch(AI) {
            case 0: output += "scissor. "; break;
            case 1: output += "rock. "; break;
            case 2: output += "paper. "; break;
        }

        switch(pick) {
            case 0: output += "You are scissor"; break;
            case 1: output += "You are rock"; break;
            case 2: output += "You are paper"; break;
        }



        if((pick == 0 && AI == 0) || (pick == 1 && AI == 1) || (pick == 2 && AI == 2)) {
            System.out.println(output + " too. It is a draw");
        } else if ((pick == 0 && AI == 2) || (pick == 1 && AI == 0) || (pick == 2 && AI == 1)) {
            System.out.println(output + ". You won");
        } else if ((pick == 2 && AI == 0) || (pick == 0 && AI == 1) || (pick == 1 && AI == 2)) {
            System.out.println(output + ". You lost");
        } else {
            System.out.println("Invalid pick!");
        }
    }



}
