public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        if (second % first == 0) {
            System.out.println("Aliquot");
        } else {
            System.out.println("Not aliquot");
        }
    }
}
