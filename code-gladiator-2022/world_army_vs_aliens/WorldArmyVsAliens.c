// C SOLUTION (passed all test cases)

#include <stdio.h>
int main() {

    int departureTimeHH, departureTimeMM, TravelTimeHH, TravelTimeMM;
    scanf("%d %d", &departureTimeHH, &departureTimeMM);
    scanf("%d %d", &TravelTimeHH, &TravelTimeMM);
    
    int totalMinutesOfTravel = (TravelTimeHH * 60) + TravelTimeMM;
    
    for(int i=1; i<=totalMinutesOfTravel; i++){
        departureTimeMM += 1;
        if (departureTimeMM > 59){
            departureTimeMM = 0;
            departureTimeHH += 1;
            if (departureTimeHH > 23){
                departureTimeHH = 0;
            }
        }    
    }
    printf("%02d %02d", departureTimeHH, departureTimeMM);
    return 0;
}