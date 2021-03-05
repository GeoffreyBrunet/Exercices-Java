package com.geoffreybrunet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String sentence = "Nous entendons souvent des questions du genre « Quel est le premier langage de programmation à apprendre ? »,\n" +
                "« Java est-il un bon langage de programma-tion pour débuter ? »,\n" +
                "« A quel point Java est-il bon comme premier langage de programmation ? »,\n" +
                "« Quel est le meilleur langage de programmation pour débu-tants ? »,\n ou encore « Devrais-je commencer avec Java ou Python ? ».\n" +
                "Eh bien, la réponse à toutes ces questions est que Java est l’un des langages de programmation les plus populaires,\n" +
                "et il y a de nombreuses raisons d’apprendre Java, allant des opportunités d’emploi à la quantité et la qualité de la commu-nauté de soutien de ce langage de programmation.";
        try (FileWriter writer = new FileWriter("file.txt");
             BufferedWriter bw = new BufferedWriter(writer)) {
            bw.write(sentence);
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}
