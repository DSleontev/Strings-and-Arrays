package ru.netology.stats;

public class StatsService {


    public long salesamount(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (sum + sales[i]);
        }
        return sum;
    }

    public long averagesalesamount(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        long avsa = sum / sales.length;
        return avsa;

    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;

    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long Belowaverage(long[] sales) {

        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        long avsa = sum / sales.length;

        long BelowaMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avsa) {
                BelowaMonth = BelowaMonth + 1;
            }
        }
        return BelowaMonth;
    }


    public long aboveaverage(long[] sales) {

        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        long avsa = sum / sales.length;

        int AboveMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avsa) {
                AboveMonth = AboveMonth + 1;
            }
        }
        return AboveMonth;
    }


}