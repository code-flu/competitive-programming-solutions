#include <stdio.h>
#include <iostream>
#include <algorithm>
using namespace std;

  int main(int argc, char *a[])
  {
    int t,n,g;
    scanf("%d", &t);
    for (int x = 0; x < t; x++) {
      scanf("%d", &n);
      scanf("%d", &g);
      long gifts[g];
      for (int i = 0; i < g; i++) {
        cin>>gifts[i];
      }
      int j = sizeof(gifts)/sizeof(gifts[0]);
      std::sort(gifts, gifts + j);
      long sum = 0;
      for (int k = 0; k < n; k++) {
        sum = sum+gifts[k];
      }
      cout<<sum<<endl;
    }
  }