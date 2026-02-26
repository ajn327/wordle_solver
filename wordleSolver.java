import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


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
        Scanner keyboard = new Scanner(System.in);

        while(true)
		{
            System.out.println("Enter Input Word");
			String in = keyboard.next().toLowerCase();
            System.out.println("Enter - for a letter not in the word");
			System.out.println("Enter o for a letter in the word but in the wrong space");
			System.out.println("Enter x for a letter in the word in the right space");
			String result = keyboard.next();
            if(result.contentEquals("xxxxx"))
			{
				break;
			}

            for(int i = 0; i < 5; i++)
			{
                String letter = in.substring(i, i + 1);
				String rate = result.substring(i, i + 1);
            }
        }
    }
}
