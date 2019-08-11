/*
 * Problem Link: https://leetcode.com/problems/two-sum/
 * 
 * A straight-forward way to solve this problem would be to use two nested loops and list out every
 * possible pair of numbers to check whether they sum up to the required target. But, this 
 * solution's asymptotic time complexity is quadratic i.e. O(n^2)
 * 
 * We could do better by first sorting the array. Then, iterate through every element in the array
 * and search for its complement (i.e for every 'x', check whether 'target - x' is present in the
 * array). Since the array is sorted, we could use binary search. This solution's asymptotic
 * time complexity is O(n log n)
 * 
 * However, we can do even better. The key is to realize that the bottleneck is the lookup 
 * operation. The data structure that is best suited for efficient lookups is a hash table
 * (assuming that it uses a good hash function to minimize collisions). Therefore, if we were to
 * store every number along with its index in a hash table, we could check whether its complement
 * exists in O(1) time with a very high probability. Therefore, this algorithm runs in O(n)
 * (Look at the solutions page on leetcode for a more intuitive 2 pass hash table solution)
 */


class Solution 
{
    public:

    vector<int> twoSum(vector<int>& nums, int target) 
    {
        vector<int> result;
        unordered_map<int, int> complementMap;
        int complement;
        
        for(int i = 0; i < nums.size(); i++)
        {
            complement = target - nums[i];
            
            // The complement map does not contain the complement and 
            // we hence have to insert the number
            if(complementMap.find(complement) == complementMap.end())
            {
                complementMap[nums[i]] = i;
            }
            // We have found our solution
            else
            {
                result.push_back(complementMap[complement]);
                result.push_back(i);
                break;
            }
        }
        return result;
    }
};