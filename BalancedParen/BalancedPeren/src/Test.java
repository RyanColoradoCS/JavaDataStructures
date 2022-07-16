class Test {
    public static void main(String[] args) {
        Stack<String> s = new Stack<String>();
        s.push("Hi");
        s.push("my");
        s.push("name");

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        String str = "This is a test";
        str = str.replaceAll("\\s+","");
        char[] ch = str.toCharArray();
 
        // Traverse the character array
        for (int i = 0; i < ch.length; i++) {
            // Print current character
            System.out.print(ch[i] + " ");
        }

    }
}