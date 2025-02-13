package design_a_voting_system;

import java.util.*;

public class VoteManager {
    private Map<String, Integer> votesMap = new HashMap<>();

    public void addVote(String candidate) {
        votesMap.put(candidate, votesMap.getOrDefault(candidate, 0) + 1);
    }
    public Map<String, Integer> getVotesMap() {
        return votesMap;
    }


    public void displayResultsSorted() {
        Map<String, Integer> sortedMap = new TreeMap<>(votesMap);
        System.out.println("Results (Sorted by Candidate):");
        sortedMap.forEach((candidate, votes) ->
                System.out.println(candidate + ": " + votes + " votes")
        );
    }

    public void displayResultsInOrder() {
        Map<String, Integer> orderedMap = new LinkedHashMap<>(votesMap);
        System.out.println("Results (In Order of Voting):");
        orderedMap.forEach((candidate, votes) ->
                System.out.println(candidate + ": " + votes + " votes")
        );
    }
}