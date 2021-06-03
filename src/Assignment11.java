import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assignment11 {
    static void writeCharacterCountToFile(Map<Character,Integer> m) throws Exception{
        FileWriter fileWriter=null;
        try{
            fileWriter = new FileWriter("/home/vasam/JAVA-Assignments/src/output.txt");
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("vasanth");
        }
        Iterator keyIterator = m.entrySet().iterator();
        Iterator valueIterator = m.values().iterator();
        while(keyIterator.hasNext() && valueIterator.hasNext()){
           // System.out.print(keyIterator.next() + " -> "+valueIterator.next());
            Map.Entry mapElement = (Map.Entry)keyIterator.next();
            fileWriter.write( mapElement.getKey().toString()+" -> "+mapElement.getValue().toString());
        }
        fileWriter.close();
    }

    public static void main(String[] args) throws Exception{
        FileReader fileReader = null;
        try{
            fileReader = new FileReader(args[0]);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        int i;
        Map<Character,Integer> characterCount = new HashMap<Character,Integer>();
        while((i=fileReader.read())!=-1){
           // System.out.println((char)i);
            if(characterCount.containsKey((char)i)){
                characterCount.put((char)i,characterCount.get((char)i)+1);
            }
            else{
                characterCount.put((char)i,1);
            }
        }
        writeCharacterCountToFile(characterCount);

        fileReader.close();
    }
}
