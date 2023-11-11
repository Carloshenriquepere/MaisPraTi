package weekSix_FunctionalProgrammingInJava.challengeWeekSix.dataAnalysis;


import weekSix_FunctionalProgrammingInJava.challengeWeekSix.datas.Data;

import java.util.*;
import java.util.stream.Collectors;

public class DataAnalysis {

    private final List<Data> datas;

    public DataAnalysis() {
        datas = new ArrayList<>();
    }

    public List<Data> getDatas(){return datas;}

    //Filter data by category
    public List<Data> filterByCategory(String categories) {
        return datas.stream()
                .filter(d -> d.getCategory().equalsIgnoreCase(categories))
                .collect(Collectors.toList());
    }

    //Finding the maximum value of a list of data
    public double findingTheMaximumValue(String categories){
        return datas.stream()
                .filter(data -> categories.equalsIgnoreCase(data.getCategory()))
                .mapToDouble(d -> d.getCategory() != null ? d.getValue() : 0.0)
                .max()
                .orElse(0.0);
    }

    //Calculate the sum of values per category
    public double sumCategoryValues(String categories){
        return datas.stream()
                .filter(data -> categories.equalsIgnoreCase(data.getCategory()))
                .mapToDouble(Data::getValue)
                .sum();
    }


    //Group data by category
    public Map<String, List<Data>> groupDataByCategory(){
        return datas.stream()
                .collect(Collectors.groupingBy(Data::getCategory));
    }

    //Sort data by value and date
    public List<Data> sortByValueAndDate(){
        return datas.stream()
                .sorted(Comparator.comparing(Data::getValue).thenComparing(Data::getDate))
                .collect(Collectors.toList());
    }


}
