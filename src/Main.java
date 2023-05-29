public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println("За " + price + "р. будет начислено " + miles + " миль");
        System.out.println();

        price = 9_999;
        miles = service.calculate(price); // должно получиться 499
        System.out.println("За " + price + "р. будет начислено " + miles + " миль");
        System.out.println();

        price = 20;
        miles = service.calculate(price); // должно получиться 1
        System.out.println("За " + price + "р. будет начислено " + miles + " миль");
        System.out.println();

        price = 21;
        miles = service.calculate(price); // должно получиться 1
        System.out.println("За " + price + "р. будет начислено " + miles + " миль");
        System.out.println();

        price = 19;
        miles = service.calculate(price); // должно получиться 0
        System.out.println("За " + price + "р. будет начислено " + miles + " миль");
        System.out.println();

        price = 0;
        miles = service.calculate(price); // должно получиться 0
        System.out.println("За " + price + "р. будет начислено " + miles + " миль");
        System.out.println();

        price = 123_456_789;
        miles = service.calculate(price); // должно получиться 6172839
        System.out.println("За " + price + "р. будет начислено " + miles + " миль");
        System.out.println();
    }
}
