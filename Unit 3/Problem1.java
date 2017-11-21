// Created by Brian Yu on 10/8/2017
public class Problem1 {
    public static void main(String[] args){
        CombinationLock mickeyLock = new CombinationLock(0, 28, 17, 39, true);
        Locker mickeyMouse = new Locker("Mickey Mouse", 100, 3, false, mickeyLock);
        CombinationLock donaldLock = new CombinationLock(0, 35, 16, 27, true);
        Locker donaldDuck = new Locker("Donald Duck", 275, 0, false, donaldLock);
        mickeyMouse.openLocker();
        for(int i=0; i<3; i++) {
            mickeyMouse.putBookInLocker();
        }
        donaldDuck.removeBookFromLocker();
        mickeyMouse.printLocker();
        donaldDuck.printLocker();
    }
}
