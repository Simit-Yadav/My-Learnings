
# Collection Interface

The root interface in the collection hierarchy. A collection represents a group of objects, known as its elements. Some collections allow duplicate elements and others do not. Some are ordered and others unordered.

## Methods
- <b>boolean add(Object obj)</b> : 
Adds obj to the invoking collection. Returns true if obj was added to the collection. Returns false if obj is already a member of the collection, or if the collection does not allow duplicates.

- <b>boolean addAll(Collection c)</b> : 
Adds all the elements of c to the invoking collection. Returns true if the operation succeeds (i.e., the elements were added). Otherwise, returns false.

- <b>void clear( )</b> : 
Removes all elements from the invoking collection.

- <b>boolean contains(Object obj)</b> : 
Returns true if obj is an element of the invoking collection. Otherwise, returns false.

- <b>boolean containsAll(Collection c)</b> : 
Returns true if the invoking collection contains all elements of c. Otherwise, returns false. 

- <b>boolean equals(Object obj)</b> : 
Returns true if the invoking collection and obj are equal. Otherwise, returns false.

- <b>int hashCode( )</b> : 
Returns the hash code for the invoking collection.

- <b>boolean isEmpty( )</b> : 
Returns true if the invoking collection is empty. Otherwise, returns false.

- <b>Iterator iterator( )</b> : 
Returns an iterator for the invoking collection.

- <b>boolean remove(Object obj)</b> : 
Removes one instance of obj from the invoking collection. Returns true if the element was removed. Otherwise, returns false.

- <b>boolean removeAll(Collection c)</b> : 
Removes all elements of c from the invoking collection. Returns true if the collection changed (i.e., elements were removed). Otherwise, returns false.

- <b>boolean retainAll(Collection c)</b> : 
Removes all elements from the invoking collection except those in c. Returns true if the collection changed (i.e., elements were removed). Otherwise, returns false.

- <b>int size( )</b> : 
Returns the number of elements held in the invoking collection.

- <b>Object[ ] toArray( )</b> : 
Returns an array that contains all the elements stored in the invoking collection. The array elements are copies of the collection elements.

- <b>Object[ ] toArray(Object array[ ])</b> : 
Returns an array containing only those collection elements whose type matches that of array.