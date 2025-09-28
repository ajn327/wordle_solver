import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class wordleSolver {
    public static void main(String[] args) throws IOException{
        File file = new File("C:\\VSCode\\java\\old_code\\wordle_solver\\wordle_solver\\5 Letter Words");
        BufferedReader br = new BufferedReader(new FileReader(file));
		String st;

        ArrayList<String> avaliableWords = new ArrayList<String>();
        while ((st = br.readLine()) != null)
		{
			avaliableWords.add(st);
		}
    }
}
