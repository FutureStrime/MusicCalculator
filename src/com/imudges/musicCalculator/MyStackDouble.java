package com.imudges.musicCalculator;

class MyStackDouble {
	private int maxSize;// ջ���������
	private double[] ch; // ջ������
	private int top; // ջͷ���

	public MyStackDouble(int s) {
		maxSize = s;
		ch = new double[s];
		top = -1;
	}

	public void push(double c) {// ��ջ
		ch[++top] = c;
	}

	public double pop() {// ��ջ
		return ch[top--];
	}

	public double top() {
		return ch[top];
	}

	public boolean empty() {//�ж��Ƿ�Ϊ��
		return top <= -1;
	}

	public boolean isFull() {
		return top == (maxSize - 1);
	}

	public int size() {
		return top + 1;
	}

	public double get(int index) {
		return ch[index];
	}

	public void display(String str) {
		System.out.print(str);
		System.out.print(" Stack (bottom-->top): ");
		for (int i = 0; i < size(); i++) { 
			System.out.print(get(i) + " ");
		}
		System.out.println();
	}
}
