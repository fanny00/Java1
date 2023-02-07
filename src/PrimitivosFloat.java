public class PrimitivosFloat {

    // static float varFlotante;
   // static float varFlotante = 45.45f;
    public static void main(String[] args) {

        float realFloat = 2.12e3f; //2120f;
        System.out.println("realFloat = " + realFloat);
        
        float realFloatNegativo = 1.5e-10f; // 0.00000000015f
        System.out.println("realFloatNegativo = " + realFloatNegativo);
        System.out.println("float corresponde a bytes a = " + Float.BYTES);
        System.out.println("Float corresponde a bites a = " + Float.SIZE);
        System.out.println("máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("minimo valor para float = " + Float.MIN_VALUE);

        double realDouble = 1.7976931348623157E308;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde a bytes a = " + Double.BYTES);
        System.out.println("double corresponde a bites a = " + Double.SIZE);
        System.out.println("máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("mínimo valor para double = " + Double.MIN_VALUE);
        
        // var varFlotante = 3.1416;
        // float varFlotante;
        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
