class check
{
    public void main()
    {
        String s="fanjay",ne="",m;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(i==0)
            {
           m=String.valueOf(ch);
            m=m.toUpperCase();
            ch=m.charAt(0);
        }
        ne=ne+ch;
    }
    System.out.println(ne);
    
}
}
   