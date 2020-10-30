package com.usa.collections;

public class CollectionsInformation {
	/*Collection in Java is nothing but group of objects.
	In one company there are multiple employees that is collection of employees. It is a single entity which is represent multiple objects.

	How we take all the employee in one collection.
	By collection framework.
	Collection framework is nothing but a group of interfaces and classes that represent a group of objects into single entity.

	Why we need collection framework?
	In arrays there are some problem
	1)	Array size is fix (not growable in nature)
	Int array [5] means we can’t store data more than that and if we store less memory will lose. In the runtime we can’t change
	2)	Store only homogeneous data that’s means same type of data.
	3)	Data structure – it can’t support ready made method.
	Means if you want to work on it you had to know programming language.

	To overcome this problem in java we use collection framework.
	The following are the important differences between Arrays and Collection.
	Sr. No.	Key	Arrays	Collection
	//1	Size	Arrays are fixed in size i.e once the array with the specific size is declared then we can't alter its size afterward.	The collection is dynamic in size i.e based on requirement size could be get altered even after its declaration.
	2	Memory Consumption	Arrays due to fast execution consumes more memory and has better performance.	Collections, on the other hand, consume less memory but also have low performance as compared to Arrays.
	3	Data type	Arrays can hold the only the same type of data in its collection i.e only homogeneous data types elements are allowed in case of arrays.	Collection, on the other hand, can hold both homogeneous and heterogeneous elements.
	4	Primitives storage	Arrays can hold both object and primitive type data.	On the other hand, collection can hold only object types but not the primitive type of data.
	5	Performance	Arrays due to its storage and internal implementation better in performance.	Collection on the other hand with respect to performance is not recommended to use.

	In java collection(I) is interface which means multiple elements into single entity.
	But in Java collections is – java.util package in java.
	It is predefined class which is available in java .util which contain different methods .
	Those method we will use to perform a set of operation on collection objects.

	If we take a array ar[];
	In collections there is method name collection. sort(ar);
	So collection(I) is a interface 
	And collections = class which contains different method

	Collection(I) have three child interface 
	1.	List	    2.	Set 	3. Queue 

	List Interface
	1.	List is child of collection(I)
	2.	Insertion order preserve and duplicate are allowed 
	Which class we can use list
	1.	Array List
	2.	LinkedList
	3.	Vector is extended stack (Both are called legacy classes)
	Set Interface
	1.	Set is a child of collection(I)
	2.	Insertion order does not preserve and duplicate are not allow 
	Which class we can use Set
	1.	HashSet
	2.	LinkedHashSet
	3.	TreeSet

	Queue Interface
	1.	Queue is a child of collection(I)
	2.	First In First out (Priority to processing )
	Which class we can use Queue
	1.	LinkedList
	2.	PriorityQueue
	3.	Dequeue 
	Map interface
	1.	Independent interface (not child interface of Collection)
	2.	Key and value object
	Key	value
	101	Nirmal
	102	Rupon
	103	Aryan
	Keys can’t be duplicate	Value can be duplicate
	104	nirmal

	Which class we can use Set
	1.	HashMap
	2.	Hashtable
	3.	Treemap

	…………………
	Inside the parent interface there are many methods which is common on child interface.
	1.	add(object o)
	2.	addall(collection c)
	3.	remove(object o)
	4.	removeall(collection c)
	5.	retainall(collection c)
	6.	clear()
	7.	isempty()
	8.	size()
	9.	contain(object o)
	10.	containall(collection c)
	11.	toArray(collection c)
	 Those methods are available in other child interface. Apart from this every child have their own methods.
	List interface have their own methods
	1. add(index, object o)
	2. addall(index, collection c)
	3. remove(index, object o)
	4. removeall(index, collection c)
	5. get(index)
	6. set(index, object o) – replace the existing object
	ArrayList
	ArrayList  al = new ArrayList();
	ArrayList <String>  al = new <String> ArrayList();

	Add(obj)- If I want to add value in empty arry[] list.
				
	It will come first one than next and so on. Or If I want to insert at the end
	Add(index, obj) – if I want to insert new object middle or any position of the array[]
	size()
	remove(index, obj)
	get(index)
	set(index,obj)
	contain(obj)- T?F (boolean)
	is Empty()- T – if there is no value or F- if found value
	addAll()
	removeAll()
	To sort the elements – collections.sort(al)
	To shuffle elements- collections.Sheffle(al)
	We can convert array to arrayListCollection in Java is nothing but group of objects.
	In one company there are multiple employees that is collection of employees. It is a single entity which is represent multiple objects.

	How we take all the employee in one collection.
	By collection framework.
	Collection framework is nothing but a group of interfaces and classes that represent a group of objects into single entity.

	Why we need collection framework?
	In arrays there are some problem
	1)	Array size is fix (not growable in nature)
	Int array [5] means we can’t store data more than that and if we store less memory will lose. In the runtime we can’t change
	2)	Store only homogeneous data that’s means same type of data.
	3)	Data structure – it can’t support ready made method.
	Means if you want to work on it you had to know programming language.

	To overcome this problem in java we use collection framework.
	The following are the important differences between Arrays and Collection.
	Sr. No.	Key	Arrays	Collection
	1	Size	Arrays are fixed in size i.e once the array with the specific size is declared then we can't alter its size afterward.	The collection is dynamic in size i.e based on requirement size could be get altered even after its declaration.
	2	Memory Consumption	Arrays due to fast execution consumes more memory and has better performance.	Collections, on the other hand, consume less memory but also have low performance as compared to Arrays.
	3	Data type	Arrays can hold the only the same type of data in its collection i.e only homogeneous data types elements are allowed in case of arrays.	Collection, on the other hand, can hold both homogeneous and heterogeneous elements.
	4	Primitives storage	Arrays can hold both object and primitive type data.	On the other hand, collection can hold only object types but not the primitive type of data.
	5	Performance	Arrays due to its storage and internal implementation better in performance.	Collection on the other hand with respect to performance is not recommended to use.

	In java collection(I) is interface which means multiple elements into single entity.
	But in Java collections is – java.util package in

import java.util.Collection;

java.
	It is predefined class which is available in java .util which contain different methods .
	Those method we will use to perform a set of operation on collection objects.

	If we take a array ar[];
	In collections there is method name collection. sort(ar);
	So collection(I) is a interface 
	And collections = class which contains different method

	Collection(I) have three child interface 
	1.	List	    2.	Set 	3. Queue 

	List Interface
	1.	List is child of collection(I)
	2.	Insertion order preserve and duplicate are allowed 
	Which class we can use list
	1.	Array List
	2.	LinkedList
	3.	Vector is extended stack (Both are called legacy classes)
	Set Interface
	1.	Set is a child of collection(I)
	2.	Insertion order does not preserve and duplicate are not allow 
	Which class we can use Set
	1.	HashSet
	2.	LinkedHashSet
	3.	TreeSet

	Queue Interface
	1.	Queue is a child of collection(I)
	2.	First In First out (Priority to processing )
	Which class we can use Queue
	1.	LinkedList
	2.	PriorityQueue
	3.	Dequeue 
	Map interface
	1.	Independent interface (not child interface of Collection)
	2.	Key and value object
	Key	value
	101	Nirmal
	102	Rupon
	103	Aryan
	Keys can’t be duplicate	Value can be duplicate
	104	nirmal

	Which class we can use Set
	1.	HashMap
	2.	Hashtable
	3.	Treemap

	…………………
	Inside the parent interface there are many methods which is common on child interface.
	1.	add(object o)
	2.	addall(collection c)
	3.	remove(object o)
	4.	removeall(collection c)
	5.	retainall(collection c)
	6.	clear()
	7.	isempty()
	8.	size()
	9.	contain(object o)
	10.	containall(collection c)
	11.	toArray(collection c)
	 Those methods are available in other child interface. Apart from this every child have their own methods.
	List interface have their own methods
	1. add(index, object o)
	2. addall(index, collection c)
	3. remove(index, object o)
	4. removeall(index, collection c)
	5. get(index)
	6. set(index, object o) – replace the existing object
	ArrayList
	ArrayList  al = new ArrayList();
	ArrayList <String>  al = new <String> ArrayList();

	Add(obj)- If I want to add value in empty arry[] list.
				
	It will come first one than next and so on. Or If I want to insert at the end
	Add(index, obj) – if I want to insert new object middle or any position of the array[]
	size()
	remove(index, obj)
	get(index)
	set(index,obj)
	contain(obj)- T?F (boolean)
	is Empty()- T – if there is no value or F- if found value
	addAll()
	removeAll()
	To sort the elements – collections.sort(al)
	To shuffle elements- collections.Sheffle(al)
	We can convert array to arrayList*/

	

}
