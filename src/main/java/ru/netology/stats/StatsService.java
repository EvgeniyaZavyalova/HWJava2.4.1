package ru.netology.stats;

public class StatsService {

    public int calculeteSum(int[] sales) {
        int result = 0;
        for (int sale : sales) {
            result += sale;
        }
        return result;
    }

    public int averageSum(int[] sales) {
        int sum = calculeteSum(sales);
        int result = sum / sales.length;
        return result;
    }

//    public int max(int [] sales){
//        int month = sales[0];
//        for (int sale : sales) {
//            if (sale > month){
//                month = sale;
//            }
//        }
//
//        return month;
//    }

    public int maxMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sales[maxMonth] >= maxMonth) {
               maxMonth = month;
            }
           month = month + 1;
        }
        return maxMonth ;
   }

    public int minMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (minMonth <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int allMonthMoreAverage (int[] sales) {
        int result = averageSum(sales);
        int monthMore=0;
        for (int sale : sales){
            if (sale > result){
                monthMore++;
            }
        }
        return monthMore;
    }

    public int allMonthLessAverage (int[] sales) {
        int result = averageSum(sales);
        int monthMore=0;
        for (int sale : sales){
            if (sale < result){
                monthMore++;
            }
        }
        return monthMore;
    }


}

