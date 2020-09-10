#include<iostream>
using namespace std;
int main()
{
	char str[20];
	int i=0;
	cout<<"Enter String :";
	cin>>str;
	for(i=0;str[i]!='\0';i++)
	
	{
		if(str[i]>=97 && str[i]<=122){
			str[i]=str[i]-32;
			
		}
		
	}

	cout<<"Converted String :"<<str;
}
