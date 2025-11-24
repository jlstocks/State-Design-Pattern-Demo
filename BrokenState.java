public class BrokenState implements State {
    
    @Override
    public void lockDoor(Door door){
        System.out.println("BROKEN: Can't lock a broken door.");
    }

    @Override
    public void unlockDoor(Door door){
        System.out.println("BROKEN: Can't unlock a broken door.");
    }

    @Override
    public void breakDoor(Door door){
        System.out.println("BROKEN: Again?");
    }

    @Override
    public void repairDoor(Door door){
        System.out.println("BROKEN -> CLOSED: My door is back!");
        door.changeState(new ClosedState());
    }

    @Override
    public void openDoor(Door door){
        System.out.println("BROKEN: Can't open a broken door.");
    }

    @Override
    public void closeDoor(Door door){
        System.out.println("BROKEN: Can't close a broken door.");
    }

    @Override
    public void armAlarm(Door door){
        System.out.println("BROKEN: Can't arm a broken door.");
    }

    @Override
    public void disarmAlarm(Door door){
        System.out.println("BROKEN: Door has been neutralized. Again.");
    }
}