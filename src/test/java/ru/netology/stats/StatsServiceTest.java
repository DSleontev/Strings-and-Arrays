package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void salesamounttest() {
        StatsService service = new StatsService();
        long[] sales = {1, 2, 3, 4, 5};
        long expected = 15;
        long adctual = service.salesamount(sales);
        Assertions.assertEquals(expected, adctual);
    }

    @Test
    public void averagesalesamounttest() {
        StatsService service = new StatsService();
        long[] sales = {1, 2, 3, 4, 5};
        long expected = 3;
        long adctual = service.averagesalesamount(sales);
        Assertions.assertEquals(expected, adctual);

    }

    @Test
    public void maxSalestest() {
        StatsService service = new StatsService();
        long[] sales = {1, 2, 3, 14, 5};
        long expected = 4;
        long adctual = service.maxSales(sales);
        Assertions.assertEquals(expected, adctual);

    }

    @Test
    public void minSalestest() {
        StatsService service = new StatsService();
        long[] sales = {10, 2, 3, 4, 5};
        long expected = 2;
        long adctual = service.minSales(sales);
        Assertions.assertEquals(expected, adctual);

    }

    @Test
    public void Belowaveragetest() {
        StatsService service = new StatsService();
        long[] sales = {1, 2, 3, 4, 5};
        long expected = 2;
        long adctual = service.Belowaverage(sales);
        Assertions.assertEquals(expected, adctual);

    }

    @Test
    public void aboveaveragetest() {
        StatsService service = new StatsService();
        long[] sales = {1, 2, 3, 4, 5, 6, 7};
        long expected = 3;
        long adctual = service.aboveaverage(sales);
        Assertions.assertEquals(expected, adctual);

    }
}

