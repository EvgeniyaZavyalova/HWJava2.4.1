package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculeteSum() {
        StatsService service = new StatsService();
        int[] sailes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculeteSum(sailes);
        assertEquals(expected, actual);
    }

    @Test
    void averageSum() {
        StatsService service = new StatsService();
        int[] sailes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSum(sailes);
        assertEquals(expected, actual);
    }

//    @Test
//    void max(){
//        StatsService service = new StatsService();
//        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
//        int expected = 20;
//        int actual = service.max(sales);
//        assertEquals(expected, actual);
//    }

    @Test
    void maxMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
       int actual = service.maxMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void minMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void allMonthMoreAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected =5;
        int actual = service.allMonthMoreAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void allMonthLessAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected =5;
        int actual = service.allMonthLessAverage(sales);
        assertEquals(expected, actual);
    }

}