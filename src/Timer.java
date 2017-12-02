public class Timer {

    long startTime;

    long timeElapsed;

    public Timer(){
        this.startTime = System.nanoTime();
    }

    public long getTimeElapsedInNS(){
        return System.nanoTime();
    }

    public void addCommentsTo(CommentCounter commentCounter){

        long nComments = 0;

        if (CommentAssets.oneSecondAuto && getTimeElapsed() > 1000000000L){
            nComments = 1;
            this.startTime = System.nanoTime();
        }

        commentCounter.addComments(nComments);



    }

    public long getTimeElapsed(){
        return System.nanoTime() - startTime;
    }
}
