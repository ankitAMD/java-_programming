#include <iostream>

using namespace std;
template<class T1, class T2>
class test
{
    T1 a;
    T2 b;
public:
    Test(T1 x,T2 y)
    {
        a=x;
        b=y;
    }
    void show()
    {
        cout<<a<<"and"<<b<<"\n";
    }
};
int main()
{

    cout<<"installing the class template as test1 with float ant int data types..\ntest1:";
    Test<float,int>test1(1.23,123);
    test1.show();
    cout<<"installing the class template as test2 with int and char  data types..\ntest2:";
    Test<int,char>test2(100,'w');
     test2.show();
     return 0;
}
