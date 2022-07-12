
# Queue Interface

- Collection designed for holding elements before processing. 
- provides additional insertion, extraction, and inspection operations.

## Additional operations
Insert - offer(e)  
Remove - poll()  
Examine - peek()  

<b>Note: If we try to use basic collection operation on a queue it will throw exception.</b>

## Super Interfaces
- Collection<E>
- Iterable<E>

## Implementing Classes
- AbstractQueue
- ArrayBlockingQueue
- ArrayDeque
- ConcurrentLinkedDeque
- ConcurrentLinkedQueue
- DelayQueue
- LinkedBlockingDeque
- LinkedBlockingQueue
- LinkedList
- LinkedTransferQueue
- PriorityBlockingQueue
- PriorityQueue
- SynchronousQueue

## Methods of Queue Interface
<b>Note: It extends Collection interface so all methods of Collection are inherited.</b>
- <b>boolean add(E e)</b> : 
Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.

- <b>E	element()</b> : 
Retrieves, but does not remove, the head of this queue.

- <b>boolean offer(E e)</b> : 
Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.

- <b>E	peek()</b> : 
Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

- <b>E	poll()</b> :
Retrieves and removes the head of this queue, or returns null if this queue is empty.

- <b>E	remove()</b> :
Retrieves and removes the head of this queue.