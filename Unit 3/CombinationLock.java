// Created by Brian Yu on 10/8/2017
public class CombinationLock {

    private int dialPosition;
    private int combination1, combination2, combination3;
    private boolean lockStatus;


    public CombinationLock(){
        this.dialPosition = 0;
        this.combination1 = 0;
        this.combination2 = 0;
        this.combination3 = 0;
        boolean lockStatus = true;
    }

    public CombinationLock(int dialPosition, int combination1, int combination2, int combination3, boolean lockStatus) {
        this.dialPosition = dialPosition;
        this.combination1 = combination1;
        this.combination2 = combination2;
        this.combination3 = combination3;
        this.lockStatus = lockStatus;
    }

    private void resetDial() {
        this.dialPosition = 0;
    }

    private void turnLeft(int turn) {
        this.dialPosition -= turn;
        if(this.dialPosition < 0) {
            this.dialPosition += 39;
        }
    }

    private void turnRight(int turn) {
        this.dialPosition += turn;
        if(this.dialPosition > 39) {
            this.dialPosition -=39;
        }
    }

    public boolean openLock(int turn1, int turn2, int turn3){
        turnRight(turn1);
        if(this.dialPosition == this.combination1){
            turnLeft(turn2);
            if (this.dialPosition == this.combination2){
                turnRight(turn3);
                if(this.dialPosition == this.combination3){
                    this.lockStatus = false;
                }
            }
        } else {
            this.lockStatus = true;
        }
        return this.lockStatus;
    }

    public int getDialPosition() {
        return dialPosition;
    }

    public void setDialPosition(int dialPosition) {
        this.dialPosition = dialPosition;
    }

    public int getCombination1() {
        return combination1;
    }

    public void setCombination1(int combination1) {
        this.combination1 = combination1;
    }

    public int getCombination2() {
        return combination2;
    }

    public void setCombination2(int combination2) {
        this.combination2 = combination2;
    }

    public int getCombination3() {
        return combination3;
    }

    public void setCombination3(int combination3) {
        this.combination3 = combination3;
    }

    public boolean isLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(boolean lockStatus) {
        this.lockStatus = lockStatus;
    }

    public void printComboLock(){
        System.out.println("The dial position for this lock is " + dialPosition + " and the combination for this lock is " + combination1 + ", " + combination2 + ", " + combination3 + " and the status of the lock is: " + lockStatus);
    }
}
