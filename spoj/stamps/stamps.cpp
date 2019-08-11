#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
    int t = 0, no_stamps = 0, no_friends = 0, no_required = 0, sum = 0, scenario = 1;
    vector<int> stamp_offerings;

    cin >> t;
    while(t > 0)
    {
        cin >> no_stamps;
        cin >> no_friends;
        no_required = 0;
        sum = 0;
        stamp_offerings.resize(no_friends);

        for(int i = 0; i < no_friends; i++)
        {
            cin >> stamp_offerings[i];
        }
        sort(stamp_offerings.begin(), stamp_offerings.end(), greater<int>()); 
        for(int i = 0; i < no_friends; i++)
        {
            if(sum < no_stamps)
            {
                sum += stamp_offerings[i];
                no_required++;
            }
            else
            {
                break;
            }
        }
        cout << "Scenario #" << scenario << ":\n";
        if(sum < no_stamps)
        {
            cout << "impossible\n";
        }
        else
        {
            cout << no_required << "\n";
        }
        scenario++;
        t--;
    }
    return 0;
}