package interfacesChapter10;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class SequenceChars implements Readable{
    private final int fixedNumberOfCharacters;
    private int sequenceSize;
    private int numberOfCharacters;

    private static final char[] characters =
            "abcdefghijklmnopqrstuvwxyz".toCharArray();


    public SequenceChars(int sequenceSize, int numberOfCharacters) {
        this.sequenceSize = sequenceSize;
        this.numberOfCharacters = numberOfCharacters;
        this.fixedNumberOfCharacters = numberOfCharacters;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(new SequenceChars(4, 10));

            while(scanner.hasNext()){
            System.out.println(scanner.next());
            }

    }

    @Override
    public int read(CharBuffer charBuffer) throws IOException {


        int count = 0;
        int sequenceIndex = 0;
        if( numberOfCharacters ==0){
            return -1;
        }
        while(count<fixedNumberOfCharacters){
            if(sequenceIndex< sequenceSize){
                numberOfCharacters--;
                charBuffer.append(characters[sequenceIndex]);
                sequenceIndex++;
                count++;
            }else{
                sequenceIndex = 0;
            }
        }


        return fixedNumberOfCharacters;
    }
}
