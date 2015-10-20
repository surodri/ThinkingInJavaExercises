package access.mypackage;

public class AccessClassMembers {
    public String publicField = "public";
    private String privateField = "private";
    protected String protectedField = "protected";

    public String publicMethod() {
        return publicField;
    }

    public String privateMethod() {
        return privateField;
    }

    protected String protectedMethod() {
        return protectedField;
    }
}

class AccessProtectedMembers{

    public void manipulateData(){
        AccessClassMembers exercise6 = new AccessClassMembers();
        String variable = exercise6.protectedField;
    }

}