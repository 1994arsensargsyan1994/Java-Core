package sargsyanarsen.attachment;

public class BraceChecker {
    private Stack stack;
    private String message = "No errors";
    private int errorIndex = -1;
    private int errorIndexInLine = 0;
    private int errorLineNumber = 0;
    private  char errorValue;
    public String getMessage()
    {
        return message;
    }

    public String getErrorIndex()
    {
        if (errorIndex == -1){
          return   message;
        }
        return "errorIndex :"+errorIndex+"\nerrorValue:"+errorValue;
    }


    public BraceChecker() {
        errorValue = '\000';
        stack = new Stack(5);

        }
       // TODO initialize  the "stack" by calling of default constructor

    /**
     * Parses the text to check correctness of disposition of brackets in text ,
     * and in case of incorrectness initializes following errorIndex,
     * errorIndexInLine and errorLineNumber fields, to indicate where
     * incorrectness occur.
     *
     * @return true if parsing passed without error, otherwise false
     */
    public boolean parse(String text) {
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()){
                    errorValue = ch;
                    errorIndex = i;
                    return  false;
                } else
                    {
                    char pope;
                    switch (ch) {
                        case ')':
                            pope = stack.pop();
                            if (pope != '(') {
                                errorIndex = i;
                                errorValue = pope;
                                stack.clear();
                                return false;
                            }
                            break;
                        case ']':
                            pope = stack.pop();
                            if (pope != '[') {
                                errorIndex = i;
                                errorValue = pope;
                                stack.clear();
                                return false;
                            }
                            break;
                        case '}':
                            pope = stack.pop();
                            if (pope != '{') {
                                errorIndex = i;
                                errorValue = pope;
                                stack.clear();
                                return false;
                            }
                            break;
                    }
                }
            }
        }
        if (!stack.isEmpty() ){
            errorValue = stack.pop();
            stack.clear();
            return  false;
        }
        return true;
    }

    public static void main(String[] args) {
  BraceChecker braceChecker = new BraceChecker();
        System.out.println(braceChecker.parse("({}()))"));
        System.out.println(braceChecker.getErrorIndex());
    }

}
