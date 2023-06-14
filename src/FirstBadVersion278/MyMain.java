package FirstBadVersion278;

public class MyMain {
    public static void main(String[] args) {
        MyMain myMain = new MyMain();
        System.out.println(myMain.firstBadVersion(3));
    }
    public int firstBadVersion(int n) {
        int startDiapazon = 1;
        int endDiapazon = n;

        while (startDiapazon != endDiapazon) {
            if (startDiapazon + 1 == endDiapazon) {
                return isBadVersion(startDiapazon) ? startDiapazon : endDiapazon;
            }
            if (isBadVersion(startDiapazon + ((endDiapazon - startDiapazon) / 2))) {
                endDiapazon = startDiapazon + ((endDiapazon - startDiapazon) / 2);
            } else {
                startDiapazon = startDiapazon + ((endDiapazon - startDiapazon) / 2);
            }
        }
        return endDiapazon;
    }

    private boolean isBadVersion(int i) {
        System.out.println(i);
        return 1 <= i;
    }
}
