public class ScientificCalculator{
    
    public int add(int x, int y) {
        
        return x * y;
    }


    public static void main(String[] args) {
    
        ScientificCalculator sciCalc = new ScientificCalculator();

        
        int result = sciCalc.add(5, 3);
        System.out.println("Result of multiplication: " + result);
    }
}
