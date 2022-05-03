
# Set Interface
- Cannot contain duplicate elements
- Set interface contains only methods inherited from Collection and adds the restriction that duplicate elements are prohibited.

## Super Interfaces
- Collection<E>
- Iterable<E>

## Sub Interfaces
- NavigableSet<E>
- SortedSet<E>

## Implementing Classes
- AbstractSet
- ConcurrentHashMap.KeySetView
- ConcurrentSkipListSet
- CopyOnWriteArraySet
- EnumSet
- HashSet
- JobStateReasons
- LinkedHashSet
- TreeSet

## Methods
<b>Note: It extends Collection interface so all methods of Collection are inherited.</b>

- <b>add(E e)</b> - Adds an object to the collection.
- <b>clear()</b> - Removes all objects from the collection.
- <b>contains(Object o)</b> - Returns true if a specified object is an element within the collection.
- <b>isEmpty( )</b> - Returns true if the collection has no elements.
- <b>iterator( )</b> - Returns an Iterator object for the collection, which may be used to retrieve an object.
- <b>remove(Object o)</b> - Removes a specified object from the collection.
- <b>size( )</b> - Returns the number of elements in the collection.