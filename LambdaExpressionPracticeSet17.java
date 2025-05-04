import java.util.Optional;
import java.util.List;
import java.util.Arrays;

public class LambdaExpressionPracticeSet17 {
    public static void main(String[] args) {
        System.out.println("Lambda Expression Practice Set 17");
        System.out.println("This is a simple Java program to demonstrate the use of lambda expressions.");
        System.out.println("Lambda expressions are a feature introduced in Java 8 that allow you to write anonymous functions.");
        System.out.println("They provide a clear and concise way to represent one method interface using an expression.");
        System.out.println("In this program, we will use lambda expressions to implement functional interfaces.");
        System.out.println("Let's get started!");
    }
    // 1. Functional Interface: An interface with a single abstract method.
    @FunctionalInterface
    interface MyFunctionalInterface {
        void myMethod();
    }
    // 2. Lambda Expression: A concise way to represent an anonymous function.
    MyFunctionalInterface myLambda = () -> System.out.println("Hello from Lambda Expression!");
    // 3. Method Reference: A shorthand notation of a lambda expression to call a method.
    MyFunctionalInterface myMethodReference = LambdaExpressionPracticeSet17::myStaticMethod;
    // 4. Static Method: A method that belongs to the class rather than an instance of the class.
    static void myStaticMethod() {
        System.out.println("Hello from Static Method!");
    }
    // 5. Instance Method: A method that belongs to an instance of the class.
    MyFunctionalInterface myInstanceMethod = new LambdaExpressionPracticeSet17()::myInstanceMethod;
    void myInstanceMethod() {
        System.out.println("Hello from Instance Method!");
    }
    // 6. Constructor Reference: A shorthand notation of a lambda expression to create an object.
    MyFunctionalInterface myConstructorReference = LambdaExpressionPracticeSet17::new;
    // 7. Default Method: A method with a body that can be overridden in implementing classes.
    interface MyInterface {
        default void myDefaultMethod() {
            System.out.println("Hello from Default Method!");
        }
    }
    // 8. Anonymous Class: A class without a name that is declared and instantiated in a single statement.
    MyFunctionalInterface myAnonymousClass = new MyFunctionalInterface() {
        @Override
        public void myMethod() {
            System.out.println("Hello from Anonymous Class!");
        }
    };
    // 9. Stream API: A new abstraction introduced in Java 8 that allows processing sequences of elements.
    // 10. Optional: A container object which may or may not contain a non-null value.
    // 11. Predicate: A functional interface that represents a single argument function that returns a boolean value.
    @FunctionalInterface
    interface MyPredicate {
        boolean test(int number);
    }
    // 12. Consumer: A functional interface that represents an operation that takes a single argument and returns no result.
    @FunctionalInterface
    interface MyConsumer {
        void accept(String message);
    }
    // 13. Supplier: A functional interface that represents a supplier of results.
    @FunctionalInterface
    interface MySupplier {
        String get();
    }
    // 14. BiFunction: A functional interface that represents a function that takes two arguments and produces a result.
    @FunctionalInterface
    interface MyBiFunction {
        int apply(int a, int b);
    }

    // 15. UnaryOperator: A functional interface that represents an operation on a single operand that produces a result of the same type.
    @FunctionalInterface
    interface MyUnaryOperator {
        int apply(int a);
    }
    // 16. BinaryOperator: A functional interface that represents an operation on two operands of the same type that produces a result of the same type.
    @FunctionalInterface
    interface MyBinaryOperator {
        int apply(int a, int b);
    }
    // 17. Function: A functional interface that represents a function that takes one argument and produces a result.
    @FunctionalInterface
    interface MyFunction {
        int apply(int a);
    }
    // 18. To demonstrate the use of lambda expressions, we will create a simple program that uses the above functional interfaces.
    public static void demonstrateLambdaExpressions() {
        // Using MyFunctionalInterface with a lambda expression
        MyFunctionalInterface myFunctionalInterface = () -> System.out.println("Hello from MyFunctionalInterface!");
        myFunctionalInterface.myMethod();

        // Using MyPredicate with a lambda expression
        MyPredicate myPredicate = (number) -> number > 0;
        System.out.println("Is 5 positive? " + myPredicate.test(5));

        // Using MyConsumer with a lambda expression
        MyConsumer myConsumer = (message) -> System.out.println("Message: " + message);
        myConsumer.accept("Hello, World!");

        // Using MySupplier with a lambda expression
        MySupplier mySupplier = () -> "Hello from Supplier!";
        System.out.println(mySupplier.get());

        // Using MyBiFunction with a lambda expression
        MyBiFunction myBiFunction = (a, b) -> a + b;
        System.out.println("Sum: " + myBiFunction.apply(5, 10));

        // Using MyUnaryOperator with a lambda expression
        MyUnaryOperator myUnaryOperator = (a) -> a * 2;
        System.out.println("Double: " + myUnaryOperator.apply(5));

        // Using MyBinaryOperator with a lambda expression
        MyBinaryOperator myBinaryOperator = (a, b) -> a * b;
        System.out.println("Product: " + myBinaryOperator.apply(5, 10));
    }
    // 19. To demonstrate the use of streams, we will create a simple program that uses the Stream API.
    public static void demonstrateStreams() {
        // Using Stream API to filter and print even numbers from a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }
    // 20. To demonstrate the use of Optional, we will create a simple program that uses the Optional class.
    public static void demonstrateOptional() {
        // Using Optional to handle null values
        Optional<String> optionalString = Optional.ofNullable(null);
        System.out.println("Is value present? " + optionalString.isPresent());
        System.out.println("Value: " + optionalString.orElse("Default Value"));
    }
    // 21. To demonstrate the use of method references, we will create a simple program that uses method references.
    public static void demonstrateMethodReferences() {
        // Using method reference to refer to a static method
        MyFunctionalInterface myStaticMethodReference = LambdaExpressionPracticeSet17::myStaticMethod;
        myStaticMethodReference.myMethod();

        // Using method reference to refer to an instance method
        LambdaExpressionPracticeSet17 instance = new LambdaExpressionPracticeSet17();
        MyFunctionalInterface myInstanceMethodReference = instance::myInstanceMethod;
        myInstanceMethodReference.myMethod();
    }
    // 22. To demonstrate the use of constructor references, we will create a simple program that uses constructor references.
    public static void demonstrateConstructorReferences() {
        // Using constructor reference to create an object
        MyFunctionalInterface myConstructorReference = LambdaExpressionPracticeSet17::new;
        myConstructorReference.myMethod();
    }
    // 23. To demonstrate the use of default methods, we will create a simple program that uses default methods.
    public static void demonstrateDefaultMethods() {
        MyInterface myInterface = new MyInterface() {};
        myInterface.myDefaultMethod();
    }
    // 24. To demonstrate the use of anonymous classes, we will create a simple program that uses anonymous classes.

    public static void demonstrateAnonymousClasses() {
        MyFunctionalInterface myAnonymousClass = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("Hello from Anonymous Class!");
            }
        };
        myAnonymousClass.myMethod();
    }
    // 25. To demonstrate the use of the Stream API, we will create a simple program that uses the Stream API.
    public static void demonstrateStreamAPIWithFilter() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
    // 26. To demonstrate the use of the Optional class, we will create a simple program that uses the Optional class.
    public static void demonstrateOptionalClassExample() {
        Optional<String> optionalString = Optional.ofNullable("Hello, World!");
        System.out.println("Is value present? " + optionalString.isPresent());
        System.out.println("Value: " + optionalString.orElse("Default Value"));
    }
    // 27. To demonstrate the use of the Predicate interface, we will create a simple program that uses the Predicate interface.
    public static void demonstratePredicate() {
        MyPredicate myPredicate = (number) -> number > 0;
        System.out.println("Is 5 positive? " + myPredicate.test(5));
    }
    // 28. To demonstrate the use of the Consumer interface, we will create a simple program that uses the Consumer interface.
    public static void demonstrateConsumer() {
        MyConsumer myConsumer = (message) -> System.out.println("Message: " + message);
        myConsumer.accept("Hello, World!");
    }
    // 29. To demonstrate the use of the Supplier interface, we will create a simple program that uses the Supplier interface.
    public static void demonstrateSupplier() {
        MySupplier mySupplier = () -> "Hello from Supplier!";
        System.out.println(mySupplier.get());
    }
    // 30. To demonstrate the use of the BiFunction interface, we will create a simple program that uses the BiFunction interface.
    public static void demonstrateBiFunction() {
        MyBiFunction myBiFunction = (a, b) -> a + b;
        System.out.println("Sum: " + myBiFunction.apply(5, 10));
    }
    // 31. To demonstrate the use of the UnaryOperator interface, we will create a simple program that uses the UnaryOperator interface.
    public static void demonstrateUnaryOperator() {
        MyUnaryOperator myUnaryOperator = (a) -> a * 2;
        System.out.println("Double: " + myUnaryOperator.apply(5));
    }
    // 32. To demonstrate the use of the BinaryOperator interface, we will create a simple program that uses the BinaryOperator interface.
    public static void demonstrateBinaryOperator() {
        MyBinaryOperator myBinaryOperator = (a, b) -> a * b;
        System.out.println("Product: " + myBinaryOperator.apply(5, 10));
    }
    // 33. To demonstrate the use of the Function interface, we will create a simple program that uses the Function interface.
    public static void demonstrateFunction() {
        MyFunction myFunction = (a) -> a * a;
        System.out.println("Square: " + myFunction.apply(5));
    }
    // 34. To demonstrate the use of the Stream API, we will create a simple program that uses the Stream API.
    public static void demonstrateStreamAPI() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
    // 35. To demonstrate the use of the Optional class, we will create a simple program that uses the Optional class.
    public static void demonstrateOptionalClass() {
        Optional<String> optionalString = Optional.ofNullable("Hello, World!");
        System.out.println("Is value present? " + optionalString.isPresent());
        System.out.println("Value: " + optionalString.orElse("Default Value"));
    }
    // 36. To demonstrate the use of the Predicate interface, we will create a simple program that uses the Predicate interface.
    public static void demonstratePredicateInterface() {
        MyPredicate isEven = (number) -> number % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
    }

    // 37. To demonstrate the use of the Consumer interface, we will create a simple program that uses the Consumer interface.
    public static void demonstrateConsumerInterface() {
        MyConsumer printMessage = (message) -> System.out.println("Consumed Message: " + message);
        printMessage.accept("Hello from Consumer!");
    }

    // 38. To demonstrate the use of the Supplier interface, we will create a simple program that uses the Supplier interface.
    public static void demonstrateSupplierInterface() {
        MySupplier generateMessage = () -> "Generated Message from Supplier!";
        System.out.println(generateMessage.get());
    }

    // 39. To demonstrate the use of the BiFunction interface, we will create a simple program that uses the BiFunction interface.
    public static void demonstrateBiFunctionInterface() {
        MyBiFunction multiply = (a, b) -> a * b;
        System.out.println("Multiplication Result: " + multiply.apply(3, 7));
    }

    // 40. To demonstrate the use of the UnaryOperator interface, we will create a simple program that uses the UnaryOperator interface.
    public static void demonstrateUnaryOperatorInterface() {
        MyUnaryOperator square = (a) -> a * a;
        System.out.println("Square of 6: " + square.apply(6));
    }

    // 41. To demonstrate the use of the BinaryOperator interface, we will create a simple program that uses the BinaryOperator interface.
    public static void demonstrateBinaryOperatorInterface() {
        MyBinaryOperator add = (a, b) -> a + b;
        System.out.println("Addition Result: " + add.apply(8, 12));
    }

    // 42. To demonstrate the use of the Function interface, we will create a simple program that uses the Function interface.
    public static void demonstrateFunctionInterface() {
        MyFunction cube = (a) -> a * a * a;
        System.out.println("Cube of 3: " + cube.apply(3));
    }

    // 43. To demonstrate the use of the Stream API with mapping, we will create a simple program that uses the Stream API.
    public static void demonstrateStreamMapping() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .map(number -> number * number)
                .forEach(System.out::println);
    }

    // 44. To demonstrate the use of Optional with ifPresent, we will create a simple program that uses the Optional class.
    public static void demonstrateOptionalIfPresent() {
        Optional<String> optionalString = Optional.of("Hello, Optional!");
        optionalString.ifPresent(System.out::println);
    }

    // 45. To demonstrate the use of method references with instance methods of an arbitrary object, we will create a simple program.
    public static void demonstrateArbitraryInstanceMethodReference() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    // 46. To demonstrate the use of method references with constructors, we will create a simple program.
    public static void demonstrateConstructorReferenceWithList() {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream()
                .map(String::new)
                .forEach(System.out::println);
    }

    // 47. To demonstrate the use of default methods in interfaces, we will create a simple program.
    public static void demonstrateDefaultMethodInInterface() {
        MyInterface myInterface = new MyInterface() {};
        myInterface.myDefaultMethod();
    }

    // 48. To demonstrate the use of anonymous classes with functional interfaces, we will create a simple program.
    public static void demonstrateAnonymousClassWithFunctionalInterface() {
        MyFunctionalInterface myAnonymousClass = new MyFunctionalInterface() {
            @Override
            public void myMethod() {
                System.out.println("Hello from another Anonymous Class!");
            }
        };
        myAnonymousClass.myMethod();
    }

    // 49. To demonstrate the use of the Stream API with sorting, we will create a simple program.
    public static void demonstrateStreamSorting() {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
        names.stream()
                .sorted()
                .forEach(System.out::println);
    }

    // 50. To demonstrate the use of Optional with orElseThrow, we will create a simple program.
    public static void demonstrateOptionalOrElseThrow() {
        Optional<String> optionalString = Optional.ofNullable(null);
        try {
            System.out.println(optionalString.orElseThrow(() -> new IllegalArgumentException("Value is null")));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
