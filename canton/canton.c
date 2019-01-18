#include <stdio.h>
#include <math.h>

void cantors_nth_term(int n)
{
    int skip_diagonals = 0, extra_steps = 0, numerator = 0, denominator = 0;

    skip_diagonals = (-1 + sqrt(1 + 8 * n)) / 2;
    extra_steps = n - (skip_diagonals * (skip_diagonals + 1) / 2);

    if((skip_diagonals % 2) == 0)
    {
        if(extra_steps <= 1)
        {
            numerator = skip_diagonals + extra_steps;
            denominator = 1;
        }
        else
        {
            numerator = skip_diagonals - extra_steps + 2;
            denominator = extra_steps;
        }
    }
    else
    {
        if(extra_steps <= 1)
        {
            numerator = 1;
            denominator = skip_diagonals + extra_steps;
        }
        else
        {
            numerator = extra_steps;
            denominator = skip_diagonals - extra_steps + 2;
        }
    }
    printf("TERM %d IS %d/%d\n", n, numerator, denominator);
}

int main()
{
    int t = 0, n = 0;
    scanf("%d", &t);

    while(t > 0)
    {
        scanf("%d", &n);
        cantors_nth_term(n);
        t--;
    }
    return 0;
}