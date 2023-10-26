package org.example;

import picocli.CommandLine;
import cli.AddCommand;
import cli.RemoveCommand;
import cli.DisplayCommand;

@CommandLine.Command(subcommands = {AddCommand.class, DisplayCommand.class, RemoveCommand.class})
public class Main{
    public static void main(String[] args){
        new CommandLine(new Main()).execute(args);
    }
}