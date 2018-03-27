class Day2Test extends GroovyTestCase {
	
	def day2 = new Day2()

	void testForCalculateASimpleCaseOfWrapper(){
		String dimension = "2x3x4"
		Integer result = day2.calculateWrapper(dimension)
		assert result == 58
	}

	void testForCalculateAnOtherSimpleCaseOfWrapper(){
		String dimension = "1x1x10"
		Integer result = day2.calculateWrapper(dimension)
		assert result == 43
	}

	void testForCalculateTotalOfWrapper(){
		File dimension = new File('/home/luis/Repos/Groovy/examplesGroovy/AdventOfCode/Day2.txt')
		Integer result = day2.calculateWrapper(dimension)
		assert result == 1586300
	}

	void testForCalculateASimpleCaseOfRibbon(){
		String dimension = "2x3x4"
		Integer result = day2.calculateRibbon(dimension)
		assert result == 34
	}

	void testForCalculateAnOtherCaseOfRibbon(){
		String dimension = "1x1x10"
		Integer result = day2.calculateRibbon(dimension)
		assert result == 14
	}

	void testForCalculateTotalOfRibbon(){
		File dimension = new File('/home/luis/Repos/Groovy/examplesGroovy/AdventOfCode/Day2.txt')
		Integer result = day2.calculateRibbon(dimension)
		assert result == 3737498	
	}
}