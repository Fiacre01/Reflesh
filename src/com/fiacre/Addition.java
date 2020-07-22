package com.fiacre;

public class Addition {
    int sum = 0;
    private int num1=0;
    private int num2=0;

    public int addTwoNum(int num1, int num2){
        sum = num1+ num2;
        return sum;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2(){
        return num2;
        }
    public void setNum1(int newNum1){
        this.num1=newNum1;
    }
    public void setNum2(int newNum2){
        this.num2=newNum2;
    }
}
