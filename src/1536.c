long long int f() {
	int i;
	long long int min;
	min = d[1];
	for (i = 1; i <=n; i++) {
		if (d[i] < min) {
			min = d[i];
		}
	}
	return min;
}