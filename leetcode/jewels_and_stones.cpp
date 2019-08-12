class Solution 
{
    public:
    
    int numJewelsInStones(string J, string S) 
    {
        vector<int> freq(128, 0);
        int s_len = S.size();
        int j_len = J.size();
        int result = 0;

        for(int i = 0; i < s_len; i++)
        {
            freq[S[i]]++;
        }

        for(int i = 0; i < j_len; i++)
        {
            result += freq[J[i]];
        }
        return result;
    }
};