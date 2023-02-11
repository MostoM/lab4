public class Human {
    private String name;
    private int age;
    private double mass;
    private Planet planet;

    public Human(String name, int age, double mass) {
        this.name = name;
        this.age = age;
        this.mass = mass;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public double getWeight() {
        return planet.calculateWeight(mass);
    }

    public double jump(double speed) {
        try {
            if (speed <= 0) {
                throw new IllegalArgumentException("Скорость должна быть больше 0");
            }

            class JumpHeight { //Локальный класс
                public double jumpHeight() {
                    return (Math.pow(speed, 2) / (2 * planet.getG()));
                }
            }
            JumpHeight jumpable = new JumpHeight();
            return jumpable.jumpHeight();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}