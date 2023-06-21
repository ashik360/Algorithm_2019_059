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
public class LinearSearch {
    public void LinearSearch() {
        Input in = new Input();
        Output out = new Output();

        System.out.println("\n---Linear Search selected---");

        int list[] = in.listInput();
        int key = in.keyInput();
        int i = 0;
        boolean found = false;

        for (i = 0; i < list.length; i++) {
            if (key == list[i]) {
                found = true;
                break;
            }
        }
        if (found)
            out.searchResultFoundOutput(key, i);
        else
            out.searchResultNotFoundOutput(key);

    }
}
