int sqrt(long long int n) {
	long long int k;
	if (n == 0) return 0;
	if (n == 1) return 1;
	for (k = 2; k<n/2; k++) {
		if ((k*k) <= n && ((k+1)*(k+1)>n)) break;
	}
	return (int)k;
}