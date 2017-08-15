package com.jaholm;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        if (tonerLevel>0 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagesPrinted = 0;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillToner(int tonerAmount){
        if (tonerAmount<0){
            System.out.println("No negative toner");
        } else if ((tonerLevel+tonerAmount)>=100){
            tonerLevel = 100;
            System.out.println("Tonerlevel 100% full.");
        } else {
            tonerLevel += tonerAmount;
            System.out.println("Tonerlevel filled. New tonerlevel is " + tonerLevel +"%.");
        }
    }

    public void printPage(int numberOfPages){
        System.out.println("Before printing: " + numberOfPagesPrinted + " pages printed. Tonerlevel is " + tonerLevel + "%.");
        int startNumberOfPagesPrinted = numberOfPagesPrinted;
        for (int i=0; i<numberOfPages; i++){
            if (isDuplexPrinter){
                if (i%2==0) numberOfPagesPrinted++;
            } else {
                numberOfPagesPrinted++;
            }
            tonerLevel--;
            if (tonerLevel<=0){
                System.out.println("Toner empty. " + (i+1) + " pages printed of total " + numberOfPages + ".");
                break;
            } else if ((i+1)==numberOfPages){
                System.out.println("Total numbers printed: " + numberOfPages);
            }
        }
    }


    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
