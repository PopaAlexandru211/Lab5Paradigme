import java.io.*;
import java.util.Scanner;
import java.lang.String;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//a)

        System.out.println("Subiectul a)");
        Scanner sc=new Scanner("in.txt");
        String Text1=" ";
        while(sc.hasNext()){
            System.out.println(" ");
            System.out.println(sc.nextLine());
            Text1+=sc.nextLine();
        }
        sc.close();

//b)

        System.out.println("Subiectul b)");
        try{
            Scanner sc2 = new Scanner("in.txt");
            String Text2=" ";
            while(sc.next(".")=="."){
                System.out.println(" ");
                System.out.println(sc2.nextLine());
                Text2+=sc2.nextLine();
            }
            sc.close();
        }
        catch(Exception e){
            System.out.println("Error");
            e.printStackTrace();
        }


        System.out.println();
        System.out.println("Subiectul c)");
        try {
            File fisierNou = new File("out.txt");
            if (fisierNou.createNewFile()) {
                System.out.println("Fisier creat: " + fisierNou.getName());
                fisierNou.setWritable(true);
                if(fisierNou.exists()){
                    String filePath = "out.txt";

                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                       // writer.write(Text1);
                        writer.newLine();
                       // writer.write(Text2);
                        System.out.println("Succes");
                    } catch (IOException e) {
                        System.err.println("Eroare");
                    }
                }
            }


            else {
                System.out.println("Problema1");
            }
        } catch (IOException e) {
            System.out.println("Problema2");
            e.printStackTrace();
        }
    }
}
