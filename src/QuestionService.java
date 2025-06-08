import java.security.SecureRandom;
import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5]; // We are creating an array that can hold five references to Question object.
    String[] useranswer = new String[5];
    public QuestionService(){

        questions[0] = new Question(1,"Chin Chin age","1","2","3","4","2");
        questions[1] = new Question(2,"Chin Chin age","1","2","3","4","2");
        questions[2] = new Question(3,"Chin Chin age","1","2","3","4","2");
        questions[3] = new Question(4,"Chin Chin age","1","2","3","4","2");
        questions[4] = new Question(5,"Chin Chin age","1","2","3","4","2");


    }
    public void playQuiz() {

        for (int i =0;i<questions.length;i++){

            System.out.println("Ouestion Number: " + questions[i].getId());
            System.out.println("Question : " + questions[i].getQuestion());
            System.out.println("Option 1 : " + questions[i].getOpt1());
            System.out.println("Option 2 : " + questions[i].getOpt2());
            System.out.println("Option 3 : " + questions[i].getOpt3());
            System.out.println("Option 4 : " + questions[i].getOpt4());

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your answer : ");
            useranswer[i] = sc.nextLine();

        }


//        for (String s : useranswer){
//
//            System.out.println("Your answer " +s);
//        }
    }

    public void displayScore(){

        int score =0;

        for (int i=0;i<questions.length;i++) {
            //Question que = questions[i];
            String actualAnswer = questions[i].getAnswer();
            String userAnswer = useranswer[i];

            if (actualAnswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your Score : "+ score);
    }
}
