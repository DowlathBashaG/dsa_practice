package dowlath.io.example.custom_annotations;

import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String args[]) {
        // Class level annotation
        Class<MyAnnotationClass> obj = MyAnnotationClass.class;

        if (obj.isAnnotationPresent(MyAnnotation.class)) {
            MyAnnotation myAnnotation = obj.getAnnotation(MyAnnotation.class);
            System.out.println("Class Annotation:");
            System.out.println("Author: " + myAnnotation.author());
            System.out.println("Purpose: " + myAnnotation.purpose());
            System.out.println("-------------------------------------------------");

            // Process method-level annotations
            for (Method method : obj.getDeclaredMethods()) {
                if (method.isAnnotationPresent(MyAnnotation.class)) {
                    MyAnnotation info = method.getAnnotation(MyAnnotation.class);
                    System.out.println("Method: " + method.getName());
                    System.out.println("Author: " + info.author());
                    System.out.println("Purpose: " + info.purpose());
                    System.out.println("--------------------------");
                }
            }
        }
    }
}
