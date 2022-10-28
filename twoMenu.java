import java.util.*;
class TwoMenu
{
    void cal()
    {
        Scanner sc = new Scanner(System.in);
        int a[][]={{2,1,5,9,4},{8,3,6,5,7},{2,5,8,3,7},{9,5,8,7,1}};
        int i,j,n,m;
        do
        {
            System.out.println("\nEnter choice: ");
            System.out.println("1 for normal array: ");
            System.out.println("2 for transposed array: ");
            System.out.println("3 for border elements: ");
            System.out.println("4 for core elements: ");
            System.out.println("5 for row no. : ");
            System.out.println("6 for column no. : ");
            System.out.println("7 to exit : ");            
            n=sc.nextInt();
            System.out.println("\n\n");
            switch(n)
            {
                case 1:for(i=0;i<4;i++)
                       {
                           for(j=0;j<5;j++)
                           {
                               System.out.print(a[i][j]+"  ");
                            }
                            System.out.println();
                        }
                        System.out.println("\n\n");
                        break;
                case 2:for(i=0;i<5;i++)
                       {
                           for(j=0;j<4;j++)
                           {
                               System.out.print(a[j][i]+"  ");
                            }
                            System.out.println();
                        }
                        System.out.println("\n\n");
                        break;
                case 3:for(i=0;i<4;i++)
                       {
                           for(j=0;j<5;j++)
                           {
                               if(i==0||j==0||i==3||j==4)
                               System.out.print(a[i][j]+"  ");
                               else
                               System.out.print("   ");        
                              
                            }
                            System.out.println();
                        }
                        System.out.println("\n\n");
                        break;
                 case 4:for(i=0;i<4;i++)
                       {
                           for(j=0;j<5;j++)
                           {
                               if(!(i==0||j==0||i==3||j==4))
                               System.out.print(a[i][j]+"  ");
                               else
                               System.out.print("   ");        
                              
                            }
                            System.out.println();
                        }
                        System.out.println("\n\n");
                        break;
                case 5: System.out.println("Enter row no.(1 to 4) : ");            
                        m=sc.nextInt();
                        if(m>0 && m<5)
                        {
                            for(i=0;i<4;i++)
                           {
                               for(j=0;j<5;j++)
                               {
                                  if(i==m-1)
                                  System.out.print(a[i][j]+"  ");
                                  else
                                  System.out.print("   ");        
                              
                               }
                               System.out.println();
                            }
                            System.out.println("\n\n");                            
                        }
                        else
                        {
                            System.out.println("\nWrong input !! Try again !!"); 
                            break;
                        }
                        break;
                 case 6: System.out.println("Enter column no.(1 to 5) : ");            
                        m=sc.nextInt();
                        if(m>0 && m<6)
                        {
                            for(i=0;i<4;i++)
                           {
                               for(j=0;j<5;j++)
                               {
                                  if(j==m-1)
                                  System.out.print(a[i][j]+"  ");
                                  else
                                  System.out.print("   ");        
                              
                               }
                               System.out.println();
                            }
                            System.out.println("\n\n");                            
                        }
                        else
                        {
                            System.out.println("\nWrong input !! Try again !!"); 
                            break;
                        }
                        break;
                       
                       

                case 7:System.out.println("Terminating program !!");
                       break;
                default:System.out.println("Wrong choice !!! Try again !!!");
            }
            
        }
        while(n!=7);
        
        
       
    }

}
