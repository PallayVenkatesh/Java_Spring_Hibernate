public class A 
{
    public void methOne(int a)
    {
        // something
    }
}

class B extends A
{
    private void methOne(int a)
    {
        // something else
    }
    }

class C
{
     public static void main(String args[])
     {
          new B().methOne(); 
          // in this special case after removing the specifier rule it will execute the method from parent class.
     }
}