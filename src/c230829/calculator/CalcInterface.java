package c230829.calculator;

public interface CalcInterface extends AddInterface, MinusInterface {
	public default int add(int ...nums) {
		int temp = 0;
		for(int num : nums) {
			temp = AddInterface.super.add(temp, num);
		}
		return temp;
	}
	
	public default int minus(int ...nums) {
		int temp = nums[0];
		for(int i = 1; i < nums.length; i++) {
			temp = MinusInterface.super.minus(temp, nums[i]);
		}
		return temp;
	}
}
