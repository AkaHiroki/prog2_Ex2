
public class Main{
    public static void main(String[] args){
        Chatbot bot1 = new Chatbot();
        //bot1.setName ("vivy");
        Chatbot bot2 = new Chatbot("ドラえもん");
        //bot2.setName ("ドラえもん");
        //bot2.setName ("こん");

        bot1.greeting();
        bot2.greeting();
        bot2.name = "vivy";
        bot2.greeting();

    }
}