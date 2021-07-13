package zadanie17;

public class AlertStatus {
    private Alert alert = new LowAlert();
    public void change(int i) {
        if (i == 1) {
            alert = new LowAlert();
        } else if (i == 2) {
            alert = new MidAlert();
        } else {
            alert = new HighAlert();}
    }

    public void checkStatus() {
       alert.status();
    }
}
