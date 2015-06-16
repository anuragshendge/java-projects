#include <iostream>
using namespace std;

void reverse(char **str);

int main(){

	char p[] = "12345";
	char *str = p;	

	cout<<str<<endl;
	reverse(&str);
	cout<<str<<endl;
	return 0;
} 


void reverse(char **str_ref){

	char *str = *str_ref;
	char *end = str;
	char tmp;

	while(*end != '\0'){
		++end;
	}
	end--;

	while(str < end)
	{
		tmp = *str;
		*str++ = *end;
		*end-- = tmp;
	}





}
