# ADS_Assignment3
MyHashTable with Custom Hashing Example
This is an example implementation of a hashtable in Java using separate chaining collision resolution, along with a custom hashing function for a custom class.

Usage
To use the MyHashTable class, simply create an instance of it and add elements to it using the put method:

MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();

// Create some elements to add to the hashtable
MyTestingClass key1 = new MyTestingClass(1, "John");
Student value1 = new Student("John Smith", 3.8);
MyTestingClass key2 = new MyTestingClass(2, "Jane");
Student value2 = new Student("Jane Doe", 3.9);

// Add the elements to the hashtable
table.put(key1, value1);
table.put(key2, value2);
To retrieve an element from the hashtable, use the get method:

Student retrievedValue = table.get(key1);
To remove an element from the hashtable, use the remove method:

Student removedValue = table.remove(key1);
To check if a value is present in the hashtable, use the contains method:

boolean hasValue = table.contains(value2);
To get the key associated with a value in the hashtable, use the getkey method:

MyTestingClass key = table.getkey(value2);
To print the number of elements in each bucket (chain or linkedlist), use the printBuckets method:

table.printBuckets();
Custom Hashing
To use a custom class as a key in a hashtable, the class must override the hashCode() and equals() methods. In this example, we have created a custom class MyTestingClass with an implementation of hashCode() that combines the hash codes of its fields using the formula 31 * result + field.hashCode(). We have also provided an implementation of equals() that checks if the objects have the same fields.
