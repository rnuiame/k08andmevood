import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class andmevood{

    public static int vanus(String s){
        return Integer.parseInt(s.split(",")[1]);
    }

    public static void main(String[] args) throws Exception{
    PrintWriter writer = new PrintWriter(new FileWriter("Output.txt"));
    //Sorteerimine uude faili
    Files.readAllLines(Paths.get("Input.txt")).stream().sorted(Comparator.comparingInt(andmevood::vanus)).collect(Collectors.toList()).forEach(writer::println);
    writer.close();
    System.out.println("Mehed kes on vanemad kui 30:");
    Files.readAllLines(Paths.get("Input.txt")).stream().filter(s -> Integer.parseInt(s.split(",")[1])>30).forEach(System.out::println);
    }
}

/*
OUTPUT
Mehed kes on vanemad kui 30:
Kert,38
Mart,45
Andres,32
Aivar,36
*/
