/**
 * @author Kacper Staszek
 */
class Field<S extends FieldContainer> {

    private S fieldValue;

    S getFigure() {
        return fieldValue;
    }
}
