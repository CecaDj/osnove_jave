package p14_09_2023;

public class TestStep {
    private String description;
    private String actualResult;
    private String expectedResult;
    private String errorMessage;

    public TestStep(String description, String actualResult, String expectedResult, String errorMessage) {
        this.description = description;
        this.actualResult = actualResult;
        this.expectedResult = expectedResult;
        this.errorMessage = errorMessage;
    }

    public boolean validate(){
        if (this.expectedResult.equals(this.actualResult)) {
            return true;
        } else {
            return false;
        }
    }

    public void print(){
        System.out.println("| " + this.description + " |");
        if (validate()){
            System.out.println("| Status (PASSED) |");
        } else {
            System.out.println("| Status (FAILED) | " + this.errorMessage);
        }
    }

    public String getDescription() {
        return description;
    }

    public String getActualResult() {
        return actualResult;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
