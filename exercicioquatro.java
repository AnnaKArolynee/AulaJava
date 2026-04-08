public class testecinco {
    public static void main(String[] args) {
        String x = "Programação";
        
        String cortado = x.substring(0, 8);
        String cortadoFinal = x.substring(7, 11);

        System.out.println("A palavra " + x+ " ficou assim cortada " + cortado + " e " + cortadoFinal);
    }
}
