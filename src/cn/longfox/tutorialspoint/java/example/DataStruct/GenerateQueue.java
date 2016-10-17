package cn.longfox.tutorialspoint.java.example.DataStruct;

import java.util.LinkedList;
/**
 * 定义一个队列模板
 * @author Administrator
 *
 * @param <E>
 */
class Queue<E> {
	private LinkedList<E> queue = new LinkedList<E>();

	public void enqueue(E queue) {
		this.queue.addLast(queue);
	}

	public E dequeue() {
		return queue.poll();
	}

	public boolean hasItems() {
		return !queue.isEmpty();
	}

	public int size() {
		return queue.size();
	}

	public void addItems(Queue<? extends E> q) {
		while (q.hasItems()) {
			queue.addLast(q.dequeue());
		}
	}
}

class Employee {
	public String name;
	public int age;

	public Employee() {

	}

	public Employee(String strName, int age) {
		this.name = strName;
		this.age = age;
	}

	public String toString() {
		return "the employee name is " + name + " age: " + age;
	}
}

class HourlyEmployee extends Employee {
	private int hourRate;

	public HourlyEmployee(String name, int age) {
		super(name, age);
		this.hourRate = 10;
	}

	public int getHourRate() {
		return hourRate;
	}

	public void setHourRate(int hourRate) {
		this.hourRate = hourRate;
	}
}

public class GenerateQueue {
	public static void main(String[] args) {
		Queue<Employee> empList;
		empList = new Queue<Employee>();
		Queue<HourlyEmployee> hList;
		hList = new Queue<HourlyEmployee>();
		hList.enqueue(new HourlyEmployee("T", 3));
		hList.enqueue(new HourlyEmployee("G", 4));
		hList.enqueue(new HourlyEmployee("F", 5));
		empList.addItems(hList);
		System.out.println("The employees' names and age are:");
		while (empList.hasItems()) {
			Employee emp = empList.dequeue();
			System.out.println(emp.name + " " + emp.age);
		}
	}
}
