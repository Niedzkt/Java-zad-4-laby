package cli;

import models.Student;
import models.StudentDabase;
import picocli.CommandLine;

@CommandLine.Command(name = "dodaj", description = "Dodaj studenta do bazy danych")
public class AddCommand implements Runnable {
    private static StudentDabase database = new StudentDabase();

    @CommandLine.Option(names = {"-n", "--name"}, required = true, description = "Nazwa studenta")
    private String name;

    @CommandLine.Option(names = {"-a", "--age"}, required = true, description = "Wiek studenta")
    private int age;

    @Override
    public void run(){
        database.addStudent(new Student(name, age));
        System.out.println("Dodano studenta: "+name);
    }
}
