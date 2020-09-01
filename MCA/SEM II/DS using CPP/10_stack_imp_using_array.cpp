#include<iostream>
using namespace std;

int s[10],i;
int top=-1;
	int display()
	{
		cout<<"Stack:"<<endl;
		for(i=0;i<=top;i++)
		{
			cout<<"Element at position "<<i<<" is "<<s[i]<<endl;
		}
	}
	bool isfull()
	{
		if(top==9)
			return 1;
		else 
			return 0;
	}
	bool isempty()
	{
		if(top==-1)
			return 1;
		else
			return 0;
	}
int main()
{
	int ch;
	while(ch!=-1)
	{
		cout<<"\n-----MENU-----"<<endl;
		cout<<"1.Push."<<endl;
		cout<<"2.Pop."<<endl;
		cout<<"3.Display"<<endl;
		cout<<"4.Exit"<<endl;
		cout<<"Enter a choice:";
		cin>>ch;
		switch(ch)
		{
			case 1:
				if(isfull())
				{
					cout<<"Stack is full"<<endl;
					break;
				}
				else
				{
					top=top+1;
					cout<<"Enter a character:";
					cin>>s[i];
					display();
					if(isfull())
					{
						cout<<"Stack is Full!"<<endl;
					}
					break;
				}
			case 2:
				if(isempty())
				{
					cout<<"Stack is empty!"<<endl;
					break;
				}	
				else
				{
					cout<<s[i]<<" is removed!"<<endl;
					top=top-1;
					display();
					if(isempty())
					{
						cout<<"Stack is Empty!"<<endl;
					}
					break;
				}
			case 3:
				if(isempty())
				{
					cout<<"Stack is empty!"<<endl;
				}
				else
					display();
				break;
			case 4:
				exit(0);	
		}
	}
}

