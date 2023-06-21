/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm_2019_059;

import java.util.Scanner;

import algorithm_2019_059.Algorithms.KnapSack;
import algorithm_2019_059.Algorithms.Krushkal;
import algorithm_2019_059.Algorithms.Lcs;
import algorithm_2019_059.Algorithms.Mcm;
import algorithm_2019_059.Algorithms.Obst;
import algorithm_2019_059.Algorithms.Prims;
import algorithm_2019_059.DataStruct.BinarySearch;
import algorithm_2019_059.DataStruct.BubbleSort;
import algorithm_2019_059.DataStruct.InsertionSort;
import algorithm_2019_059.DataStruct.LinearSearch;
import algorithm_2019_059.DataStruct.MergeSort;
import algorithm_2019_059.DataStruct.QuickSort;
import algorithm_2019_059.DataStruct.SelectionSort;

/**
 *
 * @author Asik Ahmed Shuvo
 */
public class Algorithm_2019_059 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("================ ((Algorithms))====================");
            System.out.println(" 1) Data Structures\n"
                    + " 2) Graph Algorithms");
            System.out.print("Enter your choice #> ");

            int choice = s.nextInt();
            System.out.println("====================================================");

            if (choice == 1) {
                System.out.println("================ ((Data Structures))====================");
                System.out.println(
                        "  01) Bubble Sort\n"
                                + " 02)  Insertion Sort\n"
                                + " 03)  Selection Sort\n"
                                + " 04)  Marge Sort\n"
                                + " 05)  Quick Sort\n"
                                + " 06)  Counting Sort\n"
                                + " 07)  Radix Sort\n"
                                + " 08)  Heap Sort\n"
                                + " 09)  Bin Sort\n"
                                + " 10)  Shell Sort\n"
                                + " 11)  Linear Search\n"
                                + " 12)  Binary Search\n"
                                + " 13)  Euclidean GCD Algorithm\n"
                                + " 14)  Universal Hashing\n"
                                + " 15)  Stack\n"
                                + " 16)  Queue\n"
                                + " 17)  Linked List\n"
                                + " 18)  Fibonacci Numbers\n"
                                + " 19)  Recurrences");
                System.out.print("Enter your Data Sturcture choice #> ");
                int c1 = s.nextInt();
                switch (c1) {
                    case 1:
                        System.out.println("================ ((Bubble Sort))====================");
                        BubbleSort bs = new BubbleSort();
                        bs.bubbleSort();
                        break;
                    case 2:
                        System.out.println("================ ((Insertion Sort))====================");
                        InsertionSort is = new InsertionSort();
                        is.insertionSort();
                        break;
                    case 3:
                        System.out.println("================ ((Selection Sort))====================");

                        SelectionSort ss = new SelectionSort();
                        ss.selectionSort();

                        break;
                    case 4:
                        System.out.println("================ ((Merge Sort))====================");
                        MergeSort ms = new MergeSort();
                        ms.mergeSort();
                        break;
                    case 5:
                        System.out.println("================ ((Quick Sort))====================");
                        QuickSort qs = new QuickSort();
                        qs.quickSort();
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        System.out.println("================ ((LinearSearch))====================");
                        LinearSearch ls = new LinearSearch();
                        ls.LinearSearch();
                        break;
                    case 12:
                        System.out.println("================ ((BinarySearch))====================");
                        BinarySearch bns = new BinarySearch();
                        bns.binarySearch();
                        break;
                    case 13:
                        break;
                    case 14:
                        break;
                    case 15:
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                System.out.println("====================================================");
            } else if (choice == 2) {
                System.out.println("================ ((Algorithms))====================");
                System.out.println("  01) Largest Common Subsequence\n"
                        + " 02)  Optimal Binary Search Tree\n"
                        + " 03)  Matrix Chain Multiplication\n"
                        + " 04)  Strassen's Matrix Muliplication Algorithm\n"
                        + " 05)  BFS\n"
                        + " 06)  DFS\n"
                        + " 07)  DAG\n"
                        + " 08)  Longest Increasing Subsequence\n"
                        + " 09)  Topological Sort\n"
                        + " 10)  Krushkal's Algorithm\n"
                        + " 11)  Prim's Algorithm\n"
                        + " 12)  Dijkastra's Algorithm\n"
                        + " 13)  Bellman Ford's Algorithm\n"
                        + " 14)  Worshall's Algorithm\n"
                        + " 15)  (0,1) KKnapsack Problem\n"
                        + " 16)  Naive String Matching Algorithms\n"
                        + " 17)  Rabin Krap String Matching Algorithm\n"
                        + " 18)  Activity Selection Problem\n"
                        + " 19)  MST Algorithms\n"
                        + " 20)  Max Flow Min Cut");
                System.out.print("Enter your Graph Algorithm choice #> ");
                int c1 = s.nextInt();
                switch (c1) {
                    case 1:
                        System.out.println("================ (LCS)====================");
                        Lcs lcs = new Lcs();
                        lcs.Lcs();
                        break;
                    case 2:
                        System.out.println("================ (OBST)====================");
                        Obst obst = new Obst();
                        obst.Obst();
                        break;
                    case 3:
                        System.out.println("================ (MCM)====================");
                        Mcm mcm = new Mcm();
                        mcm.Mcm();
                        break;
                    case 4:
                        System.out.println("================ (())====================");

                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        System.out.println("================ ((Krushkal's Algorithm))====================");
                        Krushkal kl = new Krushkal();
                        kl.krushkal();
                        break;
                    case 11:
                        System.out.println("================ ((Prims Algorithm))====================");
                        Prims pr = new Prims();
                        pr.prims();
                        break;
                    case 12:
                        break;
                    case 13:
                        break;
                    case 14:
                        break;
                    case 15:
                        System.out.println("================ ((KnapSack))====================");
                        KnapSack kn = new KnapSack();
                        kn.knapSack();
                        break;
                    case 16:
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
                System.out.println("====================================================");

            } else {
                System.out.println("Invalid choice");
            }
        }

    }

}
