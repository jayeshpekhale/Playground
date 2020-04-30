#include<iostream>
using namespace std;
int main()
{
  int a,b;
  std::cin>>a;
  
if(a<=200)
  {
      b=a*0.5;
      std::cout<<"Rs."<<b;
  }
 else if(a>=400)
    std::cout<<((a*0.65)+100);
   
    else
    std::cout<<(a*1.25)+(425);
      
}