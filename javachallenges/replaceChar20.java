package javachallenges;
//Write a java program to replace ‘a’ with ‘$’ in the following String
//        “I am always ready to learn although I do not always like being taught.”
public class replaceChar20 {
    public static void main(String []args){
        String ch="";
        String s="I am always ready to learn although I do not always like being taught.";
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='a')
                    ch=ch+'$';
            else
                ch=ch+(s.charAt(i));
        }
        System.out.println(ch);
    }
}
