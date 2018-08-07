package com.timelock.practice.aug04;

import java.io.*;
import java.util.Scanner;

class linkedlist1 {
	int data;
	linkedlist1 prev;
	linkedlist1 next;

	linkedlist1(int value) {
		this.data = value;
	}

	void display() {
		System.out.println(data);
	}
}

class linked1 {
	public linkedlist1 fstnode, lastnode;

	linked1() {
		fstnode = null;
		lastnode = null;
	}
	
	/* Insert node at the beginning or create linked list */
	void insert_front(int value) {
		linkedlist1 node = new linkedlist1(value);
		if(fstnode == null) {
			node.prev = node.next = null;
			fstnode = lastnode = node;
			System.out.println("Lined list created successfully!");
		}
		else {
			node.prev = null;
			node.next = fstnode;
			fstnode.prev = node;
			fstnode = node;
			System.out.println("Node Inserted at the front of the Linked list!");
		}
	}

	/* Insert node at the end or create linked list */
	void insert_end(int value) {
		linkedlist1 node = new linkedlist1(value);
		if(fstnode == null) {
			node.prev = node.next = null;
			fstnode = lastnode = node;
			System.out.println("Lined list created successfully!");
		}
		else {
			node.next = null;
			node.prev = lastnode;
			lastnode.next = node;
			lastnode = node;			
			System.out.println("Node Inserted at the end of the Linked list!");
		}
	}

	/* Delete node from linked list */
	void delete() {
		int count = 0, number, i;
		linkedlist1 node, node1, node2;
		Scanner input = new Scanner(System.in);
		
		for(node = fstnode; node != null; node = node.next)
			count++;
		display();
		node = node1 = node2 = fstnode;
		System.out.println(count+" nodes available here!");
		System.out.println("Enter the node number which you want to delete from ascending order list:");
		number = Integer.parseInt(input.nextLine());
		if(number != 1) {
			if(number < count && number > 0) {
				for(i = 2; i <= number; i++)
					node = node.next;
				for(i = 2; i <= number-1; i++)
					node1 = node1.next;
				for(i = 2; i <= number+1; i++)
					node2 = node2.next;
				node2.prev = node1;
				node1.next = node2;
				node.prev = null;
				node.next = null;
				node = null;
			}
			else if(number == count) {
				node = lastnode;
				lastnode = node.prev;
				lastnode.next = null;
				node = null;
			}
			else
				System.out.println("Invalid node number!\n");
		}
		else {
			node = fstnode;
			fstnode = node.next;
			fstnode.prev = null;
			node = null;
		}

		System.out.println("Node has been deleted successfully!\n");
	}

	/* Display linked list */
	void display() {
		linkedlist1 node = fstnode;
		System.out.println("List of node in Ascending order!");
		while(node != null) {
			node.display();
			node = node.next;
		}

		node = lastnode;
		System.out.println("List of node in Descending order!");
		while(node != null) {
			node.display();
			node = node.prev;
		}
	}
}


class DoublyLinkedList {
	public static void main(String args[ ]) {
		linked1 list = new linked1();
		Scanner input = new Scanner(System.in);
		int op = 0;
		while(op != 5) {
			System.out.println("1. Insert at front 2. Insert at back 3. Delete 4. Display 5. Exit");
			System.out.println("Enter your choice:");
			op = Integer.parseInt(input.nextLine());
			switch(op) {
				case 1:
					System.out.println("Enter the positive value for Linked list:");
					list.insert_front(Integer.parseInt(input.nextLine()));
					break;
				case 2:
					System.out.println("Enter the positive value for Linked list:");
					list.insert_end(Integer.parseInt(input.nextLine()));
					break;
				case 3:
					list.delete();
					break;
				case 4:
					list.display();
					break;
				case 5:
					System.out.println("Bye Bye!");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid choice!");

			}
		}
	}
}
