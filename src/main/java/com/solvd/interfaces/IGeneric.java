
package com.solvd.interfaces;

public interface IGeneric<T> {

	T pop();

	T peek();

	boolean isEmpty();

	void push(T v);

}
