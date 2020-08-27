package egs.home22Gitar;

public enum Wood {
    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE,
    COBOL, ADIRONDACK, CEDAR, ALDER, CILKA;

    @Override
    public String toString() {
        switch (this) {
            case ALDER: {
                return "Alder";
            }
            case INDIAN_ROSEWOOD: {
                return "Indian rosewood";
            }
            case BRAZILIAN_ROSEWOOD: {
                return "Brazilian rosewood";
            }
            case MAHOGANY: {
                return "mahogany";
            }
            case MAPLE: {
                return "maple";
            }
            case CEDAR: {
                return "cedar";
            }
            case COBOL: {
                return "cobol";
            }
            case ADIRONDACK: {
                return "adirondack";
            }
            case CILKA: {
                return "cilka";
            }
        }
        return null;
    }
}
