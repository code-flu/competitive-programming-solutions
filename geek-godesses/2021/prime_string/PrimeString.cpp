#include <iostream>
using namespace std;
#include <iostream>
#include <cstring>
#include <cstdlib>

int main() {
    int n;
    string s;
    cin>>n;
    for (int i = 0; i < n; i++) {
        cin >> s;
        char chr[s.length() + 1];
        strcpy(chr, s.c_str());
        int k = 0;
        int even = 0;
        int odd = 0;
        for (char c : chr) {
            if (k % 2 == 0) even += c;
            else odd += c;
            k += 1;
        }
        int diff = labs(odd - even);
        if (diff % 3 == 0 || diff % 5 == 0 || diff % 7 == 0) 
            cout << "Prime String" << endl;
        else cout << "Casual String" << endl;
    }
    return 0;
}
