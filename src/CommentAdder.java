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

    Asset[] assetObjects = new Asset[8];
    
    static final long ONE_SECOND = 1000000000L;



    public CommentAdder(Asset[] assetObjects){
        this.assetObjects = assetObjects
        this.setTimers();
    }

    public long getTimeElapsedInNS(){
        return System.nanoTime();
    }

    public void addCommentsTo(CommentCounter commentCounter){

        int nComments = 0;

        //this be a comment;
         
        if (this.getTimeElapsed1() > assetObjects[0].getPeriod()) nComments += (assetObjects[0].getQuantity() * assetObjects[0].getValue());
        if (this.getTimeElapsed2() > assetObjects[1].getPeriod()) nComments += (assetObjects[1].getQuantity() * assetObjects[1].getValue());
        if (this.getTimeElapsed3() > assetObjects[2].getPeriod()) nComments += (assetObjects[2].getQuantity() * assetObjects[2].getValue());
        if (this.getTimeElapsed4() > assetObjects[3].getPeriod()) nComments += (assetObjects[3].getQuantity() * assetObjects[3].getValue());
        if (this.getTimeElapsed5() > assetObjects[4].getPeriod()) nComments += (assetObjects[4].getQuantity() * assetObjects[4].getValue());
        if (this.getTimeElapsed6() > assetObjects[5].getPeriod()) nComments += (assetObjects[5].getQuantity() * assetObjects[5].getValue());
        if (this.getTimeElapsed7() > assetObjects[6].getPeriod()) nComments += (assetObjects[6].getQuantity() * assetObjects[6].getValue());
        if (this.getTimeElapsed8() > assetObjects[7].getPeriod()) nComments += (assetObjects[7].getQuantity() * assetObjects[7].getValue());

        commentCounter.addComments(nComments);
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
