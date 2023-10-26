package cli;

import models.StudentDabase;
import picocli.CommandLine;

@CommandLine.Command(name = "usuń", description = "Usuń studenta z bazy danych")
public class RemoveCommand implements Runnable {
    private static StudentDabase database = new StudentDabase();

    @CommandLine.Option(names = {"-n", "--name"}, required = true, description = "Nazwa studenta do usunięcia")
    private String name;

    @Override
    public void run(){
        database.removeStudent(name);
        System.out.println("Usunięto studenta: "+name);
    }
}
