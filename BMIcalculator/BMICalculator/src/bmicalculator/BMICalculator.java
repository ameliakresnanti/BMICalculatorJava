package bmicalculator;
public class BMICalculator {
    public static void main(String[] args) {
        int beratbadan = 45;
        float tinggibadan = 1.70f;
        float bmicalculator = (beratbadan/(tinggibadan*tinggibadan));
        
        System.out.println("BMI ANDA ADALAH\t:"+bmicalculator);
        
        if (bmicalculator<18.5){
            System.out.println("BERAT BADAN ANDA KURANG");
        }
        else if (bmicalculator<24.5){
            System.out.println("BERAT BADAN NORMAL/IDEAL");
        }
        else if (bmicalculator<29.9){
            System.out.println("BERAT BADAN ANDA LEBIH");
        }
        else{
            System.out.println("OBESITAS");
          }
    }
    
}
