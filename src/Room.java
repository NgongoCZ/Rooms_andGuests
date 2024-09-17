import java.util.ArrayList;

public class Room {

    private String roomName;
    private int numberOfSpaces;
    private ArrayList<Person>personList;

    public Room(String roomName, int numberOfSpaces){
        this.roomName = roomName;
        this.numberOfSpaces = numberOfSpaces;
        this.personList = new ArrayList<>();
    }

    public void addPerson(Person person){
        personList.add(person);
    }

    public String getRoomName(){
        return this.roomName;
    }

    public int getNumberOfSpaces(){
        return this.numberOfSpaces;
    }

    public void printAllPersons(){
        for (Person person : personList){
            System.out.println(person);
        }
    }

    public int numberOfPersons(){
        return personList.size();
    }

@Override
    public String toString(){
        return "Room name: " + this.roomName + ", Max number of people: " + this.numberOfSpaces + ", Number of people: " + numberOfPersons();
    }

}
