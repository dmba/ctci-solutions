/**
 * 1.5 One Way
 * <p/>
 * There are three types of edits that can be performed on strings:
 * <ul>
 * <li>1. insert a character</li>
 * <li>2. remove a character</li>
 * <li>3. replace a character</li>
 * </ul>
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 * <p/>
 * EXAMPLE
 * <ul>
 * <li>pale,  ple -> true</li>
 * <li>pales, pale -> true</li>
 * <li>pale,  bale -> true</li>
 * <li>pale,  bake -> false</li>
 * </ul>
 * <p/>
 * Hints:
 * <ul>
 * <li>#23 : Start with the easy thing. Can you check each of the conditions separately?</li>
 * <li>#97 : What is the relationship between the "insert character" option and the "remove character" option?
 *           Do these need to be two separate checks?</li>
 * <li>#130: Can you do all three checks in a single pass?</li>
 * </ul>
 */
package io.github.dmba.ch1.tasks.q15oneway;