public class Main {

    public static void main(String[] args) {
        CommentCounter commentCounter = new CommentCounter();

        testInventory();

        Timer timer = new Timer();


        gameLoop:
        while (true) {
            timer.addCommentsTo(commentCounter);
            System.out.println(System.nanoTime() + ":\t" + commentCounter.getNComments());
        }
    }

    public static void testInventory() {
        CommentAssets.oneSecondAuto = true;
    }
}
