#include<iostream>
using namespace std;
int find_factorial(int);
int main()
{
   int num, fact;
   
   cout<<"\nEnter any integer number:";
  cin>>num;
 
  
   fact =find_factorial(num);
 

  cout<<fact;
   return 0;
}
int find_factorial(int n)
{
  
   if(n==0)
      return(1);
 
  
   return(n*find_factorial(n-1));
}
