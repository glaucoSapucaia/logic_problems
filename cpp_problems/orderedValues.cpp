#include <iostream>

using namespace std;

int main()
{
    // variables
    int x, y;

    // inputs
    do {
        cout << "Enter two integers [equal values stop the program]:" << endl;
        cout << "First value: ";
        cin >> x;
        cout << "Second value: ";
        cin >> y;
        cout << endl;

        // logic and answers
        if (x < y) {
            cout << "Ascending order!" << endl;
        }
        else if (x > y) {
            cout << "Descending order!" << endl;
        }
        else {
            cout << "Equal values | Stopping the program.";
        }

    } while (x != y);

    return 0;
}