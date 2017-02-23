import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class box {
        public static void main(String args[]) throws IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                String curr;
                ArrayList<String> mem = new ArrayList<String>();
                while ((curr = in.readLine()) != null) {
                        mem.add(curr);
                }
                if(mem.size() == 0)
                        return;
                for(int x = 0; x < mem.size(); x++) {
                        String temp = mem.get(x).replace("\t", "        ");
                        mem.set(x, temp);
                }
                int line = 0;
                for(int x = 0; x < mem.size(); x++) {
                        if(mem.get(x).length() > line)
                                line = mem.get(x).length();
                }
                String minus = "";
                for(int x = 0; x < line; x++)
                        minus += "-";
                System.out.println("+" + minus + "+");
                for(int x = 0; x < mem.size(); x++) {
                        while(mem.get(x).length() < line) {
                                mem.set(x, mem.get(x)+" ");
                        }
                        System.out.println("|" + mem.get(x) + "|");
                }
                System.out.println("+" + minus + "+");
        }
}
