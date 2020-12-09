import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other) {
    data = other;
    currentIndex = 0;
  }

  //Postcondition: The otherseq will be reset.
  //This constructor will copy ALL values of the `otherseq` into the data array.
  public ArraySequence(IntegerSequence otherseq) {

  }

}
