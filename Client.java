public class Client{
    //client class for state design pattern demo
    public static void main(String[] args){
        //initialize a door object
        Door door = new Door();

        //show standard door behavior
        System.out.println("DOOR STANDARD TESTS");
        door.openDoor(); //Closed -> Open
        door.closeDoor(); //Open -> Closed
        door.lockDoor(); //closed -> locked
        door.unlockDoor(); //locked -> closed
        door.armAlarm(); //closed -> armed
        door.disarmAlarm(); //alarm -> closed
        System.out.println("");

        //now break the door.
        System.out.println("DOOR BREAK TESTS");
        door.breakDoor(); //closed -> broken
        door.repairDoor(); //broken -> closed
        door.lockDoor(); //closed -> locked
        door.breakDoor(); //locked -> broken
        door.repairDoor(); //broken -> closed
        door.armAlarm(); //closed -> alarm
        door.breakDoor(); //alarm -> broken
        door.repairDoor(); //broken -> closed
        System.out.println("");

        //now test some security
        System.out.println("DOOR ALARM TESTS");
        door.armAlarm(); //closed -> alarm
        door.openDoor(); //ERROR: open armed door
        door.armAlarm(); //alarm already armed
        door.lockDoor(); //alarm -> locked
        door.openDoor(); //ERROR: can't open locked door
        System.out.println("");

        //finally some error tests
        System.out.println("DOOR ERROR TESTS");
        door.lockDoor(); //ERROR: Already locked
        door.unlockDoor(); //Locked -> closed
        door.unlockDoor(); //ERROR: Already unlocked
        door.openDoor(); //closed -> open
        door.lockDoor(); //ERROR: cant lock open door
        door.closeDoor(); //open -> closed
        door.disarmAlarm(); //ERROR: alarm isnt enabled
        door.breakDoor(); //just break the door
        door.breakDoor(); //break it again.
    }
}