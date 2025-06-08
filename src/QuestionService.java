import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5]; // We are creating an array that can hold five references to Question object.
    String[] answer = new String[5];
    public QuestionService(){

        questions[0] = new Question(1,"Chin Chin age","1","2","3","4","2");
        questions[1] = new Question(2,"Chin Chin age","1","2","3","4","2");
        questions[2] = new Question(3,"Chin Chin age","1","2","3","4","2");
        questions[3] = new Question(4,"Chin Chin age","1","2","3","4","2");
        questions[4] = new Question(5,"Chin Chin age","1","2","3","4","2");


    }
    public void playQuiz() {

        for (int i =0;i<questions.length;i++){

            System.out.println("Ouestion: " + questions[i].getId());
            System.out.println(questions[i].getQuestion());
            System.out.println(questions[i].getOpt1());
            System.out.println(questions[i].getOpt2());
            System.out.println(questions[i].getOpt3());
            System.out.println(questions[i].getOpt4());

            Scanner sc = new Scanner(System.in);
            answer[i] = sc.nextLine();

        }


        for (String s : answer){

            System.out.println("Your answer " +s);
        }
    }

    public void displayScore(){

        int score;

    }
}
