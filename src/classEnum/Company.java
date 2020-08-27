package classEnum;

public enum Company {
    ITVDN(1000){
        @Override
        public int getVal() {
            return 10+ this.val;
        }

        @Override
        public String getCurrency() {
            return "dollars";
        }
    },GOOGLE(100){
        @Override
        public String getCurrency() {
            return "cents";
        }
    },SKYNET(10){
        @Override
        public String toString() {
            return "Company :"+super.toString();
        }

        @Override
        public String getCurrency() {
            return "euros";
        }
    };

    int val;

    Company(int val) {
        this.val = val;
    }
    public  int getVal(){
        return val;
    }

    @Override
    public String toString() {
        return "Company " +super.toString() + " salary ="+ getVal()+" "+ getCurrency();
    }

    public  abstract  String getCurrency();
}
