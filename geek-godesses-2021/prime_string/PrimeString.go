package main

import (
   "fmt"
)
func main()  {
      var n int
      _, _ = fmt.Scanln(&n)
      for i := 0; i < n; i++ {
         var s string
         var even int32 =  0
         var odd int32 = 0
         _, _ = fmt.Scanln(&s)
         for k, r := range s {
            if k % 2 == 0 {
               even += r
            }else {
               odd += r
            }
         }
         diff := Abs(odd-even)
         if diff % 3 == 0 || diff % 5 == 0 || diff % 7 == 0 {
            fmt.Println("Prime String")
         } else {
            fmt.Println("Casual String")
         }
      }
}
func Abs(x int32) int32 {
   if x < 0 {
      return -x
   }
   return x
}