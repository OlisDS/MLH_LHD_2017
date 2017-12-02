public class CommentCounter {

    long nComments;

    public CommentCounter(){
        nComments = 0;
    }

    public void addComments(long newComments){
        nComments += newComments;
    }

    public long getNComments(){
        return nComments;
    }
}
