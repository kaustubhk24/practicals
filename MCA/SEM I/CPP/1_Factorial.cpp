#include<iostream>
using namespace std;
int main()
{
	int a,n;
	cout<<"Enter Number ";
	cin>>n;
	/*if(n==0)
	{
		cout<<"The Factorial is 1";
	}
	else if(n<0)
	{
		cout<<"Factorial of negative numbers can't find";
	}
	else*/ if(n>0)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
			cout<<"The factorial is:";
			cout<<fact;
	
		
	}
	
}
