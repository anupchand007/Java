package EXAM_PREPARE.P1_CORE;

public class P3_LOOPS {

    public static void main(String[] args) {
        //for loop

        int[] myMarks = {43, 75, 34, 21};
        for( int i = 0; i< myMarks.length; i++){
            System.out.println(myMarks[i]);
        }

        //for Each loop

        String[] myFriends = {"Anup", "Bimal", "Ayush"};

        for(String fri : myFriends){
            System.out.println(fri);
        }
    }
}
