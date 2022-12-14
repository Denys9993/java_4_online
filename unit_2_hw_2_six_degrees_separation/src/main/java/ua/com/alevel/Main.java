package ua.com.alevel;

public class Main {
    public static void main(String[] args) {

        Handshake a1 = new Handshake("1");
        Handshake a2 = new Handshake("2", null);
        Handshake a3 = new Handshake("3", null);
        Handshake a4 = new Handshake("4", null);
        Handshake a5 = new Handshake("5", null);
        Handshake a6 = new Handshake("6", null);

        while(a6.message == null){
            a1.sendMessage(a2);
            a2.sendMessage(a3);
            a3.sendMessage(a4);
            a4.sendMessage(a5);
            a5.sendMessage(a6);}
    }
}