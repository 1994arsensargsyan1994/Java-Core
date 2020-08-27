package inerAndNestClass.ananimniClass.ex1;

public interface InterFace1 {
    void method();
}
class Main{
    int c;                          // c ananimni clasum chi erevum qani vo na drsi clasi dashte
    public static void main(String[] args){
         int n = 100;                               // n erevum ee ananimni clasum qani vor gtvum e metodi mej
        InterFace1 interFace1 = new InterFace1() {
            public  double d = 10.5;
            @Override
            public void method(){
                //c popoxakany chi erevum
               System.out.println("Call method() in ananinum class " + d + " " + getD() );
                d = n;     // n revum ee
                System.out.println("Call method() in ananinum class " + d + " " + getD() );
              //  n = 200;
                //  nersi claum  ananimni clasum poxes n i arjeqy qani vor na veragrvele drsi clasi metodum
                // da klini kanpilaciai sxal ays orenqy kochvum e  <<efektivni finelrzovania>>
           }
           public double getD(){
                return d;
           }
        };
        interFace1.method();
        //System.out.println(interFace1.d);  d in aystex chi karox linel qani vor
           // ananimni classy nerum new inerfface {    erevum dzevavor pakagceric ners
          //                                              }
       // System.out.println(interFace1.getD);  nuyn veraberum e nayev method nerin aysinqn annanimni clasnery
        // nersi dashterin metodnerin (voronq tvyal interfisi  ev class methodner chen voronq partavoreq pereapredilat anel
        // annaimni clasum orinak aystex method() y
     }
}
