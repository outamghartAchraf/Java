public class string_methods {
    public static void main(String[] args) {
        
        String name = "Dev Code";
        
        int length = name.length();
        char letter = name.charAt(0); // first letter
        int index = name.indexOf("o");
        int lastIndex = name.lastIndexOf("o");
        
        //name = name.toUpperCase();
        //name = name.toLowerCase();
        //name = name.trim();
        //name = name.replace("o", "a")
        
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name.isEmpty());
        
        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }else{
            System.out.println("Hello " + name);
        }
        
        if(name.contains("Dev")){
            System.out.println("Your developer");

        }else{
            System.out.println("Your not developer");
        }
          
    }
}
