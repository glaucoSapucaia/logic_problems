#include <iostream>
#include <cmath>
#include <iomanip>

using namespace std;

int main()
{
    // variables
    double base, height, area, perimeter, diagonal;

    // inputs
    cout << "Base of the rectangle: ";
    cin >> base;
    cout << "Height of the rectangle: ";
    cin >> height;
    cout << endl;

    // calculations
    area = base * height;
    perimeter = 2 * (base + height);
    diagonal = sqrt(pow(base, 2) + pow(height, 2));

    // answers
    cout << "Rectangle data:" << endl;
    cout << fixed << setprecision(4);
    cout << "Area -> " << area << endl;
    cout << "Perimeter -> " << perimeter << endl;
    cout << "Diagonal -> " << diagonal;

    return 0;
}