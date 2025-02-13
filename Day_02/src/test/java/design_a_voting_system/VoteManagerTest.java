package design_a_voting_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class VoteManagerTest {

    private VoteManager voteManager;

    @BeforeEach
    void setUp() {
        voteManager = new VoteManager();
    }

    @Test
    void testAddVote() {
        System.out.println("Testing addVote method...");

        voteManager.addVote("Alice");
        voteManager.addVote("Bob");
        voteManager.addVote("Alice");

        Map<String, Integer> results = voteManager.getVotesMap();

        assertEquals(2, results.get("Alice"), "Alice should have 2 votes.");
        assertEquals(1, results.get("Bob"), "Bob should have 1 vote.");

        System.out.println("Vote counts: " + results);
    }

    @Test
    void testDisplayResultsSorted() {
        System.out.println("Testing displayResultsSorted method...");

        voteManager.addVote("Alice");
        voteManager.addVote("Bob");
        voteManager.addVote("Alice");

        voteManager.displayResultsSorted();

    }

    @Test
    void testDisplayResultsInOrder() {
        System.out.println("Testing displayResultsInOrder method...");

        voteManager.addVote("Alice");
        voteManager.addVote("Bob");
        voteManager.addVote("Alice");

        voteManager.displayResultsInOrder();


    }
}
