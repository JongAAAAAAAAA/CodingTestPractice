import java.io.*;
import java.util.StringTokenizer;

public class b15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int t = Integer.parseInt(s);

        for (int i = 0; i < t; i++) {
            String x = br.readLine();

            StringTokenizer st = new StringTokenizer(x);

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write(a + b + "\n");
        }
        br.close();

        bw.flush();
        bw.close();
    }
}
