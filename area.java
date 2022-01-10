import java.util.*;
class area
{
    int t,r,s;
    
    area()
    {
        t=0;
        r=0;
        s=0;
    }
    
    void show()
    {
        triangle();
        System.out.println(t);
        rectangle();
        System.out.println(r);
        square();
        System.out.println(s);
    }
    int triangle()
    {
        t=15*5;
        return t;
    }
    int rectangle()
    
    {
        r=10;
        return r;
    }
    int square()
    {
        s=123;
        return s;
    }
    public void main()
    {
        area obj=new area();
        obj.show();
        obj.triangle();
        obj.rectangle();
        obj.square();
    }
}
    
   
        
   
    