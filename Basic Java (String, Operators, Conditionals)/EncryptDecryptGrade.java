public class EncryptDecryptGrade {
    public static void main(String[] args) {
        char  grade = 'B';
        System.out.println("The original grade is " + grade);

        grade = (char) (grade + 8);
        System.out.println("Encrypted grade is "+ grade);

        grade = (char) (grade - 8);
        System.out.println("Decrypted grade is "+ grade);

    }
}
