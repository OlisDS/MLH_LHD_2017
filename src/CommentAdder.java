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
    
    static final long ONE_SECOND = 1000000000L;



    public CommentAdder(){
        this.setTimers();
    }

    public long getTimeElapsedInNS(){
        return System.nanoTime();
    }

    public void addCommentsTo(CommentCounter commentCounter){

        int nComments = 0;
        
        if (this.getTimeElapsed1() > SingleLineComment.PERIOD) nComments += (SingleLineComment.quantity * SingleLineComment.VALUE);
        if (this.getTimeElapsed2() > MultiLineComment.PERIOD) nComments += (MultiLineComment.quantity * MultiLineComment.VALUE);
        if (this.getTimeElapsed3() > JavaDocAsset.PERIOD) nComments += (JavaDocAsset.quantity * JavaDocAsset.VALUE);
        if (this.getTimeElapsed4() > ReadMeAsset.PERIOD) nComments += (ReadMeAsset.quantity * ReadMeAsset.VALUE);
        if (this.getTimeElapsed5() > HeadDesignPattern.PERIOD) nComments += (HeadDesignPattern.quantity * HeadDesignPattern.VALUE);
        if (this.getTimeElapsed6() > QACommenter.PERIOD) nComments += (QACommenter.quantity * QACommenter.VALUE);
        if (this.getTimeElapsed7() > AutomaticCommentScript.PERIOD) nComments += (AutomaticCommentScript.quantity * AutomaticCommentScript.VALUE);
        if (this.getTimeElapsed8() > ReadableCodeAsset.PERIOD) nComments += (ReadableCodeAsset.quantity * ReadableCodeAsset.VALUE);
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
