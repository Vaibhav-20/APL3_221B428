public class CrowAdapter implements Swan{
    private Crow crow;
    
    public CrowAdapter(Crow crow){
        this.crow = crow;
    }
    
    public void swim(){
        crow.cry();
    }
    
    public void sing(){
        crow.fly();
    }
    
    public void eat(){
        crow.eat();
    }
}