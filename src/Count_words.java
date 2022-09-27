import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
public  class Count_words{

    public static int start_freq(String File) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(File));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line.toLowerCase());
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            String[] words = everything.split(" ");
            words = sortWordsViaFrequencies(words);

            if(words.length>=3){
                for(int i=0;i<3;i++){
                    System.out.print(words[i]+" ");
                }
            }else{
                System.out.println("");
            }
            System.out.println(Arrays.asList(words));
        } 
        catch(FileNotFoundException ex) {
            System.out.println("Unreadable file: " + File );
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + File + "': " + ex.getMessage());
            ex.printStackTrace();
        }
        finally {
            br.close();
        }
        return 0;

    
    }
        
      


    public static void sortWordsUsingFrequencies(String[] words,
            Map<String, Integer> frequencyMap) {
        Arrays.sort(words, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                // Largest frequency first:
                return Integer.compare(frequencyMap.get(o2),
                        frequencyMap.get(o1));
            }
        });
        }

    public static Map<String, Integer> computeWordFrequencyMap(String[] words) {
        Map<String, Integer> result = new HashMap<>(words.length);

        for (String word : words) {
            result.put(word, result.getOrDefault(word, 0) + 1);
        }

        return result;
    }

    public static String[] sortWordsViaFrequencies(String[] words) {
        Map<String, Integer> frequencyMap = computeWordFrequencyMap(words);

        String[] uniqueWords = 
                frequencyMap.keySet().toArray(new String[frequencyMap.size()]);

        sortWordsUsingFrequencies(uniqueWords, frequencyMap);
        return uniqueWords;
    }
    
}
