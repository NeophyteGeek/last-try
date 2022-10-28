import java.util.*;
class Stack
{
    int st[]=new int [5];
    int f=st.length,r=st.length,i;
    
    void push(int v)
    {
        if(r>0)
        {
            st[--r]=v;
            f--;
        }
        
    }
    void pop()
    {
        if(r==st.length)
        System.out.println("Stack empty!!!");
        else
        {   
            System.out.println("Popped element is : "+st[f]);
            f++;
            r++;
        }
    }
    void display()
    {
        System.out.println();
        for(i=f;i<st.length;i++)
        {
            System.out.println(st[i]+" ");
        }
    }
    void cal()
    {
        Scanner sc=new Scanner(System.in);
        int n,b;
        do
        {
            System.out.println("\n1.) Push ");
            System.out.println("2.) Pop");
            System.out.println("3.) Display ");
            System.out.println("4.) Quit ");
            n=sc.nextInt();
            switch(n)
            {
                case 1:if(r==0)
                       System.out.println("\nStack full !!");
                       else
                       {
                       System.out.print("Enter value: ");
                       b=sc.nextInt();
                       push(b);
                       }                       
                       break;
                case 2:pop();
                       break;
                case 3:if(r==st.length)
                       System.out.println("\n\nStack empty !! ");
                       else
                       display();
                       break;
                case 4:System.out.println("Quitting the program !!! ");       
                       break;
                default:System.out.println("Not a valid choice!!! ");       
            }   
        }
        while(n != 4);
    }
}
