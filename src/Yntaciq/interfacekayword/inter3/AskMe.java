package Yntaciq.interfacekayword.inter3;

public class AskMe implements SharedConstans{
    public static void answer(int result){
        switch (result){
            case NO:
                System.out.println("Voch");
                break;
            case YES:
                System.out.println("Ayo");
                break;
            case MAYBE:
                System.out.println("Miguce");
                break;
            case LATER:
                System.out.println("Leter");
                break;
            case SOON:
                System.out.println("Shutov");
                break;
            case NEVER:
                System.out.println("Erbeq");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
