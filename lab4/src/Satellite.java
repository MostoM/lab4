class Satellite {
    private String name;
    private double weight;
    private double orbitRadius;
    private double orbitPeriod;

    public Satellite(String name, double weight, double orbitRadius, double orbitPeriod) {
        this.name = name;
        this.weight = weight;
        this.orbitRadius = orbitRadius;
        this.orbitPeriod = orbitPeriod;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getOrbitRadius() {
        return orbitRadius;
    }

    public double getOrbitPeriod() {
        return orbitPeriod;
    }

    public void checkOrbitRadius() throws InvalidOrbitRadiusException {
        if (orbitRadius <= 0) {
            throw new InvalidOrbitRadiusException("Радиус орбиты должен являться положительным числом");
        }
    }

    public void checkOrbitPeriod() throws InvalidOrbitPeriodException {
        if (orbitPeriod <= 0) {
            throw new InvalidOrbitPeriodException("Период обращение должен быть больше 0");
        }
    }
}

class InvalidOrbitRadiusException extends Exception {
    public InvalidOrbitRadiusException(String message) {
        super(message);
    }
}

class InvalidOrbitPeriodException extends Exception {
    public InvalidOrbitPeriodException(String message) {
        super(message);
    }
}