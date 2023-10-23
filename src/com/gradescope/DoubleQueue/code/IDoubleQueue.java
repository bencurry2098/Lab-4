/**
 * Cayden Akers
 * Ben Curry 
 * Cameron Scott
 */
package com.gradescope.DoubleQueue.code;

/**IDoubleQueueContract
 * @initialization ensures: [a queue of type T is created]
 *
 * @defines: max_queue_size = queueMaxSize
 *
 *@constraints 0 < |self| <= max_queue_size
 */
public interface IDoubleQueue<T>
{

    //This function's contracts are in the individual classes
    public void enqueue(T val);

    /**dequeueContract
     * Dequeue removes an item from the queue
     *
     *@return returns the value at the front of the queue
     *
     *@pre None
     *
     *@post [value is removed from the front of the queue]
     */
    T dequeue();

    /**lengthContract
     * length returns the length of the queue
     *
     *@return the length of the queue as an int
     *
     *@pre None
     *
     *@post length = [the length of the queue]
     * self = #self
     */
    public int length();

    /**toStringContract
     * toString returns a string with the format: [value]
     *
     *@return a string with the format: [value]
     *
     *@pre None
     *
     *@post toString = "[value]"
     * self = #self
     */
    public String toString();

    /**peekContract
     * peek returns the value at front of queue without changing it
     * 
     * @return value of type T
     * 
     * @pre None
     * 
     * @post peek = [value at front of queue]
     * 
    */
    public default  T peek()
    {
        T ret,
          temp;
        int queueSize = length();
        temp = dequeue();
        ret = temp;
        enqueue(temp);
        for(int i = 1; i < queueSize; i++)
        {
            temp = dequeue();
            enqueue(temp);
        }
        return ret;
    }
}
