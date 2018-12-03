class Square extends Rectangle {

    public Square() {}

    public Square(int size){
        width = height = size;
    }

    //The setHeight and setWidth methods violate the LSP

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
