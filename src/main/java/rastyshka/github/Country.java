package rastyshka.github;

public class Country {
    public String name;
    public int square;
    public String capital;
    public double population;

    public void countryName() {
        System.out.println("Название страны:" + name);
    }

    public void countryInfo() {
        System.out.println(("Столица:" + capital));
        System.out.println(("Численность населения:" + population + " миллиона человек"));
        System.out.println(("Площадь:" + square + " км²"));
    }
}
