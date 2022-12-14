package ua.com.alevel;

class Handshake {
    public static String message;
    public static String newMessage = "Hallo";
    String name;
    Handshake(String name, String message){
        this.name=name;
        this.message = message;}
    Handshake(String name){
        this.name =name;
    }
    void sendMessage(Handshake handshake){
        handshake.message = newMessage;
        System.out.println("Ok get it message "+ message + " from  " + name);
    }
}