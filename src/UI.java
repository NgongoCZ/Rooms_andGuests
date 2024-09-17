import java.util.Scanner;

public class UI {

    private Scanner uIScanner;


    public UI(Scanner uiScanner){
        this.uIScanner = uiScanner;
    }

    // start method that handles an entire logic
    public void start(){

        // creating new instance of Room class
        Room newRoom = createRoom();
        int personsInTheRoom = 0;

        while (newRoom.numberOfPersons() < newRoom.getNumberOfSpaces()){
            System.out.println("Add a new person into the room.");

            // creating a new instance of Person class
            Person newPerson = createPerson();

            // adding a new person into the personList
            System.out.println("Adding a new person in the room");
            newRoom.addPerson(newPerson);

            System.out.println("Do you want to add another guest ? y/n ");
            String answer = uIScanner.nextLine();

            if (answer.equals("n")){
                break;
            } else if (answer.equals("y")) {
                continue;
            }
            uIScanner.close();
        }

        // printing all information
        System.out.println("Room is complete. Do you want to print all the information about the " + newRoom.getRoomName() + " room ? y/n ");
        String answer = uIScanner.nextLine();

        if (answer.equals("n")){
            System.out.println("Have a nice day");
        } else if (answer.equals("y")) {
            System.out.println(newRoom);
            newRoom.printAllPersons();
        }
    }

    // method for creating a new Person
    public Person createPerson(){
        System.out.println("What is the name of the person ?");
        String personName = uIScanner.nextLine();

        System.out.println("How old is the person ?");
        int personAge = uIScanner.nextInt();
        uIScanner.nextLine();
        return new Person(personName, personAge);
    }

    // method for creating a new Room
    public Room createRoom(){
        System.out.println("What is the name of the room ?");
        String roomName = uIScanner.nextLine();

        System.out.println("How many spaces are available ?");
        int availableSpace = uIScanner.nextInt();
        uIScanner.nextLine();

        return new Room(roomName, availableSpace);
    }
}
