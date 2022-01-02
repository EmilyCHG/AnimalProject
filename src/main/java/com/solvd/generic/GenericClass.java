
package com.solvd.generic;

import java.util.EmptyStackException;

import com.solvd.interfaces.IGeneric;

public class GenericClass<T> implements IGeneric<T> {

	public GenericClass() {
		top = null;
	}

	private static class Element<T> {
		private T data;
		private Element<T> next;

		Element(T data, Element<T> next) {
			this.data = data;
			this.next = next;
		}
	}

	private Element<T> top;

	@Override
	public void push(T v) {
		if (v == null) {
			throw new NullPointerException();
		}
		top = new Element<T>(v, top);
	}

	@Override
	public T pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		T data = top.data;
		top = top.next;
		return data;
	}

	@Override
	public T peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		T data = top.data;
		top = top.next;
		return data;

	}

	@Override
	public boolean isEmpty() {
		return (top == null);

	}

}
