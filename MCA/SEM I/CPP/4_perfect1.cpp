#include<iostream>
using namespace std;
int main()
{
	int n,sum=0,a=1;
	cout<<"Enter Number :";
	cin>>n;
	while(a<n)
	{
		if(n%a==0)
		{
			sum=sum+a;
			
			
		}
		a++;
	}
	if(sum==n){
		cout<<"Perfect no";
		
	}
	else{
		cout<<"Not perfect";
		
	}
}
