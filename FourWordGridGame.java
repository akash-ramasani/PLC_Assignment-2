import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FourWordGridGame {

    private static final String[] WORDS = {
            "also", "able", "acid", "aged", "away", "baby", "back", "bank", "been",
	          "ball", "base", "busy", "bend", "bell", "bird", "come", "came", "calm", 
            "card", "coat", "city", "chat", "cash", "crow", "cook", "cool", "dark",
            "each", "evil", "even", "ever", "face", "fact", "four", "five", "fair", 
            "feel", "fell", "fire", "fine", "fish", "game", "gone", "gold", "girl", 
            "have", "hair", "here", "hear", "into", "iron", "jump", "kick", "kill", 
            "life", "like", "love", "main", "move", "meet", "more", "nose", "near",  
            "open", "only", "push", "pull", "sell", "sale"
    };

    private static ArrayList<String> getRandomWords() {
        ArrayList<String> selectedWords = new ArrayList<>();
        ArrayList<String> wordsList = new ArrayList<>();
        Collections.addAll(wordsList, WORDS);
        Collections.shuffle(wordsList);
        for (int i = 0; i < 4; i++) {
            selectedWords.add(wordsList.get(i));
        }
        return selectedWords;
    }

    private static ArrayList<Character> generateShuffledGrid(ArrayList<String> words) {
        ArrayList<Character> gridLetters = new ArrayList<>();
        for (String word : words) {
            for (char letter : word.toCharArray()) {
                gridLetters.add(letter);
            }
        }
        Collections.shuffle(gridLetters);
        return gridLetters;
    }

    private static void displayGrid(ArrayList<Character> gridLetters) {
        System.out.println("Here is the 4x4 letter grid:");
        for (int i = 0; i < gridLetters.size(); i++) {
            System.out.print(gridLetters.get(i) + " ");
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
    }

    private static void playGame() {
        ArrayList<String> selectedWords = getRandomWords();
        ArrayList<Character> shuffledGrid = generateShuffledGrid(selectedWords);
        System.out.println("Welcome to the Four Word Grid Game!");
        displayGrid(shuffledGrid);
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;
        while (attempts > 0) {
            System.out.println("\nEnter your guesses for the 4 words (separated by spaces):");
            String userGuess = scanner.nextLine();
            String[] guesses = userGuess.split(" ");

	          //Code Here

        }
        if (attempts == 0) {
            System.out.println("Game over. The correct words were: " + selectedWords);
        }
        scanner.close();
    }

    public static void main(String[] args) {
        playGame();
    }
}
