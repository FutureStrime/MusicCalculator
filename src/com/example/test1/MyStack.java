package com.example.test1;

class MyStack {
	private int maxSize;// ջ���������
	private char[] ch; // ջ������
	private int top; // ջͷ���

	public MyStack(int s) {
		maxSize = s;
		ch = new char[s];
		top = -1;
	}

	public void push(char c) {// ��ջ
		ch[++top] = c;
	}

	public char pop() {// ��ջ
		return ch[top--];
	}

	public char top() {
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

	public char get(int index) {
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
