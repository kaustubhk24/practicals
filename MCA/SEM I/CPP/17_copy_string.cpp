#include<iostream>
using namespace std;
int main()
{
	char str1[20],str2[20];
	int i;

	cout<<"Enter String :";
	cin>>str1;
	for(i=0;str1[i]!='\0';i++)
	{
      str2[i]=str1[i];
	}
	str2[i]='\0';
	cout<<"Copied String :"<<str2;
}
