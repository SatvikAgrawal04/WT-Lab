package Lab12;
import java.io.*;

public class q2 {
    public static void main(String[] args) {
        try {
//            FileInputStream file1 = new FileInputStream("file1.txt");
//            FileInputStream file2 = new FileInputStream("file2.txt");
//            while (true) {
//                int c1 = file1.read();
//                int c2 = file2.read();
//                if (c1 == -1 && c2 == -1) {
//                    break;
//                }
//                System.out.print((char)c1+""+(char)c2);
//            }
//            file1.close();
//            file2.close();
//        } catch (IOException e) {
//            System.out.println("Error: " + e.getMessage());
//        }
            FileInputStream file1 = null;
            FileInputStream file2 = null;

            FileOutputStream fos = null;

            //Declare file3 to store combined files
            SequenceInputStream file3 = null;

            //Open the file to be concatnated
            file1 = new FileInputStream("text1.txt");    //open for reading purpose
            file2 = new FileInputStream("text2.txt");

            fos = new FileOutputStream("text3.txt", true);//open for writing purpose

            //Concatenate file1 and file2 into file3
            file3 = new SequenceInputStream(file1, file2);

            //System.out.println("1111");

            int ch;
            while ((ch = file3.read()) != -1)//Returns the ascii value of the char read
            {
                fos.write(ch);
                System.out.print((char) ch);
            }
            file1.close();
            file2.close();
            file3.close();

        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

