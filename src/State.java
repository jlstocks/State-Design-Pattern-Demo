//interface responsible for handling transitions
public interface State{
    void lockDoor(Door door);
    void unlockDoor(Door door);
    void breakDoor(Door door);
    void repairDoor(Door door);
    void openDoor(Door door);
    void closeDoor(Door door);
    void armAlarm(Door door);
    void disarmAlarm(Door door);
}