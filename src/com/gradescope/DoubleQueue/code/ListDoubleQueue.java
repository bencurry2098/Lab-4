/**
 * Cayden Akers
 * Ben Curry 
 * Cameron Scott
 */
package com.gradescope.DoubleQueue.code;

import java.util.ArrayList;

/**ListDoubleQueueContract
 * This class implements the IDoubleQueue interface to construct a Queue of type T with an arrayList backend structure
 *
 * @invariant: 0 < maxListSize
 *
 * @corresponds: self = Queue of type T from LQueue[0] to LQueue[maxListSize]
 *
 */
public class ListDoubleQueue<T> implements IDoubleQueue<T>
{
    private ArrayList<T> LQueue;
    private int maxListSize;

    /**ListDoubleQueueConstructorContact
     * Constructor for the List Queue of type T object. Initializes all instance variables via parameters
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
        this.LQueue = new ArrayList<T>();
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
    public void enqueue(T val)
    {
        if(LQueue.size() == this.maxListSize)
            LQueue.set(this.maxListSize-1, val);
        else
            LQueue.add(val);
    }

    //Note: The below 3 functions intentionally do not have contracts. You do not need to add them.

    @Override
    public T dequeue()
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
        int size = LQueue.size();
        String ret = "";
        for (int i = 0; i < size; i++) {
            ret += "[" + LQueue.get(i);
            if (i != size - 1) {
                ret += "] ";
            }
            else {
                ret += "]";
            }
        }
        return ret;
    }

}
