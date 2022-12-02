package gottfried;

public enum Wallpeapers {

    Opening("Opening.jpg"),
    Intro("Intro.webp"),
    Task(""),
    GameBackground(""),
    EndOfGame("End_Of_Game.jpg"),
    GoodStep("Good_Step.jpg"),
    BadStep("Bad_Step.jpg");

    private String fileName;

    Wallpeapers(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
