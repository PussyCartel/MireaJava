package com.example.cardsgame;

import java.util.Deque;
import java.util.LinkedList;

public class Cards {
    protected Deque<Integer> first;
    protected Deque<Integer> second;
    private Integer  a=0, b=0, out = 0;
    private Integer k = 0;
    private String winner;

    public Cards() {
        this.first = new LinkedList<>();
        this.second = new LinkedList<>();
    }

    public void inputPlayerCard(int player, Integer valueCard){
        switch (player){
            case 1: {
                this.first.addLast(valueCard);
                break;
            }
            case 2:{
                this.second.addLast(valueCard);
                break;
            }
        }
    }

    public void output(){
        for(int i = 0; i< 5; i++){
            System.out.println(first.pollFirst());
            System.out.println(second.pollFirst());
        }
    }

    public String playGame(){
        while (out == 0 && k < 106){
            a = first.pollFirst();
            b = second.pollFirst();
            if(a > b && a != 0 && b != 9){
                first.addLast(b);
                first.addLast(a);
            }
            else if(a < b && a != 0 && b != 9){
                second.addLast(a);
                second.addLast(b);
            }
            else if(a == 0 && b == 9){
                first.addLast(b);
                first.addLast(a);
            }
            else if (a == 9 && b == 0){
                second.addLast(a);
                second.addLast(b);
            }
            if(first.isEmpty() || second.isEmpty()){
                out = 1;
            }
            k++;
        }
        if(first.isEmpty() && k != 106){
            winner = "Победил первый игрок, кол-во ходов "+ k.toString();
        }
        else if(second.isEmpty() && k != 106){
            winner = "Победил второй игрок, кол-во ходов "+ k.toString();
        }
        else if(k == 106){
            winner = "botva";
        }
        return winner;
    }
}
