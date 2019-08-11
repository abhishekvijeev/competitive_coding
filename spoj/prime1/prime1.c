#include <stdio.h>
#include <math.h>
#include <stdbool.h>
#include <inttypes.h>
#include <stdlib.h>
#include <string.h>

bool *simple_sieve(uint32_t limit);
void segmented_sieve(uint32_t m, uint32_t n);


int main()
{
	uint32_t t, m, n;
	
	scanf("%d", &t);
	while(t > 0)
	{
		scanf("%d", &m);
		scanf("%d", &n);
		segmented_sieve(m, n);	
		--t;
	}
	return 0;
}

bool *simple_sieve(uint32_t limit)
{
	bool *basic_primes = (bool *)malloc(sizeof(bool) * (limit + 1));
	memset(basic_primes, true, sizeof(bool) * (limit + 1));
	
	
	for(uint32_t i = 2; (i * i) <= limit; i++)
	{
		if(basic_primes[i])
		{
			for(uint32_t j = i * 2; j <= limit; j += i)
			{
				basic_primes[j] = false;
			}
		}
	}	
	
	return basic_primes;
}

void segmented_sieve(uint32_t m, uint32_t n)
{
	uint32_t limit = sqrt(n);
	bool *basic_primes, *required_primes;
	
	required_primes = (bool *)malloc(sizeof(bool) * (n - m + 1));
	memset(required_primes, true, sizeof(bool) * (n - m + 1));
	
	basic_primes = simple_sieve(limit);
	
	for(uint32_t i = 2; i <= limit; i++)
	{
		if(basic_primes[i])
		{
			uint32_t first_div = (m / i) * i;
			if(first_div < m)
			{
				first_div += i;
			}
			
			for(uint32_t j = first_div; j <= n; j += i)
			{
				if(j != i)
				{
					required_primes[j - m] = false;
				}
			}
		}
	}
	
	for(uint32_t i = m; i <= n; i++)
	{
		if((i != 1) && required_primes[i - m])
		{
			printf("%d\n", i);
		}
	}
	
	if(basic_primes != NULL)
	{
		free(basic_primes);
	}
	if(required_primes != NULL)
	{
		free(required_primes);
	}
}





























