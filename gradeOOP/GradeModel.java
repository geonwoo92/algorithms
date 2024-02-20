package gradeOOP;
//이름
//국어
//영어
//수학
//평균

public class GradeModel {
    private String name;
    private double kor;
    private double eng;
    private double math;
    private double avg;

    public void setName(String name) {
        this.name = name;
    }
    public void createKor(){
        this.kor = Math.floor( Math.random()*100+0);
    }
    public void createEng(){
        this.eng = Math.floor(Math.random()*100+0);
    }
    public void createMath(){
        this.math = Math.floor(Math.random()*100+0);
    }
    public void createAvg(){
        this.avg = Math.floor((kor + eng + math)/3);
    }

    public String getName() {
        return this.name;
    }

    public double getKor() {
        return this.kor;
    }

    public double getEng() {
        return this.eng;
    }

    public double getMath() {
        return this.math;
    }

    public double getAvg() {
        return this.avg;
    }
}

