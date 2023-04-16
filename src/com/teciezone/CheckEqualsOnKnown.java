package com.teciezone;

/**
 * @author Viraj
 * 4/14/2023
 */

public class CheckEqualsOnKnown {
    private static final String TRANSACTION_SUBMITTED = "TRANSACTION_SUBMITTED";
    private static final String TRANSACTION_PROCESSING = "TRANSACTION_PROCESSING";
    private static final String TRANSACTION_SUCCESSFUL = "TRANSACTION_SUCCESSFUL";

    public static void main(String[] args) {
        String paymentResponse = doPayment();

        //Incorrect way
        //checkTransactionStatusIncorrectWay(paymentResponse);
        //Correct Way
        checkTransactionStatusCorrectWay(paymentResponse);
    }

    //this is the method you process customer transaction
    public static String doPayment(){

        String transactionStatus = TRANSACTION_SUCCESSFUL;
        return transactionStatus;
    }

    //this is the method you check transaction status
    private static void checkTransactionStatusIncorrectWay(String txnStatus) {
        try {
            if (txnStatus.equals(TRANSACTION_SUCCESSFUL)){
                System.out.println("Transaction Successful");
            }
            else {
                System.out.println("Transaction Failed");
            }
        }
        catch (Exception e){
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
    }

    //this is the method you check transaction status
    public static void checkTransactionStatusCorrectWay(String txnStatus){

        if (TRANSACTION_SUCCESSFUL.equals(txnStatus)){
            System.out.println("Transaction Successful");
        }
        else {
            System.out.println("Transaction Failed");
        }
    }
}
