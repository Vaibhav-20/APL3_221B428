public class Singletonlazy
{
    private static Singletonlazy uniqueIntsance;
    private Singletonlazy(){
        System.out.println("lazy object is isntantiated");
        
    }
    public static Singletonlazy getUniqueInstance()
    {
        if(uniqueIntsance==null)
        {
            uniqueIntsance = new Singletonlazy() ;
        }
        return uniqueIntsance;
    }
    public static void check()
    {
        System.out.println("check done lazy");
    }
    
}