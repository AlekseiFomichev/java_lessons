// Простой пример
// Создать строку из 1 млн плюсиков. Как?

public class lesson_2 {
    public static void main(String[] args) {
        var s = System.currentTimeMillis();
        //String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
        //str += "+";
        sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s);
        //System.out.println(str);
        //System.out.println(sb);
        }
       
}

// Работа с файловой системой. Файлы

import java.io.File;
public class fileSystemDemo {
 public static void main(String[] args) {
 String pathProject = System.getProperty("user.dir");
 String pathFile = pathProject.concat("/file.txt");
 File f3 = new File(pathFile);
 System.out.println(f3.getAbsolutePath ());
 // /Users/sk/vscode/java_projects/file.txt
 // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt
 }
}

// Работа с файловой системой. Файлы. Ошибки

import java.io.File;
public class tryDemo {
    public static void main(String[] args) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File f3 = new File(pathFile);
            System.out.println("try");
        } catch (Exception e) {
             System.out.println("catch");
        }
        finally
        { System.out.println("finally"); }
    }
}

// isHidden(): возвращает истину, если каталог или файл является скрытым
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые находятся
// в определенном каталоге
// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог



//                       Работа с файловой системой. Каталоги

import java.io.File;
public class Ex0043 {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathDir = pathProject.concat("/files");
        File dir = new File(pathDir);
        System.out.println(dir.getAbsolutePath ());
        if (dir.mkdir()) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
        for (String fname : dir.list()) {
            System.out.println(fname);
        } }
}
