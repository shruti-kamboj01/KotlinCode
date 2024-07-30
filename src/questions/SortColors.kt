package questions

fun main() {
    val nums = intArrayOf(2,0,2,1,1,0);
    val nums2 = arrayOf(2,1,2,0,2)
    sortColors(nums)
    for(i in nums) {
        println(i)
    }
}

fun sortColors(nums2: Array<Int>) {

}

fun sortColors(nums: IntArray): Unit {
    var countZeros = 0
    var countOne = 0
    var countTwo = 0

    for( i in nums) {
        when(i) {
            0 -> countZeros++
            1 ->  countOne++
            2 -> countTwo++
        }
    }



   var i = 0
       while(countZeros > 0) {
           nums[i] = 0
           i++
           countZeros--

       }
       while(countOne > 0) {
           nums[i] = 1
           countOne--
           i++
       }
       while(countTwo > 0) {
           nums[i] = 2
           countTwo--
           i++
       }

   }





