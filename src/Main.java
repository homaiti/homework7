
public class Main {
    public static void main(String[] args)
    {
        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task4Ext();
        Task5Ext();
    }
    public static void Task1()
    {
        System.out.println("Задача 1");
        int contribMonth = 15_000;
        int sum = 0;
        int month = 0;

        while(sum < 2_459_000)
        {
            sum += contribMonth;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println();

    }

    public static void Task2()
    {
        System.out.println("Задача 2");
        int num = 0;

        while (num < 10)
        {
        num++;
            System.out.print(num + " ");
        }
        System.out.println();
        for (; num > 0; num--)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void Task3()
    {
        System.out.println("Задача 3");

        int year = 0;
        int population = 12_000_000;
        int growthPopulation = (population/1000) * 17;
        int declinePopulation = (population/1000) * 8;

        while (year < 10) {
            population = population + growthPopulation - declinePopulation;
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println();
    }

    public static void Task4() {
        System.out.println("Задача 4");

        double startDeposit = 15_000;
        double procent = 0.07;
        float needSum = 12_000_000;
        int month = 0;
        while (startDeposit < needSum) {
        startDeposit = startDeposit +(startDeposit * procent);
        month++;
            System.out.println("Месяц " + month + ",сумма на счете " + String.format("%.2f", startDeposit));
        }
        System.out.println();
    }
    public static void Task5() {
        System.out.println("Задача 5");

        double startDeposit = 15_000;
        double procent = 0.07;
        float needSum = 12_000_000;
        int month = 0;
        while (startDeposit < needSum) {
            startDeposit = startDeposit +(startDeposit * procent);
            month++;
            if(month % 6 == 0) {
                System.out.println("Месяц " + month + ",сумма на счете " + String.format("%.2f", startDeposit));
            }
        }
        System.out.println();
    }

    public static void Task6() {
        System.out.println("Задача 6");

        double startDeposit = 15_000;
        double procent = 0.07;
        int month = 0;
        int depositPeriod = 9 * 12;
        while (month < depositPeriod) {
            startDeposit = startDeposit +(startDeposit * procent);
            month++;
            if(month % 6 == 0) {
                System.out.println("Месяц " + month + ",сумма на счете " + String.format("%.2f", startDeposit));
            }
        }
        System.out.println();
    }

    public static void  Task7() {
        System.out.println("Задача 7");
        int date = 0;
        int friday = 5;

        while (date < 31){
            date++;
            if (date % friday == 0) {
                System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет");
            }
        }
    }

    public static void Task8() {
        System.out.println("Задача 8");
        int ourYear = 2022;
        int twoHundredYearsAgo = ourYear - 200;
        int oneHundredYearsNext = ourYear + 100;
        int cometPeriodic = 79;
        int cometNearByEarth = 0;

        while (cometNearByEarth < oneHundredYearsNext) {
            cometNearByEarth += cometPeriodic;
            if (cometNearByEarth > twoHundredYearsAgo && cometNearByEarth < oneHundredYearsNext) {
                System.out.println(cometNearByEarth);
            }
        }
    }

    public static void Task4Ext() {
        System.out.println("Задача 4 Повышенная сложность");

        for (int i = 1; i <= 30; i++) {
            System.out.print(i + ": ");
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("ping pong");
            } else if (i % 3 == 0) {
                System.out.print("ping");
            } else if (i % 5 == 0) {
                System.out.print("pong");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void Task5Ext()
    {
        System.out.println("Задача 5 Повышенная сложность");
        int febNumOne = 0;
        int febNumTwo = 1;
        //int result;

        for(int i = 0; i < 5; i++)
        {
            System.out.print(febNumOne + " ");
            System.out.print(febNumTwo + " ");
            febNumOne += febNumTwo;
            febNumTwo += febNumOne;

        }
    }
}