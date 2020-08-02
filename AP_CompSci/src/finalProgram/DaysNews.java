package finalProgram;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DaysNews {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String economist = "https://www.economist.com/search?q=¶%2F†%2F§";
        String washingtonPost = "https://www.washingtonpost.com/newssearch/?datefilter=All%20Since%202005&query=¶%2F†%2F§&sort=Relevance";

        System.out.println("Welcome to 'DaysNews'");
        System.out.println(
                "Here you can enter one name of one of the available news sources\nand a date to recieve that days news.\n");
        System.out.println("Suggested dates:");
        System.out.println("20/1/2020: The first confirmed case of COVID 19 in US.");
        System.out.println("31/12/2019: The first reported case of COVID 19 in Wuhan China.");
        System.out.println("11/1/2020: China reported its first COVID 19 death");
        System.out.println("23/1/2020: Chines authroities stopped all transport in and out of Wuhan.");
        System.out.println("30/1/2020: WHO declared global health emergency.\n");
        System.out.println(
                "Enter number next to news source desired: The Economist(1), The Washington Post(2)");
        int newspaper = in.nextInt();
        System.out.println("Enter day in DD format (ie. 01 for the first of a given month).");
        int day = in.nextInt();
        System.out.println("Enter month in MM format (ie. 01 for January).");
        int month = in.nextInt();
        System.out.println("Enter yearin YYYY format (ie. 2020 for this year).");
        int year = in.nextInt();
        in.close();

        Calendar c = new GregorianCalendar();
        c.set(year, month, day);

        if (newspaper == 1) {
            openPaper(economist, c);
        } else if (newspaper == 2) {
            openPaper(washingtonPost, c);
        } else {

        }

    }                                                       
    
    private static void openPaper(String paperUrl, Calendar c) {
        PageOpener pg = new PageOpener(c, paperUrl);
        pg.openPage();
    }
}