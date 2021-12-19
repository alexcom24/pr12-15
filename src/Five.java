import java.util.Objects;

public class Five {
    private int k0=0; // счётчик пробелов
    private StringBuilder[] newS=new StringBuilder[1000];
    private String[] words;
    private int l;
    private int l1;
    public  void getLine(String s) {

        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)==' ') k0+=1;
        }
         words = s.split(" ");
        l=k0+1;
        l1=k0+1;
        for (int i=0;i<k0;i++)
            for (int j=i+1;j<l;j++)
                if (Objects.equals(words[i],words[j])) {
                    l-=1;
                    l1-=1;
                    for (int b = j; b <l;b++)
                        words[b]=words[b+1];
                }
        for (int i=0; i<factorial(l1);i++)
            newS[i]=new StringBuilder();






    }


    public int factorial(int a) {
        int e=1;
        while (a!=0) {
            e=e*a;
            a-=1;
        }
        return e;
    }
    public void h() {
        int k=0;
        int r=l;
        int t=factorial(r);
        int t1=0;
        for (int i=1;i<=r;i++) {
            int q=l;
            int v=0;
            if (i==r) {
                /*for (int w=0;w<factorial(r);w++) {
                    int f = 0;
                    int f1 = 0;
                    for (int y = 0; y < newS[w].length(); y++) {

                        if (newS[w].charAt(y) == ' ') {
                            f1 = y;
                            if (newS[w].substring(f, f1) == words[k]) k+=1;
                            f = y + 1;
                        }
                    }
                }*/
                while (t1 != t) { // в этом цикле заполняется один уровень
                    boolean p = false;
                    for (int j = v; j < v + 1; j++) {
                        int f = 0;
                        int f1 = 0;

                        /*if (newS[j] == null) {
                            newS[j].append(words[k]);
                            k += 1;
                            v += factorial(l - 1);
                        } else*/
                        for (int y = 0; y < newS[j].length(); y++) {
                            if (newS[j].charAt(y) == ' ') {
                                f1 = y;
                                if (Objects.equals(newS[j].substring(f, f1), words[k])) p = true;
                                f = y + 1;
                            }
                        }

                        if (p == false) {
                            newS[j].append(words[k]);
                         //   newS[j].append(' ');
                            t1+=1;
                        }
                    }
                    if (p == false) {
                        if (k==(r-1)) k=0; else
                            k += 1;
                        v += 1;
                    }
                    else { if (k==(r-1)) k=0; else k+=1; }
                }
            }
            else
          //  while (q!=0) {
                while (t1 != t) { // в этом цикле заполняется один уровень
                    boolean p = false;
                    for (int j = v; j < v + factorial(l - 1); j++) {
                        int f = 0;
                        int f1 = 0;

                        /*if (newS[j] == null) {
                            newS[j].append(words[k]);
                            k += 1;
                            v += factorial(l - 1);
                        } else*/
                            for (int y = 0; y < newS[j].length(); y++) {
                                if (newS[j].charAt(y) == ' ') {
                                    f1 = y;
                                    if (Objects.equals(newS[j].substring(f, f1), words[k])) p = true;
                                    f = y + 1;
                                }
                            }

                        if (p == false) {
                            newS[j].append(words[k]);
                            newS[j].append(' ');
                            t1+=1;

                        }
                    }
                    if (p == false) {
                        if (k==(r-1)) k=0; else
                        k += 1;
                        v += factorial(l - 1);
                    }
                    else { if (k==(r-1)) k=0; else k+=1; }
                }
                l-=1;
                k=0;
                t1=0;
           // }
        }
    }
    public void vyvod() {
        int max=-1;
        StringBuilder maximum=new StringBuilder();
        int u=0;
        for (int i=0;i<factorial(l1);i++) {
            for (int y = 0; y < newS[i].length(); y++) {
                if (newS[i].charAt(y) == ' ') {
                    if (Objects.equals(newS[i].charAt(y - 1), newS[i].charAt(y + 1))) u += 1;
                }
            }
            if (u>max) { max=u;maximum=newS[i];}
            u=0;
        }
        if (max!=l1-1) System.out.println("Невозможно составить имя файла по требуемым критериям"); else
            System.out.println(maximum);
    }
}
