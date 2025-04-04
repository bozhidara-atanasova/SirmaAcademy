import  java.util.Scanner;
import java.util.ArrayDeque;
public class Browser {
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);
      ArrayDeque<String> history = new ArrayDeque<>();
      String currentURL = "";
      while (true)
      {
          String command = scanner.nextLine();
          if(command.equals("Home"))
          {
              break;
          }
          else if(command.equals("back"))
          {
              if(history.isEmpty())
              {
                  System.out.println("no previous URLs");
              }
              else
              {
                  currentURL = history.pop();
                  System.out.println(currentURL);
              }
          }
          else {
              if(!currentURL.equals(""))
              {
                  history.push(currentURL);
              }
              currentURL = command;
              System.out.println(currentURL);
          }
      }
    }
}
