public class bmi {
    
    private double groeße;
    private double gewicht;

    public bmi(double groeße, double gewicht){
        this.gewicht = gewicht;
        this.groeße = groeße;
    }

    public double rechner(){
        return gewicht/(groeße*groeße);
    }

    public void ausgabe(){
        System.out.println("dein BMI ist :"+rechner());
        if (rechner() > 28) {
            System.out.println("übergewicht \n");
        }
        else if (rechner() < 21){
            System.out.println("untergewicht \n");
        }
        else{
            System.out.println("normal \n");
        }
    }
}
