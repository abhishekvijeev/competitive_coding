#include <stdio.h>
#include <inttypes.h>

int main()
{
    uint64_t term_3 = 0, term_3_last = 0, sum = 0;
    uint64_t n = 0, d = 0, a = 0;
    int t = 0;

    scanf("%d", &t);
    while(t > 0)
    {
        scanf("%lu %lu %lu", &term_3, &term_3_last, &sum);

        n = (sum * 2) / (term_3 + term_3_last);
        d = (term_3_last - term_3) / (n - 5);
        a = term_3 - (2 * d);
        
        printf("%lu\n", n);
        for(int i = 1; i <= n; i++)
        {
            printf("%lu ", a);
            a += d;
        }
        printf("\n");
        t--;
    }
    return 0;
}