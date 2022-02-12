package lesson9Practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ExamData{
    private String studentName;
    private double testScore;
    public ExamData(String name, double score) {
        studentName = name;
        testScore = score;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public double getTestScore() {
        return testScore;
    }
    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }
}
public class SummaryStatisticsPractice {
    public static void main(String[] args) {

        List<ExamData> data = new ArrayList<ExamData>() {
            {
                add(new ExamData("George", 91.3));
                add(new ExamData("Tom", 88.9));
                add(new ExamData("Rick", 80));
                add(new ExamData("Harold", 90.8));
                add(new ExamData("Ignatius", 60.9));
                add(new ExamData("Anna", 77));
                add(new ExamData("Susan", 87.3));
                add(new ExamData("Phil", 99.1));
                add(new ExamData("Alex", 84));
            }
        };

        DoubleSummaryStatistics statis=data.stream().collect(Collectors.summarizingDouble(s->s.getTestScore()));

        System.out.println("Max value :: "+statis.getMax());
        System.out.println("Average Value :: "+statis.getAverage());
        System.out.println("MIN Value :: "+statis.getMin());
        System.out.println(statis.getSum());
        System.out.println(statis.getCount());


        IntStream ram=IntStream.range(0,100);
        ram.forEach(System.out::println);
        System.out.println("\n");
        IntStream ram2=IntStream.rangeClosed(0,100);
        ram2.forEach(System.out::println);

       // List<String> listStr= Arrays.asList("Md Mazed","Md Mazed","Bablu","Milon","Tom","JKOB","Abdul");

        // toSet()::
        /*
        listStr.stream()
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toSet()).forEach(System.out::println);

         */

        // toMap()
        /*
        Map<Integer,String> mapOb=listStr.stream()
                .map(s->s)
                .distinct()
                .collect(Collectors.toMap(s->{
                    int index=0;
                    if(listStr.contains(s)){
                        index=listStr.indexOf(s);
                    }
                    return index;
                    },s->s));

        System.out.println(mapOb);

         */
    }


}



