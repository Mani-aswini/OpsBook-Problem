import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> scores = new ArrayList<>();
		for (int i = 0 i < n; i++) 
			scores.add(sc.nextInt());
		int k = sc.nextInt();
		int idx1 = sc.nextInt();
		int idx2 = sc.nextInt();
		int freqValue = sc.nextInt();
		int searchValue = sc.nextInt();
		int fillValue = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> squad2 = new ArrayList<>();
		for (int i = 0 ; i < m; i++) { 
			squad2.add(sc.nextInt());
		}
		processOperations (scores, k, idx1, idx2, freqValue, searchValue, fillValue, squad2);
	}
	public static void processOperations (List<Integer> scores, int k, int idx1, int idx2, int freqValue, int searchValue, int fillValue, List<Integer> squad2) {
		ArrayList<Integer> al = new ArrayList<>(scores);
		Collections.sort(scores);
		System.out.println("Sorted Scores: + scores);
		Collections.reverse (scores);
		System.out.println("Reversed Scores: + scores);
		System.out.println("Maximum Score: + Collections.max(scores));
		System.out.println("Minimum Score: + Collections.min(scores));
		Collections.rotate (scores, k);
		System.out.println("Rotated Scores (by " + k + "): " + scores);
		Collections.swap (scores, idx1, idx2);
		System.out.println("After Swap (" + idx1 + "," + idx2 +"): " + scores);
		System.out.println("Frequency of "+ freqValue + ": "+ Collections.frequency(scores, freqValue));
		Collections.sort(scores);
		int num = Collections.binarySearch(scores, searchValue);
		if(num >= 0) {
			System.out.println("Binary Search for + searchValue + ": + "Found at index + num);
		}
		else {
			System.out.println("Binary Search for + searchValue "+ ": "+ "Not Found");
		}
		Collections.copy (al, scores);
		System.out.println("Copied Scores: " + al);
		Collections.fill (scores, fillValue);
		System.out.println("After Fill (" + fillValue + "):" + scores);
		Collections.replaceAll(scores, fillValue, 999);
		System.out.println("After ReplaceAll (" + fillValue + ", 999): " + scores);
		System.out.println("List with nCopies (5, 100): " + Collections.nCopies (5,100));
		System.out.println("Disjoint with second squad " + squad2 + "?" + Collections.disjoint(squad2, al));
	}
}
