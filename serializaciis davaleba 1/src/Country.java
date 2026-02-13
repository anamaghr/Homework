public class Country {
    String CountryName;
    int CountryPopulation;
    double CountryArea;

    public Country(String countryName, int countryPopulation, double countryArea) {
        CountryName = countryName;
        CountryPopulation = countryPopulation;
        CountryArea = countryArea;
    }

    public String getCountryName() {
        return CountryName;
    }

    public int getCountryPopulation() {
        return CountryPopulation;
    }

    public double getCountryArea() {
        return CountryArea;
    }

    @Override
    public String toString() {
        return "Country{" +
                "CountryName='" + CountryName + '\'' +
                ", CountryPopulation=" + CountryPopulation +
                ", CountryArea=" + CountryArea +
                '}';
    }
}
