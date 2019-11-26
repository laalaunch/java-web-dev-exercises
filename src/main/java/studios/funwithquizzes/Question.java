package studios.funwithquizzes;

abstract class Question {

    private String question;
    private String response;

    public Question() {}

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Question(String question, String response) {
        this.question = question;
        this.response = response;
    }
}
