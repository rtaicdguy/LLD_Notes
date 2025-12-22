package snakeAndLadder;

import snakeAndLadder.constants.ElementType;

public class BoardElement {
    private final ElementType elementType;
    private final Integer from;
    private final Integer to;

    BoardElement(ElementType elementType,Integer from,Integer to){
        this.elementType=elementType;
        this.from=from;
        this.to=to;
    }

    public ElementType getElementType() {
        return elementType;
    }

    public Integer getFrom() {
        return from;
    }

    public Integer getTo() {
        return to;
    }

}
