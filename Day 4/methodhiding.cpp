#include <iostream>
using namespace std;

class A {
public:
    void msg() {
        cout << "hello A" << endl;
    }
};

class B : public A {
public:
    void msg2() {
        cout << "hello B" << endl;
    }
};

int main() 
{
    B *obj = new B();

    obj->msg();
    obj->msg2();

    delete obj;

    return 0;
}
