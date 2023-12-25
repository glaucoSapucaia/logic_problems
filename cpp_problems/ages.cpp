#include <iostream>
#include <iomanip>
#include <climits>

using namespace std;

int main()
{
    // variables
    string name1, name2;
    int age1, age2;
    double average;

    // inputs
    cout << "First person data:" << endl;
    cout << "Name: ";
    getline(cin, name1);
    cout << "Age: ";
    cin >> age1;
    cout << endl;
    cout << "Second person data:" << endl;
    cout << "Name: ";
    cin.ignore(INT_MAX, '\n');
    getline(cin, name2);
    cout << "Age: ";
    cin >> age2;
    cout << endl;

    // calculation
    average = (double)(age1 + age2) / 2;

    // results
    cout << fixed << setprecision(1);
    cout << "The average age between " << name1 << " and " << name2 << " is " << average << ".";

    return 0;
}