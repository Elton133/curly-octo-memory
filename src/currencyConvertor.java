import java.util.Scanner;

public class currencyConvertor {
    static double convertedAmount;
    static int currencyToconvertFrom;
    static String currencyToConvertTo;

    public class mainConvertor {
        // USD TO OTHER CURRENCIES
        static double usdtoEur = 0.92;
        static double usdtoGbp = 0.79;
        static double usdtoJpy = 156.51;

        // EUR TO OTHER CURRENCIES
        static double eurtoUsd = 1.08;
        static double eurtoGbp = 0.85;
        static double eurtoJpy = 169.58;

        // GBP TO OTHER CURRENCIES
        static double gbptoUsd = 1.27;
        static double gbptoEur = 1.18;
        static double gbptoJpy = 199.31;

        // JPY TO OTHER CURRENCIES
        static double jpytoUsd = 0.0064;
        static double jpytoEur = 0.0059;
        static double jpytoGbp = 0.0050;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("WELCOME TO THE CURRENCY CONVERTOR");
        System.out.println("--------------------------------------");

        double convertedAmount = 0.0;
        System.out.println("Type start to begin or exit to end");
        String start = scanner.nextLine();
        String startCounter = start.toLowerCase();

        while (startCounter.equals("start")) {
            System.out.println(
                    "Available Currencies\n1.United States Dollar-USD\n2.Euro-EUR\n3.British Pounds-GBP\n4.Japanese Yen-JPY");
            String currency = scanner.nextLine();

            switch (currency) {

                case "USD":
                case "1":
                    System.out.println("US DOLLAR CONVERSION");
                    USD(convertedAmount, currency, scanner);
                    break;
                case "EUR":
                case "2":
                    System.out.println("EURO CONVERSION");
                    EUR(convertedAmount, currency, scanner);
                    break;
                case "GBP":
                case "3":
                    System.out.println("GREAT BRITAIN POUNDS CONVERSION");
                    GBP(convertedAmount, currency, scanner);
                    break;
                case "JPY":
                case "4":
                    System.out.println("JAPANESE YEN CONVERSION");
                    JPY(convertedAmount, currency, scanner);
                    break;
                default:
                    System.out.println("INVALID OPTION, PLEASE TRY AGAIN");
                    break;
            }
            System.out.println("Do you wish to start again or exit, Enter start or exit");
            start = scanner.nextLine();
            startCounter = start.toLowerCase();

        }
        scanner.close();
    }

    private static void EUR(double amount, String toCurrency, Scanner scanner) {
        amount = 0.0;
        System.out.print("Enter the amount you want to convert: ");
        amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter the currency you want to convert to: ");
        currencyToConvertTo = scanner.nextLine();
        switch (currencyToConvertTo) {
            case "USD":
            case "1":
                convertedAmount = amount * mainConvertor.eurtoUsd;
                System.out.println("Converted amount: " + convertedAmount + " USD");
                break;
            case "GBP":
            case "2":
                convertedAmount = amount * mainConvertor.eurtoGbp;
                System.out.println("Converted amount: " + convertedAmount + " GBP");
                break;

            case "JPY":
            case "3":
                convertedAmount = amount * mainConvertor.eurtoJpy;
                System.out.println("Converted amount: " + convertedAmount + " JPY");
                break;
        }

    }

    private static void GBP(double amount, String toCurrency, Scanner scanner) {
        amount = 0.0;
        System.out.print("Enter the amount you want to convert: ");
        amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter the currency you want to convert to: ");
        currencyToConvertTo = scanner.nextLine();
        switch (currencyToConvertTo) {

            case "USD":
            case "1":
                convertedAmount = amount * mainConvertor.gbptoUsd;
                System.out.println("Converted amount: " + convertedAmount + " USD");
                break;

            case "EUR":
            case "2":
                convertedAmount = amount * mainConvertor.gbptoEur;
                System.out.println("Converted amount: " + convertedAmount + " EUR");
                break;

            case "JPY":
            case "3":
                convertedAmount = amount * mainConvertor.gbptoJpy;
                System.out.println("Converted amount: " + convertedAmount + " JPY");
                break;
        }

    }

    private static void JPY(double amount, String toCurrency, Scanner scanner) {
        amount = 0.0;
        System.out.print("Enter the amount you want to convert: ");
        amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter the currency you want to convert to: ");
        currencyToConvertTo = scanner.nextLine();
        switch (currencyToConvertTo) {

            case "USD":
            case "1":
                convertedAmount = amount * mainConvertor.jpytoUsd;
                System.out.println("Converted amount: " + convertedAmount + " USD");
                break;

            case "EUR":
            case "2":
                convertedAmount = amount * mainConvertor.jpytoEur;
                System.out.println("Converted amount: " + convertedAmount + " EUR");
                break;

            case "GBP":
            case "3":
                convertedAmount = amount * mainConvertor.gbptoJpy;
                System.out.println("Converted amount: " + convertedAmount + " GBP");
                break;
        }

    }

    private static void USD(double amount, String toCurrency, Scanner scanner) {
        amount = 0.0;
        System.out.print("Enter the amount you want to convert: ");
        amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter the currency you want to convert to: ");
        currencyToConvertTo = scanner.nextLine();
        switch (currencyToConvertTo) {

            case "EUR":
            case "1":
                convertedAmount = amount * mainConvertor.usdtoEur;
                System.out.println("Converted amount: " + convertedAmount + " USD");
                break;

            case "GBP":
            case "2":
                convertedAmount = amount * mainConvertor.usdtoGbp;
                System.out.println("Converted amount: " + convertedAmount + " GBP");
                break;

            case "JPY":
            case "3":
                convertedAmount = amount * mainConvertor.usdtoJpy;
                System.out.println("Converted amount: " + convertedAmount + " JPY");
                break;
        }

    }
}
