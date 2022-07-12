# <b>Array List Class</b>

- Extends List
- found in <b>java.util.ArrayList</b>
- resizable-array implementation of the list interface.
- easy to handle
- Give data type of the list.

## <b>How to use</b>
ArrayList<Integer> arr = new ArrayList<>(); 

### <b>Constructor</b>
- ArrayList() - constructs an empty list with an initial capacity of 10.
- ArrayList(Collection<? extends E> c) - Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
- ArrayList(int initialCapacity) - Constructs an empty list with the specified initial capacity.

## Methods of ArrayList class
As we know ArrayList extends List interface so, all its methods are inherited.

- <b>boolean	add(E e)</b> - Appends the specified element to the end of this list.
- <b>void	add(int index, E element)</b> - Inserts the specified element at the specified position in this list.
- <b>boolean	addAll(Collection<? extends E> c)</b> - Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
- <b>boolean	addAll(int index, Collection<? extends E> c)</b> - Inserts all of the elements in the specified collection into this list, starting at the specified position.
- <b>void	clear()</b> - Removes all of the elements from this list.
- <b>Object	clone()</b> - Returns a shallow copy of this ArrayList instance.
- <b>boolean	contains(Object o)</b> - Returns true if this list contains the specified element.
- <b>void	ensureCapacity(int minCapacity)</b> - Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument.
- <b>void	forEach(Consumer<? super E> action)</b> - Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
- <b>E	get(int index)</b> - Returns the element at the specified position in this list.
- <b>int	indexOf(Object o)</b> - Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
- <b>boolean	isEmpty()</b> - Returns true if this list contains no elements.
- <b>Iterator<E>	iterator()</b> - Returns an iterator over the elements in this list in proper sequence.
- <b>int	lastIndexOf(Object o)</b> - Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
- <b>ListIterator<E>	listIterator()</b> - Returns a list iterator over the elements in this list (in proper sequence).
- <b>ListIterator<E>	listIterator(int index)</b> - Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list.
- <b>E	remove(int index)</b> - Removes the element at the specified position in this list.
- <b>boolean	remove(Object o)</b> - Removes the first occurrence of the specified element from this list, if it is present.
- <b>boolean	removeAll(Collection<?> c)</b> - Removes from this list all of its elements that are contained in the specified collection.
- <b>boolean	removeIf(Predicate<? super E> filter)</b> - Removes all of the elements of this collection that satisfy the given predicate.
- <b>protected void	removeRange(int fromIndex, int toIndex)</b> - Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
- <b>void	replaceAll(UnaryOperator<E> operator)</b> - Replaces each element of this list with the result of applying the operator to that element.
- <b>boolean	retainAll(Collection<?> c)</b> - Retains only the elements in this list that are contained in the specified collection.
- <b>E	set(int index, E element)</b> - Replaces the element at the specified position in this list with the specified element.
- <b>int	size()</b> - Returns the number of elements in this list.
- <b>void	sort(Comparator<? super E> c)</b> - Sorts this list according to the order induced by the specified Comparator.
- <b>Spliterator<E>	spliterator()</b> - Creates a late-binding and fail-fast Spliterator over the elements in this list.
- <b>List<E>	subList(int fromIndex, int toIndex)</b> - Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
- <b>Object[]	toArray()</b> - Returns an array containing all of the elements in this list in proper sequence (from first to last element).
- <b><T> T[]	toArray(T[] a)</b> - Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
- <b>void	trimToSize()</b> - Trims the capacity of this ArrayList instance to be the list's current size.