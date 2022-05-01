#include <stdio.h>
#include <iostream>
using namespace std;

 int find(int tj[], int res) {
    for (int i = tj[2]; i > 0; ) {
      int t = i - tj[0];
      if (t > 0) {
        i = t + tj[1];
      } else break;
      res++;
    }
    return res;
  }
  
int main() {
    int n;
    scanf("%d", &n);
    int tj[3];
    for (int i = 0; i < n; i++) {
      cin>>tj[0]>>tj[1]>>tj[2];
      cout<<find(tj, 1)<<endl;
    }
}