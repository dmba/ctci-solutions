/**
 * 1.8 Zero Matrix
 * <p>
 * Write an algorithm such that if an element in an MxN matrix is 0,
 * its entire row and column are set to 0.
 * <p/>
 * Hints:
 * <ul>
 * <li>#17 : If you just cleared the rows and columns as you found Os, you'd likely wind up clearing the whole matrix.
 *           Try finding the cells with zeros first before making any changes to the matrix.</li>
 * <li>#74 : Can you use O(N) additional space instead of O(N^2)?
 *           What information do you really need from the list of cells that are zero?</li>
 * <li>#102: You probably need some data storage to maintain a list of the rows and columns that need to be zeroed.
 *           Can you reduce the additional space usage to 0(1) by using the matrix itself for data storage?</li>
 * </ul>
 */
package io.github.dmba.ch1.tasks.q18zeromatrix;
