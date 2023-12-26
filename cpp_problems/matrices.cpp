#include <iostream>

using namespace std;

int main()
{
    // vars
    int N, number_of_negatives, i, j;

    // inputs
    cout << "Matrix order: ";
    cin >> N;
    cout << endl;

    // variables
    double matrix[N][N], main_diagonal[N];

    // inputs
    for (i = 0; i < N; i++) {
        for (j = 0; j < N; j++) {
            cout << "Matrix[" << (i + 1) << "," << (j + 1) << "] value: ";
            cin >> matrix[i][j];
        }
    }
    cout << endl;

    // logic
    number_of_negatives = 0;
    for (i = 0; i < N; i++) {
        for (j = 0; j < N; j++) {
            if (matrix[i][j] < 0) {
                number_of_negatives += 1;
            }
            main_diagonal[i] = matrix[i][i];
        }
    }

    // results
    cout << "Matrix data:" << endl;
    cout << "Main matrix diagonal -> ";
    for (i = 0; i < N; i++) {
        if (i == (N - 1)) {
            cout << main_diagonal[i] << endl;
        }
        else {
            cout << main_diagonal[i] << " | ";
        }
    }
    cout << "Number of negative values -> " << number_of_negatives;

    return 0;
}