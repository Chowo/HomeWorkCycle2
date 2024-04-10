public class Main {
    public static void main(String[] args) {
        //Task 01
        System.out.println("Task 01");
        double totalIncome = 0;
        int monthlyInvestment = 15000;
        int goalMonths = 0;
        while (totalIncome < 2_459_000) {
            totalIncome = totalIncome * 1.01;
            totalIncome += monthlyInvestment;
            goalMonths++;
        }
        System.out.printf("Месяц %s, сумма накоплений равна %.2f рублей%n", goalMonths, totalIncome);

        //Task 02
        System.out.println("Task 02");
        int counting = 0;
        while (counting < 10) {
            counting++;
            System.out.printf("%s ", counting);
        }
        System.out.println();
        for (; counting > 0; counting--) {
            System.out.printf("%s ", counting);
        }
        System.out.println();

        //Task 03
        System.out.println("Task 03");
        int population = 12_000_000;
        int birthRateYearlyIncrease = 17 * population / 1000;
        int mortalityRateYearlyDecrease = 8 * population / 1000;
        for (int i = 1; i <= 10; i++) {
            population = population + birthRateYearlyIncrease - mortalityRateYearlyDecrease;
            System.out.printf("Год %s, численность населения составляет %s человек%n", i, population);
        }

        //Task 04
        System.out.println("Task 04");
        double investment = 15_000;
        int durationInMonths = 0;
        while (investment < 12_000_000) {
            investment = investment * 1.07;
            durationInMonths++;
            System.out.printf("Месяц %s, накопления составляют %.2f рублей%n", durationInMonths, investment);
        }
        System.out.printf("Василию понадобиться %s месяцев, чтобы накопить 12 миллионов рублей%n", durationInMonths);

        //Task 05
        System.out.println("Task 05");
        investment = 15_000;
        durationInMonths = 0;
        while (investment < 12_000_000) {
            investment = investment * 1.07;
            durationInMonths++;
            if (durationInMonths % 6 == 0) {
                System.out.printf("Месяц %s, накопления составляют %.2f рублей%n", durationInMonths, investment);
            }
        }
        System.out.printf("Василию понадобиться %s месяцев, чтобы накопить 12 миллионов рублей%n", durationInMonths);

        //Task 06
        System.out.println("Task 06");
        investment = 15_000;
        for (int i = 1; i <= 108; i++) {
            investment = investment * 1.07;
            if (i % 6 == 0) {
                System.out.printf("Месяц %s, накопления составляют %.2f рублей%n", i, investment);
            }
        }

        //Task 07
        System.out.println("Task 07");
        int firstFriday = 2;
        for (int i = 1; i <= 31; i++) {
            if (i == firstFriday || (i - firstFriday) % 7 == 0) {
                System.out.printf("Сегодня пятница, %s-е число%n", i);
            }
        }

        //Task 08
        System.out.println("Task 08");
        int startingPeriod = 2024 - 200;
        int endingPeriod = 2024 + 100;
        for (int i = 0; i <= endingPeriod; i += 79) {
            if (i >= startingPeriod)
                System.out.println(i);
        }

    }
}
