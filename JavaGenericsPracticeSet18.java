public class JavaGenericsPracticeSet18 {
    public static void main(String[] args) {
        System.out.println("Java Generics Practice Set - 18.");

        // Demonstrating Java Generics
        // Demonstrating Java Generics with a simple example
        GenericClass<Integer> intObj = new GenericClass<>(10);
        GenericClass<String> stringObj = new GenericClass<>("Hello Generics");

        System.out.println("Integer Value: " + intObj.getValue());
        System.out.println("String Value: " + stringObj.getValue());
    }

    // A simple generic class
    static class GenericClass<T> {
        private T value;

        public GenericClass(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }
}
