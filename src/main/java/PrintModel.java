import java.util.function.Function;

/**
 * @author Kacper Staszek
 */
class PrintModel<T> {

  private Function<Integer, T> function;

  public PrintModel(Function<Integer, T> function) {
    this.function = function;
  }

  T getInfo(int number) {
    return function.apply(number);
  }
}

/*
Utwórz klasę Board
 */
