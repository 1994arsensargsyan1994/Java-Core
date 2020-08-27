package egs.home22Gitar;

public enum Type {
    ACOUSTIC, ELECTRIC;

    @Override
    public String toString() {
        switch (this) {
            case ACOUSTIC:
                return "Type -> acoustic";
            case ELECTRIC:
                return "Type -> electric";
        }
        return null;
    }
}
