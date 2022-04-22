
# List Interface

- Ordered collection, also known as a sequence.
- Duplicates are generally permitted.
- Allows positional access.
- Extends the Collection interface.

## Implementing Classes
- AbstractList
- AbstractSequentialList
- ArrayList 
- AttributeList
- CopyOnWriteArrayList
- LinkedList
- RoleList
- RoleUnresolvedList
- Stack
- Vector

## Methods of List Interface
<b>Note: It extends Collection interface so all methods of Collection are inherited.</b>

- <b>void add(int index, Object obj)</b> : 
Inserts obj into the invoking list at the index passed in the index. Any pre-existing elements at or beyond the point of insertion are shifted up. Thus, no elements are overwritten.

- <b>boolean addAll(int index, Collection c)</b> : 
Inserts all elements of c into the invoking list at the index passed in the index. Any pre-existing elements at or beyond the point of insertion are shifted up. Thus, no elements are overwritten. Returns true if the invoking list changes and returns false otherwise.

- <b>Object get(int index)</b> : 
Returns the object stored at the specified index within the invoking collection.

- <b>int indexOf(Object obj)</b> : 
Returns the index of the first instance of obj in the invoking list. If obj is not an element of the list, .1 is returned.

- <b>int lastIndexOf(Object obj)</b> : 
Returns the index of the last instance of obj in the invoking list. If obj is not an element of the list, .1 is returned.

- <b>ListIterator listIterator( )</b> : 
Returns an iterator to the start of the invoking list.

- <b>ListIterator listIterator(int index)</b> :
Returns an iterator to the invoking list that begins at the specified index.

- <b>Object remove(int index)</b> : 
Removes the element at position index from the invoking list and returns the deleted element. The resulting list is compacted. That is, the indexes of subsequent elements are decremented by one.

- <b>Object set(int index, Object obj)</b> : 
Assigns obj to the location specified by index within the invoking list.

- <b>List subList(int start, int end)</b> : 
Returns a list that includes elements from start to end.1 in the invoking list. Elements in the returned list are also referenced by the invoking object.