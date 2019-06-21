long long int lcd(int a, int b) {
	int i = 2;
	long long int re = 1;
	while(1) {
		if (a%i == 0 && b%i == 0) {
			re *= i;
			a /= i;
			b /= i;
		}
		else i++;
		if (a < i || b < i) {
			re *= a;
			re *= b;
			break;
		}
	}
	return re;
}