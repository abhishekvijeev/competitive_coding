#include <iostream>
#include <vector>

using namespace std;

void dfs(int node, const vector<vector<int>> &adj_lists, vector<bool> &visited)
{
    visited[node] = true;
    vector<int> node_adj_list = adj_lists[node];
    int adj_node = 0;

    for(int i = 0; i < node_adj_list.size(); i++)
    {
        adj_node = node_adj_list[i];
        if(!visited[adj_node])
        {
            dfs(adj_node, adj_lists, visited);
        }
    }
}

bool isTree(int n, int e, vector<vector<int>> adj_lists)
{
    vector<bool> visited;
    visited.resize(n);
    
    if(n != (e + 1))
    {
        return false;
    }
    for(int i = 0; i < n; i++)
    {
        visited[i] = false;
    }
    dfs(0, adj_lists, visited);
    for(int i = 0; i < n; i++)
    {
        if(!visited[i])
        {
            return false;
        }
    }
    return true;
}

int main()
{
    vector<vector<int>> adj_lists;
    int n = 0, e = 0, u = 0, v = 0;
    cin >> n;
    cin >> e;
    adj_lists.resize(n);

    for(int i = 0; i < n; i++)
    {
        adj_lists[i] = vector<int>();
    }

    for(int i = 0; i < e; i++)
    {
        cin >> u;
        u--;
        cin >> v;
        v--;
        adj_lists[u].push_back(v);
        adj_lists[v].push_back(u);
    }
    cout << (isTree(n, e, adj_lists) ? "YES" : "NO");
    return 0;
}