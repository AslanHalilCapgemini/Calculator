package enums;

public enum Operations {
    ADDITION("addition"),
    SUBSTRACTION("substraction"),
    MULTIPLICATION("multiplication"),
    DIVISION("division");
    private String operation;

    Operations(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }
}
