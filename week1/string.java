public class Main {
    public static void main(String[] args) {


        String message=" The weather is chilly";
        /**/
        System.out.println(message);
        System.out.println("Length of message: "+message.length());

        System.out.println(message.charAt(4));

        char[]abc= new char[7];
        message.getChars(0,7,abc,0);
        System.out.println(abc);

        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("."));


        System.out.println(message.concat(" sometimes"));

        System.out.println(message.lastIndexOf("e"));
        System.out.println(message.lastIndexOf("is"));



        String newMessage= message.replace(' ','-');
        System.out.println(newMessage);
        System.out.println(newMessage.substring(4,11));
        for(String kelime: message.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());


    }
}