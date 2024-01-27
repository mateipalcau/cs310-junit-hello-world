package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        String message_1;
        StringBuilder s=new StringBuilder();
        s.append(message);
        s.reverse();
        message_1=s.toString();
        return message_1;
    }
    
}