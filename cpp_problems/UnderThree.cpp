#include <iostream>

using namespace std;

int main()
{
    // vars
    int a, b, c, lower_number;

    // inputs
    cout << "Enter three integer:" << endl;
    cout << "First value: ";
    cin >> a;
    cout << "Second value: ";
    cin >> b;
    cout << "Third value: ";
    cin >> c;
    cout << endl;

    // logic
    if (a < b && a < c) {
        lower_number = a;
    }
    else if (b < c) {
        lower_number = b;
    }
    else {
        lower_number = c;
    }

    // answers
    cout << "The smallest value reported is " << lower_number << ".";

    return 0;
}