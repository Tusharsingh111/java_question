public class stringbuilder {
    public static void main(String args[]){
        // String S1 = "JAVA STRING";
        // String S2 = "gava string";
        

        
        // System.out.println(S1.charAt(7));
        // System.out.println(S1.codePointAt(7));
        // System.out.println(S1.codePointCount(2,4));
        // System.out.println(S1.compareTo(S2));
        // System.out.println(S1.compareToIgnoreCase(S2));
        // System.out.println(S1.concat(S2));
        // System.out.println(S1.contains(S2));
        // System.out.println(S1.contentEquals(S2));
        // char s[] = {'T','U','S','H','A','R'};
        // System.out.println(String.copyValueOf(s));

        // System.out.println(S1.endsWith(S2));

        // System.out.println(S1.equals(S2));

        // System.out.println(S1.equalsIgnoreCase(S2));
        // System.out.println(S1.indexOf('T'));

    
        StringBuilder s = new StringBuilder();
        s.append("Hey");
        s.append(" ");
        s.append(" world");
        System.out.println(s);
        s.insert(4, "beautiful");
        System.out.println(s.toString());
       
        System.out.println(s.toString());


        
    } 
}
