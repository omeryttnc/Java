package techproed2020.day43lambda;

public class try02 {
        private String Season;
        private String courseName;
        private int averageScore;
        private int numberOfStudents;

    public try02 (String Season, String courseName, int averageScore , int numberOfStudents) {
        this.Season = Season;
        this.courseName = courseName;
        this.averageScore = averageScore;
        this.numberOfStudents = numberOfStudents;
    }
    public String getSeason() {
        return Season;
    }

    public void setSeason(String season) {
        Season = season;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
    public String toString(){
        return Season +" _ " + courseName +" _ " + averageScore +" _ " + numberOfStudents;
    }

        }


