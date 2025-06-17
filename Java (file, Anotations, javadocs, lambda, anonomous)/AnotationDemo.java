// 1. for @overide
// class Animal {
//     void sound() {
//         System.out.println("Animal makes sound");
//     }
// }

// class Dog extends Animal {
//     @Override
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }


//2. for @FunctionalInterface
// @FunctionalInterface
// interface Greeting {
//     void sayHello(); // Only one method allowed
// }



//3. for @Deprecated
// class OldAPI {
//     @Deprecated
//     void legacyMethod() {
//         System.out.println("This method is deprecated");
//     }
// }

//4. for @SuppressWarnings
// class Test {
//     @SuppressWarnings("deprecation")
//     public static void main(String[] args) {
//         OldAPI api = new OldAPI();
//         api.legacyMethod(); // No warning due to suppression
//     }
// }



