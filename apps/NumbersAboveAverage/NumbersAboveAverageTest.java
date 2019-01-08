package test;


import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.NumbersAboveAverage;

class NumbersAboveAverageTest {

	@Test
	void should_ThrowNumbersAboveAverage_When_GivenAListOfPositiveNumbers() {
		NumbersAboveAverage nAA = new NumbersAboveAverage();
		
		List<Double> numbers = new ArrayList<>();
		numbers.add(1.0);
		numbers.add(4.0);
		numbers.add(3.0);
		numbers.add(29.0);
		numbers.add(41.0);
		numbers.add(10.0);
		
		List<Double> expected = new ArrayList<>();
		expected.add(29.0);
		expected.add(41.0);
		
		assertEquals(expected, nAA.numbersAboveAverage(numbers));
	}
	
	@Test
	void should_ThrowNumbersAboveAverage_When_GivenAListOfNegativeNumbers() {
		NumbersAboveAverage nAA = new NumbersAboveAverage();
		
		List<Double> numbers = new ArrayList<>();
		numbers.add(-20.0);
		numbers.add(-90.0);
		numbers.add(-4.0);
		numbers.add(-8.0);
		numbers.add(-10.0);
		numbers.add(-1.0);
		
		List<Double> expected = new ArrayList<>();
		expected.add(-20.0);
		expected.add(-4.0);
		expected.add(-8.0);
		expected.add(-10.0);
		expected.add(-1.0);
		
		assertEquals(expected, nAA.numbersAboveAverage(numbers));
	}
	
	@Test
	void should_ThrowNumbersAboveAverage_When_GivenAListOfMixedNumbers() {
		NumbersAboveAverage nAA = new NumbersAboveAverage();
		List<Double> numbers = new ArrayList<>();
		numbers.add(-1.0);
		numbers.add(4.0);
		numbers.add(3.0);
		numbers.add(-29.0);
		numbers.add(41.0);
		numbers.add(10.0);
		
		List<Double> expected = new ArrayList<>();
		expected.add(41.0);
		expected.add(10.0);
		
		assertEquals(expected, nAA.numbersAboveAverage(numbers));
	}

}
