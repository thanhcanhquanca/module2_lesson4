package hop_4;

public class MainFan {
    public static void main(String[] args) {

        final int SNOW = 1;
        final int MEDIUM = 2;

        Fan fan1 = new Fan();
        fan1.setRadius(5);
        fan1.setSpeed(SNOW);
        fan1.setColor("blue");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setRadius(3);
        fan2.setColor("green");
        fan2.setOn(false);


        System.out.println("Fan 1: " + fan1.getSpeed());
        System.out.println("Fan 2: " + fan2.toString());

    }
}
