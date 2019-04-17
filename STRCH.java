import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class STRCH {

    static int substring(String s){
        return (s.length()+1)*s.length()/2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s=new StringBuffer();
        for (int testcase = Integer.parseInt(br.readLine()); testcase >0 ; testcase--) {
            int n=Integer.parseInt(br.readLine());
            String ip[]=br.readLine().split(" ");
            String s1=ip[0];
            String s2=ip[1];
            int possibleSubstring = ((s1.length()+1)*s1.length())/2;
            String splitedString[]=s1.split(s2);
            int notcontainX=0;
            for (int i = 0; i < splitedString.length ; i++) {
                notcontainX+=substring(splitedString[i]);
            }

            s.append(possibleSubstring-notcontainX).append("\n");
        }
        System.out.print(s);
    }
}
