public class Chatbot {
    private String name;
    /* 
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    */
    public Chatbot(){
        System.out.println("チャットボットの原型を作成します。");
    }
    
    public Chatbot(String _name){
        this.name = _name;
        System.out.println("チャットボット名" + this.name + "を作成する");
        //System.out.println("はじめまして+ name + です、よろしくお願いします。");  
    }
    public void greeting(){
        System.out.println("はじめまして"+ this.name + "です、よろしくお願いします。");
    }
    
}
