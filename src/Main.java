public class Main {

    public static void main(String[] args) {
        CommentCounter commentCounter = new CommentCounter();

        testInventory();

        CommentAdder adder = new CommentAdder();


        gameLoop:
        while (true) {
            adder.addCommentsTo(commentCounter);
            System.out.println(System.nanoTime() + ":\t" + commentCounter.getNComments());
        }
    }

    public static void testInventory() {
        //set values of how much of each asset we have
    }
}
