public class ClosedState implements State {
    
    @Override
    public void lockDoor(Door door){
        System.out.println("CLOSED -> LOCKED: Door is now locked.");
        door.changeState(new LockedState());
    }

    @Override
    public void unlockDoor(Door door){
        System.out.println("CLOSED: Door is already unlocked.");
    }

    @Override
    public void breakDoor(Door door){
        System.out.println("CLOSED -> BROKEN: Really? Just open it next time.");
        door.changeState(new BrokenState());
    }

    @Override
    public void repairDoor(Door door){
        System.out.println("CLOSED: Door is not broken.");
    }

    @Override
    public void openDoor(Door door){
        System.out.println("CLOSED -> OPEN: Door is now open.");
        door.changeState(new OpenState());
    }

    @Override
    public void closeDoor(Door door){
        System.out.println("CLOSED: Door is already closed.");
    }

    @Override
    public void armAlarm(Door door){
        System.out.println("CLOSED -> ALARM: Door's alarm is armed.");
        door.changeState(new AlarmState());
    }

    @Override
    public void disarmAlarm(Door door){
        System.out.println("CLOSED: Door's alarm is already disarmed.");
    }
}