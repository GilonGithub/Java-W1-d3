import java.util.Scanner;

public class PickACard {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String output = "The card you picked is ";

        System.out.print("Pick a rank [1-Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11-Jack, 12-Queen, 13-King]: ");
        short rank = input.nextShort();

        System.out.print("Pick a suit [1-Clubs, 2-Diamonds, 3-Hearts, 4-Spades]: ");
        short suit = input.nextShort();

        switch(rank) {
            case 1: output = output + "Ace"; break;
            case 2: //output = output + Short.toString(rank); break;
            case 3: 
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: output = output + Short.toString(rank); break;
            case 11: output = output + "Jack"; break;
            case 12: output = output + "Queen"; break;
            case 13: output = output + "King"; break;
            default: output = output + "an invalid rank"; break;
        }

        switch(suit) {
            case 1: output = output + " of Clubs"; break;
            case 2: output = output + " of Diamonds"; break;
            case 3: output = output + " of Hearts"; break;
            case 4: output = output + " of Spades"; break;
            default: output = " of invalid suit!"; break;
        }

        System.out.println(output);
    }
}
