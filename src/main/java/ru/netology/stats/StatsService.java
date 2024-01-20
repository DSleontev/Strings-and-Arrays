package ru.netology.stats;

public class StatsService {


    public int salesamount(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        return sum;
    }

    public int averagesalesamount(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        int avsa = sum / sales.length;
        return avsa;

    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;

    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int Belowaverage(int[] sales) {

        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        int avsa = sum / sales.length;

        int BelowaMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avsa) {
                BelowaMonth = BelowaMonth + 1;
            }
        }
        return BelowaMonth;
    }


    public int aboveaverage(int[] sales) {

        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        int avsa = sum / sales.length;

        int AboveMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avsa) {
                AboveMonth = AboveMonth + 1;
            }
        }
        return AboveMonth;
    }


}