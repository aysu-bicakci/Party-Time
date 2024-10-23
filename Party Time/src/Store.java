import java.util.Scanner;public class Store extends Location {    public Store(Character character) {        super(character);        getRayon();    }    Location location;    Scanner scan = new Scanner(System.in);    static int drinkCounter = 0;    static int foodCounter = 0;    static int desertCounter = 0;    static int decorationCounter = 0;    public void getRayon() {        System.out.println("-------REYONLAR-------\n");        System.out.println("1-İçecek Reyonu");        System.out.println("2-Yiyecek Reyonu");        System.out.println("3-Tatlılar Reyonu");        System.out.println("4-Süslemeler Reyonu");        System.out.println("5-Ana Menü\n");        System.out.print("Seçiminiz : ");        int selProduct = scan.nextInt();        System.out.println();        int selProductID;        switch (selProduct) {            case 1 -> {                selProductID = drinkMenu();                buyDrink(selProductID);            }            case 2 -> {                selProductID = foodMenu();                buyFood(selProductID);            }            case 3 -> {                selProductID = desertMenu();                buyDesert(selProductID);            }            case 4 -> {                selProductID = decorationMenu();                buyDecoration(selProductID);            }            case 5 -> getLocation();            default -> {                System.out.println("Geçerli bir işlem yapınız!");                getRayon();            }        }    }    public int drinkMenu() {        System.out.println("\nToplam paranız = "+character.getMoney());        System.out.println();        System.out.println("1- Kola \t \t \t Ücret:40");        System.out.println("2- Sprite \t \t \t Ücret:50");        System.out.println("3- Enerji içeceği \t Ücret:60");        System.out.println("4- Reyonlar\n");        System.out.print("Seçiminiz:");        return scan.nextInt();    }    public void buyDrink(int productID) {        int price = 0;        String drink = null;        if (productID > 0 && productID <= 4) {            switch (productID) {                case 1 -> {                    drink = "Kola";                    price = 40;                }                case 2 -> {                    drink = "Sprite";                    price = 50;                }                case 3 -> {                    drink = "Enerji içeceği";                    price = 60;                }                case 4 -> {                    System.out.println("Çıkış yapılıyor...\n");                    getRayon();                }            }            if (price > 0) {                if (character.getMoney() >= price) {                    character.getInv().setDrink(drink);                    character.setMoney(character.getMoney() - price);                    System.out.println(drink + " satın aldınız.");                    drinkCounter += 1;                    System.out.println("Kalan Paranız: " + character.getMoney());                } else {                    System.out.println("Yeterli paranız yok!\n");                }                System.out.println();                getRayon();            }        } else {            System.out.println("Geçerli bir işlem seçiniz:");            int newChoice = drinkMenu();            buyDrink(newChoice);        }    }    public int foodMenu() {        System.out.println("\nToplam paranız = "+character.getMoney());        System.out.println();        System.out.println("1- Abur Cubur \t Ücret:100");        System.out.println("2- Hamburger \t Ücret:200");        System.out.println("3- Pizza \t \t Ücret:150");        System.out.println("4- Reyonlar\n");        System.out.print("Seçiminiz:");        return scan.nextInt();    }    public void buyFood(int productID) {        int price = 0;        String food = null;        if (productID > 0 && productID <= 4) {            switch (productID) {                case 1 -> {                    food = "Abur Cubur";                    price = 100;                }                case 2 -> {                    food = "Hamburger";                    price = 200;                }                case 3 -> {                    food = "Pizza";                    price = 150;                }                case 4 -> {                    System.out.println("Çıkış yapılıyor...\n");                    getRayon();                }            }            if (price > 0) {                if (character.getMoney() >= price) {                    character.getInv().setFood(food);                    character.setMoney(character.getMoney() - price);                    System.out.println(food + " satın aldınız.");                    foodCounter += 1;                    System.out.println("Kalan Paranız: " + character.getMoney());                    getRayon();                } else {                    System.out.println("Yeterli paranız yok!\n");                    System.out.println();                    getRayon();                }            }        } else {            System.out.println("Geçerli bir işlem seçiniz:");            int newChoice = foodMenu();            buyFood(newChoice);        }    }    public int desertMenu() {        System.out.println("\nToplam paranız = "+character.getMoney());        System.out.println();        System.out.println("1- Pasta \t \t Ücret:300");        System.out.println("2- Kurabiye \t Ücret:200");        System.out.println("3- Magnolya \t Ücret:100");        System.out.println("4- Reyonlar\n");        System.out.print("Seçiminiz:");        return scan.nextInt();    }    public void buyDesert(int productID) {        int price = 0;        String desert = null;        if (productID > 0 && productID < 5) {            switch (productID) {                case 1 -> {                    desert = "Pasta";                    price = 300;                }                case 2 -> {                    desert = "Kurabiye";                    price = 200;                }                case 3 -> {                    desert = "Magnolya";                    price = 100;                }                case 4 -> {                    System.out.println("Çıkış yapılıyor...\n");                    getRayon();                }            }            if (price > 0) {                if (character.getMoney() >= price) {                    character.getInv().setDesert(desert);                    character.setMoney(character.getMoney() - price);                    System.out.println(desert + " satın aldınız.");                    desertCounter += 1;                    System.out.println("Kalan Paranız: " + character.getMoney());                } else {                    System.out.println("Yeterli paranız yok!\n");                }                System.out.println();                getRayon();            }        } else {            System.out.println("Geçerli bir işlem seçiniz:");            System.out.println("Geçerli bir işlem seçiniz:");            int newChoice = desertMenu();            buyDesert(newChoice);        }    }    public int decorationMenu() {        System.out.println("\nToplam paranız = "+character.getMoney());        System.out.println();        System.out.println("1- Balon \t \t Ücret:50");        System.out.println("2- Led Işık \t Ücret:300");        System.out.println("3- Maske \t \t Ücret:150");        System.out.println("4- Reyonlar\n");        System.out.print("Seçiminiz:");        return scan.nextInt();    }    public void buyDecoration(int productID) {        int price = 0;        String decoration = null;        if (productID > 0 && productID < 5) {            switch (productID) {                case 1 -> {                    decoration = "Balon";                    price = 50;                }                case 2 -> {                    decoration = "Led Işık";                    price = 300;                }                case 3 -> {                    decoration = "Maske";                    price = 150;                }                case 4 -> {                    System.out.println("Çıkış yapılıyor...\n");                    getRayon();                }            }            if (price > 0) {                if (character.getMoney() >= price) {                    character.getInv().setDecoration(decoration);                    character.setMoney(character.getMoney() - price);                    System.out.println(decoration + " satın aldınız.");                    decorationCounter += 1;                    System.out.println("Kalan Paranız: " + character.getMoney());                    System.out.println();                    getRayon();                } else {                    System.out.println("Yeterli paranız yok!\n");                    getRayon();                }            }        } else {            System.out.println("Geçerli bir işlem seçiniz:");            int newChoice = decorationMenu();            buyDecoration(newChoice);        }    }    public void getLocation() {        int loc = 0;        try {            System.out.println("---------Ana Menü--------\n");            System.out.println("1-Ev");            System.out.println("2-İşyeri");            System.out.print("\nGideceğiniz yeri seçin : ");            loc = scan.nextInt();            System.out.println();            if (loc != 1 && loc != 2) {                throw new FaultyInput("Geçerli bir değer girmediniz");            }        } catch (FaultyInput e) {            e.getMessage();            System.out.println("Tekrar tercih yapınız : ");            getLocation();        }        switch (loc) {            case 1 -> location = new Home(character);            case 2 -> location = new Workplace(character);        }    }}