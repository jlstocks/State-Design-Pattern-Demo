public class LockedState implements State {
    
    @Override
    public void lockDoor(Door door){
        System.out.println("LOCKED: Door is already locked.");
    }

    @Override
    public void unlockDoor(Door door){
        System.out.println("LOCKED -> CLOSED: Door is now unlocked.");
        door.changeState(new ClosedState());
    }

    @Override
    public void breakDoor(Door door){
        System.out.println("LOCKED -> BROKEN: Understandable.");
        door.changeState(new BrokenState());
    }

    @Override
    public void repairDoor(Door door){
        System.out.println("LOCKED: Door is not broken.");
    }

    @Override
    public void openDoor(Door door){
        System.out.println("LOCKED: Door cannot be opened.");
    }

    @Override
    public void closeDoor(Door door){
        System.out.println("LOCKED: Door is already closed.");
    }

    @Override
    public void armAlarm(Door door){
        System.out.println("LOCKED -> ALARM: Door's alarm is armed.");
        door.changeState(new AlarmState());
    }

    @Override
    public void disarmAlarm(Door door){
        System.out.println("LOCKED: Door's alarm is already disarmed.");
    }
}