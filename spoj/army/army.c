#include <stdio.h>

int main()
{
    int t = 0, ng = 0, nm = 0, largest_1 = 0, largest_2 = 0, inp = 0;

    scanf("%d", &t);
    while(t > 0)
    {
        scanf("%d", &ng);
        scanf("%d", &nm);
        largest_1 = 0, largest_2 = 0;
        while(ng > 0)
        {
            scanf("%d", &inp);
            if(inp > largest_1)
            {
                largest_1 = inp;
            }
            ng--;
        }
        while(nm > 0)
        {
            scanf("%d", &inp);
            if(inp > largest_2)
            {
                largest_2 = inp;
            }
            nm--;
        }
        if(largest_1 >= largest_2)
        {
            printf("Godzilla\n");
        }
        else
        {
            printf("MechaGodzilla\n");
        }
        t--;
    }
    return 0;   
}