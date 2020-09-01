#include<iostream>
using namespace std;
int main()
{
	int num,i,n,cnt=0,pos,c=0;
	cout<<"Enter array size :";
	cin>>n;
	cout<<"Enter array elements :";
	int arr[n];
	for(i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	cout<<"Enter element to search :";
	cin>>num;
	for(i=0;i<n;i++)
	{
		if(num==arr[i])
		{
			cout<<"Found at :"<<i+1;
			c=1;
			break;
		}
		else{
		c=0;
		}
	}
	if(c==0){
		cout<<"Element not found!";
	}
}
