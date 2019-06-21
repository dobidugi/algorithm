long long int f(long long int n)
{
	long long int sum = 0;

	for (long long int i = 1; i <= n; i++) sum += i;
	return sum;
}