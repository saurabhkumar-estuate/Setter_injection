package setterinjectionspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
  public static void main(String[] args) 
  {
 ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("saurabh1.xml");   // create the container
	 
	 Student student1= (Student) context.getBean("s1");    //get the beans
	 Student student2= (Student) context.getBean("s1");
	 
	 System.out.println(student1);        //use the beans  using setter
	 System.out.println(student2);        //use the beans using constructor
	 
	 context.close();
  }    
                                
}
