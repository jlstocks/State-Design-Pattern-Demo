public class Door{
    //private state object
    private State currentState;

    //constructor
    public Door(){
        //initializes the currentState object as closed
        this.currentState = new ClosedState();
        System.out.println("Door closed.");
    }

    //method to change the state object
    public void changeState(State state){
        this.currentState = state;
    }

    //delegate all transitions to the currentState
    public void lockDoor(){
        currentState.lockDoor(this);
    }

    public void unlockDoor(){
        currentState.unlockDoor(this);
    }

    public void breakDoor(){
        currentState.breakDoor(this);
    }

    public void repairDoor(){
        currentState.repairDoor(this);
    }

    public void openDoor(){
        currentState.openDoor(this);
    }

    public void closeDoor(){
        currentState.closeDoor(this);
    }

    public void armAlarm(){
        currentState.armAlarm(this);
    }

    public void disarmAlarm(){
        currentState.disarmAlarm(this);
    }
}
