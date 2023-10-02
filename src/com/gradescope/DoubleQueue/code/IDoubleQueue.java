package com.gradescope.DoubleQueue.code;

/**IDoubleQueueContract
 *@initialization Ensures:
 *
 *@defines:
 *
 *@constraints: 0 < |self| <= queueMaxSize
 */
public interface IDoubleQueue
{

    //This function's contracts are in the individual classes
    public void enqueue(Double val);

    /**dequeueContract
     * Dequeue removes an item from the queue
     *
     *@return returns the double at the front of the queue
     *
     *@pre None
     *
     *@post [value is removed from the front of the queue]
     */
    public Double dequeue();

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
