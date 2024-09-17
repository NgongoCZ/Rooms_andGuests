import java.util.Scanner;

public class UI {

    private Scanner uIScanner;


    public UI(Scanner uiScanner){
        this.uIScanner = uiScanner;
    }

    // start method that handles an entire logic
    public void start(){
        System.out.println("Write a name of the room");
        String roomName = uIScanner.nextLine();

        System.out.println("How many spaces are available ?");
        int numOfSpaces = uIScanner.nextInt();
        uIScanner.nextLine();

        // creating new instance of Room class
        Room newRoom = new Room(roomName, numOfSpaces);
        int personsInTheRoom = 0;

        while (personsInTheRoom < newRoom.getNumberOfSpaces()){
            Scanner personScanner = new Scanner(System.in);
            System.out.println("Add a new person into the room.");
            System.out.println("What is the name of the person ? ");
            String personName = personScanner.nextLine();

            System.out.println("How old is the person ?");
            int personAge = personScanner.nextInt();
            personScanner.nextLine();

            //creating a new instance of Person class
            Person newPerson = new Person(personName, personAge);

            System.out.println("Adding a new person in the room");

            // adding a new person into the personList
            newRoom.addPerson(newPerson);
            personsInTheRoom++;

            System.out.println("Do you want to add another guest ? y/n ");
            String answer = uIScanner.nextLine();

            if (answer.equals("n")){
                break;
            } else if (answer.equals("y")) {
                continue;
            }
            personScanner.close();
        }

        // printing all information
        System.out.println("Room is complete. Do you want to print all the information about the " + newRoom.getRoomName() + " room ? y/n ");
        String answer = uIScanner.nextLine();

        if (answer.equals("n")){
            System.out.println("Have a nice day");
        } else if (answer.equals("y")) {
            newRoom.updateNumberOfPeople();
            System.out.println(newRoom);
            newRoom.printAllPersons();
        }
    }
}
