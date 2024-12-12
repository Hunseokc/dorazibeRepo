package Code;

public class Repeater {
    public Scan scan = new Scan();
    public void repeat(){
        int count = 0;
        int max = scan.returnInt();
        while (count<max) {
            count++;
        }
    }
}
