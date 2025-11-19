// class Solution {
//     public void rotate(int[] nums, int k) {
//        int n=nums.length;
//        if(k>=n){
//         k=k%n;
//        }
//         while(k>0){
//              int i=nums.length-1;
//         int j=nums.length-2;
//             while(i>=1&&j>=0){
//                 int c=nums[i];
//                  nums[i]=nums[j];
//                   nums[j]=c;
//                 i--;
//                 j--;
//             }
//             k--;
//         }
//     }
// }
int count=0;
int max=0;
for(int i=0;i<=n-1;i++){
    while(i!=0){
        count++;
        i+1
      }
      if(count>max){
        max=count;
    }
}