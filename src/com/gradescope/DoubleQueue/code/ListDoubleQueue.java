package com.gradescope.DoubleQueue.code;

import java.util.ArrayList;

/**ListDoubleQueueContract
 * This class implements the IDoubleQueue interface to construct a Double Queue with an arrayList backend structure
 *
 * @invariant: 0 <= LQueue <= maxListSize
 *
 * @corresponds: self = Queue of Doubles from LQueue[0] to LQueue[maxListSize]
 *
 */
public class ListDoubleQueue implements IDoubleQueue
{
    private ArrayList<Double> LQueue;
    private int maxListSize;

    /**ListDoubleQueueConstructorContact
     * Constructor for the List Queue of Doubles object. Initializes all instance variables via parameters
     *
     * @param maxSize value to be set as maximum size of the list
     *
     * @pre maxListSize >= 0
     *
     * @post maxListSize = maxSize AND self = new ArrayList<Double>
     *
     */
    public ListDoubleQueue(int maxSize)
    {
        this.LQueue = new ArrayList<Double>();
        this.maxListSize = maxSize;
    }

    /**enqueueContact
     * Enqueue adds a value to the back of the queue
     *
     * @param val value to be added to the list
     *
     * @pre val >= 0
     *
     * @post [val is added to LQueue IF maxListSize has already been reached, replace the last element] AND
     * maxListSize = #maxListSize
     *
     */
    @Override
    public void enqueue(Double val)
    {
        if(LQueue.size() == this.maxListSize)
            LQueue.set(this.maxListSize-1, val);
        else
            LQueue.add(val);
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public Double dequeue()
    {
        return LQueue.remove(0);
    }


    @Override
    public int length()
    {
        return LQueue.size();
    }


    public String toString()
    {
        String ret = "";
        for(Double d : LQueue)
        {
            ret += ("[" + d + "] ");
        }
        return ret;
    }

}
