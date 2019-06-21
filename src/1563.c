int mid(int a, int b, int c) {
	int arr[3];
	arr[0] = a;
	arr[1] = b;
	arr[2] = c;
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			if (arr[i] < arr[j]) {
				a = arr[i];
				arr[i] = arr[j];
				arr[j] = a;
			}
		}
	}
	return arr[1];
}