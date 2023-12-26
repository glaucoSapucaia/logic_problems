#include <iostream>

using namespace std;

int main()
{
    // vars
    int x, y, lower_number, odd_sum, i;

    // inputs
    cout << "Enter two integers:" << endl;
    cout << "X = ";
    cin >> x;
    cout << "Y = ";
    cin >> y;

    // logic
    if (x > y) {
        lower_number = y;
        y = x;
        x = lower_number;
    }

    odd_sum = 0;
    for (i = (x + 1); i < y; i++) {
        if (i % 2 != 0) {
            odd_sum += i;
        }
    }

    // results
    cout << "The sum of the odd numbers between " << x << " and " << y << " is " << odd_sum << ".";

    return 0;
}