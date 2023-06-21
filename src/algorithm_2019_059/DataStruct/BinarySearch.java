/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_2019_059.DataStruct;

import algorithm_2019_059.Algorithms.Input;
import algorithm_2019_059.Algorithms.Output;

/**
 *
 * @author Shuvo
 */
public class BinarySearch {
    public void binarySearch() {
        Input in = new Input();
        Output out = new Output();

        System.out.println("\n---Binary Search selected---");
        System.out.println("\n\tInput must be sorted ASC!\n");

        int list[] = in.listInput();
        // int list[] = {12, 11, 13, 5, 6};
        int key = in.keyInput();
        int h, l, m = -1;
        boolean found = false;

        l = 0;
        h = list.length - 1;
        while (l <= h) {
            m = (l + h) / 2;

            if (key == list[m]) {
                found = true;
                break;
            } else if (key < list[m])
                h = m - 1;
            else
                l = m + 1;
        }
        if (found)
            out.searchResultFoundOutput(key, m);
        else
            out.searchResultNotFoundOutput(key);

    }
}
