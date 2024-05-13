package methods;

public abstract class Abstract {
    public void Method(){
        System.out.println(protectedMethod());
    }
    private String protectedMethod(){
        return "Diana";
    }
}
