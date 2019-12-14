void f() {
	int flag = 1;
	for (int i = 2; i < n; i++) {
		if (n%i == 0) {
			flag = 0;
			break;
		}
	}
	if (flag == 1) printf("prime");
	else if(flag == 0) printf("composite");

} 