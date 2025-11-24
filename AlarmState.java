public class AlarmState implements State {
    
    @Override
    public void lockDoor(Door door){
        System.out.println("ALARM -> LOCKED: Door is now locked.");
        door.changeState(new LockedState());
    }

    @Override
    public void unlockDoor(Door door){
        System.out.println("ALARM -> CLOSED: Door is now unlocked.");
        door.changeState(new ClosedState());
    }

    @Override
    public void breakDoor(Door door){
        System.out.println("ALARM -> BROKEN: Beep! Beep! The authorities have your location.");
        door.changeState(new BrokenState());
    }

    @Override
    public void repairDoor(Door door){
        System.out.println("ALARM: Door is not broken.");
    }

    @Override
    public void openDoor(Door door){
        System.out.println("ALARM: Alarm triggered. Cannot open door while alarm is active.");
        door.changeState(new OpenState());
    }

    @Override
    public void closeDoor(Door door){
        System.out.println("ALARM -> CLOSED: Door is now closed.");
        door.changeState(new ClosedState());
    }

    @Override
    public void armAlarm(Door door){
        System.out.println("ALARM: Door's alarm is already armed.");
    }

    @Override
    public void disarmAlarm(Door door){
        System.out.println("ALARM -> CLOSED: Door's alarm has been disarmed.");
        door.changeState(new ClosedState());
    }
}