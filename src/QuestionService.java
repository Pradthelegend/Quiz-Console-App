public class QuestionService {

    Question[] questions = new Question[5]; // We are creating an array that can hold five references to Question object.

    public QuestionService(){

        questions[0] = new Question(1,"Chin Chin age","1","2","3","4","2");
        questions[1] = new Question(1,"Chin Chin age","1","2","3","4","2");
        questions[2] = new Question(1,"Chin Chin age","1","2","3","4","2");
        questions[3] = new Question(1,"Chin Chin age","1","2","3","4","2");
        questions[3] = new Question(1,"Chin Chin age","1","2","3","4","2");


    }
    public void displayQuestions(){

        System.out.println(questions[0]);
    }
}
