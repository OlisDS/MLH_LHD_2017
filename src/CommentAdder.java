import Assets.*;

public class CommentAdder {

    long beginning1;
    long beginning2;
    long beginning3;
    long beginning4;

    long beginning5;
    long beginning6;
    long beginning7;
    long beginning8;

<<<<<<< HEAD
=======
    Asset[] assetObjects = new Asset[8];
    
>>>>>>> 6365508635b066ab004eb3640210f8068dac131e
    static final long ONE_SECOND = 1000000000L;



    public CommentAdder(Asset[] assetObjects){
        this.assetObject = assetObjects
        this.setTimers();
    }

    public long getTimeElapsedInNS(){
        return System.nanoTime();
    }

    public void addCommentsTo(CommentCounter commentCounter){

        int nComments = 0;
<<<<<<< HEAD

        if (this.getTimeElapsed1() > SingleLineComment.PERIOD) nComments += (SingleLineComment.quantity * SingleLineComment.VALUE);
        if (this.getTimeElapsed2() > MultiLineComment.PERIOD) nComments += (MultiLineComment.quantity * MultiLineComment.VALUE);
        if (this.getTimeElapsed3() > JavaDocAsset.PERIOD) nComments += (JavaDocAsset.quantity * JavaDocAsset.VALUE);
        if (this.getTimeElapsed4() > ReadMeAsset.PERIOD) nComments += (ReadMeAsset.quantity * ReadMeAsset.VALUE);
        if (this.getTimeElapsed5() > HeadDesignPattern.PERIOD) nComments += (HeadDesignPattern.quantity * HeadDesignPattern.VALUE);
        if (this.getTimeElapsed6() > QACommenter.PERIOD) nComments += (QACommenter.quantity * QACommenter.VALUE);
        if (this.getTimeElapsed7() > AutomaticCommentScript.PERIOD) nComments += (AutomaticCommentScript.quantity * AutomaticCommentScript.VALUE);
        if (this.getTimeElapsed8() > ReadableCodeAsset.PERIOD) nComments += (ReadableCodeAsset.quantity * ReadableCodeAsset.VALUE);
=======
        
        if (this.getTimeElapsed1() > assetObjects[0].period) nComments += (assetObjects[0].quantity * assetObjects[0].value);
        if (this.getTimeElapsed2() > assetObjects[1].period) nComments += (assetObjects[1].quantity * assetObjects[1].value);
        if (this.getTimeElapsed3() > assetObjects[2].period) nComments += (assetObjects[2].quantity * assetObjects[2].value);
        if (this.getTimeElapsed4() > assetObjects[3].period) nComments += (assetObjects[3].quantity * assetObjects[3].value);
        if (this.getTimeElapsed5() > assetObjects[4].period) nComments += (assetObjects[4].quantity * assetObjects[4].value);
        if (this.getTimeElapsed6() > assetObjects[5].period) nComments += (assetObjects[5].quantity * assetObjects[5].value);
        if (this.getTimeElapsed7() > assetObjects[6].period) nComments += (assetObjects[6].quantity * assetObjects[6].value);
        if (this.getTimeElapsed8() > assetObjects[7].period) nComments += (assetObjects[7].quantity * assetObjects[7].value);

        commentCounter.addComments(nComments);
>>>>>>> 6365508635b066ab004eb3640210f8068dac131e
    }

    private long getTimeElapsed1(){ return System.nanoTime() - beginning1; }
    private long getTimeElapsed2(){ return System.nanoTime() - beginning2; }
    private long getTimeElapsed3(){ return System.nanoTime() - beginning3; }
    private long getTimeElapsed4(){ return System.nanoTime() - beginning4; }
    private long getTimeElapsed5(){ return System.nanoTime() - beginning5; }
    private long getTimeElapsed6(){ return System.nanoTime() - beginning6; }
    private long getTimeElapsed7(){ return System.nanoTime() - beginning7; }
    private long getTimeElapsed8(){ return System.nanoTime() - beginning8; }
    private void resetTimer1(){ this.beginning1 = 0; }
    private void resetTimer2(){ this.beginning2 = 0; }
    private void resetTimer3(){ this.beginning3 = 0; }
    private void resetTimer4(){ this.beginning4 = 0; }
    private void resetTimer5(){ this.beginning5 = 0; }
    private void resetTimer6(){ this.beginning6 = 0; }
    private void resetTimer7(){ this.beginning7 = 0; }
    private void resetTimer8(){ this.beginning8 = 0; }

    private void setTimers(){
        this.resetTimer1();
        this.resetTimer2();
        this.resetTimer3();
        this.resetTimer4();
        this.resetTimer5();
        this.resetTimer6();
        this.resetTimer7();
        this.resetTimer8();
    }



}
