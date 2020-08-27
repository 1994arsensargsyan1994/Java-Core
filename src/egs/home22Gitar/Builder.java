package egs.home22Gitar;

public enum Builder {
    FENDER, MARTIN, GIBSON, CALLINGS, OLSON, RYAN, PRS, ANY;

    @Override
    public String toString() {
        switch (this) {
            case ANY:
                return "builder -> any";
            case FENDER:
                return "builder -> fender";
            case MARTIN:
                return "builder -> martin";
            case GIBSON:
                return "builder -> gibson";
            case CALLINGS:
                return "builder -> callings";
            case OLSON:
                return "builder -> olson";
            case RYAN:
                return "builder -> ryan";
            case PRS:
                return "builder -> prs";
        }
        return null;
    }
}
