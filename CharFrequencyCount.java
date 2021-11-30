import java.util.*;

 class Practice
{
    public static void main(String[] args) 
    {
        int index;
        char c;
        int[] freq = new int[30];
        Scanner stdin = new Scanner(System.in);
        
        //Initiallizing frequency array two zeroes
        for(index=0; index<26; index++)
            freq[index]=0;
        System.out.println("Enter a Line full of Text\n");
        String inp = stdin.nextLine();
        for(index=0; index<inp.length(); index++)
        {
            c = inp.charAt(index);
            if(c >= 'A' && c <= 'Z')
                freq[c-'A']++;
            else 
                if(c >= 'a' && c <= 'z')
                    freq[c-'a']++;
        }
        System.out.println("Letter \t Frequency\n");
        for(index=0; index<26; index++)
            System.out.println((char)('A'+index)+"\t"+freq[index]);
    }
}