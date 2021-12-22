package ru.mirea.task6.opt1;

public class TestSolSystem {
    public static void main(String[] args){
        SolSystem s[] = {new Sun(), new Mercure(), new Venus(), new Earth(), new Mars(), new Jupiter(), new Saturn(), new Uranus(), new Neptune()};
        for (int i = 0; i < 9; i++){
            s[i].print();
        }

    }
}
