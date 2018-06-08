/**
 * 2.4 Partition
 * <p>
 * Write code to partition a linked list around a value x,
 * such that all nodes less than x come before all nodes greater than or equal to x.
 * If x is contained within the list, the values of x only need to be after
 * the elements less than x (see below).
 * The partition element x can appear anywhere in the "right partition";
 * it does not need to appear between the left and right partitions.
 * </p>
 * <p>
 * EXAMPLE:
 * <ul>
 * <li>Input : 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition=5]</li>
 * <li>Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8</li>
 * </ul>
 * </p>
 * Hints:
 * <ul>
 * <li>#3 : There are many solutions to this problem,
 *          most of which are equally optimal in runtime.
 *          Some have shorter, cleaner code than others.
 *          Can you brainstorm different solutions?</li>
 * <li>#24: Consider that the elements don't have to stay in the same relative order.
 *          We only need to ensure that elements less than the pivot must be
 *          before elements greater than the pivot.
 *          Does that help you come up with more solutions?</li>
 * </ul>
 */
package io.github.dmba.ch2.tasks.q24partition;
