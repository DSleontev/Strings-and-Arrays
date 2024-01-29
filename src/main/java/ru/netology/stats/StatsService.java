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
//        long sum = 0;
//        for (int i = 0; i < sales.length; i++) {
//            sum = (int) (sum + sales[i]);
//        }
        return salesamount(sales) / sales.length;
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

    public long belowaverage(long[] sales) {

//        long sum = 0;
//        for (int i = 0; i < sales.length; i++) {
//            sum = (int) (sum + sales[i]);
//        }
//        long avsa = sum / sales.length;

        long belowaMonth = 0;
        long average = averagesalesamount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                belowaMonth = belowaMonth + 1;
            }
        }
        return belowaMonth;
    }


    public long aboveaverage(long[] sales) {

//        long sum = 0;
//        for (int i = 0; i < sales.length; i++) {
//            sum = (int) (sum + sales[i]);
//        }
//        long avsa = sum / sales.length;
        long average = averagesalesamount(sales);
        int aboveMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                aboveMonth = aboveMonth + 1;
            }
        }
        return aboveMonth;
    }


}