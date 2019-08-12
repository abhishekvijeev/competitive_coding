class Solution {
public:
    string defangIPaddr(string address) {
        string result;
        const string bracket_period = "[.]";
        int len = address.length();

        result.reserve(len + 6);
        for(int i = 0; i < len; i++)
        {
            if(address[i] >= '0' && address[i] <= '9')
            {
                result.append(1, address[i]);
            }
            else if(address[i] == '.')
            {
                result.append(bracket_period);
            }
        }
        return result;
        }
};