import java.util.Random;

class Landscape {
    private String type;

    public Landscape(String type) {
        this.type = type;
    }

    public String getWeather() {
        Random random = new Random();
        int weather = random.nextInt(3);

        WeatherSupplier supplier = new WeatherSupplier() { //Анонимный класс
            @Override
            public String getWeather() {
                switch (weather) {
                    case 0: return "Sunny";
                    case 1: return "Rainy";
                    case 2: return "Snowy";
                    default: return "Unknown";
                }
            }
        };

        return supplier.getWeather();
    }

    private interface WeatherSupplier {
        String getWeather();
    }
}
