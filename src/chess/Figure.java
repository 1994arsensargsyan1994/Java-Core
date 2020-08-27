package chess;

public abstract class Figure <T extends Figure> {

    private String image;

    private EnumColor color;

    Figure(EnumColor color, String image) {
        this.image = image;
        this.color = color;
    }

    public EnumColor getColor() {
        return this.color;
    }

    public String getImage() {
        return this.image;
    }
}
