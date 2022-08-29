// GO lang SOLUTION (passed all test cases)


func main() {
   var departureTimeHH int
   var departureTimeMM int
   var travelTimeHH int
   var travelTimeMM int

   fmt.Scanf("%d %d", &departureTimeHH, &departureTimeMM)
   fmt.Scanf("%d %d", &travelTimeHH, &travelTimeMM)

   totalMinutesOfTravel := (travelTimeHH * 60) + travelTimeMM

   for i := 1; i <= totalMinutesOfTravel; i++ {
      departureTimeMM += 1
      if departureTimeMM > 59 {
         departureTimeMM = 0
         departureTimeHH += 1
         if departureTimeHH > 23 {
            departureTimeHH = 0
         }
      }
   }
   fmt.Printf("%02d %02d", departureTimeHH, departureTimeMM)
}