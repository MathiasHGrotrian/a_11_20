package Chapter11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise20
{
    /*

        Write a modified version of the Vocabulary program developed in Chapter 10
         that uses sets rather than ArrayLists to store its words. (The program will
          be noticeably shorter and will run faster!)
     */

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
               

        getWords(scanner);
    }

    public static Set<String> getWords(Scanner input)
    {
        Set<String> words = new HashSet<>();
        while(input.hasNext())
        {
            String next = input.next().toLowerCase();
            words.add(next);
        }

        Set<String> result = new HashSet<>();
        if(words.size() > 0)
        {
            for(String string: words)
            {
                if(result.contains(string) == false)
                {
                    result.add(string);
                }
            }

        }

        return result;
    }

}
