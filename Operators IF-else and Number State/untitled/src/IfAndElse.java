public class IfAndElse {
    static void main(String[] args) {
        boolean isMale = true;
        String name = "Ava";

        System.out.println("before if");
        if(isMale) {
            System.out.println("Mr." + name);
        } else {
            System.out.println("Mrs." + name);
        }
        System.out.println("after if");

        boolean isSeniorCitizen = false;
        boolean isAdult = false;
        if (isSeniorCitizen) {
            System.out.println("Hello Senior Citizen");
        } else if(isAdult) {
                System.out.println("Hello You Are An Adult");
            } else {
                System.out.println("Hello Child");
            }
        }
    }
