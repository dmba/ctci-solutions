/**
 * 1.9 String Rotation
 * <p>
 * Assume you have a method isSubstring which checks if one word is a substring of another.
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1
 * using only one call to isSubstring (e.g.,"waterbottle" is a rotation of"erbottlewat").
 * <p/>
 * Hints:
 * <ul>
 * <li>#34 : If a string is a rotation of another, then it's a rotation at a particular point.
 *           For example, a rotation of waterbottle at character 3 means cutting waterbottle
 *           at character 3 and putting the right half (erbottle) before the left half (wat).</li>
 * <li>#88 : We are essentially asking if there's a way of splitting the first string into two parts,
 *           x and y, such that the first string is xy and the second string is yx.
 *           For example, x = wat and y = erbottle. The first string is xy = waterbottle.
 *           The second string is yx = erbottlewat.</li>
 * <li>#104: </li>
 * </ul>
 */
package io.github.dmba.ch1.tasks.q19stringrotation;
