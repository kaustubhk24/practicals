#include<iostream>
using namespace std;
int main()
{
	int n;
	cout<<"Enter Number ";
	cin>>n;
	cout<<"Series:";
	int n1=0,n2=1,n3;
	cout<<n1;
	cout<<" ";
	cout<<n2;
	
	
	for(int i=1;i<=n;i++)
	{
	n3=n1+n2;
	cout<<" ";
	cout<<n3;
	n1=n2;
	n2=n3;
	
		
	}
}
