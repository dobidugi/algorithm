int f() {
	int max,i;
	max = d[0];
	for (i = 1; i < n; i++) {
		if (d[i] > max) {
			max = d[i];
		}
	}
	for (i = 0; i < n; i++) {
		if (d[i] == max) {
			break;
		}
	}
	return i + 1;
}