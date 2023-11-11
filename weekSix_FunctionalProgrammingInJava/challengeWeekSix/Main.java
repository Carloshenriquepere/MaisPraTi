package weekSix_FunctionalProgrammingInJava.challengeWeekSix;


import weekSix_FunctionalProgrammingInJava.challengeWeekSix.dataAnalysis.DataAnalysis;
import weekSix_FunctionalProgrammingInJava.challengeWeekSix.datas.Data;

public class Main {
    public static void main(String[] args) {

        DataAnalysis dataAnalysis = new DataAnalysis();

        Data data = new Data(1,130.36,"Roupa","2021/02/15");
        Data data1 = new Data(2,1.36,"Roupa","2021/02/15");
        Data data2 = new Data(3,30.6,"Alimento","1900/02/15");
        Data data3 = new Data(4,20.00,"higiene","2021/02/15");
        Data data4 = new Data(5,50.25,"higiene","2021/02/15");
        Data data5 = new Data(6,80.36,"comida","2021/02/15");
        Data data6 = new Data(7,3.36,"Roupa","2021/02/15");
        Data data7 = new Data(8,60.6,"alimento","2010/10/15");
        Data data8 = new Data(9,10.6,"alimento","1990/03/15");
        dataAnalysis.getDatas().add(data);
        dataAnalysis.getDatas().add(data1);
        dataAnalysis.getDatas().add(data2);
        dataAnalysis.getDatas().add(data3);
        dataAnalysis.getDatas().add(data4);
        dataAnalysis.getDatas().add(data5);
        dataAnalysis.getDatas().add(data6);
        dataAnalysis.getDatas().add(data7);
        dataAnalysis.getDatas().add(data8);

        System.out.println("---------------------------------------------");

        System.out.println(dataAnalysis.filterByCategory("alimento"));

        System.out.println("------------------------------------------------");

        System.out.println(dataAnalysis.findingTheMaximumValue("alimento"));

        System.out.println("-------------------------------");

        System.out.println(dataAnalysis.groupDataByCategory());

        System.out.println("----------------------------------------");

        System.out.println(dataAnalysis.sumCategoryValues("alimento"));

        System.out.println("----------------------------------------------");

        System.out.println(dataAnalysis.sortByValueAndDate());

    }
}
