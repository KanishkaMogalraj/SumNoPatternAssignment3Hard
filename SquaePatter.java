import java.util.*;
public class Main {
	
	public static void main(String[] args) {
	
        Scanner sc=new Scanner(System.in);
        int n,sum=0;
        n=sc.nextInt();
        if(n>=0 && n<=50)
        {
            int i=1;
            while(i<=n)
            {
               int j=1;
                sum=sum+i;
                
                       while(j<=i)
                        {
                           
                           
                           if(i==1)
                           {
                               System.out.print(i+"="+ sum);
                              
                           }
                           else
                           {
                              
                               if(j!=i+1)
                               {
                                    System.out.print(j);
                                  if(j<i)
                                  {
                                   System.out.print("+" );
                                  }
                                     else
                               {
                                   System.out.print("=" + sum);
                               }
                                   
                               }
                             
                               
                          
                           }
                           j++;
                      
                            
                            
                        }
                System.out.println();
                i++;
                    }
                    
                    
                }
                
             
        
        
	}
}
