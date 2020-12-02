package pack10;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {
        Student zhangsan = new Student("张三" , "计171", "111");
        String str = null;
        FileInputStream f1 = null;
        File f2 = new File("C:\\Users\\lenovo\\Desktop\\文本文件a.txt");
        try {
            f1 = new FileInputStream("C:\\Users\\lenovo\\Desktop\\文本文件b.txt");
            Writer out = new FileWriter(f2,true);
            out.write(zhangsan.toString() + "\n");
            byte[] byte1 = new byte[1024 * 1024];
            int readcount = 0;
            while ((readcount = f1.read(byte1)) != -1){
                str = new String(byte1,0,readcount);
            }
            char[] char1 = str.toCharArray();
//            int i = 0;
//            for (char j:char1) {
//                if (i % 7 == 0 && i % 14 != 0){
//                    out.write("，");
//                }
//                if (i % 14 == 0 && i != 0){
//                    out.write("。\n");
//                }
//                if (j==char1.length){
//                    out.write("。\n");
//                }
//                i++;
//                out.write(j);
//            }
            for(int i = 0;i < char1.length;i++){
                if (i % 7 == 0 && i % 14 != 0){
                    out.write("，");
                }
                if (i % 14 == 0 && i != 0){
                    out.write("。\n");
                }
                out.write(char1[i]);
                if (i == char1.length - 1){
                    out.write("。");
                }
            }
            out.flush();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (f1 != null){
                try {
                    f1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
