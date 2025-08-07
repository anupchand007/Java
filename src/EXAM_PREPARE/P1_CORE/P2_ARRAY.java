package EXAM_PREPARE.P1_CORE;

public class P2_ARRAY {
    public static void main(String[] args) {

        String[] myFirends = new String[5];
        myFirends[1] = "Anup Chand 1";
        myFirends[2] =  "Ayush";
        myFirends[3] =  "Shusbhashish";
        myFirends[4] =  "Kaushal";
        myFirends[0] =  "Summit";

        for(String fri : myFirends){
            System.out.println(fri);
        }

        int[] Ages = {22, 23, 23, 23, 23};

        for(int i=0; i<Ages.length; i++){
            System.out.println(Ages[i]);
        }

        for(int ages : Ages){
            System.out.println(ages);
        }


    }
}
