import java.io.*;

class GetSetname {
    
    private String name;
    private int age;
    public String getName() {return name;}
    public void setName(String N)
    {
        this.name = N;
    }
    public Integer getAge() {return age;}
    public void setAge(Integer x)
    {
        this.age = x;
    }
}



public class Main
{
	public static void main(String[] args) {
		GetSetname obj1 = new GetSetname();
		obj1.setName("Vaibhav");
		obj1.setAge(20);
		System.out.println(obj1.getName());
		System.out.println(obj1.getAge());
	}
}
