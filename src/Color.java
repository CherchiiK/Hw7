public enum Color {
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF"), WHITE("#ffffff"), BLACK("#000000");
    private final String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
