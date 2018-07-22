package com.se.object.array;

class MathDemo {
	public static void main(String[] args) {
		MathDemo m = new MathDemo();
		int[] b = new int[5];

		b = MathDemo.input();
		System.out.println("随机数产生的长度为五的一个数组");
		MathDemo.show(b);
		MathDemo.selectSort(b);
		System.out.println("对产生的数组进行选择排序：");
		MathDemo.show(b);
		MathDemo.reverse(b);
		System.out.println("对数组进行倒置：");
		MathDemo.show(b);
		// m.maoPao(b);
		// System.out.println("对数组进行冒泡排序：");
		// m.show(b);
		m.insertSort(b);
		System.out.println("选择排序是：");
		MathDemo.show(b);
		MathDemo.maxMin(b);
	}

	public static void maxMin(int[] a) {
		int max = 0;
		int min = 0;
		for (int i = 0; i < a.length; i++) {
			max = a[0];
			min = a[0];
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("最大值：" + max + "\t最小值：" + min);
	}

	public static void change(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void maoPao(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					change(a, j, j + 1);
				}
			}
		}
	}

	public static int[] input() {
		int[] a = new int[5];
		for (int i = 0; i < 5; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		return a;
	}

	public static void show(int[] b) {
		System.out.print("[");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
			if (i < b.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public static void selectSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int index = i;
			for (int j = i; j < a.length; j++) {
				if (a[index] > a[j]) {
					index = j;
				}
			}
			change(a, i, index);
		}
	}

	public void insertSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			if (a[i - 1] > a[i]) {
				int j = i - 1;

				for (; j >= 0 && temp < a[j]; j--) {
					a[j + 1] = a[j];
				}
				a[j + 1] = temp;
			}
		}
	}

	public static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}
	}
}