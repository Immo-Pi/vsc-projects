public class bmi {
    
    private double groeße;
    private double gewicht;
    private double bmi;

    public bmi(double groeße, double gewicht){
        this.gewicht = gewicht;
        this.groeße = groeße;
    }

    public double rechner(){
        bmi = gewicht/(groeße*groeße);
        return bmi;
    }

    public void ausgabe(){
        rechner();
        System.out.println("dein BMI ist :"+rechner());
        if (bmi > 28) {
            System.out.println("übergewicht \n");
        }
        else if (bmi < 21){
            System.out.println("untergewicht \n");
        }
        else{
            System.out.println("normal \n");
        }
    }
}
