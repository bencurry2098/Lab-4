package com.gradescope.DoubleQueue.code;

/**ArrayDoubleQueueContract
 * Array implementation for the Double queue.
 *
 * @invariant: queueMaxSize > 0
 *
 * @corresponds: max_queue_size = queueMaxSize
 *
 */
public class ArrayDoubleQueue implements IDoubleQueue
{
    private Double[] queue;
    private int queueMaxSize;

    /**ArrayDoubleQueueConstructorContact
     * Constructor for the arrayListDouble queue.
     *
     * @param maxSize max size of the array
     *
     * @pre maxSize > 0
     *
     * @post queueMaxSize = maxSize AND self = new Double[queueMaxSize].
     *
     */
    public ArrayDoubleQueue(int maxSize)
    {
        queueMaxSize = maxSize;
        queue = new Double[queueMaxSize];
    }

    /**enqueueContact
     * Enqueue adds an item to the queue.
     *
     * @param val the Double to be added
     *
     * @pre |self| < queueMaxSize
     *
     * @post [self = #self with val added to left-most unoccupied index] AND queueMaxSize = #queueMaxSize
     *
     */
    @Override
    public void enqueue(Double val)
    {
        for(int i = 0; i < queueMaxSize; i++)
        {
            if(queue[i] == null)
            {
                queue[i] = val;
                break;
            }
        }
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public Double dequeue()
    {
        Double ret = 0.0;
        for(int i = 0; i < queueMaxSize; i++)
        {
            if(queue[i] == null)
            {
                continue;
            }
            else
            {
                ret = queue[i];
                queue[i] = null;
                return ret;
            }
        }
        return ret;
    }

    @Override
    public int length()
    {
        int ret = 0;
        for(Double d : queue)
        {
            if(d != null)
            {
                ret++;
            }
        }
        return ret;
    }

    public String toString()
    {
        String ret = "";
        for(Double d : queue)
        {
            ret += ("[" + d + "] ");
        }
        return ret;
    }

    //-----------------Ignore the functions below this line-----------------------
    public int getQueueMaxSize()
    {
        return this.queueMaxSize;
    }

    public Double[] getQueue()
    {
        return this.queue;
    }
}
