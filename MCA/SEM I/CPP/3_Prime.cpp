#include<iostream>
using namespace std;
int main()
{
	int n;
	cout<<"Enter a number ";
	int flag=0;
	cin>>n;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			flag=1;
			break;
			
		}
	}
	if(flag==0){
		cout<<"The number is prime";
	}
	else{
		cout<<"The number is not prime";
	}
		
}

