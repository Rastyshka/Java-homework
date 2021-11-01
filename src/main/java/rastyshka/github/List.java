package rastyshka.github;

public class List {
    public static void main(String[] args) {
        Country russia = new Country();
        russia.name = "Россия";
        russia.square = 17130000;
        russia.capital = "Москва";
        russia.population = 144.1;


        Country qazaqstan = new Country();
        qazaqstan.name = "Казахстан";
        qazaqstan.square = 2725000;
        qazaqstan.capital = "Нур-Султан";
        qazaqstan.population = 18.75;

        russia.countryName();
        russia.countryInfo();

        qazaqstan.countryName();
        qazaqstan.countryInfo();


    }
}
