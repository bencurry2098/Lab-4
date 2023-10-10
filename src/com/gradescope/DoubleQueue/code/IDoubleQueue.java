package com.gradescope.DoubleQueue.code;

/**IDoubleQueueContract
 * @initialization ensures: [a queue of type double is created]
 *
 * @defines: max_queue_size = queueMaxSize
 *
 *@constraints 0 < |self| <= max_queue_size
 */
public interface IDoubleQueue <T>
{

    //This function's contracts are in the individual classes
    public <T> void enqueue(Double val);

    /**dequeueContract
     * Dequeue removes an item from the queue
     *
     *@return returns the double at the front of the queue
     *
     *@pre None
     *
     *@post [value is removed from the front of the queue]
     */
    public <T> Double dequeue();

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
    public <T> int length();

    /**toStringContract
     * toString returns a string with the format: [double]
     *
     *@return a string with the format: [double]
     *
     *@pre None
     *
     *@post toString = "[double]"
     * self = #self
     */
    public String toString();
}
