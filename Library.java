//Inheritance Library
class Library            //Super Class
{
    String name,author;
    double p;
    Library(String n,String au,double pe)  
    {                     //To assign value using constructor
        name=n;
        author=au;
        p=pe;
    }
    public void show()
    {
        System.out.println("Name:"+name);
        System.out.println("Author:"+author);
        System.out.println("Price:"+p);
    }
}
    
        
        