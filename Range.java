import java.util.NoSuchElementException;
public class Range implements IntegerSequence {

  private int start,end,current;

  public Range(int Start, int End) {
    start = Start;
    end = End;
    curpos = Start;
  }
  public void reset() {
    curpos = start;
  }

  public int length() {
    return (end - start)++;
  }

  public boolean hasNext() {
    return (current <= end);
  }

  //@throws NoSuchElementException
  public int next(){    }

}
