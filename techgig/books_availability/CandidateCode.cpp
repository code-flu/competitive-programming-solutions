
#include <iostream>
#include <vector>

using namespace std;

int main() {
    int n;
    cin >> n;

    vector<vector<int>> matrix(n, vector<int>(n));
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> matrix[i][j];
        }
    }

    int max_sum = -1;
    int max_row_index = -1;
    for (int i = 0; i < n; i++) {
        int row_sum = 0;
        for (int j = 0; j < n; j++) {
            row_sum += matrix[i][j];
        }
        if (row_sum > max_sum) {
            max_sum = row_sum;
            max_row_index = i;
        }
    }

    cout << max_row_index << endl;

    return 0;
}
