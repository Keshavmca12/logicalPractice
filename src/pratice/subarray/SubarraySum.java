package pratice.subarray;
import java.util.ArrayList;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubarraySum {
	static List<List<Integer>> subarrayList = new ArrayList<List<Integer>>();
	static List<Boolean> resultList = new ArrayList<Boolean>();

	public static void main(String[] args) {
		int array[] = { 3, 5, 6, 9, 14, 8, 2, 12, 7, 7 };
		// printSubArrayOfRequiredSum(array, 14);
		// findSubArray(array, 14);
		for (int i = 0; i < array.length; i++) {
			findAllSubArray(array, 14, i);
		}
		System.out.println("subaaray List" + subarrayList);
		ArrayList<Integer> al=new ArrayList<>();
		//{1, 3, 4, 5 , 6}
		al.add(1);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		
	}

	private static void findAllSubArray(int[] array, int n, int startIndex) {
		int sum = 0;
		int index = 0;
		// System.out.println("start index  :: "+startIndex);
		for (int i = startIndex; i < array.length; i++) {
			sum = 0;
			List<Integer> subArray = new ArrayList<Integer>();
			++index;
			for (int k = i; k < array.length; k += index) {
				sum += array[k];
				subArray.add(array[k]);
				if (sum == n) {
					// System.out.println("sub aaray " + subArray);
					List<Integer> tempList = new ArrayList<Integer>(subArray);
					resultList = new ArrayList<Boolean>();
					addToSubarrayListIfUnique(tempList);
					// subarrayList.add(tempList);
				}
			}
		}
		
	

	}

	private static void addToSubarrayListIfUnique(List<Integer> subArray) {
		System.out.println("sub aaray input :: " + subArray + " subarrayList "
				+ subarrayList);
		if (subarrayList.size() == 0) {
			subarrayList.add(subArray);
			return;
		}
		int matched = 0;
		for (List<Integer> tempList : subarrayList) {
			boolean isMatched=false;
			System.out.println("temp list :: " + tempList);
			HashMap<Integer, Integer> elementCount = new HashMap<Integer, Integer>();
			if(tempList.size()!=subArray.size()){
				isMatched=false;
			}else{
				for (int element : subArray) {
					if (elementCount.get(element) == null) {
						elementCount.put(element, 1);
					} else {
						elementCount.put(element, elementCount.get(element) + 1);
					}
				}
				System.out.println("after subarray  change elementCount ::  "
						+ elementCount);
				for (int element : tempList) {
					if (elementCount.get(element) == null) {
						// System.out.println("elementCount ::  "+
						// element+" null  ");
						elementCount.put(element, -1);
						break;
					} else {
						if(elementCount.get(element)>1){
							elementCount.put(element, elementCount.get(element) - 1);
						}
					}
				}
				System.out.println("after tempList  change elementCount ::  "
						+ elementCount.values());
				for (int count : elementCount.values()) {
					if (count != 1) {
						System.out.println("not matched  :: " + tempList);
						isMatched=false;
						break;
					} else{
						isMatched=true;
					}
				}
			}
			resultList.add(isMatched);
		}
		System.out.println("result list  "+resultList);
		for (boolean result : resultList) {
			if (result) {
				matched++;
			} 
		}
		System.out.println("sub aaray   :: " + subArray+"   matched   ::  "+matched);
		if (matched == 0) {
			subarrayList.add(subArray);
		}
	}

	private static void printSubarrays(int[] input, int k) {
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		List<Integer> initial = new ArrayList<Integer>();
		initial.add(-1);
		map.put(0, initial);
		int preSum = 0;
		// Loop across all elements of the array
		for (int i = 0; i < input.length; i++) {
			preSum += input[i];
			// If point where sum = (preSum - k) is present, it means that
			// between that
			// point and this, the sum has to equal k
			if (map.containsKey(preSum - k)) { // Subarray found
				List<Integer> startIndices = map.get(preSum - k);
				// System.out.println("Startindices: "+startIndices);
				List<Integer> subArray = new ArrayList<Integer>();
				int startIndex = -1;
				for (int start : startIndices) {
					startIndex = start + 1;
					System.out
					.println("Start: " + (startIndex) + "\tEnd: " + i);
				}
				for (int x = startIndex; x <= i; x++) {
					subArray.add(input[x]);
				}
				System.out.println("subArray" + subArray);
			}

			List<Integer> newStart = new ArrayList<Integer>();
			if (map.containsKey(preSum)) {
				newStart = map.get(preSum);
			}
			newStart.add(i);
			map.put(preSum, newStart);
			// System.out.println("map ::"+map);
		}
	}

	private static void findSubArray(int[] array, int n) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = 0;
			List<Integer> subArray = new ArrayList<Integer>();
			for (int j = i; j < array.length; j++) {
				sum += array[j];
				subArray.add(array[j]);
				if (sum == n) {
					System.out.println("sub aaray " + subArray);

				}
			}
		}

	}

	private static void printSubArrayOfRequiredSum(int[] array, int requiredSum) {
		for (int i = 0; i < array.length; i++) {
			String str = "[ ";
			int sum = 0;
			for (int j = i; j < array.length; j++) {
				sum = sum + array[j];
				str = str + array[j] + ", ";
				if (sum == requiredSum) {
					System.out.println(" sum : " + sum + " array : " + str
							+ "]");
					str = "[ ";
					sum = 0;
				}
			}
		}
	}

}
