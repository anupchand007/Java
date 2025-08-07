package EXAM_PREPARE.P1_CORE;

class TMS {
    String TMSWork = "Send People Abroad";

     class Documentation{
        String Work = "Checks the Documents of Applicants";
        public void Display(){
        System.out.println("Documentation knows the work of TMS is "+ TMSWork + ", and Documentation works is " + Work);
        }
    }
}


public class P6_INNER_CLASS {
    public static void main(String[] args) {
        TMS tms =  new TMS();
        TMS.Documentation d= tms.new Documentation();

        d.Display();
    }
}
