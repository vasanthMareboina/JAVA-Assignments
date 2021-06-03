package javaAssignments;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Assignment1 {
    public static void main(String[] args) {
        File filePath = new File(".");
        System.out.println("Enter pattern");
        Scanner s = new Scanner(System.in);
        String regex = s.nextLine();
        String[] list;
        list = filePath.list(new DirFilter(regex));
        for (int i = 0; i < list.length; i++)

            System.out.println(list[i]);
    }
}

class DirFilter implements FilenameFilter {
    private Pattern pattern;

    public DirFilter(String reg) {
        pattern = Pattern.compile(reg);
    }

    @Override
    public boolean accept(File dir, String name) {
        // Strip path information, search for regex:
        return pattern.matcher(new File(name).getName()).matches();
    }
}




