package com.example.test1;

class MyQueue {
	private int maxSize;// �е��������
	private char[] ch; // �е�����
	public int top; // ��ͷ���
	private int trail;

	public MyQueue(int s) {
		maxSize = s;
		ch = new char[s];
		top = 0;
		trail=-1;
	}

	public void push(char c) {// ����
		ch[++trail] = c;
	}

	public char pop() {// ����
		return ch[++top];
	}

	public char top() {
		return ch[top];
	}

	public boolean empty() {//�ж��Ƿ�Ϊ��
		return trail <=top;
	}

	public boolean isFull() {
		return trail == (maxSize - 1);
	}

	public int size() {
		return trail -top;
	}

	public char get(int index) {
		return ch[index];
	}

	public void display(String str) {
		System.out.print(str);
		System.out.print(" Stack (bottom-->trail): ");
		for (int i = 0; i < size(); i++) { 
			System.out.print(get(i) + " ");
		}
		System.out.println();
	}
}
