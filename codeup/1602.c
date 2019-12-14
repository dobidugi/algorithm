#include <stdio.h>

int main()
{
	double n;
	scanf("%lf", &n);
	if (n < 0) n = -n;
	printf("%.10g", n);
}