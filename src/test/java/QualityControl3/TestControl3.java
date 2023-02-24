package QualityControl3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

    public class TestControl3 {
        public static void main(String[] args) {
            List<Integer> numbers=new ArrayList<>(Arrays.asList(5,10,20,60,80,4,15,70));
            List<String> name=new ArrayList<>(Arrays.asList("Tarik","Asim","Ahmet","Mehmet","Sadik","Fatma"));

            for(int i=0;i<name.size();i++){
                System.out.println("name.get("+i+") = " + name.get(i));
            }

            name.stream().forEach(System.out::println);

            name.stream().forEach(n->{
                System.out.println("**********");
                System.out.println(n + " is happy");
            });

            for (int i=0;i<numbers.size();i++){
                System.out.println(numbers.get(i));
            }
            System.out.println("-------------------------------------");

            numbers.stream().forEach(System.out::println);

            Consumer<Integer> consumer=new Consumer<Integer>() {
                @Override
                public void accept(Integer integer) {
                    System.out.println("hello");
                }
            };

            numbers.stream().forEach(x->{
                System.out.println(x);
                System.out.println("--");
                System.out.println(x+10);
            });

            List<Integer> collect=numbers.stream().filter(x-> x<30).collect(Collectors.toList());
            System.out.println("collect = " + collect);

            List<String> collectName=name.stream().collect(Collectors.toList());
            System.out.println("collectName = " + collectName);

            IntSummaryStatistics summary= numbers.stream().mapToInt(x->x).summaryStatistics();
            System.out.println("summary.getAverage() = " + summary.getAverage());
            System.out.println("summary.getMin() = " + summary.getMin());
            System.out.println("summary.getMax() = " + summary.getMax());
            System.out.println("summary.getSum() = " + summary.getSum());

    }
}
