public class First {
    public void moveForward() {
        System.out.println("The robot is moving forward.");
    }

    public void turnLeft() {
        System.out.println("The robot is turning left.");
    }

    public void stop() {
        System.out.println("The robot has stopped.");
    }

    public static void main(String[] args) {
        autonrobot robot = new autonrobot();
        robot.moveForward();
        robot.turnLeft();
        robot.stop();
    }
}