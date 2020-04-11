package app;
import classes.*;

public class App{

    public static void main(String[] args) throws Exception{
        Carro c = new Carro();
        
        c.ligar();

       System.out.println(c.getLigado());
    }

}