import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other) {
    data = new int[other.length];
    for (int i = 0; i < other.length; i++) {
      data[i] = other[i];
    }
    currentIndex = 0;
  }

  //Postcondition: The otherseq will be reset.
  //This constructor will copy ALL values of the `otherseq` into the data array.
  public ArraySequence(IntegerSequence otherseq) {
    data = new int[otherseq.length()];
    for (int i = 0; i < otherseq.length(); i++) {
      data[i] = otherseq.next();
    }
    otherseq.reset();
  }

  public boolean hasNext() {
    return (currentIndex < data.length);
  }

  public int next() throws NoSuchElementException {
    if (!(hasNext())) throw new NoSuchElementException();
    currentIndex++;
    return data[currentIndex--];
  }

  public int length() {
      return data.length;
    }

  public void reset() {
    currentIndex = 0;
  }

}
