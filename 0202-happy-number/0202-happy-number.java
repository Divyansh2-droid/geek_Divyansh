class Solution {
    public boolean isHappy(int n) {
        Set<Integer> usedIntegers = new HashSet<>();
        while(true){
            // finding sumnof the squares
            int sum =0;
            while(n!=0){
                sum+= Math.pow(n%10, 2.0);
                n = n/10;
            }
       
            //if sum equals 1 returns true
            if(sum==1) return true;
           //else our new number ie n = sum
            n=sum;
          //if hashset contains the number n return false because wapis usi number pe aa gye loop me fas gye so get out of loop by returning false
            if(usedIntegers.contains(n))
            return false;
            //else agar number hashset me nahi hai toh usko ab hashset me add krdo
            usedIntegers.add(n);
        }
    }
}