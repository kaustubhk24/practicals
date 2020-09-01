#include<iostream>
using namespace std;
int main()
{
	int arr[10],n,max=0,min;
	cout<<"Enter size of array";
	cin>>n;
	cout<<"Enter array elements";
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
		
	}
	for(int i=0;i<n;i++)
	{
	if(arr[i]>max)
	{
		max=arr[i];
		
	}
	}
	min=max;
	
		for(int i=0;i<n;i++)
	{
	if(arr[i]<min)
	{
		min=arr[i];
		
	}
	}
	cout<<"max is:";
	cout<<max<<endl;
	
	cout<<min;
	
}
