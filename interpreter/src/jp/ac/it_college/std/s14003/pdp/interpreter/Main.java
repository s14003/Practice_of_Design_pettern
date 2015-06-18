package jp.ac.it_college.std.s14003.pdp.interpreter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by s14003 on 15/06/18.
 */
public class Main { //{
        public static void main(String...args) {
            try (
                BufferedReader reader = new BufferedReader(
                        new FileReader("data23/program.txt"));
                ) {
                String text;
                while ((text = reader.readLine()) != null) {
                    System.out.println("text = \"" + text + "\"");
                    Node node = new ProgramNode();
                    node.perse(new Context(text));
                    System.out.println("node = " + node);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
}
