package co.com.example;

class Succession {
    private final Integer limit;
    private final Integer number;

    public Succession(Integer limit, Integer number) {
        this.limit = limit;
        this.number = number;
    }

    public double calculateSuccession() {
        int currentPrimeNumber = this.getPrimeNumber(0);
        double result = 0;

        for (int i = 0; i < this.limit; i++) {
            if (i % 2 == 0) {
                result = result + Math.pow(this.number, i+4) / this.calculateFactorial(currentPrimeNumber);
            } else {
                result = result - Math.pow(this.number, i+4) / this.calculateFactorial(currentPrimeNumber);
            }

            currentPrimeNumber = getPrimeNumber(currentPrimeNumber + 1);
        }

        return result;
    }

    private Integer calculateFactorial(Integer value) {
        int result = 1;

        for (int i = 1; i < value+1; i++) { result = result * i; }

        return result;
    }

    private Integer getPrimeNumber(Integer previousPrimeNumber) {
        for (Integer i = previousPrimeNumber; i < 100; i++) {
            if (this.validatePrimeNumber(i)) { return i; }
        }

        return previousPrimeNumber;
    }

    private Boolean validatePrimeNumber(Integer number) {
        int countDividers = 0;

        for (int j = 1; j < number+1; j++) {
            if (number % j == 0) { countDividers++; }
        }

        return countDividers == 2;
    }
}