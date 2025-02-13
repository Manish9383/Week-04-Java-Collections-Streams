package design_a_voting_system;


public class Main {
    public static void main(String[] args) {
        VoteManager voteManager = new VoteManager();

        voteManager.addVote("Alice");
        voteManager.addVote("Bob");
        voteManager.addVote("Alice");
        voteManager.addVote("Charlie");
        voteManager.addVote("Bob");

        voteManager.displayResultsSorted();
        System.out.println();


        voteManager.displayResultsInOrder();
    }
}