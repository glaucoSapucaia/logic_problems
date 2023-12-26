#include <iostream>
#include <iomanip>
#include <climits>

using namespace std;

int main()
{
    // variables
    int N, i;

    // inputs
    cout << "Data from how many people will be informed?: ";
    cin >> N;
    cout << endl;

    // variables
    string names[N];
    double heights[N], average_height, percentage_under_16;
    int ages[N], number_under_16;

    // input
    for (i = 0; i < N; i++) {
        cout << "Person[" << (i + 1) << "] data:" << endl;
        cout << "Name: ";
        cin.ignore(INT_MAX, '\n');
        getline(cin, names[i]);
        cout << "Age: ";
        cin >> ages[i];
        cout << "Height: ";
        cin >> heights[i];
        cout << endl;
    }

    // calculations and logic
    average_height = 0;
    number_under_16 = 0;
    for (i = 0; i < N; i++) {
        average_height += heights[i];
        if (ages[i] < 16) {
            number_under_16 += 1;
        }
    }

    average_height = average_height / N;

    percentage_under_16 = (double)(number_under_16 * 100) / N;

    // answers
    cout << "Data:" << endl;
    cout << fixed << setprecision(2);
    cout << "Average height -> " << average_height << endl;
    cout << fixed << setprecision(1);
    cout << "Percentage of people under 16 -> " << percentage_under_16 << "%" << endl;
    cout << "Names of people under 16:" << endl;
    for (i = 0; i < N; i++) {
        if (ages[i] < 16) {
            cout << "-> " << names[i] << "." << endl;
        }
    }

    return 0;
}