import java.util.List;

/**
 * @author Kacper Staszek
 */
class Board <V,T extends PrintModel<V>,S extends FieldContainer> {
  private List<Field<S>> fields;
  private T printModel;

  Board(List<Field<S>> fields, T printModel) {
    this.fields = fields;
    this.printModel = printModel;
  }

    V getFieldInfo(int fieldNumber){
    return printModel.getInfo(fieldNumber);
  }
  S getField(int fieldNumber){
    return fields.get(fieldNumber).getFigure();
  }

}

