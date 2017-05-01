package nro;

public class SecondMinimum {

		public static void main(String[] args) {
			int min=-1;
			int secondMin=-1;
			int max=-1;
			int secondMax=-1;
			int[] arr={45,56,12,89,98,7777,522,32,10,20};
			min=arr[0];
			secondMin=arr[0];
			for(int i=0;i<arr.length;i++){
				System.out.println(" arr[i]  ::  "+arr[i]);
				if(arr[i]<min){
					secondMin=min;
					min=arr[i];
				}else if(arr[i]<secondMin){
					secondMin=arr[i];
				}
			}
			
			for(int i=0;i<arr.length;i++){
				if(arr[i]>max){
					secondMax=max;
					max=arr[i];
				}else if(arr[i]>secondMax){
					secondMax=arr[i];
				}
			}
			
			
			
			System.out.println("max :: "+max+"   secondMax  ::  "+secondMax);
			
			System.out.println("min :: "+min+"   secondMin  ::  "+secondMin);
		}

}
