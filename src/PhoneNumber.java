public class PhoneNumber {
    private int code;
    private int firstThree;
    private int secondThree;
    private int four;
    public void setNumber(String a) {
        if (a.charAt(0)=='+') {
            int i = Integer.parseInt (a.substring(1,2));
            code=i;
            i=Integer.parseInt (a.substring(2,5));
            firstThree=i;
            i=Integer.parseInt (a.substring(5,8));
            secondThree=i;
            i=Integer.parseInt (a.substring(8));
            four=i;
        }
        else {
          //  int i = Integer.parseInt (a.substring(0,1));
            code=7;
           int i=Integer.parseInt (a.substring(1,4));
            firstThree=i;
            i=Integer.parseInt (a.substring(4,7));
            secondThree=i;
            i=Integer.parseInt (a.substring(7));
            four=i;

        }
    }

    @Override
    public String toString() {
        return "+"+code+firstThree+"-"+secondThree+"-"+four;
    }
}
