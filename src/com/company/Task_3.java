package com.company;



        public class Task_3 {
            public static void main(String[]args){
                int a [][] = new int[10][10];

                //for loop , used to add numbers from 1 to 9 to diagonal ;

                System.out.println("Diagonal of the matrix are : ");
                for (int i = 0; i < a.length; i++) {


                    int rnd = (int)(Math.random() * 9 + 1);
                    a[i][i]=rnd;
                    System.out.print("\n"+a [i][i]+" ");
                }


                for (int i = 0; i < a.length; i++){
                    //second for statement for columns
                    for (int j = 0; j < a.length; j++) {
                    }
                }
            }
    }

