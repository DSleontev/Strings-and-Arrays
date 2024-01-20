package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void salesamounttest() {
        StatsService service = new StatsService();
        int[] sales = {1, 2, 3, 4, 5};
        int expected = 15;
        int adctual = service.salesamount(sales);
        Assertions.assertEquals(expected, adctual);
    }

    @Test
    public void averagesalesamounttest() {
        StatsService service = new StatsService();
        int[] sales = {1, 2, 3, 4, 5};
        int expected = 3;
        int adctual = service.averagesalesamount(sales);
        Assertions.assertEquals(expected, adctual);

    }

    @Test
    public void maxSalestest() {
        StatsService service = new StatsService();
        int[] sales = {1, 2, 3, 14, 5};
        int expected = 4;
        int adctual = service.maxSales(sales);
        Assertions.assertEquals(expected, adctual);

    }

    @Test
    public void minSalestest() {
        StatsService service = new StatsService();
        int[] sales = {10, 2, 3, 4, 5};
        int expected = 2;
        int adctual = service.minSales(sales);
        Assertions.assertEquals(expected, adctual);

    }

    @Test
    public void Belowaveragetest() {
        StatsService service = new StatsService();
        int[] sales = {1, 2, 3, 4, 5};
        int expected = 2;
        int adctual = service.Belowaverage(sales);
        Assertions.assertEquals(expected, adctual);

    }

    @Test
    public void aboveaveragetest() {
        StatsService service = new StatsService();
        int[] sales = {1, 2, 3, 4, 5, 6, 7};
        int expected = 3;
        int adctual = service.aboveaverage(sales);
        Assertions.assertEquals(expected, adctual);

    }
}

