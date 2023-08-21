package ArrayListIteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

    public static void main(String[] args) {
        ArrayList<String> tvSeries = new ArrayList<String>();
        tvSeries.add("Game of Thrones");
        tvSeries.add("Breaking Bad");
        tvSeries.add("THe Big Bang Theory");
        tvSeries.add("The Walking Dead");
        tvSeries.add("Prison Break");


        System.out.println("------------print using for each loop with lambda in java 8---------------");
        // 1. Using java 8 with for each loop and lambda expression

        tvSeries.forEach(shows -> {
            System.out.println(shows);
        });

        System.out.println("----------print using Iterator-----------");

        // 2. Using Iterator
        Iterator<String> it = tvSeries.iterator();

        while (it.hasNext()){
            String shows=it.next();
            System.out.println(shows);
        }

        // 3. Using iterator and java 8 forEachRemaining() method
        System.out.println("------------print using iterator and java 8 lambda and forEachRemaining() method--------------");

        it = tvSeries.iterator();
        it.forEachRemaining(show -> {
            System.out.println(show);
        });


        // 4. using for each loop
        System.out.println("------------using for each loop------------------");

        for (String show: tvSeries){
            System.out.println(show);
        }

        // 5. Using for loop with order/index
        System.out.println("-------------using for loop with index/order----------------");

        for(int i=0; i<tvSeries.size(); i++){
            System.out.println(tvSeries.get(i));
        }

        // 6. Using a listIterator() to traverse in both directions
        System.out.println("------------using a listIterator() to traverse in both directions-----------------");

        ListIterator<String> tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());
        while (tvSeriesListIterator.hasPrevious()){
            String show = tvSeriesListIterator.previous();
            System.out.println(show);
        }
    }

}
