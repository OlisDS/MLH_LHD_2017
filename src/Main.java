public class Main {

    static Asset[] assetTypes;
    static CommentCounter commentCounter;
    
    public static void main(String[] args) {
        commentCounter = new CommentCounter();

        testInventory();
        
        Asset[] assetTypes = new Asset[8];
        
        initialize(assetTypes)
        
        CommentAdder adder = new CommentAdder(assetTypes);

        gameLoop:
        while (true) {
            adder.addCommentsTo(commentCounter);
            System.out.println(System.nanoTime() + ":\t" + commentCounter.getNComments());
        }
    }

    public static void testInventory() {
        //set values of how much of each asset we have
    }
    
    public static void initialize(Asset[] assetTypes){
        Asset SingleLine = new Asset(150, 1, 10000000);
        Asset MultiLine = new Asset(1000, 5, 5000000);
        Asset JavaDoc = new Asset(11000, 40, 5000000);
        Asset ReadMe = new Asset(25000, 80, 2500000);
        Asset HeaderDesignPatterns = new Asset(500000, 200, 2500000);
        Asset QACommenter = new Asset(1000000, 400, 25000000);
        Asset AutoScript = new Asset(25000000, 1000, 125000000);
        Asset ReadableCode = new Asset(50000000, 6666, 10000000);
        assetTypes = {SingleLine, MultiLine, JavaDoc, ReadMe, HeaderDesignPatterns, QACommenter, AutoScript, ReadableCode};
    
    }
}
