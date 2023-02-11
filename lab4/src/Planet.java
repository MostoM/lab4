public class Planet {
    private String name;
    private double g;

    private Weather weather;

    public Weather getWeather() {
        return weather;
    }

    public Planet(String name, double g) {
        this.name = name;
        this.g = g;
    }

    public double getG(){
        return g;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public void printWeather() {
        System.out.println("The current weather on the planet is: " + weather);
    }
    public double calculateWeight(double mass) {
        return mass * g;
    }

    public static class Weather {           //Вложенный класс
        private String description;
        private int temperature;

        public Weather(String description, int temperature) {
            this.description = description;
            this.temperature = temperature;
        }

        public String getDescription() {
            return description;
        }

        public int getTemperature() {
            return temperature;
        }
    }
}
