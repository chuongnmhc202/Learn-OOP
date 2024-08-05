package House;

public class Main {
	public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House("B02", 3, true, 100.0, 2500000.0);

        System.out.println(house1);
        System.out.println(house2);
    }
}
