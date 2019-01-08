package main;

import java.util.ArrayList;
import java.util.List;

public class NumbersAboveAverage {
	public List<Double> numbersAboveAverage(List<Double> numbers) {
		List<Double> numbersAboveAverage = new ArrayList<>();
		double average = checkAverage(numbers);
		
		for (double number : numbers) {
			if (number > average) {
				numbersAboveAverage.add(number);
			}
		}	
		return numbersAboveAverage;
	}
	
	public double checkAverage(List<Double> numbers) {
		double sum = 0;
		
		for (double number : numbers) {
			sum = sum + number;
		}
		double average = sum/numbers.size();
		
		return average;
	}
	
}
