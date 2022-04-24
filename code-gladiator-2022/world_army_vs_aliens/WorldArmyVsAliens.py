# PYTHON SOLUTION (passed all test cases)

departureTimeHH,departureTimeMM = input().split(" ")
TravelTimeHH,TravelTimeMM = input().split(" ")
departureTimeHH = int(departureTimeHH)
departureTimeMM = int(departureTimeMM)
TravelTimeHH = int(TravelTimeHH)
TravelTimeMM = int(TravelTimeMM)

totalMinutesOfTravel = (TravelTimeHH * 60) + TravelTimeMM

for x in range(1, totalMinutesOfTravel+1, 1):
    departureTimeMM += 1
    if departureTimeMM > 59:
        departureTimeMM = 0
        departureTimeHH += 1
        if departureTimeHH > 23:
            departureTimeHH = 0

print(f"{departureTimeHH:02d}", f"{departureTimeMM:02d}")