package dowlath.io.example.custom_annotations;

@MyAnnotation(author = "Dowlath Basha G", purpose = "MyAnnotationClass ")
public class MyAnnotationClass{

    @MyAnnotation(author = "Dowlath Basha G", purpose = "This Method says Hello")
    public void sayHello(){
        System.out.println("Hello from sayHello()");
    }

    @MyAnnotation(purpose = "This method is test method")
    public void testMethod(){
        System.out.println("Inside Test Method()");
    }

    public void  noAnnotationMethod(){
        System.out.println("This method has no annotation");
    }
}
