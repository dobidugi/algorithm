long long int f(long long int n) {
	long long int re = 0;
	int temp;
	while (1) {
		if (n < 10) break;
		temp = (n % 10);
		re += temp;
		re = re * 10;
		n = n / 10;
	}
	re += n;
	return re;
}