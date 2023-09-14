package p14_09_2023;

import java.util.ArrayList;

public class TestCase {
    private String id;
    private String name;
    private ArrayList<TestStep> steps;

    public TestCase(String ID, String name) {
        this.id = id;
        this.name = name;
        this.steps = new ArrayList<>();
    }

    public void addTestStep(TestStep step){
        this.steps.add(step);
    }

    public int countFailed(){
        int counter = 0;
        for (int i = 0; i < this.steps.size(); i++) {
            if (!this.steps.get(i).validate()) {
                counter++;
            }
        }
        return counter;
    }

    public String status(){
        if (countFailed() == 0){
            return " TEST CASE PASSED";
        } else {
            return "TEST CASE FAILED";
        }
    }

    public void printStatus(){
        System.out.println("ID " + this.id + " - " + this.name);
        for (int i = 0; i < steps.size(); i++) {
            this.steps.get(i).print();
        }
        System.out.println(this.steps.size() + " / " + countFailed());
        System.out.println(status());
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<TestStep> getSteps() {
        return steps;
    }
}
