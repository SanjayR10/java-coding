class j
{
    public void main()
    {
        int c=0;
        String s="abcds";
        String s2="abcdz";
        int a =s2.compareTo(s);
        for(int i=0;i<s.length();i++)
         {
             char ch=s.charAt(i);
             if(Character.isLetter(ch))
             ++c;
            }
        System.out.println(a);
    }
}
        
             
         
       