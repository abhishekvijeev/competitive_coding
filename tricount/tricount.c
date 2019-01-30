#include <stdio.h>
#include <math.h>
#include <inttypes.h>

int main()
{
    uint32_t t = 0;
    unsigned long long result = 0, n = 0;;
    scanf("%d", &t);

    while(t > 0)
    {
        scanf("%llu", &n);
        result = n * (n + 2) * (2 * n + 1) / 8;
        printf("%llu\n", result);
        t--;
    }    
    return 0;
}
