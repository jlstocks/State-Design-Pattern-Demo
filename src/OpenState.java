public class OpenState implements State {
    
    @Override
    public void lockDoor(Door door){
        System.out.println("OPEN -> LOCKED: Door is now locked.");
        door.changeState(new LockedState());
    }

    @Override
    public void unlockDoor(Door door){
        System.out.println("OPEN: Door is already unlocked.");
    }

    @Override
    public void breakDoor(Door door){
        System.out.println("OPEN -> BROKEN: Thats just rude.");
        door.changeState(new BrokenState());
    }

    @Override
    public void repairDoor(Door door){
        System.out.println("OPEN: Door is not broken.");
    }

    @Override
    public void openDoor(Door door){
        System.out.println("OPEN: Door is already open.");
    }

    @Override
    public void closeDoor(Door door){
        System.out.println("OPEN -> CLOSED: Door is now closed.");
        door.changeState(new ClosedState());
    }

    @Override
    public void armAlarm(Door door){
        System.out.println("OPEN -> ALARM: Door's alarm is armed.");
        door.changeState(new AlarmState());
    }

    @Override
    public void disarmAlarm(Door door){
        System.out.println("OPEN: Door's alarm is already disarmed.");
    }
}