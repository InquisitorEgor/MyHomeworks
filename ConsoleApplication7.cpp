#include "pch.h"
#include <iostream>
#include <cmath>
using namespace std;

void InputMas(double *m, double length,int count1) {
	for (int i = 0; i < length; ++i) {
		count1++;
		cout << "Input the " << count1 << " number: ";
		cin >> m[i];
	}
}
void OutputMas(double *m, double length, int count1) {
	for (int i = 0; i < length; ++i) {
		count1++;
		cout <<"The "<<count1<<" number is "<< m[i]<<endl;
	}
}
bool Two(double a1) {
	while (a1 > 1) {
		a1 /= 2;
	}
	if (a1 == 1) return true;
	return false;
}
void Finding(double *m, double length, int count ) {
	for (int i = 0; i < length; ++i,++count) {
		bool a = Two(m[i]);
		cout <<count<<": "<< m[i] << " is " << a << endl;
	}
}



int main()
{
	int count = 0;
	int n = 5;
	double *mas = new double[n];
	InputMas(mas, n, count);
	OutputMas(mas, n, count);
	Finding(mas, n,count);
	system("pause");
}
