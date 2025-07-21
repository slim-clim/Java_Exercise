import java.util.Scanner;

public class DinnerParty extends Party {
    private int dinnerChoice;

    public int getDinnerChoice() {
        return dinnerChoice;
    }

    public void setDinnerChoice(int choice) {
        dinnerChoice = choice;
    }

    public static void main(String[] args) {
        DinnerParty aDinnerParty = new DinnerParty();
        int guests;
        int choice;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number of guests for the dinner party >> ");
        guests = keyboard.nextInt();
        aDinnerParty.setGuests(guests);

        System.out.print("Enter the menu option -- 1 for chicken or 2 for beef >> ");
        choice = keyboard.nextInt();
        aDinnerParty.setDinnerChoice(choice);

        System.out.println("The dinner party has " + aDinnerParty.getGuests() + " guests");
        System.out.println("Menu option " + aDinnerParty.getDinnerChoice() + " will be served");
        aDinnerParty.displayInvitation();

        keyboard.close(); // Close the Scanner to prevent resource leaks
    }
}