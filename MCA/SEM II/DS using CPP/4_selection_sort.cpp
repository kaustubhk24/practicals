
#include<iostream>
using namespace std;
int main()
{
	int no,num;
	cout<<"Enter number of elements :";
	cin>>no;
	int arr[no];
	cout<<"Enter elements :";
	for(int i=0;i<no;i++)
	{
		cin>>arr[i];
	}
	cout<<"Enter no for searching :";
	cin>>num;
	for(int i=0;i<no;i++)
	{
		if(arr[i]==num)
		{
			cout<<"found at "<<i+1;
		return 0;
		}
		
	}
	cout<<"Not found";
	
}
