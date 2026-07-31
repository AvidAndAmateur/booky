import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> books = new ArrayList<String>();
        String choice = "undecided";
        while(true){
        while (choice.equals("add")) { 
            System.out.println("enter book title");
            String inp = scanner.nextLine();
            if(inp.equals("quit")){
                choice = "undecided";
                break;
            }
            books.add(inp);
        }
        while (choice.equals("remove")){
            System.out.println("enter book title");
            String inp = scanner.nextLine();
            if(inp.equals("quit")){
                choice = "undecided";
                break;
            }
            books.remove(inp);
        }
        while(choice.equals("view")){
            for (Object book : books) {
                System.out.println(book);
            }
            choice = "undecided";
            break;
        }
        while(choice.equals("undecided")){
            System.out.println("Add book, remove book or view book");
            choice = scanner.nextLine();
            break;
        }
        }
    }
    }

