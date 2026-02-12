import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Main {
  public static void main(String[] args) {
   
        Main main = new Main();
        main.arrayList();
        main.queue();
        main.stack();
    }
    public void arrayList() {
        LinkedList<String> progLanguages = new LinkedList<>();

        
        // Adding elements to the LinkedList
        progLanguages.add("Java");
        progLanguages.add("Python");
        progLanguages.add("C++");

        // Modifying the LinkedList
        progLanguages.remove("C++");
        progLanguages.add(2, "HTML");

        // Displaying the elements using an iterator
        Iterator<String> iterator = progLanguages.iterator(); 
        while (iterator.hasNext()) { 
            System.out.println(iterator.next());
        }
    }
    public void queue() {
        Queue<String> q = new LinkedList<>();

        q.add("Alice"); 
        q.add("Brad"); 
        q.add("Chris"); 
        q.add("Diana"); 
        q.add("Eve");

        // Displaying the elements of the queue
        System.out.println("Elements of queue: " + q);

        String removedElement = q.remove();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Head of queue (peek): " + q.peek());

        // Displaying the elements of the queue after removal
        for (String element : q) { 
            System.out.println(element); 
        } 
    }
    public void stack() {
        Stack<String> bookStack = new Stack<>();

       bookStack.push("Clean Code"); 
       bookStack.push("Design Patterns"); 
       bookStack.push("Pragmatic Programmer");

       // Displaying the top element of the stack
       String popped = bookStack.pop(); 
       System.out.println("Popped book: " + popped);

       // Displaying the top element of the stack after popping
       System.out.println("Top of stack (peek): " + bookStack.peek());

       bookStack.push("Web DB Technologies");

       // Displaying the top element of the stack after pushing a new book
       System.out.println("Top of stack after push: " + bookStack.peek());

       // Searching for an element in the stack
       int position = bookStack.search("Design Patterns"); 
       System.out.println("Search result for 'Design Patterns': " + position);

       // Displaying the size of the stack
       System.out.println("Is the stack empty? " + bookStack.empty());

       // Displaying all elements in the stack
       for (String book : bookStack) { 
        System.out.println(book); 
       }
    } 
} 

    

