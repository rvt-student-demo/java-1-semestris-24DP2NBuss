package rvt;

public class PaymentCard_MainProgram {
    public static void main(String[] args) {

    

        PaymentCard PaulsCard = new PaymentCard(20);
        System.out.println("Paul: " + PaulsCard);
        PaymentCard MattsCard = new PaymentCard(30);
        System.out.println("Matt: " + MattsCard);

        PaulsCard.eatHeartily();
        MattsCard.eatAffordably();
        System.out.println("Paul: " + PaulsCard);
        System.out.println("Matt: " + MattsCard);
        
        PaulsCard.addMoney(20);
        MattsCard.eatHeartily();
        System.out.println("Paul: " + PaulsCard);
        System.out.println("Matt: " + MattsCard);

        PaulsCard.eatAffordably();
        PaulsCard.eatAffordably();
        MattsCard.addMoney(50);
        System.out.println("Paul: " + PaulsCard);
        System.out.println("Matt: " + MattsCard);
    }
}



