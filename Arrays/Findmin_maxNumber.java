// If the function signature requires returning an ArrayList<Integer>
// class Solution {
//     public ArrayList<Integer> getMinMax(int[] arr) {
//         // code Here
//         int min = arr[0];
//         int max = arr[0];
        
//         for (int  i = 1; i < arr.length; i++)
//         {
//             if (arr[i] > max)
//             {
//                 max = arr[i];
//             } else if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }
//      ArrayList<Integer> ans = new ArrayList<>();
//     ans.add(min);
//     ans.add(max);

//     return ans;
// }
// }

//Simple no any twicks

// int[] findMinMax(int[] arr) {
//     int min = arr[0];
//     int max = arr[0];

//     for (int i = 1; i < arr.length; i++) {
//         if (arr[i] > max) {
//             max = arr[i];
//         } else if (arr[i] < min) {
//             min = arr[i];
//         }
//     }

//     return new int[]{max, min};
// }
