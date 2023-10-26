package cli;

import models.StudentDabase;
import picocli.CommandLine;

@CommandLine.Command( name = "Wyświetl", description = "Wyświetl wszystkich studentów w bazie danych")
public class DisplayCommand implements Runnable{
    private static StudentDabase database = new StudentDabase();

    @Override
    public void run(){
        database.getStudents().forEach(System.out::println);
    }
}
