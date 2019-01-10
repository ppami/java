package test;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.NumbersAboveAverage;

class NumbersAboveAverageTest {

	@Test
	void should_ThrowNumbersAboveAverage_When_GivenAListOfPositiveNumbers() {
		NumbersAboveAverage nAA = new NumbersAboveAverage();
		
		List<Double> numbers = new ArrayList<Double>(Arrays.asList(1.0, 4.0, 3.0, 29.0, 41.0, 10.0));
		List<Double> expected = new ArrayList<Double>(Arrays.asList(29.0, 41.0));
		
		assertEquals(expected, nAA.numbersAboveAverage(numbers));
	}
	
	@Test
	void should_ThrowNumbersAboveAverage_When_GivenAListOfNegativeNumbers() {
		NumbersAboveAverage nAA = new NumbersAboveAverage();
		
		List<Double> numbers = new ArrayList<Double>(Arrays.asList(-20.0, -90.0, -4.0, -8.0, -10.0, -1.0));
		List<Double> expected = new ArrayList<Double>(Arrays.asList(-20.0, -4.0, -8.0, -10.0, -1.0));
		
		assertEquals(expected, nAA.numbersAboveAverage(numbers));
	}
	
	@Test
	void should_ThrowNumbersAboveAverage_When_GivenAListOfMixedNumbers() {
		NumbersAboveAverage nAA = new NumbersAboveAverage();
		
		List<Double> numbers = new ArrayList<Double>(Arrays.asList(-1.0, 4.0, 3.0, -29.0, 41.0, 10.0));
		List<Double> expected = new ArrayList<Double>(Arrays.asList(41.0, 10.0));
		
		assertEquals(expected, nAA.numbersAboveAverage(numbers));
	}

}
