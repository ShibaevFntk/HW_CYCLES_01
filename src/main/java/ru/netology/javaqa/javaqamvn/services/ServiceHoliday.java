package ru.netology.javaqa.javaqamvn.services;

public class ServiceHoliday {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        int overExpenses = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                overExpenses = (money - expenses) * 2 / 3;

                System.out.println("Месяц " + month + ". Денег " + money + " Буду отдыхать. Потратил -" + expenses + " Затем ещё -" + overExpenses);
                money = money - expenses - overExpenses;

            } else {
                System.out.println("Месяц " + month + ". Денег " + money + " Придется работать. Заработал +" + income + " Потратил -" + expenses);
                money = money + income - expenses;
            }
        }
        System.out.println("Отдохнул месяцев " + count);
        return count;
    }
}
