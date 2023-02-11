public class Main {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 9.8);
        Human Neznaika = new Human("Neznaika", 30, 34);
        Human Ponchik = new Human("Ponchik", 25, 50);
        Neznaika.setPlanet(earth);

        double speed = 10.0;
        double height = Neznaika.jump(speed);
        System.out.println("Высота прыжка: " + height + " метров");
    }
}